package Servicios;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

import Anotaciones.Columna;
import Anotaciones.Id;
import Anotaciones.Tabla;
import Utilidades.UBean;

public class Servicios {
	
	
	
	// el cual debe guardar en la base de datos el objeto. Debe
	// armarse la query por medio de reflexi�n utilizando las anotaciones creadas en
	// el punto 2 y utilizando los m�todos creados en UBean.

	public static void Guardar(Object o)
	{
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Field> lista = new ArrayList<>();
		lista = UBean.obtenerAtributos(o);
		
		
		// Armo primer parte del String.
		
		sb.append("INSERT INTO ");
		sb.append(o.getClass().getAnnotation(Tabla.class).nombre());
		sb.append(" (");
		
		
		// Recorro todos los atributos. 
		for (Field campo : lista)
		{
			if (campo.getAnnotation(Id.class) == null)
			{
				sb.append(campo.getAnnotation(Columna.class).nombre() + ",");
			}	
		}
		
		sb.delete(sb.length()-1, sb.length());
		sb.append(") VALUES (");
		
		
		for (Field campo: lista)
		{
			if (campo.getAnnotation(Id.class) == null)
			{
				if (campo.getAnnotatedType().getType().equals(String.class))
				{
					sb.append("'");
					sb.append(UBean.ejecutarGet(o, campo.getAnnotation(Columna.class).nombre()));
					sb.append("'");
					sb.append(",");
				}
				else
				{
					sb.append(UBean.ejecutarGet(o, campo.getAnnotation(Columna.class).nombre()));
					sb.append(",");
				}
					
			}
		}
		
		sb.delete(sb.length()-1, sb.length());
		sb.append(")");

	
		System.out.println(sb);
		
	}
	
	
	
	// el cual debe modificar todas las columnas, excepto la
	// columna Id, la cual se va a utilizar para la restricci�n(where). Debe armarse la
	// query por medio de reflexi�n utilizando las anotaciones creadas en el punto 2
	// y utilizando los m�todos creados en UBean.
	
	public void Modificar(Object o)
	{
		
		String consulta = "Insert into";
		
		
	}
	
	
	
	//  el cual debe eliminar el registro de la base de datos. Debe
	// armarse la query por medio de reflexi�n utilizando las anotaciones creadas en
	// el punto 2 y utilizando los m�todos creados en UBean.
	
	public static void Eliminar(Object o)
	{
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Field> lista = new ArrayList<>();
		lista = UBean.obtenerAtributos(o);
		
		
		sb.append("DELETE FROM ");
		sb.append(o.getClass().getAnnotation(Tabla.class).nombre());
		sb.append(" WHERE ");
		
		
		// Recorro todos los atributos. 
				for (Field campo : lista)
				{
					if (campo.getAnnotation(Id.class) == null)
					{
						sb.append(campo.getAnnotation(Columna.class).nombre() + "=");
						
						
						if (campo.getAnnotatedType().getType().equals(String.class))
						{
							sb.append("'");
							sb.append(UBean.ejecutarGet(o, campo.getAnnotation(Columna.class).nombre()));
							sb.append("'");
							sb.append("&&");
						}
						else
						{
							sb.append(UBean.ejecutarGet(o, campo.getAnnotation(Columna.class).nombre()));
							sb.append("&&");
						}
					
					}	
				}
				
				sb.delete(sb.length()-2, sb.length());

			
		System.out.println(sb);
	
	
		
	}
	
	
	
	// el cual debe devolver un objeto del tipo
	// definido en el par�metro Class, con todos sus datos cargados. ). Debe armarse
	// la query por medio de reflexi�n utilizando las anotaciones creadas en el punto
	// 2 y utilizando los m�todos creados en UBean.
	
	public void ObtenerPorID(Class c, Object o)
	{
		
		String consulta = "Insert into";
		
		
	}
	
	
	

}
