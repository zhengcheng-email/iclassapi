package com.iclass.iclassapi.service;

import com.iclass.iclassapi.dao.CourseMapper;
import com.iclass.iclassapi.entity.CourseWithBLOBs;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Daniel on 2017/4/14.
 * Function :
 */
@Service
public class CoursesService implements Services{
    @Resource
    private  CourseMapper mapper;

    @Transactional
    public Integer insertCourse(CourseWithBLOBs courseWithBLOBs){
        mapper.insert(courseWithBLOBs);
        //System.out.println(1/0);
        return courseWithBLOBs.getCourseId();
    }

    public CourseWithBLOBs getCourse(Integer courseId){
        return mapper.selectByPrimaryKey(courseId);
    }

    public List<CourseWithBLOBs> getCoursesByTeacherId(Integer teacherId){
        List<CourseWithBLOBs> courseWithBLOBses = mapper.selectByTeacherId(teacherId);
        return courseWithBLOBses;
    }
}
