package br.com.senac.servlet;

import br.com.senac.agenda.dao.ContatoDAO;
import br.com.senac.agenda.model.Contato;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletContatoPesquisa", urlPatterns = {"/usuario/ServletContatoPesquisa"})

public class ServletContatoPesquisa extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String mensagem = null ; 
        
        try {
            String codigo = request.getParameter("id");
            String nome = request.getParameter("nome");
            String telefone = request.getParameter("telefone");
            String celular = request.getParameter("celular");
            String fax = request.getParameter("fax");
            String cep = request.getParameter("cep");
            String endereco = request.getParameter("endereco");
            String numero = request.getParameter("numero");
            String bairro = request.getParameter("bairro");
            String cidade = request.getParameter("cidade");
            String uf = request.getParameter("uf");
            String email = request.getParameter("email");
            Integer id = null;

            if (codigo != null && !codigo.trim().isEmpty()) {
                id = new Integer(codigo);
            }

            ContatoDAO dao = new ContatoDAO();

            List<Contato> lista = dao.getByFiltro(id, nome, telefone, celular, fax, cep, endereco, numero, bairro, cidade, uf, email);

            request.setAttribute("lista", lista);

        } catch (NumberFormatException ex) {
            mensagem = "Campo codigo somente aceita valores numericos." ; 
            request.setAttribute("mensagem", mensagem);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("pesquisarContato.jsp");

        dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
