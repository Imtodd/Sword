package org.todd.Sword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.todd.Sword.po.Person;
import org.todd.Sword.service.ISwordService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="sword")
public class SwordController {

	@Autowired
	private ISwordService service;
	
	
	@RequestMapping(value="init",method=RequestMethod.GET)
	@ResponseBody
	public String init() {
		Person p = new Person();
		p.setName("todd");
		p.setAge(22);
		service.savePerson(p);
		return "保存成功";
	}
	
	@ApiOperation(value="获取单个人物信息",notes="根据url中的id来获取用户信息")
	@ApiImplicitParam(name="id",value="用户id",required=true,dataType="int",paramType="path")
	@RequestMapping(value="getperson/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String getOnePerson(@PathVariable(value="id")int id) {
		return service.getone(id).toString(); 
	}
	
//	public Person getAll() {
//		return service.
//		
//	}
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "todd");
		return "index";
	}
	
	
	
}
