package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import enums.TiposTriangulo;

public class FiguraFactoryTest {
		
	@Test
	public void testGetCirculo() {
		assertEquals(FiguraFactory.getCirculo(), FiguraFactory.getCirculo());
	}
	
	@Test
	public void testGetQuadrado() {
		assertFalse(FiguraFactory.getQuadrado() == FiguraFactory.getQuadrado());
	}
	
	@Test
	public void testGetTriangulo() {
		assertEquals(FiguraFactory.getTriangulo(TiposTriangulo.Equilatero), FiguraFactory.getTriangulo(TiposTriangulo.Equilatero));
		assertEquals(FiguraFactory.getTriangulo(TiposTriangulo.Isoceles), FiguraFactory.getTriangulo(TiposTriangulo.Isoceles));
		assertEquals(FiguraFactory.getTriangulo(TiposTriangulo.Retangulo), FiguraFactory.getTriangulo(TiposTriangulo.Retangulo));
	}
}
