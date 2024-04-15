import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Qual o valor da base do triângulo?");
        triangulo.setBase(leitor.nextDouble());
        System.out.println("E qual o valor da altura deste triângulo?");
        triangulo.setAltura(leitor.nextDouble());
        System.out.println("Qual o valor do lado sem ser a base?");
        triangulo.setLado2(leitor.nextDouble());
        System.out.println("Qual o valor do outro lado?");
        triangulo.setLado3(leitor.nextDouble());

        System.out.println("------------------------------------------\n" +
                "Área do triângulo: " + triangulo.area_triangulo() +
                "\nPérimetro do triângulo: " + triangulo.perimetro_triangulo() +
                "\n------------------------------------------");
    }
}