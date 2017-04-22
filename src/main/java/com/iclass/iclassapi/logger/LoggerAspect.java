package com.iclass.iclassapi.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Daniel on 2017/4/16.
 * Function : 日志切面，拦截方法并记录拦截点以及被拦截方法执行时间
 */
@Aspect
@Component
public class LoggerAspect {
    @Pointcut(value = "execution(* com.iclass.iclassapi.controller.*.*(..))")
    private void controller(){}

    private final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Around("controller()")
    public Object logger(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            long span = System.currentTimeMillis() - start;
            logger.info(joinPoint.toShortString() + ",time:"+span);
        }catch (Throwable e){
            logger.error(joinPoint.toShortString()+",error:"+e.toString());
        }
        return result;
    }
}
