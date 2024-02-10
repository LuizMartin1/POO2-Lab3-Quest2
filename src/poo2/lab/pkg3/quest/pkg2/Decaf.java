/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Decaf implements Cafe {

    @Override
    public String getDescricao() {
        return "Cafe descafeinado\n";
    }

    @Override
    public double calculaCusto() {
        return 1.50;
    }
    
}
