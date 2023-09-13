package eva1_9_area_triangulo.netbeans;

import java.util.Scanner;

public class EVA1_9_AREA_TRIANGULONETBEANS {
    
    public static void main(String[] args) {
        // double es el tipo real (numero con parte decimal)
        double base;
        double altura;
        double area;
        Scanner input = new Scanner(System.in);
        // operaciones: * / + - =
        System.out.println("introduce la base del triangulo");
        base = input.nextDouble();
        System.out.println("introduce la altura del triangulo");
        altura = input.nextDouble();
        area = (base*altura)/2;
        System.out.print("el area es: ");
        System.out.println(area);
        
    }
    
}
