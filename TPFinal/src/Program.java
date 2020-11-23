import java.lang.reflect.Field;
import java.util.ArrayList;

import Clases.PersonaReflexion;
import Servicios.Servicios;
import Utilidades.UBean;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaReflexion p = new PersonaReflexion();
		
				
		p.setDni(11111);
		p.setApellido("Moreno");
		p.setLocalidad("Banfield");
		p.setNombre("Lucho");
		p.setProvincia("Buenos Aires");
			
		Servicios.Guardar(p);
		
		Servicios.Eliminar(p);
		
		
		Servicios.Modificar(p);
		
	
		
	}

}
