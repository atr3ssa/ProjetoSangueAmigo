//pacote
package bean;


public class Usuario {
    // Encapsulamento de atributos
      private int id_usuario;
      private String nome_usuario;
      private String Cpf_usuario;
      private String email_usuario;
      private String senha_usuario;
      private String dataDeNascimento;
      private String Cep;
      private String tipoSanguineo;
      
       public int getId_usuario;
     
      

      //Conferir
    public Usuario(int id_usuario, String nome_usuario, String Cpf_usuario, String email_usuario, String senha_usuario,String dataDeNascimento, String Cep, String tipoSanguineo) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.Cpf_usuario = Cpf_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        this.dataDeNascimento = dataDeNascimento;
        this.Cep = Cep;
        this.tipoSanguineo = tipoSanguineo;
    }
    public Usuario (){
        this.id_usuario = 0;
        this.nome_usuario = "";
        this.Cpf_usuario = "";
        this.email_usuario = "";
        this.senha_usuario = "";
        this.dataDeNascimento = "";
        this.Cep = "";
        this.tipoSanguineo = "";
    }
    public Usuario (String nome_usuario, String senha_usuario){
        this.id_usuario = 0;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }

    //GETTERS E SETTERS
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getCpf_usuario() {
        return Cpf_usuario;
    }

    public void setCpf_usuario(String Cpf_usuario) {
        this.Cpf_usuario = Cpf_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }}


    
    