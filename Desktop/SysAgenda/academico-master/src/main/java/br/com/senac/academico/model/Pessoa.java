package br.com.senac.academico.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa extends Entidade implements Serializable {

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = true, length = 200)
    private String email;

    @Column(nullable = false, unique = true, length = 11, insertable = true, updatable = false)
    private String cpf;

    @Column(length = 500, nullable = false)
    private String endereco;

    @Column(nullable = true)
    private Integer numero;

    @Column(nullable = true, length = 500)
    private String complemento;

    @Column(nullable = true, length = 200)
    private String cidade;

    @Column(nullable = true, length = 2)
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
