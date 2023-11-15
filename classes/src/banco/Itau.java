package banco;

import banco.conta.Conta;
import banco.conta.ContaPF;
import banco.conta.ContaPJ;
import pessoa.Pessoa;

public abstract class Itau extends Banco {
    public String abrirConta(Pessoa pessoa) {
        Conta conta;
        if (pessoa.getTipoPessoa() == 1) {
            conta = new ContaPF();
        } else if (pessoa.getTipoPessoa() == 2) {
            conta = new ContaPJ();
        } else {
            throw new IllegalArgumentException("Tipo de pessoa inválido");
        }
        pessoa.conta = conta;
        clientes.add(pessoa);
        return "Itau-" + Math.random();
    }

    public boolean encerrarConta(Pessoa pessoa) {
        if (pessoa.conta != null) {
            clientes.remove(pessoa);
            pessoa.conta = null;
            return true;
        }
        return false;
    }
}
