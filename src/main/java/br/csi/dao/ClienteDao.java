package br.csi.dao;

import br.csi.modelo.Cliente;

public class ClienteDao {

		public boolean adicionar(Cliente c){
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Endereço: "+ c.getRuaNroComp());
			System.out.println("Bairro: "+ c.getBairro());
			System.out.println("Cidade: "+ c.getCidade());
			return true;
		}
}
