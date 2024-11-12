package exercicios04.calculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("A area da sala retangular é: " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perimetro da sala retangular é: " + perimetro);
    }
}
