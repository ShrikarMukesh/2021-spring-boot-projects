package com.shrikar.springboot.entity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course, Integer>{
	public List<Course> getCoursesByTrainer(String trainer);
	public List<Course> getCoursesByCost(double cost);
	public Course getCoursesByCname(String cname);
}