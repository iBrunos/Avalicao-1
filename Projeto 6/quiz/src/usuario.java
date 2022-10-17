public class usuario {

    public String nome;
    public int acertos = 0;
    public int erros = 0;

    public String getNome() {
        return nome;
    }

    public int getAcertos() {
        return acertos;
    }
    public int getErros() {
        return erros;
    }

    public void acertou(double valor) {
		this.acertos = this.acertos + 1;
	}

    public void errou(double valor) {
		this.erros = this.erros + 1;
	}
}
