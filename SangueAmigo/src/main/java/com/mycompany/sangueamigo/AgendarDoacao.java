
package com.mycompany.sangueamigo;


public class AgendarDoacao {
      private int codigoDoacao;
      private String local_doacao;
      private String data_doacao;
      private String hora_doacao;
      private String opcaoDoacao;
      
      public AgendarDoacao(int codigoDoacao, String local_doacao, String data_doacao, String hora_doacao, String opcaoDoacao) {
          this.codigoDoacao = codigoDoacao;
          this.local_doacao = local_doacao;
          this.data_doacao = data_doacao;
          this.hora_doacao = hora_doacao;
          this.opcaoDoacao = opcaoDoacao;
      }
      public AgendarDoacao (){
        this.codigoDoacao = 0;
        this.local_doacao = "";
        this.data_doacao = "";
        this.hora_doacao = "";
        this.opcaoDoacao = "";
    }

    public int getCodigoDoacao() {
        return codigoDoacao;
    }

    public void setCodigoDoacao(int codigoDoacao) {
        this.codigoDoacao = codigoDoacao;
    }

    public String getLocal_doacao() {
        return local_doacao;
    }

    public void setLocal_doacao(String local_doacao) {
        this.local_doacao = local_doacao;
    }

    public String getData_doacao() {
        return data_doacao;
    }

    public void setData_doacao(String data_doacao) {
        this.data_doacao = data_doacao;
    }

    public String getHora_doacao() {
        return hora_doacao;
    }

    public void setHora_doacao(String hora_doacao) {
        this.hora_doacao = hora_doacao;
    }

    public String getOpcaoDoacao() {
        return opcaoDoacao;
    }

    public void setOpcaoDoacao(String opcaoDoacao) {
        this.opcaoDoacao = opcaoDoacao;
    }
      
}