import java.util.Scanner;

/*
 * @author Tiago Santos
 */

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Por favor, digite o nome do cliente: ");
			String nomeCliente = scanner.nextLine();
			
			System.out.println("Por favor, digite o número da sua conta: ");
			int numero = scanner.nextInt();
			
			System.out.println("Por favor, digite o número da sua agencia com dígito: ");
			String agencia = scanner.next();
			
			System.out.println("Por favor, digite o seu saldo: ");
			double saldo = scanner.nextDouble();
			
			showBankAccountInfo(nomeCliente, numero, agencia, saldo);
		}
		
	}
	
	public static void showBankAccountInfo(String nomeCliente, int numero ,String agencia , double saldo) {	
		System.out.println("Olá["+nomeCliente+"], obrigado por criar uma conta em nosso banco,"
				+ " sua agência é ["+agencia+"],conta ["+numero+"] e seu saldo ["+saldo+"] já está "+
				"disponivel para saque.");
	}

}
