/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if;

import java.util.Scanner;

public class EVA2_2_IF {
    
    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la calificacion");
        califa = input.nextInt();
        
        if(califa >= 70) //se ejecuta si es verdad
            System.out.println("Aprobaste");
        else //si es falso se ejecuta este. else es opcional
            System.out.println("No aprobaste");
    }
    
}
