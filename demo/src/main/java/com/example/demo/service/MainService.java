package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.countThread;
import com.example.demo.repository.countThreadRepo;

@Service
public class MainService {
	@Autowired
	countThreadRepo countThreadRepo;
	int count = 0;

	public void increaseCount() throws Exception {
		System.out.println();
		synchronized (this) {

			countThreadRepo.increaseCountDatabase();
		}
	}
}
