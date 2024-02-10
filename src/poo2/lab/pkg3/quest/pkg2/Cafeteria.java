/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FAZENDO O PEDIDO DE UM ESPRESSO PERSONALIZADO
        Cafe pedido1 = new Espresso();
        Cafe espressoPedido1 = new Leite(new Canela(new Chocolate(pedido1)));
        String descPedido1 = espressoPedido1.getDescricao();
        double precoPedido1 = espressoPedido1.calculaCusto();
        System.out.println("Preparando seu Espresso personalizado...\n");
        System.out.println(descPedido1);
        System.out.println("R$" + precoPedido1);
        
        //FAZENDO PEDIDO DE UM DESCAFEINADO COM LEITE E CANELA
        Cafe pedido2 = new Decaf();
        Cafe decafPedido2 = new Leite(new Canela(pedido2));
        String descPedido2 = decafPedido2.getDescricao();
        double precoPedido2 = decafPedido2.calculaCusto();
        System.out.println("Preparando seu cafe descafeinado personalizado...\n");
        System.out.println(descPedido2);
        System.out.println("R$" + precoPedido2);
    }
    
}
