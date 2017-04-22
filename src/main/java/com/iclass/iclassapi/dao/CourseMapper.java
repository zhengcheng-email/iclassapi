package com.iclass.iclassapi.dao;

import com.iclass.iclassapi.entity.Course;
import com.iclass.iclassapi.entity.CourseWithBLOBs;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public interface CourseMapper {
    List<CourseWithBLOBs> selectByTeacherId(Integer teacherId);

    int deleteByPrimaryKey(Integer courseId);

    int insert(CourseWithBLOBs record);

    int insertSelective(CourseWithBLOBs record);

    CourseWithBLOBs selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(CourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseWithBLOBs record);

    int updateByPrimaryKey(Course record);
}