package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogController {

	@GetMapping("/dog")
	public String dog() {

		return "views/list";
	}

	@PostMapping("/dog")
	public String save(
			@RequestParam("name") String name, 
			@RequestParam("breed")String breed, 
			@RequestParam("age") int age) {

		System.out.println("name: "+name);
		System.out.println("breed: "+breed);
		System.out.println("age: "+age);
		return "redirect:/dog";

	}

}
