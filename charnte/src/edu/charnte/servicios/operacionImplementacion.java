package edu.charnte.servicios;

import java.util.Scanner;
/**
 * <summary>
 * Clase donde se encuentra los métodos de la operativa.
 * <author>CHI - 05-12-23</author>
 * </summary>
 *  */
public class operacionImplementacion implements operacionInterfaz{
	
	int money = 0;
	Scanner sc2 = new Scanner(System.in);
	int dineroFinal = 0;
	
	/**
	 * <summary>
	 * Interfaz donde se encuentran los métodos de la operativa
	 * <author>CHI - 05-12-23</author>
	 * </summary>
	 *  */
	public int venta()
	{
		
		System.out.println("Nueva venta");
		
		int valorVenta = sc2.nextInt();
		
		dineroFinal = money + valorVenta;
		
	
		
		return dineroFinal;
	}
	
	/**
	 * <summary>
	 * Método donde se encuentra el gasto, pedirá un numero y lo restará a la cuenta.
	 * <author>CHI - 05-12-23</author>
	 * </summary>
	 *  */
	public int gasto() 
	{
		System.out.println("Nuevo Gasto");
		int valorGasto = sc2.nextInt();
		
		dineroFinal = dineroFinal - valorGasto;
		
		
		if (dineroFinal < 0)
		{
			System.out.println("Debe Dinero");
		}
		
		
		return dineroFinal;
		
		
	}
	/**
	 * <summary>
	 * Método donde se muestra el dinero en caja y según el dinero mostrará un mensaje, otro o no mostrará nada.
	 * <author>CHI - 05-12-23</author>
	 * </summary>
	 *  */
	public int dinero() 
	{
		System.out.println("Dinero en caja");
		
		
			
		
		if(dineroFinal == 0) {
		System.out.println("Vamos mal " + dineroFinal);
		}
		
		else if(dineroFinal < 0) {
	    System.out.println("Vamos muy mal " + dineroFinal);	
		}
		
		else {
			System.out.println(dineroFinal);	
		}
		
		return dineroFinal;
	}
}
