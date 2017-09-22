package org.todd.Sword.service;

import org.springframework.stereotype.Service;
import org.todd.Sword.po.Person;

public interface ISwordService {
	
	public Person getone(int id);
	
	public void savePerson(Person p);
	
}
