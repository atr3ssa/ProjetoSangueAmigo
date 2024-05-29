
package com.mycompany.sangueamigo;


public class Usuario {
      private int codigo;
      private String nome_usuario;
      private String datadeNascimento;
      private String endereco;
      private String tipoSanguineo;
      private String senha_usuario;

    public Usuario(int codigo, String nome, String senha) {
        this.codigo = codigo;
        this.nome_usuario = nome_usuario;
        this.endereco = endereco;
        this.datadeNascimento = datadeNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.senha_usuario = senha_usuario;
    }
    public Usuario (){
        this.codigo = 0;
        this.nome_usuario = "";
        this.endereco = "";
        this.datadeNascimento = "";
        this.tipoSanguineo = "";
        this.senha_usuario = "";
    }
    public Usuario (String login, String senha){
        this.codigo = 0;
        this.nome = login;
        this.periodo = "";
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

     

}


