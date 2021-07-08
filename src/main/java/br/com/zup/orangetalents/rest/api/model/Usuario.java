package br.com.zup.orangetalents.rest.api.model;

import java.sql.Timestamp;

public class Usuario {

    private String nome;
    private String email;
    private Integer cpf;
    private Timestamp dtNascimento;



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
    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public Timestamp getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Timestamp dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}


