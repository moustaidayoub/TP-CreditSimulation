<%-- 
    Document   : VueCredit
    Created on : Apr 22, 2016, 11:55:21 AM
    Author     : Ayoub MOUSTAID
--%>
<%@page import="web.CreditModel"%>
<% 
    CreditModel creditModel=(CreditModel)request.getAttribute("creditModel"); 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulateur de Crédit</title>
        <link rel="Stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css"/>
    </head>
    <body>
        <div>
            <form action="controleur" method="post">
                <table>
                    <tr>
                        <td>Montant :</td>
                        <td><input type="text" name="montant" value="<%=creditModel.getMontant()%>"/></td>
                        <td>DH</td>
                    </tr>
                     <tr>
                        <td>Durée :</td>
                        <td><input type="text" name="duree" value="<%=creditModel.getDuree()%>"/></td>
                        <td>Mois</td>
                    </tr>
                     <tr>
                        <td>Taux :</td>
                        <td><input type="text" name="taux" value="<%=creditModel.getTaux()%>"/></td>
                        <td>%</td>
                    </tr>
                     <tr>
                        <td><input type="submit" value="calculer"/></td>
                    </tr>
                </table>
            </form>
            
        </div>
        <div>
            <table>
                <tr>
                    <td>Mensualité : </td>
                    <td><%=creditModel.getMensualite()%></td>
                    <td>DH</td>
                </tr>
            </table>
        </div>
    </body>
</html>
