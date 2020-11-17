package Servicios;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

import Anotaciones.Columna;
import Anotaciones.Tabla;
import Utilidades.UBean;

public class Servicios {
	
	
	
	// el cual debe guardar en la base de datos el objeto. Debe
	// armarse la query por medio de reflexión utilizando las anotaciones creadas en
	// el punto 2 y utilizando los métodos creados en UBean.

	public static void Guardar(Object o)
	{
		
		ArrayList<Field> lista = new ArrayList<>();
		lista = UBean.obtenerAtributos(o);
		
		
		String consulta = "Insert into ";
		
		
		//String nombreTabla = o.getClass().getAnnotation(Tabla.class).nombre();
		String nombreTabla = "Personas";
		
		consulta += nombreTabla + " (";
		
	
		for (Field campo : lista)
		{
			//consulta += campo.getName().toString() + ",";
			consulta += campo.getAnnotation(Columna.class).nombre() + ",";
			
		}
		
		if(consulta.endsWith(","))
		{
			consulta = consulta.substring(0,consulta.length() - 1);
			consulta += ")";
		}
		

	
		System.out.println(consulta);
		
	}
	
	
	
	// el cual debe modificar todas las columnas, excepto la
	// columna Id, la cual se va a utilizar para la restricción(where). Debe armarse la
	// query por medio de reflexión utilizando las anotaciones creadas en el punto 2
	// y utilizando los métodos creados en UBean.
	
	public void Modificar(Object o)
	{
		
		String consulta = "Insert into";
		
		
	}
	
	
	
	//  el cual debe eliminar el registro de la base de datos. Debe
	// armarse la query por medio de reflexión utilizando las anotaciones creadas en
	// el punto 2 y utilizando los métodos creados en UBean.
	
	public void Eliminar(Object o)
	{
		
		String consulta = "Insert into";
		
		
	}
	
	
	
	// el cual debe devolver un objeto del tipo
	// definido en el parámetro Class, con todos sus datos cargados. ). Debe armarse
	// la query por medio de reflexión utilizando las anotaciones creadas en el punto
	// 2 y utilizando los métodos creados en UBean.
	
	public void ObtenerPorID(Class c, Object o)
	{
		
		String consulta = "Insert into";
		
		
	}
	
	
	

}
