package teste;


public class Principal {

	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica();
		p1.Pessoa("Erivelton", "12345678");
		String nome = p1.getNome();
		String CPF = p1.getCPF();
		Escrever.escreverArquivo("teste.txt", "Nome = " + nome + "\n" );
		Escrever.escreverArquivo("teste.txt", "CPF = " + CPF + "\n" );
	}

}
