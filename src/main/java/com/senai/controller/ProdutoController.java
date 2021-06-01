package com.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {

	@RequestMapping("/produto") //Define a url que quando for requisitada chamara o metodo
	public ModelAndView produto(){
		 //Retorna a view que deve ser chamada, no caso home (home.jsp) aqui o .jsp é omitido
		return new ModelAndView("cadastroProdutos.html");
	}
}
