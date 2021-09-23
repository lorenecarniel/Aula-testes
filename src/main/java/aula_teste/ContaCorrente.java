package aula_teste;

public abstract class ContaCorrente extends Conta {
    private double limite = 1000;
    private double taxa;
    private double saldocomlimite;

    public ContaCorrente(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldoComLimite() {
        return this.saldocomlimite;
    }

    @Override
    public abstract boolean sacar(double valor);

    @Override
    public abstract boolean depositar(double valor);
}
