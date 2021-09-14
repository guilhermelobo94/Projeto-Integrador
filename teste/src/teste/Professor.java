package teste;

public class Professor extends PessoaFisica {
	private int codigo;
	private String cadeira;
	private String titular;
	private int anoDeAdmissao;

public Professor(String nome, String sobrenome, String CPF, int codigo, String cadeira, String titular, int anoDeAdmissao) {
	super(nome, sobrenome, CPF);
	this.codigo = codigo;
	this.cadeira = cadeira;
	this.titular = titular;
	this.anoDeAdmissao = anoDeAdmissao;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public void setCadeira(String cadeira) {
	this.cadeira = cadeira;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public void setAnoDeAdmissao(int anoDeAdmissao) {
	this.anoDeAdmissao = anoDeAdmissao;
}

public int getCodigo() {
	return this.codigo;
}

public String getCadeira() {
	return this.cadeira;
}

public String getTitular() {
	return this.titular;
}

public int getAnoDeAdmissao() {
	return this.anoDeAdmissao;
}

@Override
public String toString() {
	return super.toString() + "\nCódigo = " + this.codigo + "\nCadeira = " + this.cadeira + "\nTitular = " + this.titular + "\nAno de Admissão = " + this.anoDeAdmissao;
}
}
