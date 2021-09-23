package aula_teste;

public abstract class Conta {
    private final int numero;
    private final int agencia;
    protected double saldo = 0;
    private Titular titular;

    public Conta(Titular titular, int numero, int agencia) {
        super();
        this.numero = numero;
        this.agencia = agencia;
    }

    public Titular getTItular() {
        return this.titular;
    }

    public void setTitulat(Titular titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public abstract boolean sacar(double valor);

    public abstract boolean depositar(double valor);

    public boolean transferir(double valor, Conta fovorecido) {
        saldo =- valor;
        fovorecido.saldo =+ valor;
        return false;
    }

}