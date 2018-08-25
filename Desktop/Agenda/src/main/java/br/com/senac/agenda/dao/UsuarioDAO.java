package br.com.senac.agenda.dao;

import br.com.senac.agenda.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends DAO<Usuario> {

    @Override
    public void salvar(Usuario usuario) {

        Connection connection = null;
        try {
            String query;
            if (usuario.getId() == 0) {
                query = "INSERT INTO usuario(nome , senha) values (?, ?) ;";
            } else {
                query = "UPDATE usuario SET nome = ? ,  senha = ? where id = ? ; ";
            }
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            if (usuario.getId() == 0) {
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                rs.first();
                usuario.setId(rs.getInt(1));
            } else {
                ps.setInt(3, usuario.getId());
                ps.executeUpdate();
            }

        } catch (Exception ex) {

        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

    }

    @Override
    public void deletar(Usuario usuario) {
        String query = "DELETE FROM usuario WHERE id = ?";
        Connection connection = null;

        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, usuario.getId());
            ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Erro ao deletar registro...");
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

    }

    @Override
    public List<Usuario> listar() {

        String query = "SELECT * FROM usuario;";
        List<Usuario> lista = new ArrayList<>();
        Connection connection = null;
        try {
            connection = Conexao.getConnection(); /// abriu conexao com o banco 
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query); // executa a query e retorna uma "tabela"
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                lista.add(usuario);

            }

        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ao fazer a consulta....");
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

        return lista;
    }

    @Override
    public Usuario get(int id) {
        Usuario usuario = null;
        Connection connection = null;
        String query = "SELECT * FROM usuario where id = ? ; ";
        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
            }

        } catch (Exception ex) {
            System.out.println("Erro ao executar a consulta...");
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

        return usuario;
    }

    public Usuario getByName(String name) {

        Usuario usuario = null;
        Connection connection = null;
        String query = "SELECT * FROM usuario where nome = ? ; ";
        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
            }

        } catch (Exception ex) {
            System.out.println("Erro ao executar a consulta...");
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

        return usuario;

    }

    public List<Usuario> getByFiltro(Integer id, String name) {

        List<Usuario> lista = new ArrayList<>();
        Connection connection = null;
        try {

            StringBuilder sb = new StringBuilder("SELECT * FROM USUARIO WHERE 1 = 1 ");

            if (id != null) {
                sb.append(" AND ID = ?  ");
            }

            if (name != null && !name.trim().isEmpty()) {
                sb.append(" AND NOME LIKE ? ");
            }
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(sb.toString());
            int index = 0;
            if (id != null) {
                ps.setInt(++index, id);
            }

            if (name != null && !name.trim().isEmpty()) {
                ps.setString(++index, "%" + name + "%");
            }

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                lista.add(usuario);
            }

        } catch (Exception ex) {
            System.out.println("Erro ao realizar consulta");
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Falha ao fechar conexao....");
            }
        }

        return lista;
    }

    /*
    public static void main(String[] args) {
        
        UsuarioDAO dao = new UsuarioDAO() ; 
        
        List<Usuario> lista =  dao.getByFiltro(null, null);
        System.out.println("Lista Sem Parametro:" + lista.size());
        
        lista =  dao.getByFiltro(new Integer(1), null);
        System.out.println("Lista com ID:" + lista.size());
        
        lista =  dao.getByFiltro(null, "jo");
        System.out.println("Lista com Nome:" + lista.size());
        
        lista =  dao.getByFiltro(new Integer(1), "dan");
        System.out.println("Lista com 2 Parametros:" + lista.size());
        
        lista =  dao.getByFiltro(new Integer(1), "jose");
        System.out.println("Lista com 2 Parametros zero resultado:" + lista.size());
        
        
    }
    */
    
    
    
    
    /*
    public static void main(String[] args) {
        
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario usuario = dao.getByName("daniel");
        
        System.out.println(usuario.getNome());
        
        
    }
     */
 /*
     public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setNome("Miguel");
        usuario.setSenha("123123");
        dao.salvar(usuario);

        List<Usuario> lista = dao.listar();

        for (Usuario u : lista) {
            System.out.println(u.getId() + " " + u.getNome() + " " + u.getSenha());
        }
        
        usuario.setNome("Miguel jose ");
        dao.salvar(usuario);
        
        
        lista = dao.listar();

        for (Usuario u : lista) {
            System.out.println(u.getId() + " " + u.getNome() + " " + u.getSenha());
        }
        

    }
     */
 /*
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setId(3);
        dao.deletar(usuario);

        List<Usuario> lista = dao.listar();

        for (Usuario u : lista) {
            System.out.println(u.getId() + " " + u.getNome() + " " + u.getSenha());
        }

    }
     */

 /*
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.get(1);
        System.out.println(u.getId() + " " + u.getNome() + " " + u.getSenha());
    }
     */
 /* teste lista 
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario> lista = dao.listar();

        for (Usuario u : lista) {
            System.out.println(u.getId() + " " + u.getNome() + " " + u.getSenha());
        }

    }*/
}
