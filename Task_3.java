//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 

package task_3;

public class Task_3 {
    
    /** 
     * @param x - Значение в градусах
     * @param y - Значение в градусах
     */
    public static double func(double x, double y) {
        
        double radiansX = Math.toRadians(x);
        double radiansY = Math.toRadians(y);
        double radiansXY = Math.toRadians(x * y);
        double cosX = Math.cos(radiansX);
        double cosY = Math.cos(radiansY);
        double sinX = Math.sin(radiansX);
        double sinY = Math.sin(radiansY);
        double tanXY = Math.tan(radiansXY);
        double pZ = ((sinX + cosY) / (cosX - sinY)) * tanXY;
        return pZ;
       
    }

    public static void main(String[] args) {
        
        double z = func(60, 40);
        System.out.printf("z = %.1f \n", z);
       
    }
    
}
