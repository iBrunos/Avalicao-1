import java.util.ArrayList;
import java.util.Scanner;
public class salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Cadastro de Funcionários-------");
        System.out.print("Qual a quantidade de funcionários da empresa? > ");
        int Qfuncionarios = scan.nextInt();

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        for(int i = 0; i < Qfuncionarios; i++){
            System.out.print("Qual o nome do funcionário " + i + "? >");
            String nomeFuncionario = scan.next();
            System.out.print("Qual o salário do funcionário "+ i + "? >" );
            double salarioFuncionario = scan.nextDouble();
            
           
            funcionarios.add(new Funcionario(nomeFuncionario, salarioFuncionario));

        }

        scan.close();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.nome + " \nSalário: " + funcionario.salario + " \nSalário Líquido: " + funcionario.salarioLiquido);
        }
        }
        
    }
   
