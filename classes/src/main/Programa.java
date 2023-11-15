package main;
import banco.NuBank;
import pessoa.Pessoa;

public class Programa {
	 public static void main(String[] args) {
	        
	        pessoa itau = new pessoa();
	        NuBank nubank = new NuBank();
	        Pessoa pessoa1 = new Pessoa("João", "12345678901", 1); 
	        pessoa pessoa2 = new pessoa("Empresa XYZ", "9876543210", 2); 

	        
	        String contaItauPessoa1 = itau.abrirConta(pessoa1);
	        String contaNuBankPessoa2 = nubank.abrirConta(pessoa2);

	        
	        pessoa1.listarInformacoes();
	        System.out.println("Número da Conta: " + contaItauPessoa1);

	        pessoa2.listarInformacoes();
	        System.out.println("Número da Conta: " + contaNuBankPessoa2);

	       
	        itau.enviarPix(pessoa1, pessoa2, 1000);
	        nubank.enviarPix(pessoa2, pessoa1, 500);

	        
	        System.out.println("Saldo após operação no Itau: " + itau.obterSaldo(pessoa1));
	        System.out.println("Saldo após operação no NuBank: " + nubank.obterSaldo(pessoa2));

	        
	        itau.encerrarConta(pessoa1);
	        nubank.encerrarConta(pessoa2);

	        
	        System.out.println("Conta no Itau após encerramento: " + (pessoa1.getConta() == null));
	        System.out.println("Conta no NuBank após encerramento: " + (pessoa2.getConta() == null));
	    }

}
