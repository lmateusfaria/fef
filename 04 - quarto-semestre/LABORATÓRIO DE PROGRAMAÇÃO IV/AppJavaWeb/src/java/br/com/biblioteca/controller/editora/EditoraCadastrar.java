/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.biblioteca.controller.editora;

import br.com.biblioteca.dao.EditoraDAO;
import br.com.biblioteca.dao.GenericDAO;
import br.com.biblioteca.model.Editora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FEF
 */
@WebServlet(name = "EditoraCadastrar", urlPatterns = {"/EditoraCadastrar"})
public class EditoraCadastrar extends HttpServlet {

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
        int idEditora = Integer.parseInt(request.getParameter("id_editora"));
        String nomeEditora = request.getParameter("nome_editora");
        String mensagem = "";
        
        Editora aEditora = new Editora();
        aEditora.setIdEditora(idEditora);
        aEditora.setNomeEditora(nomeEditora);      
        try {
            GenericDAO dao = new EditoraDAO();
            if (dao.cadastrar(aEditora)) {
                mensagem = "Editora cadastrada com sucesso";
            }else {
                mensagem = "Problema ao cadastrar Editora. Verifique os dados informados e tente novamente!";
            }
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("EditoraListar");
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Editora! Erro: "+ ex.getMessage());
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
