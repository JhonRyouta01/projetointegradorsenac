
<%@page import="br.com.senac.agenda.model.Usuario"%>
<jsp:include page="../header.jsp"/>

<%
    Usuario usuario = (Usuario) request.getAttribute("usuario");
    String mensagem = (String) request.getAttribute("mensagem");
    String erro = (String) request.getAttribute("erro");

%>

<% if (mensagem != null) {%>

<div class="alert alert-success" role="alert">
    
    <%= mensagem%>

</div>

<%}%>

<% if (erro != null) {%>

<div class="alert alert-danger" role="alert">
  
    <%= erro%>
</div>

<%}%>

<form action="./SalvarUsuarioServlet" method="post">
    
    <div class="form-group">
    
        <label for="codigo">Código</label>
        <input type="text" class="form-control col-2" id="codigo" name="codigo" readonly value="<%= usuario != null ? usuario.getId() : "" %>" >
    
    </div>
    
    <div class="form-group">
        <label for="nome">Nome</label>
        <input type="text" class="form-control" id="nome" placeholder="nome" name="nome" value="<%= usuario != null ? usuario.getNome() : "" %>" >
    </div>
    <div class="form-group">
        <label for="senha">Senha</label>
        <input type="password" class="form-control" id="senha" placeholder="senha" name="senha">
    </div>
    <div class="form-group text-right">
        <button type="submit" class="btn btn-primary">Salvar</button>
        <button type="reset" class="btn btn-danger">Cancelar</button>
    </div>
</form>

<jsp:include page="../footer.jsp"/>