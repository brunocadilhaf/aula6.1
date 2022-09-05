package modelos;
public class Retangulo extends Quadrilatero {
    public String ApresentarArea() {
        calcularArea();
        return "Área: " + this.area;
    }
}
