/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class CreditModel {
    private double montant;
    private int duree;
    private double taux;
    private double mensualite;

    public CreditModel() {
    }

    
    public CreditModel(double montant, int duree, double taux, double mensualite) {
        this.montant = montant;
        this.duree = duree;
        this.taux = taux;
        this.mensualite = mensualite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getMensualite() {
        return mensualite;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }
    
    
}
