package org.todd.Sword.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todd.Sword.po.Person;
import org.todd.Sword.respository.IPersonRespository;
import org.todd.Sword.service.ISwordService;

@Service
public class SwordService implements ISwordService {
	
	@Autowired
	private IPersonRespository personRespository;

	@Override
	public Person getone(int id) {
		return personRespository.findOne(id);
	}

	@Override
	public void savePerson(Person p) {
		personRespository.save(p);
	}

}
