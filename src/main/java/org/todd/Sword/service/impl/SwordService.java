package org.todd.Sword.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todd.Sword.po.Person;
import org.todd.Sword.respository.IPersonRespository;
import org.todd.Sword.service.ISwordService;

@Service
public class SwordService implements ISwordService {
	
	//定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(SwordService.class); 
	
	@Autowired
	private IPersonRespository personRespository;

	@Override
	public Person getone(int id) {
		logger.info("我是日志");
		return personRespository.findOne(id);
	}

	@Override
	public void savePerson(Person p) {
		personRespository.save(p);
	}

}
