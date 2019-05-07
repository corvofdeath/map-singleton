package application;

import enums.TiposTriangulo;
import figuras.*;

public class StartUp {

    public static void main(String[] args) {

        Circulo circulo1 = FiguraFactory.getCirculo();
        Circulo circulo2 = FiguraFactory.getCirculo();

        print("Circulo 1 Nome: " + circulo1.getNome());
        print("Circulo 2 Nome: " + circulo2.getNome());

        print("");

        Triangulo trianguloEquilatero = FiguraFactory.getTriangulo(TiposTriangulo.Equilatero);
        Triangulo trianguloIsoceles = FiguraFactory.getTriangulo(TiposTriangulo.Isoceles);
        Triangulo trianguloRetangulo = FiguraFactory.getTriangulo(TiposTriangulo.Retangulo);

        Triangulo trianguloEquilatero2 = FiguraFactory.getTriangulo(TiposTriangulo.Equilatero);
        Triangulo trianguloIsoceles2 = FiguraFactory.getTriangulo(TiposTriangulo.Isoceles);
        Triangulo trianguloRetangulo2 = FiguraFactory.getTriangulo(TiposTriangulo.Retangulo);

        print("Triangulo Equilatero 1 Nome: " + trianguloEquilatero.getNome());
        print("Triangulo Equilatero 2 Nome: " + trianguloEquilatero2.getNome());
        print("Triangulo Isoceles 1 Nome: " + trianguloIsoceles.getNome());
        print("Triangulo Isoceles 2 Nome: " + trianguloIsoceles2.getNome());
        print("Triangulo Retangulo 1 Nome: " + trianguloRetangulo.getNome());
        print("Triangulo Retangulo 2 Nome: " + trianguloRetangulo2.getNome());

        print("Quantidades de triangulos: " + FiguraFactory.trianguloCount());

        print("");

        Quadrado quadrado1 = FiguraFactory.getQuadrado();
        Quadrado quadrado2 = FiguraFactory.getQuadrado();
        Quadrado quadrado3 = FiguraFactory.getQuadrado();

        print("Quadrado 1 Nome: " + quadrado1.getNome());
        print("Quadrado 2 Nome: " + quadrado2.getNome());
        print("Quadrado 3 Nome: " + quadrado3.getNome());
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
