package Figuras;
/**
 *
 * @author migue
 */
public class Principal {

    public static void main(String[] args) {
        double radio=5;
        Circulo circ = new Circulo(radio);
        System.out.println("El circulo de radio "+ radio+" tiene de area "+ circ.area);
        System.out.println("El circulo de radio "+ radio+" tiene de perimetro "+ circ.perimetro);
        
        double[] arrX ={-3,-5,2,5};
        double[] arrY ={5,-2,-5,-1};
        Poligono poli = new Poligono(arrX,arrY);
        
        System.out.println("El poligono con los puntos");
   for(int i=0;i<poli.puntosX.size();i++){
       System.out.println(poli.puntosX.get(i)+","+poli.puntosY.get(i));
   }
        System.out.println("Tiene de area "+ poli.area);
        System.out.println("Tiene de perimetro "+ poli.perimetro);
    }
}
