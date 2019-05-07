package builders;

import enums.TiposTriangulo;
import figuras.Triangulo;

public class TrianguloBuilder {

	private Triangulo triangulo;
	
	public static TrianguloBuilder mockTriangulo() {
		TrianguloBuilder builder = new TrianguloBuilder();
		builder.triangulo = new Triangulo("Triangulo", TiposTriangulo.Equilatero);
		
		return builder;
	}
	
	public Triangulo getTriangulo() {
		return this.triangulo;
	}
}
