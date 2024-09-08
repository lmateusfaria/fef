<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1" %>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>


        <!-- Css da pagina -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        
        <!-- JQuery -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.maskMoney.min.js"></script>
        
        <!-- Importa??o da minha biblioteca de javascript -->
        <script src="${pageContext.request.contextPath}/js/app.js" type="text/javascript"></script>
        
        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        
        <!-- Datatable -->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css"/>
        <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js" type="text/javascript"></script>
        
        <!-- Mensagem alerta -->
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10.3.1/dist/sweetalert2.all.min.js" type="text/javascript">         
        </script>

<h2>Editoras</h2>
<table id="datatable" class="display">
    <thead>
        <tr>
            <th align="left">ID</th>
            <th align="left">Nome</th>
            <th align="right"></th>
            <th align="right"></th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach var="editora" items="${editoras}">
            <tr>
                <td align="left">${editora.idEditora}</td>
                <td align="left">${editora.nomeEditora}</td>

                <td align="center">
                    <a href="${pageContext.request.contextPath}/EditoraExcluir?idEditora=${editora.idEditora}">Excluir</a>
                </td>
                <td align="center">
                    <a href="${pageContext.request.contextPath}/EditoraCarregar?idEditora=${editora.idEditora}">Alterar</a>
                </td>
                
            </tr>
        </c:forEach>
            
    </tbody>
    
</table>
<div align="center">
    <a href="${pageContext.request.contextPath}/EditoraNova">Novo</a>
    <a href="/AppBiblioteca">Voltar à Página Inicial</a>
</div>
    
    <script>
        $(document).ready(function(){
        console.log('eentrei ready');
        //Carregamos a datable
        //$("#datatable").DataTable({});
        $('#datatable').DataTable({
          "oLanguage": {
              "sProcessing": "Processando...",
              "sLengthMenu": "Mostrar _MENU_ registros",
              "sZeroRecords": "Nenhum registro encontrado.",
              "sInfo": "Mostrando de _START_ até _END_ de _TOTAL_,registros",
              "sInfoEmpty": "Mostrando de 0 até 0 de 0 registros",
              "sInfoFiltered": "",
              "sInfoPostFix":"",
              "sSearch": "Buscar:",
              "sUrl": "",
              "oPaginate": {
               "sFirst": "Primeiro",
               "sPrevious": "Anterior",
               "sNext": "Seguinte",
               "sLast": "Último",
              }
          }  
            
        });
            
    }); 
        
    </script>
   
    <%@ include file="/footer.jsp"%>
    
   