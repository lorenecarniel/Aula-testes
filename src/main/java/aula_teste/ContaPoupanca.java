package aula_teste;

public abstract class ContaPoupanca extends Conta implements Rendimentos {

    public ContaPoupanca(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public abstract boolean sacar(double valor);

    @Override
    public abstract boolean depositar(double valor);

    @Override
    public void atualizar(double taxaRendimento) { };

}