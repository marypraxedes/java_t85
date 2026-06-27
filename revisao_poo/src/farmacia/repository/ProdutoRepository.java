package farmacia.repository;

import farmacia.model.Produto;

public interface ProdutoRepository {

	
	public void cadastrarProduto(Produto produto);
	public void listarTodos();
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id); 
	public void listarPorID(int id);
	
}
