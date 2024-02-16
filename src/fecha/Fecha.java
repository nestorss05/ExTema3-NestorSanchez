package fecha;

/**
 * Clase fecha: Examen Entornos T3 2023/24
 * 
 * @author Nestor Sanchez
 */
public class Fecha {

	/**
	 * d: dia de una fecha
	 */
	private int d;

	/**
	 * m: mes de una fecha
	 */
	private int m;

	/**
	 * a: anio de una fecha
	 */
	private int a;

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
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * boolean fechaCorrecta(): comprueba si la fecha es correcta
	 * 
	 * @return: fecha correcta a base de diaCorrecto, mesCorrecto y anioCorrecto
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Metodo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	 * 
	 * @return true/false en cuanto a si un anio es bisiesto o no
	 */
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	/**
	 * Metodo diaSiguiente: pasa la fecha al dia siguiente
	 */
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Metodo toString: pasa la fecha a String
	 */
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
