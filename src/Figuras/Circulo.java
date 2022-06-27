package Figuras;


/**
 *
 * @author migue
 */
public class Circulo extends Figura{
private double radio;
    @Override
    void calcularArea() {
        area=radio*radio*Math.PI;
       
    }

    @Override
    void calcularPerimetro() {
        perimetro=2*Math.PI*radio;
      
    }

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }
    
}
