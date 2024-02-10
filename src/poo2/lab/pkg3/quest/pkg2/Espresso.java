/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Espresso implements Cafe{
    
    @Override
    public String getDescricao() {
        return "Cafe Espresso\n";
    }

    @Override
    public double calculaCusto() {
        return 3.00;
    }
}
