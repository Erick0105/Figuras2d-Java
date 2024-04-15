public class Triangulo {

    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double area_triangulo(){
        return (getBase() * getAltura())/2;
    }
    public double perimetro_triangulo(){
        return getBase() + getLado2() + getLado3();
    }
}