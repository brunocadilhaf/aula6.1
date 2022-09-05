import modelos.Quadrilatero;
import modelos.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrilatero quadr = new Quadrilatero();
        quadr.setAltura(20);        
        quadr.setBase(5);
        System.out.println("Área = " + quadr.ObterArea());

        Retangulo ret = new Retangulo();
        ret.setAltura(10);
        ret.setBase(3);
        System.out.println(ret.ApresentarArea());
    }
}
