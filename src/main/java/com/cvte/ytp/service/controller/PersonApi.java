package com.cvte.ytp.service.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cvte.ytp.service.beans.Person;
import com.cvte.ytp.service.repository.PersonDao;

@Controller
public class PersonApi {
	@Autowired
	private PersonDao perDao;
	
	public PersonDao getPerDao() {
		return perDao;
	}
	
	public void setPerDao(PersonDao perDao) {
		this.perDao = perDao;
	}
	@RequestMapping(value="getPerson.action")
	public String getPerson(Model model, @RequestParam("name") String name){
		System.out.println("test select user");
		String result="";
		Person person=perDao.findByName(name);
		if(person!=null){
			model.addAttribute("person", person);
			result="success";
		}else{
			model.addAttribute("name",name);
			result="failure";
		}
		return result;
	}
	@SuppressWarnings("finally")
	@RequestMapping(value="register.action")
	public String register(Model model, 
			@RequestParam("name") String name, 
			@RequestParam("age")Integer age,
			@RequestParam("sex")String sex,
			@RequestParam("time")Long millis
			){
		System.out.println("test register controller");
		String result="";
		Person person=new Person();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		person.setName(name);
		person.setAge(age);
		person.setSex(sex);
		person.setTime(cal);
		try{
			model.addAttribute("name", name);
			perDao.save(person);
			result="registersuccess";
		}catch(Exception e){
			result="registerfailure";
		}finally{
			return result;
		}
	}
}
