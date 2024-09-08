<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1" %>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

<form name="cadastrarlivro" action="LivroCadastrar" method="POST">
    <table align="center" border="0">
        <thead>
            <tr>
                <th colspan="2" align="center">Cadastro de Livro</th>
            </tr>
            <tr>
                <th colspan="2" align="center">${mensagem}</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id_livro" id="id_livro" value="${livro.idLivro}" readonly></td>
            </tr>
            <tr>
                <td>TITULO: </td>
                <td><input type="text" name="titulo" id="titulo" value="${livro.titulo}"></td>
            </tr>
            <tr>
                <td>ISBN: </td>
                <td><input type="text" name="isbn" id="isbn" value="${livro.isbn}"></td>
            </tr>
            <tr>
                <td>Nº DE PÁGINAS: </td>
                <td><input type="text" name="numero_paginas" id="numero_paginas" value="${livro.numeroPaginas}"></td>
            </tr>
            
            <tr>
                <td>TIPO DE CAPA: </td>
                <td><input type="text" name="tipo_capa" id="tipo_capa" value="${livro.tipoCapa}"></td>
            </tr>
            
            <tr>
                <td>EDITORA: </td>
                <td>
                    <select name="id_editora" id="id_editora">
                        <option value="">Selecione</option>
                        <c:forEach var="editora" items="${editoras}">
                            <option value="${editora.idEditora}" ${livro.editora.idEditora == editora.idEditora ? "selected":""}>
                                ${editora.nomeEditora}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            
            <tr>
                <td>AUTOR: </td>
                <td>
                    <select name="id_autor" id="id_autor">
                        <option value="">Selecione</option>
                        <c:forEach var="autor" items="${autores}">
                            <option value="${autor.idAutor}" ${livro.autor.idAutor == autor.idAutor ? "selected":""}>
                                ${autor.nomeAutor}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="cadastrar" id="cadastrar" class="btn btn-success" value="Cadastrar"/>
                    <input type="reset" name="limpar" id="limpar" class="btn btn-outline-dark" value="Limpar"/>
                    
                </td>
            </tr>
            
            <tr>
                <td align="center" colspan="2">
                    <br>
                    <h5><a href="/AppBiblioteca" class="btn btn-group-lg btn-secondary" >Voltar à Página Inicial
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-return-left" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5"/>
                            </svg>
                    </a></h5>
                
                </td>
            </tr>

        </tbody>

    </table>

</form>