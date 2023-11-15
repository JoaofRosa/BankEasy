package banco.conta;

public class Conta {
	 public String numeroConta;
	    public float saldo;
	    protected int tipoConta;

	    public Conta(int tipoConta) {
	        this.tipoConta = tipoConta;
	        this.numeroConta = "Conta-" + Math.random();
	    }

	    public String obterTipoConta() {
	        return (tipoConta == 1) ? "PF" : "PJ";
	    }

	    public float getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(float saldo) {
	        this.saldo = saldo;
	    }
	}


