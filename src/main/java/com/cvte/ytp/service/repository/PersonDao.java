package com.cvte.ytp.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvte.ytp.service.beans.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {
	public Person findByName(String personname);
}
