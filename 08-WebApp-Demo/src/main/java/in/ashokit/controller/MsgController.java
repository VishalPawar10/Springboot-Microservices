package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	public MsgController() {
		System.out.println("MsgController :: constructor called...");
	}

	@GetMapping("/welcome")
	public ModelAndView getMsgController() {
		ModelAndView mav = new ModelAndView();
		//add data in k-v format
		mav.addObject("msg", "Welcome from getMsgController method");
		//set view name
		mav.setViewName("index");
		return mav;
	}
}
