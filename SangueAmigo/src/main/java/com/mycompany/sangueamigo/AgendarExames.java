package com.mycompany.sangueamigo;


public class AgendarExames {
      private int codigoExame;
      private String local_exame;
      private String data_exame;
      private String hora_exame;
      private String opcaoExame;
      
      public AgendarExames(int codigoExame, String local_exame, String data_exame, String hora_exame, String opcaoExame) {
          this.codigoExame = codigoExame;
          this.local_exame = local_exame;
          this.data_exame = data_exame;
          this.hora_exame = hora_exame;
          this.opcaoExame = opcaoExame;
      }
      public AgendarExames (){
        this.codigoExame = 0;
        this.local_exame = "";
        this.data_exame = "";
        this.hora_exame = "";
        this.opcaoExame = "";
    }
}