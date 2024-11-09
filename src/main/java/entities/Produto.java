/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author EDUARDO
 */
public class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Categoria categoria;

    public Produto(Integer id, String nome, Double preco, Integer quantidade, Categoria categoria) {
        this.id= id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double calcularValorTotal(){
        System.out.println("- - - Valor total dos produtos - - -");
        System.out.print("R$");
        return this.quantidade*this.preco;
    }

    @Override
    public String toString() {
        return 
                "| Id: "+this.id+"\n"+
                "| Nome: "+this.nome+"\n"+
                "| Preco: R$"+this.preco+"\n"+
                "| Quantidade: "+this.quantidade+"\n"+
                this.categoria+"\n";
    }
    
}
