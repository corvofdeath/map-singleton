package figuras;

import enums.TiposTriangulo;

public class Triangulo extends FiguraBase {

    private final TiposTriangulo tipo;

    public Triangulo(String nome, TiposTriangulo tipo) {
        super(nome);

        this.tipo = tipo;
    }

    public TiposTriangulo getTipo() {
        return tipo;
    }
}
