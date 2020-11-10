package Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// NIVEL CLASE.
@Target(ElementType.TYPE)
public @interface Tabla {
	String nombre();
}
