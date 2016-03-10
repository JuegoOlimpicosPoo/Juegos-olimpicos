/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

//import java.util.*;
public class JuegosOlimpicos {

    public static void main(String[] args) {
        Delegacion[] delegaciones;
        //Grupo[] grupos;
        String nombrepais, deporte;
        int i,b, accion, contador = 0, numdeportistas, moro, mplata, mbronce, integrantes;
        boolean repetir = true;
        delegaciones = new Delegacion[10];
        //grupos = new Grupo[5];
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        while (repetir == true) {
            System.out.println("1.Ingresar una nueva delegacion.\n" + "2.Consular delegacion.\n" + "3.Cambiar numero de medallas.\n"
                    + "4.Delegacion con mayor numero de medallas.\n" + "5.Terminar.");
            accion = lectura.nextInt();
            if (accion == 1) {
                if (contador == 9) {
                    System.out.println("Ha ingresado el numero maximo de delegaciones");
                    break;
                }
                System.out.println("Ingrese el nombre del pais.");
                nombrepais = lectura.next();
                System.out.println("Ingrese el numero de deportistas.");
                numdeportistas = lectura.nextInt();
                System.out.println("Ingrese el numero de medallas de oro.");
                moro = lectura.nextInt();
                System.out.println("Ingrese el numero de medallas de plata.");
                mplata = lectura.nextInt();
                System.out.println("Ingrese el numero de medallas de bronce.");
                mbronce = lectura.nextInt();
                delegaciones[contador] = new Delegacion(nombrepais, numdeportistas, moro, mplata, mbronce);
                contador = contador + 1;

                for (i = 0; i < 5; i++) {

                    System.out.println("Ingrese el numero de integrantes del grupo");
                    integrantes = lectura.nextInt();
                    if (integrantes < 2 || integrantes > 10) {
                        System.out.println("Cada grupo debe tener entre 2 y 10 integrantes.");
                        break;
                    } else {
                        System.out.println("Ingrese el nombre del deporte.");
                        deporte = lectura.next();
                        //grupos[i] = new Grupo (deporte);
                        for (b=0;b<integrantes;b++){
                            System.out.println("Ingrese el nombre del deportista " + (b+1));
                            System.out.println("Ingrese el apellido del deportista " + (b+1));
                        }

                    }
                }
            } else if (accion == 2) {
                
            } else if (accion == 3) {
                System.out.println("Ingrese el nombre de la delegacion.");
                
            } else if (accion == 4) {
            } else if (accion == 5) {
                repetir = false;
            }

        }
    }
}
