package Calendario;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        //Ponemos un escaner porque pediremos al usuario introducir valores
        Scanner sc = new Scanner(System.in);

        //Creamos objeto calendario
        Calendario calendario = new Calendario(1,1,1);

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

        //Incrementar
        calendario.incrementarDia();
        calendario.incrementarMes();
        System.out.println("Escribe cuantos años quieres incrementar: ");
        int aI = sc.nextInt();
        calendario.setAñoIncrementar(aI);

        calendario.incrementarAño();

        //Vemos si se ha modificado
        calendario.mostrar();

        //Bolean iguales
        // Creamos un nuevo objeto Calendario con la fecha específica.
        // También podríamos coger este dato de los incrementos anteriores o pedirlo por pantalla.
        //He querido hacerlo así para probar también esta forma de introducir los datos.
        Calendario otraFecha = new Calendario(14,2,2024);


        // Utilizamos el método iguales y mostramos el resultado
        boolean sonIguales = calendario.iguales(otraFecha);
        //Mostramos otra fecha
        otraFecha.mostrar();
        //Miramos si funciona el metodo iguales
        System.out.println("¿Son iguales? :" + sonIguales);
    }
}
