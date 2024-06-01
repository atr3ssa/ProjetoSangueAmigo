

package com.mycompany.sangueamigo;


public class SangueAmigo {
    //feito em um arquivo Maven
    //Onde o programa vai informar se o servidor conectou ou não

    public static void main(String[] args) {
        //con =
        ConexaoDB con = new ConexaoDB();
        con.obtemConexao();
    }
}
