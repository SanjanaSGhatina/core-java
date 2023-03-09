package com.xworkz.ott.controller;

import java.util.Arrays;


import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.ott.dto.OTTDTO;
import com.xworkz.ott.service.OttService;

@Controller
@RequestMapping("/")
public class OttController {
	@Autowired
	public OttService ottService;

	public OttController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	List<String> plat = Arrays.asList("NetFlix","HBO Max", "Disnet+","VOOT");
	List<String> lang = Arrays.asList("Kannada", "Hindi", "Telgu", "Tamil", "English");
	

	@GetMapping("/otttv")
	public String onAir(Model m) {
		m.addAttribute("platform", plat);
		m.addAttribute("language", lang);
		return "ott.jsp";
	}
	
	
	@PostMapping("/otttv")
	public String onVal(OTTDTO dto, Model mo) {
		Set<ConstraintViolation<OTTDTO>> constraintViolations = this.ottService.vlaidateAndSave(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Validation sucess");
			System.out.println(dto);
			return "disp.jsp";
		}
		
		mo.addAttribute("platform", plat);
		mo.addAttribute("language", lang);

		mo.addAttribute("cv", constraintViolations);
		System.out.println(dto);

		System.err.println(" violation in controller");
		return "ott.jsp";
	}
	

	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id" + id);
		OTTDTO dto = this.ottService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		return "Search.jsp";
	}
	

	
	@GetMapping("/goShow")
	public String onSearchShow(@RequestParam String show,Model m) {
		System.out.println("Running onSearchshow in controller" + show);
		List<OTTDTO> lists = this.ottService.findByShow(show);
		m.addAttribute("list", lists);
		return "Platform.jsp";
	}
	
	
	

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model m) {
		System.out.println("Update By Id");
		OTTDTO dto = this.ottService.findById(id);
		m.addAttribute("dto", dto);
		m.addAttribute("regions", plat);
		return "Update.jsp";
	}

	@PostMapping("/update")
	public String onUpdate(Model m, OTTDTO dto) {
		System.out.println("Running update" + dto);

		Set<ConstraintViolation<OTTDTO>> violations = this.ottService.validateAndUpdate(dto);

		if (violations.size() > 0) {
			m.addAttribute("err", violations);
		} else {
			m.addAttribute("message", "OTT DTO UPDATE sucessful");
		}
		m.addAttribute("dto", dto);
		m.addAttribute("regions", plat);
		m.addAttribute("messages", "OTT Dto Update sucessful");


		return "Update.jsp";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model m) {
		System.out.println("Running on delete");
		OTTDTO dto = this.ottService.deleteById(id);
		m.addAttribute("delete", dto);
		m.addAttribute("message", "Data Deleted sucessful");

		return "Platform.jsp";
	}
	
	

}
