package banco;
import java.util.ArrayList;
import java.util.List;
import banco.conta.Conta;
import pessoa.Pessoa;

public abstract class Banco {
    protected List<Pessoa> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public abstract String abrirConta(Pessoa pessoa);
    public abstract boolean encerrarConta(Pessoa pessoa);

    public boolean enviarPix(Pessoa origem, Pessoa destino, float valor) {
        if (origem.getConta() == null || destino.getConta() == null) {
            return false;
        }

        float saldoOrigem = obterSaldo(origem);
        if (saldoOrigem < valor) {
            return false;
        }
    
        depositar(origem.getConta(), -valor);
        depositar(destino.getConta(), valor);
    
        return true;
    }

    public List<Pessoa> obterClientes() {
        return clientes;
    }

    public float obterSaldo(Pessoa pessoa) {
        if (pessoa.getConta() == null) {
            return 0.0f;
        }
        return pessoa.getConta().getSaldo();
    }

    public void depositar(Conta conta, float valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public boolean sacar(Conta conta, float valor) {
        if (conta.getSaldo() < valor) {
            return false;
        }
        conta.setSaldo(conta.getSaldo() - valor);
        return true;
    }

	public boolean encerrarConta1(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return false;
	}
}
