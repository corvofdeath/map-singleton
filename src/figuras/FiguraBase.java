package figuras;

public abstract class FiguraBase {

    private final String nome;

    public FiguraBase(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
