package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.countThread;

public interface countThreadRepo extends JpaRepository<countThread, Integer> {
	@Modifying
	@Transactional
	@Query(value = "update demo.count_thread c set c.count=c.count+1 where c.id=1;", nativeQuery = true)
	public void increaseCountDatabase();
}
