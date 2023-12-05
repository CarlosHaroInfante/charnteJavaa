package edu.charnte.servicios;

/**
 * <summary>
 * Interfaz donde se encuentran los métodos de la operativa
 * @author Carlos - 05-12-23
 * </summary>
 *  */
public interface operacionInterfaz {

	/**
	 * <summary>
	 * Método donde se encuentra la venta, pedirá un numero y lo sumará a la cuenta.
	 * @author Carlos - 05-12-23
	 * </summary>
	 *  */
  public int venta();
   /**
	 * <summary>
	 * Método donde se encuentra el gasto, pedirá un numero y lo restará a la cuenta.
	 * @author Carlos - 05-12-23
	 * </summary>
	 *  */
  public int gasto();
 
  /**
	 * <summary>
	 * Método donde se muestra el dinero en caja y según el dinero mostrará un mensaje, otro o no mostrará nada.
	 * @author Carlos - 05-12-23
	 * </summary>
	 *  */
  public int dinero();
  
  
}
