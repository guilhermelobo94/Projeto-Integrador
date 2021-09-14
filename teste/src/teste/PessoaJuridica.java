package teste;

public class PessoaJuridica {
	private String nomeFantasia;
	private String CNPJ;
	private String razaoSocial;
	
public PessoaJuridica(String nomeFantasia, String CNPJ, String razaoSocial) {
	this.nomeFantasia = nomeFantasia;
	this.CNPJ = CNPJ;
	this.razaoSocial = razaoSocial;
}

public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}

public void setCNPJ(String CNPJ) {
	this.CNPJ = CNPJ;
}

public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}

public String getNomeFantasia() {
	return this.nomeFantasia;
}

public String getCNPJ() {
	return this.CNPJ;
}

public String getRazaoSocial(String razaoSocial) {
	return this.razaoSocial;
}

@Override
public String toString() {
	return "Nome Fantasia = " + this.nomeFantasia + "\nCNPJ = " + this.CNPJ + "\nRazão Social = " + this.razaoSocial;
}
}
