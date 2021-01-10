package com.example.demo;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class Stud {
	@RequestMapping(value="hellostudent",method=RequestMethod.GET)
	public String college()
	{
		return("Student info");

	}
	
@RequestMapping (value="Student1",method=RequestMethod.POST)

public Student student(@RequestBody Student Stud)
{
	System.out.println(""+Stud.getId());
	System.out.println(""+Stud.getName());
	System.out.println(""+Stud.getRollNo());

return Stud;
}


@PutMapping("/students")
private Student update(@RequestBody Student student) {
	Student.saveOrUpdate(student);
	return student;
}

@RequestMapping(value="/method9")
@ResponseBody
public String method9(@RequestParam("id") int id){
	
	return "method9 with id= "+id;
}


}
