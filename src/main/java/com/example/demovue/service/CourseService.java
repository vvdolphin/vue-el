package com.example.demovue.service;

import com.example.demovue.domain.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAllCourses();

    void delteCourseById(int id);

    void updateCourseById(int id, Course course);

    void addCourse(Course course);
}
