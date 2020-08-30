package com.example.demovue.controller;

import com.example.demovue.domain.Course;
import com.example.demovue.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/courses")
public class UserController {

    @Autowired
    CourseService courseServiceimpl;

    @GetMapping("")
    public List<Course> getAllCourses() {
        return courseServiceimpl.findAllCourses();
    }

    @PutMapping("/{id}")
    public void delteCourseById(@PathVariable int id) {
        courseServiceimpl.delteCourseById(id);
    }

    @PutMapping("/update/{id}")
    public void updateCourseById(@PathVariable int id,@RequestBody Course course) {
        courseServiceimpl.updateCourseById(id,course);
    }

    @PostMapping("")
    public void addCourse(@RequestBody Course course) {
         courseServiceimpl.addCourse(course);
    }

}
