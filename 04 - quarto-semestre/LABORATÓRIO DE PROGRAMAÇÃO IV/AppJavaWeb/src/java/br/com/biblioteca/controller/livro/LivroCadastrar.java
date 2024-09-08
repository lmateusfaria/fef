/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.biblioteca.controller.livro;

import br.com.biblioteca.dao.GenericDAO;
import br.com.biblioteca.dao.LivroDAO;
import br.com.biblioteca.model.Autor;
import br.com.biblioteca.model.Editora;
import br.com.biblioteca.model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LM
 */
@WebServlet(name = "LivroCadastrar", urlPatterns = {"/LivroCadastrar"})
public class LivroCadastrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idLivro = Integer.parseInt(request.getParameter("id_livro"));
        
        String titulo = request.getParameter("titulo");
        String isbn = request.getParameter("isbn");
        String numero_paginas = request.getParameter("numero_paginas");
        String tipo_capa = request.getParameter("tipo_capa");
        
        String mensagem = "";
        
        int idEditora = Integer.parseInt(request.getParameter("id_editora"));
        int idAutor = Integer.parseInt(request.getParameter("id_autor"));

        try {

            Livro oLivro = new Livro();
            oLivro.setIdLivro(idLivro);
            oLivro.setTitulo(titulo);
            oLivro.setIsbn(isbn);
            oLivro.setNumeroPaginas(numero_paginas);
            oLivro.setTipoCapa(tipo_capa);
            
            
            oLivro.setEditora(new Editora(idEditora,""));
            oLivro.setAutor(new Autor(idAutor,""));
            
            
            GenericDAO dao = new LivroDAO();
            if (dao.cadastrar(oLivro)) {
                mensagem = "Livro cadastrado com sucesso";
            } else {
                mensagem = "Problema ao cadastrar Livro. Verifique os dados informados e tente novamente!";
            }
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("LivroListar");
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Estado! Erro: " + ex.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
