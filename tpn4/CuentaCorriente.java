package tpn4;

import java.util.Scanner;

public class CuentaCorriente {
	
	//atributos...
	
	private double saldo;
	private String nombreTitular;
	private int numeroCuenta;
	
	//constructor...
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		this.numeroCuenta=(int)(Math.random()*10);
	}
	
	//métodos...
	
	public void deposito(double monto) {
		this.saldo=this.saldo+monto;
	}
	
	public int verNroCuenta() {
		return this.numeroCuenta;
	}
	
	public void extraccion(double monto) {
		this.saldo=this.saldo-monto;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String getInfo() {
		return ("\n------------------------*EL ESTADO DE LA CUENTA ES*------------------------\n"+"Nombre del titular: "+nombreTitular+"\n Saldo: "+saldo+"\nNumero de la cuenta: "+numeroCuenta);
	}
	
	public static void Transferencia (CuentaCorriente inicio, CuentaCorriente destino, double monto) {
		inicio.extraccion(monto);
		destino.deposito(monto);
	}
	
	

}
