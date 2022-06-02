
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente nome = new Cliente();
		nome.setNome("Fernando");
		
		Conta cc = new ContaCorrente(nome);
		Conta cp = new ContaPoupanca(nome);
		
		cc.depositar(100);
		cc.transferir(25, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
