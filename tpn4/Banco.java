package tpn4;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crecion cuentas...
		CuentaCorriente cuenta1 = new CuentaCorriente("Federico",900);
		CuentaCorriente cuenta2 = new CuentaCorriente("Bruce",700);
		
		//extracción y depósito...
		cuenta1.extraccion(200);
		cuenta2.deposito(200);
		
		//ver info d ela cuenta...
		System.out.println(cuenta1.getInfo());
		System.out.println(cuenta2.getInfo());
		
		

	}

}
