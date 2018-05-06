package org.student.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.student.bean.Student;

public interface StudentMapper {
	List<Student> listStudent();
	
	Student getStudent(@Param(value = "username") String username, @Param(value = "password") String password);
	
	void addStudent(Student student);
}
