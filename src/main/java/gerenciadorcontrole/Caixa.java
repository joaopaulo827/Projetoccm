/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadorcontrole;

/**
 *
 * @author Aluno
 */
public class Caixa {
    private String dia;
    private double valor;
    private String status;
    
    public Caixa(){
    
}

    public Caixa(String dia, double valor, String status) {
        this.dia = dia;
        this.valor = valor;
        this.status = status;
    }

    public String getDia(String name) {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor(java.lang.Double text) {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus(Object selectedItem) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
