
import java.util.Vector;

public class Tesoreria {

	public static void main(String[] args) {
		//VARIABLES
		String palabra="";
		Vector v=new Vector();
		
		int ingresos[]={10,40,60,120,3};
		int gastos[]={-5,-120,-65};
		int balance=0;
		boolean prueba=true;
		float numero=1.8f;
		
		//LOGICA
		for(int i=0;i<ingresos.length;i++)
		{
			balance=balance+ingresos[i];
		}
		for(int i=0;i<gastos.length;i++)
		{
			balance=balance+gastos[i];
		}
		//IMPRESION
		System.out.println("El balance total: "+balance);
	}

}
