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
import perro.model.Mascota;
import perro.model.Perro;
import perro.model.Persona;
import perro.model.Gato;

/**
 *
 * @author Ruben
 */
public class ServletRegistro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Mascota  mascota =  new Gato(); 
        /**
         * Este es el problema ya que gato aparece  se le llama inyeccion  dependencia.
         * Arquitectura Orientada a objetos reutilizacion de codigo
         * De igual forma se le llama SOA Arquitencuta Orientada a Servicios. <<<Se reutiliza software
         */
        
        Persona yo=new  Persona();
        yo.setMascota(mascota);    
        
       request .setAttribute("registro", yo);
       RequestDispatcher despachador = request.getRequestDispatcher("/registro.jsp");
       despachador.forward(request, response);
                
        
    }

}
