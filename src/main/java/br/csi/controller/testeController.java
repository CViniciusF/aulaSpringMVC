package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testeController {
		
	@RequestMapping("spring")
	public String teste(){
			
			System.out.println(" Chamou o controlador no servidor ");
			
			return"testeSpring";
		}
}