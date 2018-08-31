<%@page import="br.com.senac.agenda.model.Contato" %>
<jsp:include page="../header.jsp"/>
<% String mensagem = (String) request.getAttribute("mensagem");%>
<% Contato contato = (Contato) request.getAttribute("contato");%>

<% if (mensagem != null){%>

<div class="alert alert-sucess">
    <%= mensagem%>
</div>
<%}%>

<form action="./SalvarContatoServlet" method="post" >
    <div class="form-group" >
        <label for="codigo">Código:</label> 
        <input name="codigo" class="form-control col-2" id="codigo" type="text" readonly value="<%= contato != null ? contato.getCodigo() :"" %>" />
    </div>
    <div class="form-group" >
        <label for="nome">Nome:</label> 
        <input name="nome" id="nome" class="form-control" type="text" placeholder="nome" value="<%= contato != null ? contato.getNome():"" %>" />
    </div>
    
    <div class="row">
    <div class="form-group col-4">
        <label for="telefone" >Telefone:</label> 
        <input name="telefone" id="telefone" class="form-control" type="text" placeholder="nome" value="<%= contato != null ? contato.getTelefone():"" %>" >
    </div>
    <div class="form-group col-4">
        <label for="celular" >Celular:</label> 
        <input id="celular" name="celular" class="form-control" type="text" placeholder="senha" value="<%= contato != null ? contato.getCelular():"" %>" />
    </div>
    <div class="form-group col-4">
        <label for="fax" >Fax:</label> 
        <input id="fax" name="fax" class="form-control" type="text" placeholder="senha" value="<%= contato != null ? contato.getFax():"" %>" />
    </div>
    </div>    
    
    <div class="row">
    <div class="form-group col-3">
        <label for="cep" >CEP:</label> 
        <input name="cep" id="cep" class="form-control" type="text" placeholder="nome" value="<%= contato != null ? contato.getCep():"" %>" />
    </div>
    <div class="form-group col-6" >
        <label for="endereco" >Endereço:</label> 
        <input id="endereco" name="endereco" class="form-control" type="text" placeholder="senha" value="<%= contato != null ? contato.getEndereco() :"" %>" />
    </div>
    <div class="form-group col-3" >
        <label for="numero" >Número:</label> 
        <input id="numero" name="numero" class="form-control" type="text" placeholder="senha"  value="<%= contato != null ? contato.getNumero():"" %>" />
    </div>
    </div>
    
    <div class="row">
    <div class="form-group col-4">
        <label for="bairro" >Bairro:</label> 
        <input name="bairro" id="bairro" class="form-control" type="text" placeholder="nome"  value="<%= contato != null ? contato.getBairro():"" %>" />
    </div>
    <div class="form-group col-5" >
        <label for="cidade" >Cidade:</label> 
        <input id="cidade" name="cidade" class="form-control" type="text" placeholder="senha" value="<%= contato != null ? contato.getCidade():"" %>" />
    </div>
    <div class="form-group col-3" >
        <label for="uf" >UF:</label> 
        <input id="uf" name="uf" class="form-control" type="text" placeholder="senha" value="<%= contato != null ? contato.getUf():"" %>" />
    </div>
    </div>
    
    <div class="form-group" >
        <label for="email">E-mail:</label> 
        <input name="email" id="email" class="form-control" type="text" placeholder="nome" value="<%= contato != null ? contato.getEmail():"" %>" />
    </div>
    
    <div class="form-group text-right">
        <button  type="submit" class="btn btn-danger mb-2" >Salvar</button>
        <button  type="submit" class="btn btn-primary mb-2" >Cancelar</button>
    </div>
</form>
<jsp:include page="../footer.jsp"/>