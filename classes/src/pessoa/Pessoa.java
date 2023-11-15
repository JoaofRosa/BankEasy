package pessoa;

import banco.conta.Conta;

public abstract class Pessoa {
	protected String nome;
    protected String cpf;
    private int tipoPessoa;
    public Conta conta;

    public Pessoa(String nome, String cpf, int tipoPessoa) {
        if (tipoPessoa != 1 && tipoPessoa != 2) {
            throw new IllegalArgumentException("Tipo de pessoa inválido");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.setTipoPessoa(tipoPessoa);
    }

    public String obterTipoPessoa() {
        return (getTipoPessoa() == 1) ? "Física" : "Jurídica";
    }

    public void listarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de Pessoa: " + obterTipoPessoa());
        if (conta != null) {
            System.out.println("Número da Conta: " + conta.numeroConta);
            System.out.println("Saldo: " + conta.saldo);
        } else {
            System.out.println("Cliente não possui conta.");
        }
    }

    public Conta getConta() {
        return conta;
    }

	public int getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}

