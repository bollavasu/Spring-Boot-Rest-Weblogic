package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private Person person;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "Welcome to Spring Boot REST Weblogic...";
	}
	
	@RequestMapping("/person/get")
	public Person getPerson(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		person.setName(name);
		return person;
	}
	
	@RequestMapping(value="/person/update", method=RequestMethod.POST)
	public Person updatePerson(@RequestParam(name="name", required=true) String name) {
		person.setName(name);
		return person;
	}
	
	@RequestMapping(value="/person/update2", method=RequestMethod.POST, consumes = "application/json")
	public Person updatePerson(@RequestBody Person p) {
		person.setName(p.getName());
		return person;
	}
}
