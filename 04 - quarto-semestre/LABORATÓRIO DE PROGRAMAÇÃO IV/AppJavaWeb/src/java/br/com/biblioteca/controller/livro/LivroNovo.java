/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.biblioteca.controller.livro;

import br.com.biblioteca.dao.AutorDAO;
import br.com.biblioteca.dao.EditoraDAO;
import br.com.biblioteca.model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LM
 */
@WebServlet(name = "LivroNovo", urlPatterns = {"/LivroNovo"})
public class LivroNovo extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
            response.setContentType("text/html;charset=iso-8859-1");
            //Cria o Objeto de Estado Cidade e seta o id como zero
            Livro oLivro = new Livro();
            //busca uma lista de estados para alimentar a caixa de seleção na view(jsp)
            EditoraDAO aEditoraDAO = new EditoraDAO();
            request.setAttribute("editoras", aEditoraDAO.listar());
            
            AutorDAO oAutorDAO = new AutorDAO();
            request.setAttribute("autores", oAutorDAO.listar());
            
            //cria a variavel no servidor para armazenar no objeto de Cidade
            request.setAttribute("livro", oLivro);
            //Despacha o objeto de Cidade e a lista de estados para a pagina jsp
            request.getRequestDispatcher("cadastros/livro/livroCadastrar.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LivroNovo.class.getName()).log(Level.SEVERE, null, ex);
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
