// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
// Conjunto de objetos de estados pre definidos
// Enum valores que não sofrem alteração com constancia 

public enum EstadoBrasileiro {
    // Constante de objeto (maiúsculo), pois são imutáveis
    // Todos os objetos no enum devem ficar antes do ponto e virgula >  ;
	SAO_PAULO ("SP","São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 14),
	PIAUI ("PI", "Piauí", 5),
	MARANHAO ("MA","Maranhão", 12),
    CEARA ("CE", "Ceará", 7)
    ;
	
	private String nome;
	private String sigla;
    //adicionando nova propriedade
    private int ibge;
	
    //o construtor é privado, só a classe tem acesso
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
        this.ibge = ibge;
	}

    //métodos publicos para resgatar os valores
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
    public int getIbge() {
        return ibge;
    }
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
