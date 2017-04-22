package com.iclass.iclassapi.controller;

import com.alibaba.fastjson.JSON;
import com.iclass.iclassapi.entity.CourseWithBLOBs;
import com.iclass.iclassapi.http.BaseResponse;
import com.iclass.iclassapi.service.CoursesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Daniel on 2017/4/14.
 * Function :
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
    @Resource
    private CoursesService service;

    @RequestMapping(value = "/teacher/{teacherId}",method = RequestMethod.GET)
    public @ResponseBody String getCoursesByTeacherId(@PathVariable Integer teacherId, HttpServletRequest request, HttpServletResponse response){
        BaseResponse baseResponse = new BaseResponse();
        try{
            baseResponse.setData(service.getCoursesByTeacherId(teacherId));
            baseResponse.setStatus(BaseResponse.STATUS.SUCCESS);
        }catch (Exception ex){
            baseResponse.setStatus(BaseResponse.STATUS.FAIL);
        }
        return JSON.toJSONString(baseResponse);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json;charset=utf-8")
    public @ResponseBody String insertCourse(@RequestBody String json) throws IOException {
        CourseWithBLOBs courseWithBLOBs = null;
        BaseResponse baseResponse = new BaseResponse();
        try{
            courseWithBLOBs = JSON.parseObject(json,CourseWithBLOBs.class);
            service.insertCourse(courseWithBLOBs);
            baseResponse.setStatus(BaseResponse.STATUS.SUCCESS);
            baseResponse.setData("OK");
        }catch (Exception ex){
            baseResponse.setStatus(BaseResponse.STATUS.FAIL);
            baseResponse.setData(ex.getMessage());
        }
        return JSON.toJSONString(baseResponse);
    }
}
