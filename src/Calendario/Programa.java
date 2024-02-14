package Calendario;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        //Ponemos un escaner porque pediremos al usuario introducir valores
        Scanner sc = new Scanner(System.in);

        //Creamos objeto calendario
        Calendario calendario = new Calendario();

        //Se pide por progama valores y con el set se introducen en el objeto calendario
        System.out.println("Escribe el dia: ");
        int d = sc.nextInt();
         calendario.setDia(d);

        System.out.println("Escriba el mes: ");
        int m = sc.nextInt();
        calendario.setMes(m);

        System.out.println("Escribe el año: ");
        int a = sc.nextInt();
        calendario.setAño(a);

        //Mostramos la fecha para ver que está correcta
        calendario.mostrar();

        //Incrementar año
        System.out.println("Escribe cuantos años quieres incrementar: ");
        int aI = sc.nextInt();
        calendario.setAñoIncrementar(aI);

        //Vemos si se ha modificado
        calendario.mostrar();
    }
}
