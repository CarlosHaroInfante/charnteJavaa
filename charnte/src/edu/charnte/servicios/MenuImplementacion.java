package edu.charnte.servicios;

import java.util.Scanner;
/**
 * <summary>
 * Clase donde se encuentra el método del menú.
 * <author>CHI - 05-12-23</author>
 * </summary>
 *  */

public class MenuImplementacion implements MenuInterfaz
{
	/**
	 * <summary>
	 * Método donde el menú pedirá que el usuario elija una opción.
	 * <author>CHI - 05-12-23</author>
	 * </summary>
	 *  */
	public int menu() 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuentas");
		System.out.println("-----------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Añadir venta");
		System.out.println("[2] - Añadir gasto");
		System.out.println("[3] - Mostrar Total");
		System.out.println("-----------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
		
	}
}
