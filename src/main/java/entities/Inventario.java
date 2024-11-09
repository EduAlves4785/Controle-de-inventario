/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.List;

/**
 *
 * @author EDUARDO
 */
public class Inventario {

    private List<Produto> produtos;

    public Inventario(List<Produto> produtos) {
        this.produtos = produtos;
    }

    private int reescreveId() {
        int count = 0;
        for (Produto produto : produtos) {
            produto.setId(count);
            count++;
        }
        return count;
    }

    public void adicionarProduto(String nome, Double preco, Integer quantidade, Categoria categoria) {
        produtos.add(new Produto(reescreveId(), nome, preco, quantidade, categoria));
        System.out.println("- - - Produto adicionado com sucesso! - - -");
    }

    public void removerProduto(int produtoId) {
        if (produtoId >= produtos.size()) {
            System.out.println("- - - Produto nao encontrado! - - -");
            System.out.println("- - - - - Verifique o ID - - - - -");
        } else {
            System.out.println("- - - Produto: - - -");
            System.out.print(produtos.get(produtoId));
            System.out.println("- - - Removido com sucesso! - - -");
            produtos.remove(produtoId);
            reescreveId();
        }
    }

    public void listarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("- - - Nao ha produtos em estoque - - -");
        } else {
            System.out.println("- - - Lista de produtos - - -");
            int count = 0;
            for (Produto produto : produtos) {
                System.out.println("- - - Produto " + (count + 1) + " - - -");
                System.out.println(produtos.get(count));
                System.out.println(" ");
                count++;
            }
        }
    }

    public void buscarProduto(int produtoId) {
        if (produtoId < produtos.size()) {
            System.out.println("");
            System.out.println("- - - Produto encontrado! - - -");
            System.out.println(produtos.get(produtoId));
        } else {
            System.out.println("- - - Produto nao encontrado! - - -");
            System.out.println("- - Verifique a lista novamente! - -");
        }

    }

    public double calculaTotal() {
        double count = 0;
        System.out.println("- - - Total em estoque: - - -");
        for (Produto produto : produtos) {
            count += produto.getPreco() * produto.getQuantidade();
        }
        return count;
    }

}
