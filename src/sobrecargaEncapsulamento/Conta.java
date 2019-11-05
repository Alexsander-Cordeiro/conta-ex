package sobrecargaEncapsulamento;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		
	}
	
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	//OPERA��O	
	public void deposito(double valor) {
			saldo += valor;
		
	}
	//OPERA��O
	public void retirar(double valor) {
		saldo -= valor + 5.00;
	}
	public String toString() {
		return "Conta "
				+ numero 
				+ " , Titular: "
				+ titular
				+ " , Saldo : R$ "
				+String.format("%.2f", saldo);
	}

}
