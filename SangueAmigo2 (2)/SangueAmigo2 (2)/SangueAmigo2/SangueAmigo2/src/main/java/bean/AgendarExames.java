//pacote
package bean;


public class AgendarExames {
    // Encapsulamento de atributos
      private int codigoExame;
      private String local_exame;
      private String data_exame;
      private String hora_exame;
      private String opcaoExame;
      private int doador;
      
      public AgendarExames( int codigoExame, String local_exame, String data_exame, String hora_exame, String opcaoExame, int doador) {
          this.codigoExame = codigoExame;
          this.local_exame = local_exame;
          this.data_exame = data_exame;
          this.hora_exame = hora_exame;
          this.opcaoExame = opcaoExame;
          this.doador = doador;
      }
      public AgendarExames (){
        this.codigoExame = 0;
        this.local_exame = "";
        this.data_exame = "";
        this.hora_exame = "";
        this.opcaoExame = "";
        this.doador = 0;
    }
      // GETTERS E SETTERS

    public int getCodigoExame() {
        return codigoExame;
    }

    public void setCodigoExame(int codigoExame) {
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

    public int getDoador() {
        return doador;
    }

    public void setDoador(int doador) {
        this.doador = doador;
    }
      
   
      
}