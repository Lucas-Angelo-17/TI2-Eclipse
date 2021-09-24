package main.java.Conteudo.java;


import conexaoComservidor.DAO;

public class Conexao {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		
		// Inseriri um elemento na tabela de carros
		Carro carroX = new Carro(2013, "Citroen C3", 25000.00, 7);
		if(dao.inserirCarro(carroX) == true) {
			System.out.println("Inserção com sucesso -> " + carroX.toString());
		}

		Carro[] carros = dao.getCarros();
		
		// Mostrar os carros cadastrados
		carros = dao.getCarros();
		System.out.println("\n==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
			System.out.println("\n");
		}
		
		// Atualizar estoque da consesionaria
		carroX.setQuantidadeEstoque(14);
		dao.atualizarCarro(carroX);
		
		// Mostrar carros
		carros = dao.getCarros();
		System.out.println("\n==== Mostrar carros (Após atualização) === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
			System.out.println("\n");
		}
		
		dao.close();
		
	}
}