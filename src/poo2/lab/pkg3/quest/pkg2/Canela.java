/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Canela extends CafeDecorator {
    
    public Canela(Cafe cafe){
        super(cafe);
    }
    
    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + "Adicionando canela...\n";
    }

    @Override
    public double calculaCusto() {
        return super.cafe.calculaCusto() + 2.00;
    }
}
