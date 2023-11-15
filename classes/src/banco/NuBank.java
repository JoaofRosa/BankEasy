package banco;

import banco.conta.Conta;
import banco.conta.ContaPF;
import banco.conta.ContaPJ;
import pessoa.Pessoa;

public class NuBank extends Banco {
    public String abrirConta1(Pessoa pessoa) {
        Conta conta;
        if (pessoa.getTipoPessoa() == 1) {
            conta = new ContaPF();
        } else if (pessoa.getTipoPessoa() == 2) {
            conta = new ContaPJ();
        } else {
            throw new IllegalArgumentException("Tipo de pessoa inválido");
        }
        pessoa.conta = conta;
        return "NuBank-" + Math.random();
    }

    public boolean encerrarConta(Pessoa pessoa) {
        if (pessoa.conta != null) {
            clientes.remove(pessoa);
            pessoa.conta = null;
            return true;
        }
        return false;
    }

	@Override
	public String abrirConta(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean encerrarConta1(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return false;
	}
}
