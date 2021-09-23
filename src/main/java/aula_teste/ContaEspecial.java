package aula_teste;

public abstract class ContaEspecial extends ContaCorrente implements Rendimentos {

    public ContaEspecial(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public void atualizar(double taxaRendimento) { };

}
