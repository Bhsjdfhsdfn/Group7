package org.student.service.biz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.api.StudentApi;
import org.student.api.dto.StudentDTO;
import org.student.api.dto.StudentVO;
import org.student.api1.StudentRegister;
import org.student.bean.Student;
import org.student.service.StudentService;

import com.google.common.collect.Lists;

@Service("studentRegister")
public class StudentRegisterBiz implements StudentRegister{
	private Logger logger = LoggerFactory.getLogger(StudentRegisterBiz.class);
	
	@Autowired
	private StudentService studentService;

	@Override
	public void register(StudentVO student) {
		studentService.register(student);
	}
	
}
