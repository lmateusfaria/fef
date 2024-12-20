<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1" %>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>
<html>
    
    <body>
        <h2>Cidades</h2>
        <table id="datatable" class="display">
            <thead>
                <tr>
                    <th align="left">ID</th>
                    <th align="left">Cidade</th>
                    <th align="left">Estado</th>
                    <th align="right"></th>
                    <th align="right"></th>

                </tr>
            </thead>
            <tbody>
                <c:forEach var="cidade" items="${cidades}">
                    <tr>
                        <td align="left">${cidade.idCidade}</td>
                        <td align="left">${cidade.nomeCidade}</td>
                        <td align="left">${cidade.estado.siglaEstado}</td>
                        <td align="center">
                            <a href="${pageContext.request.contextPath}/CidadeExcluir?idCidade=${cidade.idCidade}">
                                <button class="btn btn-group-lg <c:out value="${cidade.situacao == 'A' ? 'btn-danger':'btn-success'}"/> ">
                                    
                                    <c:out value="${cidade.situacao == 'A' ? 'Inativar' : 'Ativar'}"/>
                                </button>
                            </a>
                        </td>
                        <td align="center">
                            <a href="${pageContext.request.contextPath}/CidadeCarregar?idCidade=${cidade.idCidade}">
                                <button class="btn btn-group-lg btn-warning">Alterar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-fill" viewBox="0 0 16 16">
  <path d="M12.854.146a.5.5 0 0 0-.707 0L10.5 1.793 14.207 5.5l1.647-1.646a.5.5 0 0 0 0-.708zm.646 6.061L9.793 2.5 3.293 9H3.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.207zm-7.468 7.468A.5.5 0 0 1 6 13.5V13h-.5a.5.5 0 0 1-.5-.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.5-.5V10h-.5a.5.5 0 0 1-.175-.032l-.179.178a.5.5 0 0 0-.11.168l-2 5a.5.5 0 0 0 .65.65l5-2a.5.5 0 0 0 .168-.11z"/>
</svg>
                                
                                </button>
                            </a>
                        </td>

                    </tr>
                </c:forEach>

            </tbody>

        </table>
        <div align="center">
            <a href="${pageContext.request.contextPath}/CidadeNovo" class="btn btn-group-lg btn-primary">
                
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-square" viewBox="0 0 16 16">
  <path d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2z"/>
  <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
</svg>
                Novo
            
            
            
            </a>
            
            
            <a href="/AplCurso" class="btn btn-group-lg btn-secondary">Voltar � P�gina Inicial
            
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-return-left" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5"/>
                            </svg>
            </a>
        </div>

        
        <hr>
    </body>
</html>

<%@ include file="/footer.jsp"%>

