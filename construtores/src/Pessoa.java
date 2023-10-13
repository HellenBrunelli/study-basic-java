public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;

	// método construtor, garante que na inicialização do método 
	// ja seja solicitada as variaveis relevantes para a existência de um objeto
	// o nome deverá ser igual ao nome da classe
	//o this é usado no lugar do setter
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
