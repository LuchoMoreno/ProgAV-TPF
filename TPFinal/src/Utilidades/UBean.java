package Utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class UBean {
	
	
	// Devuelve un ArrayList<Field> con todos los atributos que posee el parámetro Object.

	public static ArrayList<Field> obtenerAtributos (Object o)
	{
		
		ArrayList<Field> lista = new ArrayList<>();
		
		Class generica = o.getClass();
		
		Field[] todosLosAtributos = generica.getDeclaredFields();
		
		for (Field fields : todosLosAtributos) {
			
			lista.add(fields);

		}
		
		return lista;
		
	}
	
	
	//  Se debe ejecutar el método Setter del String dentro del Object.

	
	public static void ejecutarSet(Object o, String att, Object valor)
	{
		
/*
		Class generica = o.getClass();
		
		Method[] m = generica.getDeclaredMethods();
		
		Object[] params = new Object[1];
							
		if (m.getType().equals(String.class))
						{
							params[0] = "String";	
						}
						else if (f.getType().equals(Integer.class))
						{
							params[0] = 111111;
						}
						else
						{
							params[0] = null;
						}
							
						try {
								
							m.invoke(valor, params);
								
							} 
							catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) 
							{

								e.printStackTrace();
							}
							

		*/
		
		
	}
	
	
	// devolverá el valor del atributo pasado por
	// parámetro, ejecutando el getter dentro del objeto.
	
	
	public static void ejecutarGet(Object o, String att)
	{
		
		// GETTERS.

		Class generica = o.getClass();
		
		Method m;
		try 
		{
			m = generica.getDeclaredMethod("get"+att.substring(0,1).toUpperCase()+att.substring(1));
			m.invoke(o, null);
		} 
		
		catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

			e.printStackTrace();
		}
		
	
		
		}
	
}
