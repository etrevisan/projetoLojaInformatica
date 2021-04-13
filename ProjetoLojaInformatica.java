/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolojainformatica;

/**
 *
 * @author emill
 */
public class ProjetoLojaInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item1 = new Item(001,"mouse",0,90.00);
        double exibetot1 = item1.getTotal(0, 90.00);
        System.out.println("O total é "+exibetot1);
        
        Item item2 = new Item(002,"teclado",3,80.00);
        double exibetot2 = item2.getTotal(3, 80.00);
        System.out.println("O total é "+exibetot2);
    }
    
}
