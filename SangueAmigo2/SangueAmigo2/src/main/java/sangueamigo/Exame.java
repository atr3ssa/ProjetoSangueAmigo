package sangueamigo;


public class Exame {
    // Encapsulamento de atributos
      private String codigoExame;
      private String local_exame;
      private String data_exame;
      private String hora_exame;
      private String opcaoExame;
      
      public Exame(String codigoExame, String local_exame, String data_exame, String hora_exame, String opcaoExame) {
          this.codigoExame = codigoExame;
          this.local_exame = local_exame;
          this.data_exame = data_exame;
          this.hora_exame = hora_exame;
          this.opcaoExame = opcaoExame;
      }
      public Exame (){
        this.codigoExame = "";
        this.local_exame = "";
        this.data_exame = "";
        this.hora_exame = "";
        this.opcaoExame = "";
    }
      // GETTERS E SETTERS
      
    public String getCodigoExame() {
        return codigoExame;
    }

    public void setCodigoExame(String codigoExame) {
        this.codigoExame = codigoExame;
    }

    public String getLocal_exame() {
        return local_exame;
    }

    public void setLocal_exame(String local_exame) {
        this.local_exame = local_exame;
    }

    public String getData_exame() {
        return data_exame;
    }

    public void setData_exame(String data_exame) {
        this.data_exame = data_exame;
    }

    public String getHora_exame() {
        return hora_exame;
    }

    public void setHora_exame(String hora_exame) {
        this.hora_exame = hora_exame;
    }

    public String getOpcaoExame() {
        return opcaoExame;
    }

    public void setOpcaoExame(String opcaoExame) {
        this.opcaoExame = opcaoExame;
    }
      
}