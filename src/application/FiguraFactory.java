package application;

import enums.TiposTriangulo;
import figuras.*;

import java.util.HashMap;

public class FiguraFactory {

    private static Circulo circuloInstance = null;
    private static int quadradoInstancias = 0;
    private final static HashMap<TiposTriangulo, Triangulo> triangulosInstances = new HashMap<>();

    public static Circulo getCirculo() {

        if (circuloInstance != null)
            return circuloInstance;

        circuloInstance = new Circulo("Circulo Unico");

        return circuloInstance;
    }

    public static Quadrado getQuadrado() {
        quadradoInstancias += 1;
        return new Quadrado("Quadrado " + quadradoInstancias);
    }

    public static Triangulo getTriangulo(TiposTriangulo tipo) {

        Triangulo triangulo = triangulosInstances.get(tipo);
        if (triangulo != null)
            return triangulo;

        triangulo = new Triangulo("Triangulo " + tipo + " unico", tipo);
        triangulosInstances.put(tipo, triangulo);

        return triangulo;
    }

    public static int trianguloCount() {
        return triangulosInstances.size();
    }
}
