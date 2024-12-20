/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.curso.controller.cidade;

import br.com.curso.dao.CidadeDAO;
import br.com.curso.dao.GenericDAO;
import br.com.curso.model.Cidade;
import br.com.curso.model.Estado;
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
@WebServlet(name = "CidadeCadastrar", urlPatterns = {"/CidadeCadastrar"})
public class CidadeCadastrar extends HttpServlet {

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
        int idCidade = Integer.parseInt(request.getParameter("idcidade"));
        int idEstado = Integer.parseInt(request.getParameter("idestado"));

        String nomeCidade = request.getParameter("nomecidade");
        String situacao = request.getParameter("situacao");
        String mensagem = "";

        try {

            Cidade oCidade = new Cidade();
            oCidade.setIdCidade(idCidade);
            oCidade.setNomeCidade(nomeCidade);
            oCidade.setSituacao(situacao);
            oCidade.setEstado(new Estado(idEstado,"",""));
            
            GenericDAO dao = new CidadeDAO();
            if (dao.cadastrar(oCidade)) {
                mensagem = "Cidade cadastrada com sucesso";
            } else {
                mensagem = "Problema ao cadastrar Cidade. Verifique os dados informados e tente novamente!";
            }
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("CidadeListar");
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
