package gustavoAyalaDosSantosSousa;

import java.util.ArrayList;
import java.util.Date;


public class Produto {
    int codigo;
	String descrição;
	double preçoDeVenda;
	double preçoDeCompra;
    double lucro;
	int quantidade;
	int estoqueMinimo;
 	ArrayList<Fornecedor> fornecedores = new ArrayList<>();
	ArrayList<Movimento> movimentos = new ArrayList<>();



	public Produto(int cod, String desc, int min, double lucro){
		this.codigo = cod;
		this.descrição = desc; 
		this.estoqueMinimo = min;
		this.lucro = lucro;
	}
	
	public void compra(int quant, double val){ 
        if (quant<=0 || val <= 0){
            return ;
        }
        else {
		this.preçoDeCompra = (this.preçoDeCompra * this.quantidade + val * quant )/(quant + this.quantidade);
		this.quantidade = quant + this.quantidade;
		this.preçoDeVenda = this.preçoDeCompra + (this.preçoDeCompra * lucro); 
		Movimento mov = new Movimento("Compra", val, quant, new Date());
		movimentos.add(mov);
	}}
	
	public double venda(int quant){
       if (quant > quantidade ||  quant <= 0 ){
        return -1;
       }
       else{
        quantidade = quantidade - quant;
		Movimento mov = new Movimento("Venda", preçoDeVenda, quant, new Date());
		movimentos.add(mov);
       return (quant * preçoDeVenda);
    }}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public double getPreçoDeVenda() {
		return preçoDeVenda;
	}

	public void setPreçoDeVenda(double preçoDeVenda) {
		this.preçoDeVenda = preçoDeVenda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

        public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    public double getPreçoDeCompra() {
        return preçoDeCompra;
    }

    public void setPreçoDeCompra(double preçoDeCompra) {
        this.preçoDeCompra = preçoDeCompra;
    }
	
	 public ArrayList<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
}