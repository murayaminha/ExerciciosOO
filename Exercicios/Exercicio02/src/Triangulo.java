public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){}
    public String calcularArea(){
        if (base<0 || altura<0) {
            return "entre com valores positivos";
        }
        else {
            double area=((this.base*this.altura)/2);
            return "area do triangulo = "+area;
        }
    }
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
}
