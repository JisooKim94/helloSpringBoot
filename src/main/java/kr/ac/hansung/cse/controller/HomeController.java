package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// @GetMapping is a composed annotation that acts as a shortcut for
	// @RequestMapping(value="/", method = RequestMethod.GET).
	@GetMapping("/api/v1")
	public String home(Model model) {

		logger.info("Info: Calling home( )" );
		logger.debug("Debug: Calling home( )" );
		logger.trace("trace: Calling home( )" );
		
		model.addAttribute("message", "hello world");
		
		return "index";

	}	
	
}