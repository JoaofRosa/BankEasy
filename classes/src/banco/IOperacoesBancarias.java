package banco;

import java.util.List;

import pessoa.Pessoa;

interface IOperacoesBancarias {
    public boolean enviarPix(Pessoa origem, Pessoa destino, float valor);
    public List<Pessoa> obterClientes();
    public float obterSaldo(Pessoa pessoa);
}
