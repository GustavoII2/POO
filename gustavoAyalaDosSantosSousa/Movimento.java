package gustavoAyalaDosSantosSousa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimento {
    private String tipo;
    private double valor;
    private int quantidade;
    private Date data;

        public Movimento(String tipo,double valor, int quantidade, Date data){
            this.tipo = tipo;
            this.valor = valor;
            this.quantidade = quantidade;
            this.data = data;        

        }

        public String toString(){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dtStr = dateFormat.format(data);
            String texto = ". " + getTipo() + ". Valor: " + getValor() + ". Quant: " + getQuantidade() + ".\n";
            return dtStr + texto;
        }

        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        public double getValor() {
            return valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public int getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        public Date getData() {
            return data;
        }
        public void setData(Date data) {
            this.data = data;
        }  

}