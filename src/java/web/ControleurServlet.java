/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.CreditMetier;

/**
 *
 * @author Ayoub MOUSTAID
 */
@WebServlet(name="cs",urlPatterns={"/controleur","*.php"})
public class ControleurServlet extends HttpServlet {
    private CreditMetier metier;

    @Override
    public void init() throws ServletException {
        metier=new CreditMetier();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
    {
    double montant=Double.parseDouble(req.getParameter("montant"));
    int duree=Integer.parseInt(req.getParameter("duree"));
    double taux=Double.parseDouble(req.getParameter("taux"));
    CreditModel creditModel=new CreditModel();
    creditModel.setMontant(montant);
    creditModel.setDuree(duree);
    creditModel.setTaux(taux);
   
    double result=metier.calculeMensualite(montant, duree, taux);
   
    creditModel.setMensualite(result);
    req.setAttribute("creditModel", creditModel);
        req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("creditModel", new CreditModel());
        req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
    }
    
    
    
    
}
