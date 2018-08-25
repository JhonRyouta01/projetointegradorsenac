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


<form action="./CadastrarUsuarioServlet" method="post">
    
    <div class="form-group">
    
        <label for="codigo">Código</label>
        <input type="text" class="form-control col-2" id="codigo" name="codigo" readonly value="<%= usuario != null ? usuario.getId() : "" %>" >
    
    </div>
    
    <div class="form-group">
        
        <label for="nome">Nome</label>
        <input type="text" class="form-control" id="nome" placeholder="nome" name="nome" value="<%= usuario != null ? usuario.getNome() : "" %>" >
    
    </div
    
    <div class="form-group">
       
        <label for="telefone">Telefone</label>
        <input type="text" class="form-control" id="telefone" placeholder="telefone" name="telefone">
    
    </div>
    
    <div class="form-group">
       
        <label for="celular">Celular</label>
        <input type="text" class="form-control" id="celular" placeholder="celular" name="celular">
    
    </div>
    
    <div class="form-group">
       
        <label for="fax">Fax</label>
        <input type="text" class="form-control" id="fax" placeholder="fax" name="fax">
    
    </div>
    
    <div class="form-group">
       
        <label for="cep">CEP</label>
        <input type="text" class="form-control" id="cep" placeholder="cep" name="cep">
    
    </div>
    
    <div class="form-group">
       
        <label for="endereco">Endereco</label>
        <input type="text" class="form-control" id="endereco" placeholder="endereco" name="endereco">
    
    </div>
    
    <div class="form-group">
       
        <label for="Numero">Número</label>
        <input type="text" class="form-control" id="numero" placeholder="numero" name="numero">
    
    </div>
    
    <div class="form-group">
       
        <label for="bairro">Bairro</label>
        <input type="text" class="form-control" id="bairro" placeholder="bairro" name="bairro">
    
    </div>
    
    <div class="form-group">
       
        <label for="cidade">Cidade</label>
        <input type="text" class="form-control" id="cidade" placeholder="cidade" name="cidade">
    
    </div>
    
    <div class="form-group">
       
        <label for="uf">UF</label>
        <input type="text" class="form-control" id="uf" placeholder="uf" name="uf">
    
    </div>
    
    <div class="form-group">
       
        <label for="uf">UF</label>
        <input type="text" class="form-control" id="uf" placeholder="uf" name="uf">
    
    </div><div class="form-group">
       
        <label for="email">E-mail</label>
        <input type="text" class="form-control" id="email" placeholder="email" name="email">
    
    </div>
    
    <div class="form-group text-right">
      
        <button type="submit" class="btn btn-primary">Salvar</button>
        <button type="reset" class="btn btn-danger">Cancelar</button>
   
    </div>

</form>
        
        

<jsp:include page="../footer.jsp"/>