package com.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prac.dao.DAO;
import com.prac.model.Cbean;

@Controller
public class MainController {

	@Autowired
	DAO dao;
	
	@RequestMapping("/")
	public String mainpage(Model theModel)
	{
		return "index";
	}
	@RequestMapping("/signup")
	public String Sign(Model theModel)
	{
		String name = request.getParameter("Name");
		String email = request.getParameter("smail");
		String password = request.getParameter("spass");
		Cbean add = new Cbean(name,email,password);
		dao.Insert(add);
		return "login";
	}
	@RequestMapping("/login")
	public String login(Model theModel)
	{
		int chk=0;
		String umail = request.getParameter("umail");
		String pass = request.getParameter("pass");
		if(dao.Validate(umail,pass))
		{
			chk=1;
		}
		else
		{
			chk=0;
		}
		if(chk=1)
		{
			return "content";
		}
		else
		{
			return "lpgin";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(Model theModel)
	{
		String mail = request.getParameter("mail");
		Cbean obj = new Cbean(mail);
		dao.delete(obj);
		return "content";
	}

}
