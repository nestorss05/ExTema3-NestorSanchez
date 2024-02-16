package fecha;

/**
 * Clase fecha: Examen Entornos T3 2023/24
 * 
 * @author Nestor Sanchez
 */
public class Fecha {

<<<<<<< HEAD
	/**
	 * d: dia de una fecha
	 */
	private int d;
=======
	public static final int DIEZ = 10;

	/**
	 * d: dia de una fecha
	 */
	private int fechaDia;
>>>>>>> PMD-Refactor

	/**
	 * m: mes de una fecha
	 */
<<<<<<< HEAD
	private int m;
=======
	private int fechaMes;
>>>>>>> PMD-Refactor

	/**
	 * a: anio de una fecha
	 */
<<<<<<< HEAD
	private int a;
=======
	private int fechaAnio;
>>>>>>> PMD-Refactor

	/**
	 * Constructor sin parametros
	 */
	public Fecha() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param dia  = variable d
	 * @param mes  = variable m
	 * @param anio = variable a
	 */
	public Fecha(int dia, int mes, int anio) {
		this.fechaDia = dia;
		this.fechaMes = mes;
		this.fechaAnio = anio;
	}

	/**
	 * boolean fechaCorrecta(): comprueba si la fecha es correcta
	 * 
	 * @return: fecha correcta a base de diaCorrecto, mesCorrecto y anioCorrecto
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = fechaAnio > 0;
		mesCorrecto = fechaMes >= 1 && fechaMes <= 12;
		boolean diaMayor1 = fechaDia >= 1;
		switch (fechaMes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && fechaDia <= 29;
			} else {
				diaCorrecto = diaMayor1 && fechaDia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && fechaDia <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && fechaDia <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Metodo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	 * 
	 * @return true/false en cuanto a si un anio es bisiesto o no
	 */
	private boolean esBisiesto() {
		return fechaAnio % 4 == 0 && fechaAnio % 100 != 0 || fechaAnio % 400 == 0;
	}

	/**
	 * Metodo diaSiguiente: pasa la fecha al dia siguiente
	 */
<<<<<<< HEAD
	public void diaSiguiente() {
		d++;
=======
	public void nextDay() {
		fechaDia++;
>>>>>>> PMD-Refactor
		if (!fechaCorrecta()) {
			fechaDia = 1;
			fechaMes++;
			if (!fechaCorrecta()) {
				fechaMes = 1;
				fechaAnio++;
			}
		}
	}

	/**
	 * Metodo toString: pasa la fecha a String
	 */
	public String toString() {
		String respuesta;
		if (fechaDia < DIEZ && fechaMes < DIEZ) {
			respuesta = "0" + fechaDia + "-0" + fechaMes + "-" + fechaAnio;
		} else if (fechaDia < DIEZ && fechaMes >= DIEZ) {
			respuesta =  "0" + fechaDia + "-" + fechaMes + "-" + fechaAnio;
		} else if (fechaDia >= DIEZ && fechaMes < DIEZ) {
			respuesta = fechaDia + "-0" + fechaMes + "-" + fechaAnio;
		} else {
			respuesta = fechaDia + "-" + fechaMes + "-" + fechaAnio;
		}
		return respuesta;
	}

}
