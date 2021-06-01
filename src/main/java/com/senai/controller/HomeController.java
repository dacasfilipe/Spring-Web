package com.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home") //Define a url que quando for requisitada chamara o metodo
	public ModelAndView home(){
		 //Retorna a view que deve ser chamada, no caso home (home.jsp) aqui o .jsp é omitido
		return new ModelAndView("index.html");
	}
}
