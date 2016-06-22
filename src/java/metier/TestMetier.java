/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class TestMetier {
    public static void main(String[] args) {
        CreditMetier cm=new CreditMetier();
        System.out.println(cm.calculeMensualite(200000, 240, 4.5));
        
    }
    
}
