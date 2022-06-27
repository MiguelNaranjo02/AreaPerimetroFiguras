package Figuras;

import java.util.ArrayList;


/**
 *
 * @author migue
 */
public class Poligono extends Figura{
ArrayList<Double> puntosX= new ArrayList();
ArrayList<Double> puntosY= new ArrayList();
ArrayList<Double> auxX;
ArrayList<Double> auxY;
   
@Override
    void calcularArea() {
for (int i=0;i<auxX.size()-1;i++){
           area=area+(auxX.get(i)*auxY.get(i+1))-(auxY.get(i)*auxX.get(i+1));
       }
       area=area/2;
    }

    @Override
    void calcularPerimetro() {
       for(int i=0;i<puntosX.size();i++){
          perimetro=perimetro+Math.sqrt(Math.pow(auxX.get(i+1)-auxX.get(i),2)+Math.pow(auxY.get(i+1)-auxY.get(i), 2));
       }
    }

    public Poligono(double[] arrX, double[] arrY) {
       for(int i=0;i<arrX.length;i++){
        puntosX.add(i, arrX[i]);
      }
       for(int i=0;i<arrY.length;i++){
        puntosY.add(i, arrY[i]);
      }
       auxX = (ArrayList) puntosX.clone();
       auxY = (ArrayList) puntosY.clone();
       auxX.add(puntosX.get(0));
       auxY.add(puntosY.get(0));
        calcularArea();
        calcularPerimetro();
    }

    
}
