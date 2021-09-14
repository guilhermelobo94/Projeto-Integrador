package teste;

public class Fornecedor extends PessoaJuridica {
	private int codigo;
	private String email;
	private String telefone;
	
public Fornecedor(String nomeFantasia, String CNPJ, String razaoSocial, int codigo, String email, String telefone) {
	super(nomeFantasia, CNPJ, razaoSocial);
	this.codigo = codigo;
	this.email = email;
	this.telefone = telefone;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public void setEmail(String email) {
	this.email = email;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public int getCodigo() {
	return this.codigo;
}

public String getEmail() {
	return this.email;
}

public String getTelefone() {
	return this.telefone;
}

@Override
public String toString() {
	return super.toString() + "\nCodigo = " + this.codigo + "\nE-mail = " + this.email + "\nTelefone = " + this.telefone;
}
}
