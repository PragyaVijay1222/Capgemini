package com.mvc.springmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.mvc.springmvc.Model.Student;
import com.mvc.springmvc.Service.StudentService;



@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/register")
	
	//  @ModelAttribute-- binding form data to student object
	public String registerStudent(@ModelAttribute Student student ,Model model) {
		// student service - to forward data to dao or repository and then recieve the response
		studentService.saveStudent(student);
		
		model.addAttribute("name",student.getName());
		return "Success";// return view name (success.jsp)
		
		
	}
@GetMapping("/register")
	public  String showForm() {
	return "Register";
}
	
	
	
	

}
