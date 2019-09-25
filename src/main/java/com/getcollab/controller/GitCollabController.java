package com.getcollab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amit")
public class GitCollabController {
	@GetMapping
	public String add(){
		System.err.println(" ^^^^^^^^^^^^^^^****************");
		return "amit";
	}
	
	
	
	
}
