package sumo;

public class PreTorneo {
	
	private Luchador[] luchadores;
	private int cantidadActual;
	
	public PreTorneo(int cantidadDeParticipantes) {
		luchadores = new Luchador[cantidadDeParticipantes];
		cantidadActual = 0;
		
	}
	
	public void agregar(Luchador luchador) {
		luchadores [cantidadActual] = luchador;
		cantidadActual = cantidadActual +1;
	}
	
	//El metodo!
	public int[] calcularDominio() {
		int[] dominios = new int[luchadores.length];
		for (int i = 0; i < luchadores.length - 1; i++) {
			Luchador referencia = luchadores[i];
			for (int j = i + 1; j < luchadores.length; j++) {
				Luchador otro = luchadores[j];
				if(referencia.dominaA(otro))
					dominios[i]++;
				if(otro.dominaA(referencia))
					dominios[j]++;
			}
		}
		return dominios;
	}

}
