/*
 */
package Tarea3;

/**
 *
 * @author Windows
 */
public class Rectangle implements Calculate {
    
    private double areaRec;
    private double height;
    private double width;
    
    
    public Rectangle(double widthRec, double heightRec) {
        
        this.width = widthRec;
        this.height = heightRec;
        this.areaRec = calculateArea();
        
    }
    
    @Override
    public double calculateArea(){
        
        double areaRec = this.width * this.height;
        return areaRec;
        
    }
    
    int compareTo (Rectangle r1){
        if(this.areaRec == r1.areaRec){
            return 1;
        }else{
            return 0;
        }
        
    }
    
    


        

}
