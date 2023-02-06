package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping
public class BeachComponent {
	@PostMapping("/beach")
 public String onClik(BeachDTO dto ,Model m) {
		m.addAttribute("name", dto.getName());
		m.addAttribute("location", dto.getLocation());
	//	m.addAttribute("Clean",dto.getClean());	
		m.addAttribute("games",dto.getGames());
		
		return "dispBeach.jsp";
	}
}
