package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	private Baraja baraja;

	// Const
	public Mesa() {
		this.baraja = new Baraja();
	}

	public Mesa(int tipoBaraja) {
		this.baraja = new Baraja(tipoBaraja);
	}

	public Mesa(int tipoBaraja, boolean barajada) {
		this.baraja = new Baraja(tipoBaraja, barajada);
	}

	// Getters - Setters
	public Baraja getBaraja() {
		return baraja;
	}

	public void setBaraja(Baraja baraja) {
		this.baraja = baraja;
	}

	// Methods
	/**
	 * Muestra la baraja que hay en la mesa.
	 */
	public void mostrarBaraja() {
		System.out.println(this.baraja.lista_cartas);
	}

	/**
	 * Roba una carta de la baraja de la mesa.
	 * 
	 * @return Objeto 'Carta' que se ha robado.
	 */
	public Carta robarCartaDeBaraja() {
		Carta carta = this.baraja.robar();
		return carta;
	}

	/**
	 * Roba varias cartas de la baraja de la mesa.
	 * 
	 * @param n Entero que representa el numero de cartas que se van a robar.
	 * @return List<Carta> con las cartas robadas.
	 */
	public List<Carta> robarVariasCartas(int n) {
		List<Carta> cartas = new ArrayList<Carta>();
		for (int i = 0; i < n; i++) {
			cartas.add(robarCartaDeBaraja());
		}
		return cartas;
	}

	/**
	 * Añadimos una carta de nuestra mano al final de la baraja de la mesa.
	 * 
	 * @param carta Objeto 'Carta' que introducimos.
	 */
	public void addCartaABaraja(Carta carta) {
		this.baraja.insertaCartaFinal(carta);
	}

	// toString
	@Override
	public String toString() {
		return "Mesa [baraja=" + baraja + "]";
	}

}
