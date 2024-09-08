<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1" %>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

<form name="cadastrarcidade" action="CidadeCadastrar" method="POST">
    <table align="center" border="0">
        <thead>
            <tr>
                <th colspan="2" align="center">Cadastro de Cidade</th>
            </tr>
            <tr>
                <th colspan="2" align="center">${mensagem}</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="idcidade" id="idcidade" value="${cidade.idCidade}" readonly></td>
            </tr>
            <tr>
                <td>NOME: </td>
                <td><input type="text" name="nomecidade" id="nomecidade" value="${cidade.nomeCidade}" maxlength="50" size="50"></td>
            </tr>
            <tr>
                <td>Estado: </td>
                <td>
                    <select name="idestado" id="idestado">
                        <option value="">Selecione</option>
                        <c:forEach var="estado" items="${estados}">
                            <option value="${estado.idEstado}" ${cidade.estado.idEstado == estado.idEstado ? "selected":""}>
                                ${estado.nomeEstado}
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="hidden" name="situacao" id="situacao" value="${cidade.situacao}" readonly="readonly"/>
                </td>
                <td colspan="2" align="center">
                    <input type="submit" name="cadastrar" id="cadastrar" class="btn btn-success" value="Cadastrar"/>
                    <input type="reset" name="limpar" id="limpar" class="btn btn-outline-dark" value="Limpar"/>

                </td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <br>
                    <h5>
                        <a href="/AplCurso" class="btn btn-group-lg btn-secondary" >Voltar à Página Inicial
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-return-left" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5"/>
                            </svg>
                        </a>
                    
                    </h5>

                </td>
            </tr>

        </tbody>

    </table>

</form>