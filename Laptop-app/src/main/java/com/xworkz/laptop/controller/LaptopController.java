package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.laptop.dto.LaptopDTO;

/*@Component
  @RequestMapping("/")*/
@Controller
public class LaptopController {

	public LaptopController() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() +" object created");
		
	}
	@RequestMapping(value ="/laptop.do", method=RequestMethod.POST)
	public 	String onSubmit(@ModelAttribute LaptopDTO laptopdto, Model model)
			/*@RequestParam String laptopName, @RequestParam String laptopBrand, @RequestParam double ram, 
			@RequestParam double cost, Model model)*/
	{
		System.out.println("calling onSubmit() method");
		/*model.addAttribute("ResponseMessage",
				"thanks for submitting the form, laptop details:" +laptopName +"\t" +laptopBrand+"\t" +ram+"\t" +cost+ "\t");
		
		return "/index.jsp";
		*/
		System.out.println(laptopdto);
		model.addAttribute("display",
				"Thanks:" +laptopdto.getLaptopName() +"\t" +laptopdto.getLaptopBrand() +"\t" +laptopdto.getRam() +"\t" +laptopdto.getCost() +"\t");
		/*return "/WEB-INF/pages/LaptopResponse.jsp";*/
		return "LaptopResponse";
	}
	@RequestMapping(value ="/abc.do")
	public String onabcclick()
	{
		System.out.println("calling onabcclick method");
		return "/index.jsp";
	}
	
	

}
