package teste;


public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Erivelton","Sousa", "12345678", 1 , "A", 2021);
		Professor p1 = new Professor("Erivelton", "Sousa", "12345678", 1, "Principal","Sim", 2010);
		Fornecedor f1 = new Fornecedor("Sodexo", "123456789", "Legal", 1, "eriveltondesousa26@gmail.com", "11969753018");
		Escrever.escreverArquivo("alunos.txt", a1.toString());
		Escrever.escreverArquivo("professores.txt", p1.toString());
		Escrever.escreverArquivo("fornecedores.txt", f1.toString());
	}

}
