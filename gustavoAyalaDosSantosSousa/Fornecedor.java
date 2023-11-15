package gustavoAyalaDosSantosSousa;

public class Fornecedor {

    int CNPJ;
    String nome;
	Produto produto;
    
	public Fornecedor(int cnpj, String nome) {
		CNPJ = cnpj;
		this.nome = nome;
	}

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

