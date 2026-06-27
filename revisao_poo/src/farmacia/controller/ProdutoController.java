package farmacia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import farmacia.model.Produto;
import farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	int id = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("O produto %s foi criado com sucesso!%n", produto.getNome());
		
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());
		
			if (buscaProduto.isPresent()) {
				listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
				System.out.printf("\nO produto de ID %d foi atualizado com sucesso!", produto.getId());
			}else
				System.out.printf("\nO produto de ID %d não foi encontrado!", produto.getId());
		
	}

	@Override
	public void deletarProduto(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);
		
			if(produto.isPresent()) {
				if(listaProdutos.remove(produto.get()))
					System.out.printf("\nO produto de ID %d foi excluído com sucesso!", id);
			}else
				System.out.printf("\nO produto de ID %d não foi encontrado!", id);
		
	}

	
	@Override
	public void listarPorID(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);
		
			if (produto.isPresent())
				produto.get().visualizar();
			else
				System.out.printf("\nO produto de ID %d não foi encontrado!", id);
		
	}
	
	public int gerarId() {
		return ++ id;
	}
	
	public Optional<Produto> buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id)
				return Optional.of(produto);
		}
		
		return Optional.empty();
	}

}
