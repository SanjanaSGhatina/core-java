package com.xworkz.task.component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.task.dto.BeverageDTO;
import com.xworkz.task.dto.ChatDTO;
import com.xworkz.task.dto.EducationDTO;
import com.xworkz.task.dto.MobileDTO;

@Component
@RequestMapping
public class DispComponent {
	public DispComponent() {
		System.out.println("Created " + getClass().getSimpleName());
	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running OnEmail..");
		model.addAttribute("email","xyz@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running OnMobile..");
		long mob = 9110828977L;
		model.addAttribute("mobile",mob);
		return "index.jsp";
	}
	
	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running OnAadhar");
		model.addAttribute("aadhar", "458-658-952");
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		int ag = 23;
		model.addAttribute("age", ag);
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String onDate(Model model) {
		System.out.println("Running onDate");
		model.addAttribute("date", LocalDateTime.now());
		return "index.jsp";
	}
	
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("salary","4.6-LPA");
		return "index.jsp";
	}
	
	@GetMapping("/frnds")
	public String onFrnds(Model model) {
		System.out.println("Running onFrnds");
		List <String> ref = new ArrayList<String>();
		ref.add("ABC");
		ref.add("DEF");
		ref.add("GHI");
		ref.add("JKL");
		model.addAttribute("abc",ref);
		return "index.jsp";
	}
	
	
	@GetMapping("/place")
	public String onPlace(Model model) {
		System.out.println("Running onPlace");
		List <String> plc = new ArrayList<String>();
		plc.add("Jog Falls");
		plc.add("Sakrebailu Elephant Camp");
		plc.add("BRP Dam");
		plc.add("Kodachadri");
		model.addAttribute("place",plc);
		return "index.jsp";
	}
	
	@GetMapping("/skill")
	public String onSkill(Model model) {
		System.out.println("Running onSkill");
		List <String> ski = new ArrayList<String>();
		ski.add("Java");
		ski.add("SQL");
		ski.add("HTML");
		ski.add("CSS");
		model.addAttribute("skill",ski);
		return "index.jsp";
	}
	
	@GetMapping("/dto")
	public String onEdu(Model model) {
		System.out.println("Running EducationDTO");
		EducationDTO dto = new EducationDTO();
		model.addAttribute("eduDto", dto);
		dto.setmca("JNN College of Engineering, SHimoga");
		dto.setsub1("Resource Methodology");
		dto.setsub2("Python");
		dto.setsub3("Internet of Things");
		dto.setsub4("Advance Java");
		dto.setsub5(".Net Framework");
		return "index.jsp";
	}
	
	
	@GetMapping("/mob")
	public String onMobil(Model model) {
		MobileDTO dto = new MobileDTO();
		dto.setName("Realme 6i");
		dto.setModel("Android12");
		dto.setPrice(13000);
		dto.setRam("4 GB Ram");	
		model.addAttribute("mobi", dto);		
		System.out.println("Running onMobile ");
		return "index.jsp";
	}
	
	
	
//
//	@GetMapping("/bev")
//	public String onBev(Model model) {
//
//		BeverageDTO dto = new BeverageDTO();
//		dto.setName("TUBORG");
//		dto.setId(1);
//		dto.setQuantity("3");
//		dto.setPrice(600);
//		dto.setBarcodeNo("js673bc67437");
//		dto.setColour("brownish");
//		dto.setFlavour("Crispy");
//		dto.setType("Beer");
//		dto.setMfdDate(LocalDate.of(2023,1,12));
//		dto.setExpDate(LocalDate.of(2024, 2,03));
//		model.addAttribute("bev", dto);		
//		System.out.println("Running onBeverage ");
//		return "index.jsp";
//	}

	@GetMapping("/chat")
	public String onChat(Model model) {
		ChatDTO dto= new ChatDTO();

		dto.setName("BangarPet Chats");
		dto.setLocation("Bashyam Circle");
		dto.setPrice(35);
		dto.setChat5("Sev Puri");
		dto.setChat2("Dhai puri");
		dto.setChat3("Gobi Manchurian");
		dto.setChat6("Masal Puri");
		dto.setChat1("Pani puri");
		dto.setChat4("nipat masal");
		

		model.addAttribute("chat", dto);		
		System.out.println("Running onChat ");
		return "index.jsp";
	}
	
	
	
	
}
