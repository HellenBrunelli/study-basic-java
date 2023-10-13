//arquivo Aluno.java COM JAVA BEANS
public class Aluno {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}


// arquivo Aluno.java sem JAVA BEANS
// public class Aluno {
// 	String nome;
// 	int idade;
// }



