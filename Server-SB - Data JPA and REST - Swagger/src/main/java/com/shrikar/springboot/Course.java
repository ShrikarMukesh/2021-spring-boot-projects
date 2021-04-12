package com.shrikar.springboot;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "mycourses")
@ApiModel(value="Contains Course Information - CourseId,CourseName,Cost,Duration,Trainer ")
public class Course {
	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value="Contains courseId Information")
	private int cid;
	@Column(name = "cname")
	@ApiModelProperty(value="Contains CourseName Information")
	private String cname;
	@Column(name = "cost")
	@ApiModelProperty(value="Contains Cost Information")
	private double cost;
	@Column(name = "duration")
	@ApiModelProperty(value="Contains Duration Information")
	private int duration;
	@Column(name = "trainer")
	@ApiModelProperty(value="Contains Trainer Information")
	private String trainer;
	public Course() {
	}
	public Course(String cname, double cost, int duration, String trainer) {
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}
	public Course(int cid, String cname, double cost, int duration, String trainer) {
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}
	//Setters and Getters
	@Override
	public String toString() {
		return cid + "\t" + cname + "\t" + cost + "\t" + duration + "\t" + trainer;
	}
}