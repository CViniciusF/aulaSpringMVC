package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.csi.dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller
public class ClienteController {
		
	@RequestMapping("clientes")
	public String teste(){
			System.out.println(" Chamou o controlador no servidor ");
			return"cliente";
		}
	
	@RequestMapping("adicionaCliente")
	public String adiciona(Cliente cliente){
		
		boolean retorno = new ClienteDao().adicionar(cliente);
		if(retorno){
			return "cliente";
		}else{
			return "erro";
		}
	}
}