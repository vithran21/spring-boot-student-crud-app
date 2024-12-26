package com.learn.springbootapp.studentcrud.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(generator = "x")
	@SequenceGenerator(initialValue = 1001, allocationSize = 1, name = "x")
	private int id;
	private String name;
	private long mobile;
	private String gender;
	private int maths;
	private int science;
	private int english;

	public double getPercentage() {
		return (maths + english + science) / 3.0;
	}
}

