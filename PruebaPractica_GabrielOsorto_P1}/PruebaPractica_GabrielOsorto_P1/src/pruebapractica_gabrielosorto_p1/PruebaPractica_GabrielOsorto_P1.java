package pruebapractica_gabrielosorto_p1;

import java.util.Scanner;

public class PruebaPractica_GabrielOsorto_P1 {

    static Scanner sc = new Scanner(System.in);
    static Scanner lt = new Scanner(System.in);

    public static void main(String[] args) {
        boolean seguir = true;
        int cont1 = 0;
        while (seguir == true) {
            System.out.println("=*=*=*=*=Bienvenida=*=*=*=*=");
            System.out.println("Menu");
            System.out.println("1. Repetir el nombre.");
            System.out.println("2. Submenu de Mensajes.");
            System.out.println("3. Salir.");
            System.out.println(" Que desea hacer?:");
            int opcion = sc.nextInt();
            switch (opcion) {//incio del switch menu principal
                case 1:
                    System.out.println("****REPETIR MI NOMBRE*****");
                    System.out.println("");
                    System.out.print("Ingrese su nombre (Primer nombre y primer apellido):");
                    String nombre = lt.nextLine();
                    System.out.print("Ingrese la cantidad que desea imprimir el mensaje:");
                    int repe = sc.nextInt();
                    System.out.println("");
                    for (int i = 0; i < repe; i++) {
                        System.out.println("¡Hola mi nombre es " + nombre + " y miren mi prueba!");
                    }
                    System.out.println("");
                    System.out.print("Desea volver al menu principal?(1.Si/2.No):");
                    int conti = sc.nextInt();
                    if (conti == 2) {
                        seguir = false;
                    } else {
                        cont1++;
                    }
                    System.out.println("");
                    break;
                case 2:
                    boolean segsub = true;
                    while (segsub) {//inicio while ejercicio 2
                        System.out.println("*****Sub menu del mensaje*****");
                        System.out.println("1. Bienvenida.");
                        System.out.println("2. Despedida.");
                        System.out.println("3. Salir del submenu.");
                        System.out.print("Que desea hacer?:");
                        int op2 = sc.nextInt();
                        switch (op2) {//switch sub menu
                            case 1:
                                System.out.print("Ingrese su nombre:");
                                String nombre2 = lt.nextLine();
                                System.out.println("Bienvenido al maravilloso mundo de " + nombre2 + ":D ");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Sliendo del menu.......");
                                segsub = false;
                                break;
                            default:
                                System.out.println("¡¡Opcion no valida!!");
                                System.out.println("");
                                break;
                        }//fin switch sub menu 
                    }//while interno ejercicio sub menu
                    System.out.print("Desea volver al menu principal?(1.Si/2.No):");
                    int conti2 = sc.nextInt();
                    if (conti2 == 2) {
                        seguir = false;
                    } else {
                        cont1++;
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Adios, esta es mi prueba");
                    seguir = false;
                    break;
                default:
                    break;
            }//fin switch principal
        }//fin while menu principal
        System.out.println("El menu principal se repitio " + cont1 + " veces.");
    }//fin main
}//fin de la clase

