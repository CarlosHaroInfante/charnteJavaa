package edu.charnte.controladores;

import edu.charnte.servicios.MenuImplementacion;
import edu.charnte.servicios.MenuInterfaz;
import edu.charnte.servicios.operacionImplementacion;
import edu.charnte.servicios.operacionInterfaz;

/**
 * <summary>
 * Clase principal del programa, donde se encuentra el Main
 * <author>CHI - 05-12-23</author>
 * </summary>
 *  */
public class Inicio {
	/**
	 * <summary>
	 * Main del programa donde se encuentra la llamada a metodos, el while, switch, etc
	 * <author>CHI - 05-12-23</author>
	 * </summary>
	 *  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz menu = new MenuImplementacion();
		operacionInterfaz oper = new operacionImplementacion();
		boolean cerrarMenu = false;
		
		
		while (!cerrarMenu)
		{
			
			int op = menu.menu();
			
			switch(op) 
			{
				
			case 0:
				System.out.println("Se cierra Menú");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("Añadir Venta");
				int venta = oper.venta();
				System.out.println(venta);
				break;
			
			case 2:
				System.out.println("Añadir Gasto");
				int gasto = oper.gasto();
				System.out.println(gasto);
				break;
				
			case 3:
				System.out.println("Mostrar Total");
				int finale = oper.dinero();
				System.out.println(finale);
				break;
				
			default:
				System.out.println("Ninguna opción válida");
				break;
				
				
			
			}
			
		}
		
		
	}

}
