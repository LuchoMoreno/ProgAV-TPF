import java.lang.reflect.Field;
import java.util.ArrayList;

import Clases.PersonaReflexion;
import Servicios.Servicios;
import Utilidades.UBean;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaReflexion p = new PersonaReflexion();
		
		ArrayList<Field> lista = new ArrayList<>();
		
		
		lista = Utilidades.UBean.obtenerAtributos(p);
		
		
				for (Object aux : lista)
				{
					System.out.println(aux);
					
				}
				
				


		Servicios.Guardar(p);
	
		
	}

}
