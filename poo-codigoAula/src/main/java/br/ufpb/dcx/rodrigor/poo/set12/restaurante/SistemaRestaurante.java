package br.ufpb.dcx.rodrigor.poo.set12.restaurante;

import br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria.Hamburguer;
import br.ufpb.dcx.rodrigor.poo.set12.restaurante.hamburgueria.Hamburgueria;
import br.ufpb.dcx.rodrigor.poo.set12.restaurante.pizzaria.Pizzaria;

import java.util.Scanner;

public class SistemaRestaurante {


    private Restaurante restaurante;

    public SistemaRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    }

    public static void main(String[] args) {
        
        SistemaRestaurante sistema = new SistemaRestaurante(new Hamburgueria("Thiago"));
        sistema.printMenu();
    }

    public void printMenu(){
        for(String item: restaurante.listarMenu()){
            System.out.println(item);
        }

    }
    public void adicionarMenu(){
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite o nome do pedido");
        String pedido = leitor.nextLine();
        Hamburguer novopedido = new Hamburguer(pedido);
        SistemaRestaurante.listarMenu;


    }

}
