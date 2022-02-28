/*
 */
package Tarea3;

/**
 */
public class Circle implements Calculate {
    
    private double areaCir;
    private double radio;
    
    public Circle(Double radioCircle) {
        this.radio = radioCircle;
        this.areaCir = calculateArea();
    }
    
    @Override
    public double calculateArea(){
        double areaCir = 3.1416 * Math.pow(radio,2);
        return areaCir;
    }
    
    int compareTo (Circle c1){
        if(this.areaCir == c1.areaCir){
            return 1;
        }else{
            return 0;
        }
        
    }
    

}
