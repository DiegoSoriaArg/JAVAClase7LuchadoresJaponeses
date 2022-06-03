package sumo;

public class Luchador {

	private int peso;
	private int altura;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean dominaA(Luchador otro) {

		boolean superaEnPEso = this.peso > otro.peso;
		boolean superaEnAltura = this.altura > otro.altura;

		boolean mismaALtura = this.altura == otro.altura;
		boolean mismoPeso = this.peso == otro.peso;

		return superaEnPEso && superaEnAltura 
				|| mismaALtura && superaEnPEso 
				|| mismoPeso && superaEnAltura;

	}

}
