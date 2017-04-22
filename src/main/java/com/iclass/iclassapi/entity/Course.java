package com.iclass.iclassapi.entity;

import java.util.Date;

public class Course {
    private Integer courseId;

    private String courseCode;

    private String courseName;

    private Integer courseStudentCount;

    private Integer coursehourCount;

    private Integer courseCredit;

    private Integer teacherId;

    private Integer schoolbuildingId;

    private Date courseStarttime;

    private Date courseEndtime;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseStudentCount() {
        return courseStudentCount;
    }

    public void setCourseStudentCount(Integer courseStudentCount) {
        this.courseStudentCount = courseStudentCount;
    }

    public Integer getCoursehourCount() {
        return coursehourCount;
    }

    public void setCoursehourCount(Integer coursehourCount) {
        this.coursehourCount = coursehourCount;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSchoolbuildingId() {
        return schoolbuildingId;
    }

    public void setSchoolbuildingId(Integer schoolbuildingId) {
        this.schoolbuildingId = schoolbuildingId;
    }

    public Date getCourseStarttime() {
        return courseStarttime;
    }

    public void setCourseStarttime(Date courseStarttime) {
        this.courseStarttime = courseStarttime;
    }

    public Date getCourseEndtime() {
        return courseEndtime;
    }

    public void setCourseEndtime(Date courseEndtime) {
        this.courseEndtime = courseEndtime;
    }
}