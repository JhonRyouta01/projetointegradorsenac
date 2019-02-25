/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.agenda.dao;

import br.com.senac.agenda.model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

public class ContatoDAO extends DAO<Contato> {

    @Override
    public void salvar(Contato usuarioCad) {
        Connection connection = null;
        try {
            String query;
            if (usuarioCad.getId() == 0) {
                query = "INSERT INTO usuarioCad(nome,telefone,celular,fax,cep,endereco,numero,bairro,cidade,uf,email) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            } else {
                query = "UPDATE usuariocad SET nome = ? ,senha = ?, celular = ?, fax = ?, cep = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, email = ? WHERE id = ? ;";
            }
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuarioCad.getNome());
            ps.setString(2, usuarioCad.getTelefone());
            ps.setString(3, usuarioCad.getCelular());
            ps.setString(4, usuarioCad.getFax());
            ps.setString(5, usuarioCad.getCep());
            ps.setString(6, usuarioCad.getEndereco());
            ps.setString(7, usuarioCad.getNumero());
            ps.setString(8, usuarioCad.getBairro());
            ps.setString(9, usuarioCad.getCidade());
            ps.setString(10, usuarioCad.getUf());
            ps.setString(11, usuarioCad.getEmail());

            if (usuarioCad.getId() == 0) {
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                rs.first();
                usuarioCad.setId(rs.getInt(1));
            } else {
                ps.setInt(12, usuarioCad.getId());
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
    public void deletar(Contato usuarioCad) {

        String query = "DELETE FROM usuarioCad WHERE id = ?;";
        Connection connection = null;

        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, (int) usuarioCad.getId());
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
    public List<Contato> listar() {

        String query = "SELECT * FROM usuarioCad";
        List<Contato> lista = new ArrayList<>();
        Connection connection = null;
        try {
            connection = Conexao.getConnection(); /// abriu conexao com o banco 
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query); // executa a query e retorna uma "tabela"
            while (rs.next()) {
                Contato usuario = new Contato();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setFax(rs.getString("fax"));
                usuario.setCep(rs.getString("cep"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setNumero(rs.getString("numero"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setUf(rs.getString("uf"));
                usuario.setEmail(rs.getString("email"));
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
    public Contato get(int id) {

        Contato usuarioCad = null;
        Connection connection = null;
        String query = "SELECT * FROM usuarioCad WHERE id = ? ; ";
        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                usuarioCad = new Contato();
                usuarioCad.setId(rs.getInt("id"));
                usuarioCad.setNome(rs.getString("nome"));
                usuarioCad.setTelefone(rs.getString("telefone"));
                usuarioCad.setCelular(rs.getString("celular"));
                usuarioCad.setFax(rs.getString("fax"));
                usuarioCad.setCep(rs.getString("cep"));
                usuarioCad.setEndereco(rs.getString("endereco"));
                usuarioCad.setNumero(rs.getString("numero"));
                usuarioCad.setBairro(rs.getString("bairro"));
                usuarioCad.setCidade(rs.getString("cidade"));
                usuarioCad.setUf(rs.getString("uf"));
                usuarioCad.setEmail(rs.getString("email"));
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

        return usuarioCad;

    }

    public Contato getByName(String name) {

        Contato usuarioCad = null;
        Connection connection = null;
        String query = "SELECT * FROM usuarioCad WHERE nome = ? ";
        try {
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                usuarioCad = new Contato();
                usuarioCad.setId(rs.getInt("id"));
                usuarioCad.setNome(rs.getString("nome"));
                usuarioCad.setTelefone(rs.getString("telefone"));
                usuarioCad.setCelular(rs.getString("celular"));
                usuarioCad.setFax(rs.getString("fax"));
                usuarioCad.setCep(rs.getString("cep"));
                usuarioCad.setEndereco(rs.getString("endereco"));
                usuarioCad.setNumero(rs.getString("numero"));
                usuarioCad.setBairro(rs.getString("bairro"));
                usuarioCad.setCidade(rs.getString("cidade"));
                usuarioCad.setUf(rs.getString("uf"));
                usuarioCad.setEmail(rs.getString("email"));

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

        return usuarioCad;

    }

    public List<Contato> getByFiltro(Integer id, String nome, String telefone, String celular, String fax, String cep, String endereco,
            String numero, String bairro, String cidade, String uf, String email) {
        List<Contato> lista = new ArrayList<>();
        Connection connection = null;
        try {

            StringBuilder sb = new StringBuilder("SELECT * FROM usuarioCad WHERE 1 = 1 ");

            if (id != null) {
                sb.append(" AND id = ?  ");
            }

            if (nome != null && !nome.trim().isEmpty()) {
                sb.append(" AND nome LIKE ? ");
            }
            
            if (uf != null && !uf.trim().isEmpty()) {
                sb.append(" AND uf LIKE ? ");
            }
            
            connection = Conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(sb.toString());
            int index = 0;
            if (id != null) {
                ps.setInt(++index, id);
            }

            if (nome != null && !nome.trim().isEmpty()) {
                ps.setString(++index, "%" + nome + "%");
            }
            
            if(uf != null && !uf.trim().isEmpty()){
                ps.setString(++index, "%" + uf + "%");
            }

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Contato usuarioCad = new Contato();
                usuarioCad.setId(rs.getInt("id"));
                usuarioCad.setNome(rs.getString("nome"));
                usuarioCad.setTelefone(rs.getString("telefone"));
                usuarioCad.setCelular(rs.getString("celular"));
                usuarioCad.setFax(rs.getString("fax"));
                usuarioCad.setCep(rs.getString("cep"));
                usuarioCad.setEndereco(rs.getString("endereco"));
                usuarioCad.setNumero(rs.getString("numero"));
                usuarioCad.setBairro(rs.getString("bairro"));
                usuarioCad.setCidade(rs.getString("cidade"));
                usuarioCad.setUf(rs.getString("uf"));
                usuarioCad.setEmail(rs.getString("email"));

                lista.add(usuarioCad);
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

}
