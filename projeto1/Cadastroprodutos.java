
public class Cadastroprodutos {
	private repositorioprodutos produtos;

	public Cadastroprodutos(repositorioprodutos rep) {
		produtos = rep;
	}

	public void cadastrar(Produto produto) throws ProdutoJaCadastradoException {
		if (!produtos.existe(produto.getIdentificador())) {
			produtos.inserir(produto);
		} else {
			throw new ProdutoJaCadastradoException();
		}
	}

	public Produto procurar(String identificador) throws ProdutoNaoEncontradoException {
		if(produtos.existe(identificador)) {
			return produtos.procurar(identificador);
		}else {
			throw new ProdutoNaoEncontradoException();
		}
	}
	public void remover(String identificador)throws ProdutoNaoEncontradoException{
		if(produtos.existe(identificador)) {
			produtos.remover(identificador);
		}else {
			throw new ProdutoNaoEncontradoException();
		}
	}
	public void atualizar (String identificador) throws ProdutoNaoEncontradoException{
		if(produtos.existe(identificador)) {
			produtos.remover(identificador);
		}else {
			throw new ProdutoNaoEncontradoException();
		}
	}
}
