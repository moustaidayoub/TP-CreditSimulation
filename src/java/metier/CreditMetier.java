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
public class CreditMetier {
    public double calculeMensualite(double c,int duree,double taux)
    {
    double tauxExact=taux/100;
    double a=c*tauxExact/12;
    double b=1-Math.pow(1+tauxExact/12, -1*duree);
    return a/b;
    }
    
}
