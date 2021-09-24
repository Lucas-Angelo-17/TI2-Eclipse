package main.java.Conteudo.java;


public class Carro {
	private int anoDeLancamento;
    private int estoque;
	private String nomeDocarro;
	private double valor;
	
	public Carro() {
		this.anoDeLancamento = -1;
		this.nomeDocarro = "";
		this.valor = -1.0;
		this.estoque = -1;
	}
	
	public Carro(int anoDeLancamento, String nomeDocarro, double valor, int estoque) {
		this.anoDeLancamento = anoDeLancamento;
		this.nomeDocarro = nomeDocarro;
		this.valor = valor;
		this.estoque = estoque;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

    public int getQuantidadeEstoque() {
		return estoque;
	}

	public void setQuantidadeEstoque(int estoque) {  
		this.estoque = estoque;
	}
	public String getNomeDocarro() {
		return nomeDocarro;
	}

	public void setNomeDocarro(String nomeDocarro) {
		this.nomeDocarro = nomeDocarro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		String mensagem = "Carro: Ano de Lançameto " + anoDeLancamento + "\n" + "Quantidade em estoque: " + estoque + "\n" + "Valor: " + valor + "\n" + "Nome do Carro: " + nomeDocarro;
		return mensagem;
	}
	
}