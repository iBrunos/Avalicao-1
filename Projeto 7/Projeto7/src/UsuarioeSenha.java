import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UsuarioeSenha {
    public static void main(String[] args) throws Exception {
        
        // Iniciando o Scanner
        Scanner scan = new Scanner(System.in);
        // Iniciando o Date
        Date data = new Date();
        // Iniciando o Format
        SimpleDateFormat formatar = new SimpleDateFormat("h" + "mm");

        
        // Definindo variáveis usadas no programa
        String hora = formatar.format(data);
        int horaconvertida = Integer.parseInt(hora);
        
        System.out.println("A hora atual é: " + horaconvertida);

        String usuario; // Armazena usuario informado pelo usuario
        String senha;   // Armazena senha informada pelo usuario

        String usuarioaceito = "bruno"; // Usuário aceito para acessar o sistema
        String senhaaceita = "1234";   // Senha aceita para acessar o sistema

        System.out.println("----Acesso ao Sistema----"); 

        System.out.println("Qual o seu usuário?");
        usuario = scan.nextLine();
        
        System.out.println("Qual o sua senha?");
        senha = scan.nextLine();

        if(usuario.equals(usuarioaceito) && senha.equals(senhaaceita)){
            if(horaconvertida >= 0600 && horaconvertida <= 1159) {
                System.out.println("Bom dia, você se logou ao nosso sistema.");
    
            } else if (horaconvertida >= 1200 && horaconvertida <= 1759){
    
                System.out.println("Boa tarde, você se logou ao nosso sistema.");
    
            } else if(horaconvertida >= 1800 && horaconvertida <= 2359){
    
                System.out.println("Boa noite, você se logou ao nosso sistema.");
    
            } else {
                System.out.println("“Boa madrugada, você se logou ao nosso sistema.");
            }

        } else {
            System.out.println("Usuário e/ou senha incorretos.");
        }
    
        

        scan.close();

    }
}
