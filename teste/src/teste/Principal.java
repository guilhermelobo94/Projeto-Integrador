package teste;


public class Principal {

	public static void main(String[] args) {
		//PessoaFisica p1 = new PessoaFisica("Erivelton","Sousa", "12345678");
		//Aluno a1 = new Aluno("Erivelton","Sousa", "12345678", 1 , "A", 2021);
		//Professor p1 = new Professor("Erivelton", "Sousa", "12345678", 1, "Principal","Sim", 2010);
		//Escrever.escreverArquivo("teste.txt", a1.toString());
		//PessoaJuridica p1 = new PessoaJuridica("Sodexo", "123456789", "Legal");
		Fornecedor f1 = new Fornecedor("Sodexo", "123456789", "Legal", 1, "eriveltondesousa26@gmail.com", "11969753018");
		System.out.println(f1.toString());
	}

}
