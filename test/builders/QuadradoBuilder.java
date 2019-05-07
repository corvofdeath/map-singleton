package builders;

import figuras.Quadrado;

public class QuadradoBuilder {
	
	private Quadrado quadrado;
	
	public static QuadradoBuilder mockQuadrado() {
		QuadradoBuilder builder = new QuadradoBuilder();
		builder.quadrado = new Quadrado("Quadrado 1");
		
		return builder;
	}
	
	public Quadrado getQuadrado() {
		return this.quadrado;
	}
}
