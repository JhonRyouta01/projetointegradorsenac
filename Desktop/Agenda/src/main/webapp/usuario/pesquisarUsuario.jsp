
<%@page import="br.com.senac.agenda.model.Usuario"%>
<%@page import="java.util.List"%>
<jsp:include page="../header.jsp"/>

<% List<Usuario> lista = (List) request.getAttribute("lista"); %> 

<% String mensagem = (String) request.getAttribute("mensagem"); %>

<% if (mensagem != null) {%>

<div class="alert alert-danger">
    <%= mensagem%>
</div>

<% } %>

<fieldset  >
    <legend>Pesquisa de Usu�rios</legend>
    <form class="form-inline" action="./PesquisaUsuarioServlet">
        <div class="form-group" style="padding: 20px;">
            <label for="txtCodigo" style="margin-right: 10px">C�digo:</label> 
            <input id="id" name="id" class="form-control form-control-sm" id="txtCodigo" type="text" />
        </div>
        <div class="form-group">
            <label for="nome" style="margin-right: 10px">Nome:</label> 
            <input name="nome" id="nome" class="form-control form-control-sm" type="text" />
        </div>
        <button style="margin-left: 10px" type="submit" class="btn btn-default" >
            Pesquisar
        </button>
    </form>
</fieldset>

<hr />


<table class="table table-hover">
    <thead>
        <tr>
            <th>C�digo</th> <th>Nome</th>
        </tr>
    </thead>

    <% if (lista != null && lista.size() > 0) {
            for (Usuario u : lista) {
    %>
    <tr>
        <td><%= u.getId()%></td><td><%= u.getNome()%></td>
    </tr>

    <% } // for

    } else {%>

    <tr >
        <td  colspan="2">N�o Existem registros.</td>
    </tr>

    <%}%>


</table>







<jsp:include page="../footer.jsp"/>