package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	//method to display empty form
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	//method to display save form data
	@PostMapping("/saveStudent")
	public ModelAndView handleSubmitBtn(Student s) {
		ModelAndView mav = new ModelAndView();
		boolean isSaved =service.saveStudents(s);
		if(isSaved) {
			mav.addObject("smsg", "Student Saved");
		}else {
			mav.addObject("emsg", "Failed to Save");
		}
		mav.setViewName("index");
		return mav;
	}
	
	//method to display all student data
	@GetMapping("/getData")
	public ModelAndView getAllStudents() {
		List<Student> stuList = service.getAllStudents();
		ModelAndView mav = new ModelAndView();
		mav.addObject("students", stuList);
		mav.setViewName("Data");
		return mav;
	}
	
	@GetMapping("/delete")
	public String handleDelete(@RequestParam("studentId") Integer studentId,Model model) {
		service.deleteById(studentId);
		List<Student> stuList = service.getAllStudents();
		model.addAttribute("students",stuList);
		return "Data";
	}
}
