package org.todd.Sword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.todd.Sword.po.Person;
import org.todd.Sword.service.ISwordService;

@Controller
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
	
	@RequestMapping(value="getperson",method=RequestMethod.GET)
	@ResponseBody
	public String getOnePerson(@RequestParam int id) {
		return service.getone(id).toString(); 
	}
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "todd");
		return "index";
	}
	
	
	
}
