package org.example;

import clases.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=100;

        Scanner lea = new Scanner(System.in);
        Estudiante[] estudiantes= new Estudiante[5];

        System.out.println("***MENU***");
        System.out.println("1. Agregar un estudiante");
        System.out.println("2. Ver estudiantes");
        System.out.println("3. Salir");

        while (opcion!=3){



            System.out.println("Digite una opcion: ");
            opcion=lea.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Selecciono opcion 1");
                    for (int i=0; i<estudiantes.length; i++){
                        Estudiante prueba = new Estudiante();
                        System.out.println("Digite el nombre del estudiante: ");
                        prueba.setNombre(lea.next());
                        estudiantes[i]=prueba;

                    }
                    break;
                case 2:
                    System.out.println("Selecciono opcion 2");
                    for (int i=0; i<estudiantes.length; i++){

                        System.out.println(estudiantes[i].getNombre());

                    }

                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Seleccione opcion valida");
            }

        }

    }
}