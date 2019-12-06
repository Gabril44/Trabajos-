package tpn8;

public class Moto implements Vehiculo{
	
	private double VelBase;

    public Moto(double vel) {
        this.VelBase = vel;
    }
    
    public double getVelBase() {
        return this.VelBase;
    }

	@Override
	public String getVehiculo() {
		// TODO Auto-generated method stub
		return "MOTO";
	}

	@Override
	public void Acelerar() {
		// TODO Auto-generated method stub
		VelBase+=20;

        if(VelBase>VelMaxima) {
            System.out.println ("La velocidad maxima ha sido superada.");
        }
        if(VelBase==VelMaxima) {
            System.out.println ("La velocidad maxima ha sido alcanzada.");
        }
		
	}

	@Override
	public void Frenar(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Frenar(double x, double y) {
		// TODO Auto-generated method stub
		if(x==y) {
            VelBase-=x;
        }

        if(VelBase<0) {
            VelBase=0;
        }

        if(VelBase==x && VelBase==y && x==y &&VelBase>=60) {
            System.out.println ("Te reventaste!!!");
        }

        if(VelBase==0) {
            System.out.println ("El vehiculo se ha detenido.");
        }
		
	}

	@Override
	public String Plazas() {
		// TODO Auto-generated method stub
		return ("El Vehiculo tiene 2 plazas");
	}

}
