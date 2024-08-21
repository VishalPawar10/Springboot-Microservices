package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.repo.Employee;
import in.ashokit.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService empService;
	
	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
	}

	@GetMapping("/employee")
	public ModelAndView displayEmployee() {
		 List<Employee> emp = empService.getAllEmployees();
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp", emp);
		mav.setViewName("index");
		return mav;
	}
}
