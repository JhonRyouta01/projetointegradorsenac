package br.com.senac.servlet;

import br.com.senac.agenda.dao.UsuarioDAO;
import br.com.senac.agenda.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {

        String usuario = requisicao.getParameter("user");
        String navedor = requisicao.getHeader("User-Agent");

        // tipo da resposta 
        resposta.setContentType("text/html");
        PrintWriter out = resposta.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<b>Olá , " + usuario + " </b><br/>");
        out.println("Seja Bem-Vindo ao Mundo dos Servlets !!!<br/>");
        out.println("Voce esta usando o navegador:" + navedor);
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
        //pegar os parametros 
        String nome = requisicao.getParameter("usuario");
        String senha = requisicao.getParameter("senha");

        PrintWriter out = resposta.getWriter();

        out.println("<html>");
        out.println("<body>");

        if ((nome != null && senha != null) // se nao for nulo
                && (!nome.trim().isEmpty() && !senha.trim().isEmpty()) // e se estiver preenchido
                ) {
            UsuarioDAO dao = new UsuarioDAO();

            Usuario usuario = dao.getByName(nome);

            if (usuario != null && usuario.getSenha().equals(senha)) {

                // Caso nao exista sessao o container vai criar 
                // caso exista ele vai somente devolver o objeto
                 HttpSession session = requisicao.getSession() ;
                
                 session.setAttribute("user", usuario);
                 
                //out.println("Seja bem-vindo " + usuario.getNome());
                resposta.sendRedirect("principal.jsp");

            } else {
                if (usuario == null) {
                    out.println("Usuário inexistente!!!");
                } else {
                    out.println("Falha na autenticacao!!!");
                }
            }

            out.println("</body>");
            out.println("</html>");

        } else {
            
            resposta.sendRedirect("login.html");

        }

        /*
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);

        PrintWriter out = resposta.getWriter();
        out.println("<html>");
        out.println("<body>");
        if (usuario.getNome().equals("daniel") && usuario.getSenha().equals("123")) {
            out.println("Seja bem-vindo " + usuario.getNome());
        } else {
            out.println("Falha na autenticacao!!!");
        }
        out.println("</body>");
        out.println("</html>");

         */
    }

}
