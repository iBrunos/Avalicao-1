import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        
        //Criando o usuário na classe usuario 
        System.out.println("Qual seu nome? ");
        String nome = scan.nextLine();

        usuario primeiroUsuario = new usuario();
        primeiroUsuario.nome = nome;
    
        System.out.println("----------Inicio do Quiz----------");

        System.out.println("Pergunta 1");
        System.out.println("De quem é a famosa frase “Penso, logo existo”?");
        
        System.out.println("[1] Platão");
        System.out.println("[2] Galileu Galilei");
        System.out.println("[3] Descartes"); // resposta correta
        System.out.println("[4] Sócrates");
        System.err.println("Escolha as opções de 1 a 4");
        int resposta = scan.nextInt();
        
        if (resposta == 3){
            System.out.println("Você acertou esta questão");
            primeiroUsuario.acertou(1);
        } else if(resposta != 3){
            System.out.println("Você errou esta questão");
            primeiroUsuario.errou(1);
        }

        System.out.println("Proxima pergunta");
        System.out.println("Pergunta 2");
        System.out.println("De onde é a invenção do chuveiro elétrico?");

        System.out.println("[1] França");
        System.out.println("[2] Brasil"); // resposta correta
        System.out.println("[3] Inglaterra");
        System.out.println("[4] Austrália");
        System.err.println("Escolha as opções de 1 a 4");
        int resposta2 = scan.nextInt();

        if (resposta2 == 2){
            System.out.println("Você acertou esta questão");
            primeiroUsuario.acertou(1);
        } else if(resposta2 != 2){
            System.out.println("Você errou esta questão");
            primeiroUsuario.errou(1);
        }

        System.out.println("Proxima pergunta");
        System.out.println("Pergunta 3");
        System.out.println("Quais o menor e o maior país do mundo?");

        System.out.println("[1] Vaticano e Rússia");  // resposta correta
        System.out.println("[2] Nauru e China");
        System.out.println("[3] Mônaco e Canadá");
        System.out.println("[4] Malta e Estados Unidos");
        System.err.println("Escolha as opções de 1 a 4");
        int resposta3 = scan.nextInt();

        if (resposta3 == 1){
            System.out.println("Você acertou esta questão");
            primeiroUsuario.acertou(1);
        } else if(resposta3 != 1){
            System.out.println("Você errou esta questão");
            primeiroUsuario.errou(1);
        }
        
        System.out.println("Fim do quiz");

        System.out.println("Usuário: " + primeiroUsuario.nome);
        System.out.println("Acertos: " + primeiroUsuario.acertos);
        System.out.println("Erros: " + primeiroUsuario.erros);




/*/


            switch (resposta) {
                case 1:
                    System.out.println("Você errou esta questão");
                    primeiroUsuario.errou(1);
                  break;
                case 2:
                  System.out.println("Você errou esta questão");
                  primeiroUsuario.errou(1);
                  break;
                case 3:
                    System.out.println("Você acertou esta questão");
                    primeiroUsuario.acertou(1);
                  break;
                case 4:
                    System.out.println("Você errou esta questão");
                    primeiroUsuario.errou(1);
                    break;
            default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
              }
        */
        
        
        scan.close();
    }
        


}
