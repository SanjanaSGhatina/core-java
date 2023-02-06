package com.xworkz.goa.component;




import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.GoaDTO;

@Component
@RequestMapping("/casino")
public class GoaComponent {
	
	public GoaComponent() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	@PostMapping
	public String goGoa(GoaDTO goadto,Model model) {
		model.addAttribute("name",goadto.getName());
		model.addAttribute("cruise", goadto.getCruise());
		model.addAttribute("entryFee",goadto.getEntryFee());
		return "dispCasino.jsp";
		
	}

}
