
public class Cadastroprodutos {
	private repositorioprodutos produtos;

	public Cadastroprodutos (repositorioprodutos rep) {
		produtos = rep;
	}
	public void cadastrar(Produto produto)throws ProdutoJaCadastradoException {
		if(!produto.existe(produto.getidentificador())) {
			produto.inserir(produto);
		}else throws ProdutoJaCadastradoException;
	}
}