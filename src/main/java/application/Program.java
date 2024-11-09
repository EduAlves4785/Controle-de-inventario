package application;

import entities.Categoria;
import entities.Inventario;
import entities.Produto;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Inventario inventario = new Inventario(new ArrayList<Produto>());

        char isExit = 'T';

        System.out.println("******************************************");
        System.out.println("*                                        *");
        System.out.println("*        CONTROLE DE INVENTARIO          *");
        System.out.println("*                                        *");
        System.out.println("******************************************");
        System.out.println("*        Gerencie seus produtos          *");
        System.out.println("*        e controle o estoque            *");
        System.out.println("******************************************");
        while (isExit == 'T') {

            System.out.println("");
            System.out.println("Selecione uma operacao digitando seu respectivo numero: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Buscar produto");
            System.out.println("5 - Calcular valor total do estoque");
            System.out.print(":");
            int operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Digite o preco do produto: ");
                double preco = sc.nextDouble();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();
                System.out.print("Digite o nome da categoria do produto: ");
                sc.nextLine();
                String categoriaProduto = sc.nextLine();
                System.out.print("Digite a descricao da categoria: ");
                String descricaoCategoria = sc.nextLine();
                
                inventario.adicionarProduto(nome, preco, quantidade, new Categoria(categoriaProduto, descricaoCategoria));
            }
            if (operacao == 2) {
                System.out.print("Digite o ID do produto que sera removido: ");
                int idDeleta = sc.nextInt();
                inventario.removerProduto(idDeleta);
            }
            
            if (operacao == 3){
                inventario.listarProdutos();
            }
            
            if(operacao==4){
                System.out.print("Digite o ID do produto desejado: ");
                int id=sc.nextInt();
                inventario.buscarProduto(id);
            }
            
            if(operacao==5){
                System.out.println("R$"+inventario.calculaTotal());
            }
            
            if(operacao!=1 && operacao!=2 && operacao!=3 && operacao!=4 && operacao!=5){
                System.out.println("- - - Operacao invalida! - - -");
            }
        }

        sc.close();
    }

}
