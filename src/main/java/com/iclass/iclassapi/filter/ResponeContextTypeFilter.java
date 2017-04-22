package com.iclass.iclassapi.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Created by Daniel on 2017/4/14.
 * Function : 过滤器，拦截请求并将请求头中的accpet设置为application/json;charset
 */
public class ResponeContextTypeFilter implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(new CustomeizedRequest((HttpServletRequest) request), response);
    }

    @Override
    public void destroy() {

    }

    private class CustomeizedRequest extends HttpServletRequestWrapper {
  
    public CustomeizedRequest(HttpServletRequest request) {
        super(request);  
    }  
  
    @Override  
    public Enumeration<String> getHeaders(String name) {
        if (null != name && name.equals("accept")) {
            return new Enumeration<String>() {  
                private boolean hasGetted = false;  
  
                @Override  
                public String nextElement() {  
                    if (hasGetted) {  
                        throw new NoSuchElementException();
                    } else {  
                        hasGetted = true;  
                        return "application/json;charset=utf-8";
                    }  
                }  
  
                @Override  
                public boolean hasMoreElements() {  
                    return !hasGetted;  
                }  
            };  
        }  
        return super.getHeaders(name);  
    }  
    } 
}
