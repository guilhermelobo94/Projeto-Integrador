package teste;

public class PessoaFisica {
	private String nome;
	private String sobrenome;
	private String CPF;

public PessoaFisica(String nome, String sobrenome, String CPF) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.CPF = CPF;
}
public void setNome(String nome) {
	this.nome = nome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public void setCPF(String CPF) {
	this.CPF = CPF;
}

public String getNome() {
	return this.nome;
}

public String getSobrenome() {
	return this.sobrenome;
}

public String getCPF() {
	return this.CPF;
}

@Override
public String toString() {
	return "Nome = " + this.nome + "\nSobrenome = " + this.sobrenome + "\nCPF = " + this.CPF;
}
}
