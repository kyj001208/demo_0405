package com.green.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.nowon.domain.dto.Dog;

import lombok.RequiredArgsConstructor;

@Controller
public class DogController {

	
	@GetMapping("/dog")
	public String list() { // 페이지 경로

		return "views/list"; // 템플릿 안에 있는 뷰 안에 리스트(html)로 들어가랏
	}

	@PostMapping("/dog")
	public String save(Dog dog) {// 객체 변수를 통해 간결화:Dog라는 클래스를 만들어 필드 및 세터 만들어주기
		System.out.println(dog);

		return "redirect:/dog";

	}

}
