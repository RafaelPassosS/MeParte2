/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.kamilla.pkg2;

/**
 *
 * @author rafin
 */
public class Produto {
    private String codigo;
    private String descricao;
    private String marca;
    private String modelo;
    private double valor;
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void cadastrarProduto(String codigo, String descricao, String marca, String modelo, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        
        System.out.print("Produto Cadastrado com sucesso!");
    }
}

