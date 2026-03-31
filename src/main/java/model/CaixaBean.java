/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class CaixaBean {
    private int id_caixa;
    private float valor;
    private String tipo;
    private String entrege;
    
public CaixaBean(){
    
}

    public CaixaBean(int id_caixa, float valor, String tipo, String entrege) {
        this.id_caixa = id_caixa;
        this.valor = valor;
        this.tipo = tipo;
        this.entrege = entrege;
    }

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntrege() {
        return entrege;
    }

    public void setEntrege(String entrege) {
        this.entrege = entrege;
    }

}
