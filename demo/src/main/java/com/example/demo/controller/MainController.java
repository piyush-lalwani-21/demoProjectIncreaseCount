package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MainService;

@RestController
public class MainController {

	@Autowired
	MainService mainService;

	@RequestMapping(path = "/increaseThreadCount", method = RequestMethod.GET)
	public ResponseEntity increaseThreadCount() {
System.out.println();
		try {
			mainService.increaseCount();
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Something Went Wrong");
		}
		return ResponseEntity.ok("Count Increased by 1");
	}

}
