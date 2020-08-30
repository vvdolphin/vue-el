package com.example.demovue.dao;

import com.example.demovue.domain.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface CourseDao {

    @Select("select * from course")
    List<Course> findAllCourses();

    @Delete("delete from course where id = #{id}")
    void delteCourseById(int id);

    @Update("update course set name = #{name}, teacherId = #{teacherId} where id = #{id}")
    void updateCourseById(int id, String name,int teacherId);

    @Insert("insert into course(id,name,teacherId) values(#{id},#{name},#{teacherId})")
    void addCourse(int id,String name,int teacherId);
}
