/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_entradas_salidas;

import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;
public class EVA1_6_ENTRADAS_SALIDAS {
    public static void main(String[] args) {
    String marca;
    String modelo;
    int anio;
    double precio;
    Scanner input = new Scanner(System.in);
    //Hay un paquete System, dentro un paquete out, y dentro
    // de out, la instruccion println
    System.out.println("introduce la marca del auto");
    marca = input.nextLine();
    System.out.println("introduce el modelo del auto");
    modelo = input.nextLine();
    System.out.println("introduce el año del auto");
    anio = input.nextInt();
    System.out.println("introduce el precio del auto");
    precio = input.nextDouble();
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anio);
        System.out.println(precio);
    }
}
