public class Triangulo {

    public double base;
    public double altura;
    public double lado2;
    public double lado3;

        public Triangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
    }
        public double area(){
            return base * altura / 2;
        }
        public double perimetro(){
            return base + lado2 + lado3;
        }
    }

