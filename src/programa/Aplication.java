package programa;

import java.util.Scanner;
import sobrecargaEncapsulamento.Conta;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Entre com o numero da conta:");
		int numero = sc.nextInt();
		System.out.println("Entre com o nome do titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Irá fazer o deposito inicial(s/n) ");
		char respo = sc.next().charAt(0);
			if(respo == 's') {
				System.out.println("Valor do deposito: R$ ");
				double depositoInicial = sc.nextDouble();
				conta = new Conta(numero ,titular,depositoInicial);
								
			}else {
				System.out.println("");
				conta = new Conta(numero,titular);
				
			}
			
			System.out.println("");
			System.out.println("Dados da Conta: ");
			System.out.println(conta);
			
			System.out.println("");
			System.out.println("Entre com um novo deposito: ");
			double novoDeposito = sc.nextDouble();
			//fazendo aqui a operação de um novo deposito somando no SALDO
			conta.deposito(novoDeposito);
			System.out.println("Dados da conta atualizado: ");
			System.out.println(conta);
			
			System.out.println("");
			System.out.println("Entrar com o valor do saque");
			double valorSaque = sc.nextDouble();
			//Fazendo aqui a operação do saque.
			conta.retirar(valorSaque);
			System.out.println("Dados da conta atualizado: ");
			System.out.println(conta);

			
	
			
			
		sc.close();
		
	}

}
