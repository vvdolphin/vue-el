package com.example.demovue.service.impl;

import com.example.demovue.dao.CourseDao;
import com.example.demovue.domain.Course;
import com.example.demovue.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;


    @Override
    public List<Course> findAllCourses() {
        return courseDao.findAllCourses();
    }

    @Override
    public void delteCourseById(int id) {
        courseDao.delteCourseById(id);
    }

    @Override
    public void updateCourseById(int id, Course course) {
        courseDao.updateCourseById(id,course.getName(),course.getTeacherId());
    }

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course.getId(),course.getName(),course.getTeacherId());
    }
}
