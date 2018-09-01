
<%@page import="br.com.senac.agenda.model.Contato"%>
<%@page import="java.util.List"%>
<jsp:include page="../header.jsp"/>

<% List<Contato> lista = (List) request.getAttribute("lista"); %> 
<% String mensagem = (String) request.getAttribute("mensagem"); %>

<% if (mensagem != null) {%>
<div class="alert alert-danger">
    <%= mensagem%>
</div>
<%}%>

<fieldset  >
    <legend>Pesquisa de Contatos</legend>
    <form class="form-inline" action="./ServletContatoPesquisa">
        <div class="form-group" style="padding: 20px;">
            <label for="txtCodigo" style="margin-right: 10px">Código:</label> 
            <input id="id" name="id" class="form-control form-control-sm" id="txtCodigo" type="text" />
        </div>
        <div class="form-group">
            <label for="nome" style="margin-right: 10px">Nome:</label> 
            <input name="nome" id="nome" class="form-control form-control-sm" type="text" />
        </div>
        
        <div class="form-group">
            <label for="nome" style="margin-right: 10px">Estado:</label> 
            <select name="uf" class="form-control form-control-sm" id="uf" placeholder="uf" name="uf">
                <option value="AC">AC</option>
                <option value="AL">AL</option>
                <option value="AP">AP</option>
                <option value="AM">AM</option>
                <option value="BA">BA</option>
                <option value="CE">CE</option>
                <option value="DF">DF</option>
                <option value="ES">ES</option>
                <option value="GO">GO</option>
                <option value="MA">MA</option>
                <option value="MT">MT</option>
                <option value="MS">MS</option>
                <option value="MG">MG</option>
                <option value="PA">PA</option>
                <option value="PB">PB</option>
                <option value="PR">PR</option>
                <option value="PE">PE</option>
                <option value="PI">PI</option>
                <option value="RJ">RJ</option>
                <option value="RN">RN</option>
                <option value="RS">RS</option>
                <option value="RO">RO</option>
                <option value="RR">RR</option>
                <option value="SC">SC</option>
                <option value="SP">SP</option>
                <option value="SE">SE</option>
                <option value="TO">TO</option> 
            </select>
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
            <th>Código</th> <th>Nome</th> <th>Endereco</th> <th>Telefone</th> <th>Celular</th> <th>Fax</th> <th>E-mail</th>
        </tr>
    </thead>

    <% if (lista != null && lista.size() > 0) {
            for (Contato c : lista) {
    %>
    <tr>
        <td><%= c.getId()%></td><td><%= c.getNome()%></td><td><%= c.getEndereco() + ", " + c.getNumero() + ", " + c.getBairro() + ", " + c.getCidade() + ", " + c.getUf()%></td> <td><%= c.getTelefone()%></td><td><%= c.getCelular()%></td><td><%= c.getFax()%></td><td><%= c.getEmail()%></td>
    </tr>

    <% } // for

    } else {%>

    <tr >
        <td  colspan="2">Não Existem registros.</td>
    </tr>

    <%}%>


</table>

<jsp:include page="../footer.jsp"/>