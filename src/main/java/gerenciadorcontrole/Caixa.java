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
    private String status1;
    private String status2;
    
    public Caixa(){
    
}

    public Caixa(String dia, double valor, String status1,String status2) {
        this.dia = dia;
        this.valor = valor;
        this.status1 = status1;
        this.status2 = status2;
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

    public String getStatus1(Object selectedItem) {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2(Object selectedItem) {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }
        
}
