package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {

	private ArrayList<Cliente> clientes;
	
	private void initClientes(){
		clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Paulo");
		c.setBairro("Centro");
		c.setRuaNroComp("Duque de Caxias N:187 Apto:258");
		c.setCidade("Santa Maria");
		Cliente d = new Cliente();
		d.setNome("Roberto");
		d.setBairro("Centro");
		d.setRuaNroComp("Marechal Floriano N:1148");
		d.setCidade("Agudo");
		Cliente e = new Cliente();
		e.setNome("Ruan Escurid�o");
		e.setBairro("Nossa Senhora das Dores");
		e.setRuaNroComp("Duque de Romanos N:298 Apto:402");
		e.setCidade("Santa Maria");
		clientes.add(c);
		clientes.add(d);
		clientes.add(e);
	}
	
		public boolean adicionar(Cliente c){
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Endere�o: "+ c.getRuaNroComp());
			System.out.println("Bairro: "+ c.getBairro());
			System.out.println("Cidade: "+ c.getCidade());
			
			clientes.add(c);
			return true;
		}
		public ArrayList<Cliente> listaClientes(){
			initClientes();
			return clientes;
		}
}
