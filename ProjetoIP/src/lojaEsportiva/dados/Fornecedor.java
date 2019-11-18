package lojaEsportiva.dados;

public class Fornecedor  extends PessoaAbstrata{
   //CLASSE BASE
    private String tipoProduto;
    private String nomeFantasia;
    public Fornecedor(String nome,String endereco,String contato,String tipoProduto,String nomeFantasia, String id) {
        super (nome,endereco,contato);
    	this.tipoProduto = tipoProduto;
        this.nomeFantasia = nomeFantasia;
        this.id = id;
    }
    public String getTipoProduto() {
        return tipoProduto;
    }
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
	@Override
	public String getId() {
		return this.id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
	}


}
