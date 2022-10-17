public class Funcionario {
    public String nome;
    public double salario = 0;
    public double salarioLiquido = 0;

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setsalario(double salario){
        this.salario = salario;
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        if(this.salario < 1000){
            this.salarioLiquido = this.salario * 1.20;
        } else if (this.salario >= 1000 && this.salario < 2000){
            this.salarioLiquido = this.salario * 1.10;
        } else if (this.salario >= 2000){
            this.salarioLiquido = this.salario * 0.9;
        }
    }

}
