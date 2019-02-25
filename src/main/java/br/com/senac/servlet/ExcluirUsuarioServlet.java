/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.servlet;

import br.com.senac.agenda.dao.UsuarioDAO;
import br.com.senac.agenda.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sala302b
 */
@WebServlet(name = "ExcluirUsuarioServlet", urlPatterns = {"/usuario/ExcluirUsuarioServlet"})
public class ExcluirUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //    id = 1 & formNome = danie & formId = 1
        String id = request.getParameter("id");
        String formNome = request.getParameter("formNome");
        String formId = request.getParameter("formId");
        String erro = null;

        try {

            Integer codigo = null;
            if (id != null && !id.trim().isEmpty()) {

                codigo = Integer.parseInt(id);
            }

            Integer idPesquisa = null;
            if (formId != null && !formId.trim().isEmpty()) {

                idPesquisa = Integer.parseInt(formId);
            }

            String nome = null;

            if (formNome != null && !formNome.trim().isEmpty()) {
                nome = formNome;
            }

            UsuarioDAO dao = new UsuarioDAO();

            Usuario usuario = new Usuario();
            usuario.setId(codigo);

            dao.deletar(usuario);

            String mensagem = "Removido com sucesso.";
            
            List<Usuario> lista = dao.getByFiltro(idPesquisa, nome); 
            
            request.setAttribute("lista", lista);
            request.setAttribute("mensagem", mensagem);
            
            
            

        } catch (Exception ex) {
            erro = "Usuario não encontrado.";
            request.setAttribute("erro", erro);
            ex.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("pesquisarUsuario.jsp");

        dispatcher.forward(request, response);

    }

}
