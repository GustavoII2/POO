package gustavoAyalaDosSantosSousa;

import java.util.Date;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos = new ArrayList<>();
    public Estoque(){
    }

        public void incluir(Produto p){
            if (produtos.size() > 0){
                for (Produto produto : produtos) {
                    if(p.getCodigo() == produto.getCodigo()){
                        return;
                    }
                }
                produtos.add(p);
            }
            else{
                produtos.add(p);
            }} 
        
        public void comprar(int cod, int quant, double preco){
            for (Produto produto : produtos) {
                if(cod == produto.getCodigo()){
                    produto.compra(quant, preco);
        }}
        return;
        }
        
        public double vender(int cod, int quant){
                        for (Produto produto : produtos) {
                if(cod == produto.getCodigo()){
                    return produto.venda(quant);
        }}
        return -1;
        }
        
        public int quantidade(int cod){
            for (Produto i : produtos) {
                if(cod == i.getCodigo())
                    return i.getQuantidade();
        }
        return -1;
    }
        
        public String movimentacao(int cod, Date inicio, Date fim) {
            StringBuilder movimentacoes = new StringBuilder();
    
            for (Produto produto : produtos) {
                if (cod == produto.getCodigo()) {
                    for (Movimento movimento : produto.getMovimentos()) {
                        if (movimento.getData().after(inicio) && movimento.getData().before(fim)) {
                            movimentacoes.append(movimento.toString());
                        }
                    }
                }
            }
            
            return movimentacoes.toString();
        }
        
        public ArrayList<Fornecedor> fornecedores(int cod){
            for (Produto i : produtos) {
                if(cod == i.getCodigo()){
                    return i.getFornecedores();
                }
                
            }
            return new ArrayList<Fornecedor>();
        }
        
        public ArrayList<Produto> estoqueAbaixoDoMinimo(){
            ArrayList<Produto> abaixoDoEstoque = new ArrayList<>();
            for (Produto i : produtos) {
                if(i.getQuantidade()< i.getEstoqueMinimo() ){
                    abaixoDoEstoque.add(i);
                }
            }
            return abaixoDoEstoque;
        }
        
        public void adicionarFornecedor(int cod, Fornecedor f){
            for (Produto i : produtos) {
                if(cod == i.getCodigo()){
                    i.fornecedores.add(f);
                }
            }
            return;
        }
        
        public double precoDeVenda(int cod){
            for (Produto produto : produtos) {
                if(cod == produto.getCodigo()){
                    return produto.getPreçoDeVenda();
                }
            }
            return -1;

        }

        public double precoDeCompra(int cod){
            for (Produto produto : produtos) {
                if(cod == produto.getCodigo()){
                    return produto.getPreçoDeCompra();
                }
            }
            return -1;

        }
        
      }
      
