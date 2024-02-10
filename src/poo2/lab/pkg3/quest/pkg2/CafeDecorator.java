/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class CafeDecorator implements Cafe {
    protected Cafe cafe;
    
    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }
    
    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto();
    }
}
