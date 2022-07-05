package Figuras;


/**
 *
 * @author migue
 */
public class Circulo extends Figura{
public double radio;
    @Override
  public  void calcularArea() {
        area=radio*radio*Math.PI;
       
    }

    @Override
   public void calcularPerimetro() {
        perimetro=2*Math.PI*radio;
      
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
}
