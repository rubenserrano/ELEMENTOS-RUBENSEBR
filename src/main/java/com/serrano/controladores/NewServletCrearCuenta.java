/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.serrano.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ruben
 */
public class NewServletCrearCuenta extends HttpServlet {

    
   
    /**
     * lo volvemos publico para que lo vean todos 
     * en los dos argumentos el promero resibe la informacion del cliente y el otro la inf a mostrar
     */
    public  void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher despachador= request.getRequestDispatcher("/chica-hermosa.jsp");
        despachador.forward(request, response);
    }

   
}
