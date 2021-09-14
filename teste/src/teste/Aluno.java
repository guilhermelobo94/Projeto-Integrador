package teste;

public class Aluno extends PessoaFisica {
	private int codigo;
	private String turma;
	private int anoDeIngressao;
	
public Aluno(String nome, String sobrenome, String CPF, int codigo, String turma, int anoDeIngressao) {
	super(nome, sobrenome, CPF);
	this.codigo = codigo;
	this.turma = turma;
	this.anoDeIngressao = anoDeIngressao;
}

public void setCodigo( int codigo) {
	this.codigo = codigo;
}

public void setTurma(String turma) {
	this.turma = turma;
}

public void setAnoDeIngressao(int anoDeIngressao) {
	this.anoDeIngressao = anoDeIngressao;
}

public int getCodigo() {
	return this.codigo;
}

public String getTurma() {
	return this.turma;
}

public int getAnoDeIngressao() {
	return this.anoDeIngressao;
}

@Override
public String toString() {
	return super.toString() + "\nCódigo = " + this.codigo + "\nTurma = " + this.turma + "\nAno de Ingressão = " + this.anoDeIngressao;
}
}
