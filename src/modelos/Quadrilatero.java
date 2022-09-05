package modelos;
public class Quadrilatero {
    private int base;
    private int altura;
    protected int area;

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = this.altura * this.base;
    }

    public int ObterArea() {
        calcularArea();
        return this.area;
    }
}
