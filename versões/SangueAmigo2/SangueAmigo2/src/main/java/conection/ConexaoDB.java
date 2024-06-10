//pacote
package conection;
//importações sql
import java.sql.Connection;
import java.sql.DriverManager;

//Integração do Banco com o Netbeans
public class ConexaoDB {
    //servidor local host (servidor local usado)
    private static String host = "localhost";
    //porta na qual o servidor vai receber as requisições, é padrão
    private static String porta = "3306";
    //nome do banco de dados
    private static String db = "sangue_amigo";
    //usuario do MySQL que uso para entrar
    private static String usuario = "root";
    //senha do MySQL(deixar como: usjt
    private static String senha = "Amanhecer123@";
    
    //Método do tipo do objeto, mesmo tipo que o da importação ("java.sql.Connection;")
    public static Connection obtemConexao (){
        
        //Usado para tentar mapear o erro do código. Vai tentar executar a conexão com o banco de dados, caso não ocorra, ele vai te informar o erro (podemos detalhar futuramente as possibilidades de erros)
        //Passo muito importande, devido a conexão Cliente - Servidor.
        try{
            //Connection = Estabelecer uma conexão com o banco de dados (através do método abaixo:)
            Connection conectar = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario,senha);
            System.out.println("Banco Conectado com Sucesso!!!!");
            return conectar;
        }
        // Exception e = Classe usada p tratamentos de erros
        catch (Exception e){
            
            //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
            e.printStackTrace();
            return null;
        }
    }

  
}  

