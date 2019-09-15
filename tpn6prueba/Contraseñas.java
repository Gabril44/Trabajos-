package tpn6prueba;


import java.util.UUID;

public class Contraseñas {
	
	public void contraRandom(int numPass){
				
		if (numPass%2==0) {
	
	String pass="";
	String pass2="";
	
	pass=UUID.randomUUID().toString().toUpperCase().substring(0,numPass/2);
	pass2=UUID.randomUUID().toString().toLowerCase().substring(0,numPass/2);
	System.out.println(pass+pass2);
		} else {
			String pass="";
			String pass2="";
			
			pass=UUID.randomUUID().toString().toUpperCase().substring(0,numPass/2);
			pass2=UUID.randomUUID().toString().toLowerCase().substring(0,(numPass/2)+1);
			System.out.println(pass+pass2);
			
		}
	
	}

}
