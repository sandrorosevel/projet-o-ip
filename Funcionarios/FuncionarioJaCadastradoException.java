package projetoIP;

public class FuncionarioJaCadastradoException extends Exception {
	
	public FuncionarioJaCadastradoException() {
		super("Funcionário já está cadastrado.");
	}

}
