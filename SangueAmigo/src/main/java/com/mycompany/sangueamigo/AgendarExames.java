age com.mycompany.sangueamigo;


public class AgendarExames {
      private int codigodoacao_;
      private String localdoacoes;
      
      private String datadeNascimento;
      private String endereco;
      private String tipoSanguineo;
      private String senha_usuario;

      //Conferir
    public Usuario(int codigo, String nome, String senha) {
        this.codigo = codigo;
        this.nome_usuario = nome;
        this.endereco = endereco;
        this.datadeNascimento = datadeNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.senha_usuario = senha;
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
        this.nome_usuario = login;
        this.senha_usuario = senha;
    }
}
