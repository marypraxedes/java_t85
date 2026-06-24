package aula_08_poo;

public class Farmacia {

	private String nomeProduto;
	private float preco;
	private int idProduto;
	private int quantidadeEstoque;
	private String categoria;
	
	
	public Farmacia(String nomeProduto, float preco, int idProduto, int quantidadeEstoque, String categoria) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.idProduto = idProduto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void visualizar() {
		System.out.printf("\n******************************************\n");         
		System.out.println("            DADOS DO PRODUTO              ");         
		System.out.printf("\n******************************************\n");
		System.out.printf("\nNome do produto: " + this.nomeProduto);
		System.out.printf("\nPreço do produto: " + this.preco);
		System.out.printf("\nID do produto: " + this.idProduto);
		System.out.printf("\nQuantidade em Estoque: " + this.quantidadeEstoque);
		System.out.printf("\nCategoria do produto: " + this.categoria);
	}
}
	
	

