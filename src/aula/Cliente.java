package aula;

public class Cliente {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Círculo 1");
        Circulo circulo2 = new Circulo("Círculo 2");
        Triangulo triangulo1 = new Triangulo("Triângulo 1");
 
        FiguraAgrupada grupo1 = new FiguraAgrupada();
        grupo1.adicionar(circulo1);
        grupo1.adicionar(triangulo1);
 
        FiguraAgrupada grupo2 = new FiguraAgrupada();
        grupo2.adicionar(grupo1);  
        grupo2.adicionar(circulo2);
 
        System.out.println("Desenhando grupo 1:");
        grupo1.desenhar();
 
        System.out.println("\nDesenhando grupo 2:");
        grupo2.desenhar();
    }
}