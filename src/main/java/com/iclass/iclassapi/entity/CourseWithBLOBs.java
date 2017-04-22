package com.iclass.iclassapi.entity;

public class CourseWithBLOBs extends Course {
    private String courseInformation;

    private String courseContent;

    public String getCourseInformation() {
        return courseInformation;
    }

    public void setCourseInformation(String courseInformation) {
        this.courseInformation = courseInformation == null ? null : courseInformation.trim();
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent == null ? null : courseContent.trim();
    }
}