
package com.mycompany.sangueamigo2;


public class Usuario {
    // Encapsulamento de atributos
      private int codigo;
      private String nome_usuario;
      private String datadeNascimento;
      private String endereco;
      private String tipoSanguineo;
      private String email_usuario;
      private String cpf_usuario;
      private String senha_usuario;

      //Conferir
    public Usuario(int codigo, String nome_usuario, String endereco, String datadeNascimento, String tipoSanguineo,String email_usuario, String cpf_usuario, String senha_usuario) {
        this.codigo = codigo;
        this.nome_usuario = nome_usuario;
        this.endereco = endereco;
        this.datadeNascimento = datadeNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.email_usuario = email_usuario;
        this.cpf_usuario = cpf_usuario;
        this.senha_usuario = senha_usuario;
    }
    public Usuario (){
        this.codigo = 0;
        this.nome_usuario = "";
        this.endereco = "";
        this.datadeNascimento = "";
        this.tipoSanguineo = "";
        this.email_usuario = "";
        this.cpf_usuario = "";
        this.senha_usuario = "";
    }
    public Usuario (String login, String senha){
        this.codigo = 0;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }

        //GETTERS E SETTERS
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }}
    

    
   