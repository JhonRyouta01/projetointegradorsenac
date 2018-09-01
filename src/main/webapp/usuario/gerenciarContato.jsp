<%@page import="br.com.senac.agenda.model.Contato"%>
<%@page import="br.com.senac.agenda.model.Usuario"%>
<jsp:include page="../header.jsp"/>

<%
    Contato contato = (Contato) request.getAttribute("contato");
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



<form action="./SalvarContatoServlet" method="post">
    <div class="form-group">

        <label for="codigo">Código</label>
        <input type="text" class="form-control col-2" id="codigo" name="codigo" readonly value="<%= contato != null ? contato.getId() : ""%>" >

    </div>

    <div class="form-group">

        <label for="nome">Nome</label>
        <input type="text" class="form-control" id="nome" placeholder="nome" name="nome" value="<%= contato != null ? contato.getNome() : ""%>" >

    </div>

    <div class="row">

        <div class="col-4"
             <label for="telefone">Telefone</label>
            <input type="text" class="form-control col-15" id="telefone" placeholder="telefone" name="telefone">
        </div>

        <div class="col-4">

            <label for="celular">Celular</label>
            <input type="text" class="form-control col-15" id="celular" placeholder="celular" name="celular">

        </div>

        <div class="col-4">
            <label for="fax">Fax</label>
            <input type="text" class="form-control col-15" id="fax" placeholder="fax" name="fax"> 
        </div>

    </div>


    <div class="row">

        <div class="col-3"> 

            <label for="cep">CEP</label>
            <input type="text" class="form-control col-15" id="cep" placeholder="cep" name="cep">

        </div>


        <div class="col-7">

            <label for="endereco">Endereco</label>
            <input type="text" class="form-control col-15" id="endereco" placeholder="endereco" name="endereco">

        </div>

        <div class="col-2">

            <label for="Numero">Número</label>
            <input type="text" class="form-control col-15" id="numero" placeholder="numero" name="numero">

        </div>


    </div>

    <div class="row">

        <div class="col-4"

             <label for="bairro">Bairro</label>
            <input type="text" class="form-control col-15" id="bairro" placeholder="bairro" name="bairro">

        </div>


        <div class="col-6">

            <label for="cidade">Cidade</label>
            <input type="text" class="form-control col-15" id="cidade" placeholder="cidade" name="cidade">

        </div>

        <div class="col-2">

            <label for="uf">UF</label>
            <select name="uf" class="form-control col-15" id="uf" placeholder="uf" name="uf">
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


    </div>

    <div class="row">

        <div class="col-12">

            <label for="email">E-mail</label>
            <input type="text" class="form-control col-15" id="email" placeholder="email" name="email">
        </div>
    </div>

    <div class="form-group text-right">

        <div>
            <button type="submit" class="btn btn-primary">Salvar</button>
            <button type="reset" class="btn btn-danger">Cancelar</button>

        </div>
    </div>

</form>



<jsp:include page="../footer.jsp"/>