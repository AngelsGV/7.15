package Calendario;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        //Ponemos un escaner porque pediremos al usuario introducir valores
        Scanner sc = new Scanner(System.in);

        //Creamos objeto calendario
        Calendario calendario = new Calendario();

        //Se pide por progama valores y con el set se introducen en el objeto calendario


        System.out.println("Escribe el año (el 0 no es válido): ");
        int a = sc.nextInt();
        if (a!= 0){
        calendario.setAño(a);
        }else{
            System.out.println("Año incorrecto. Vuelva a introducirlo: ");
            a = sc.nextInt();
        }

        System.out.println("Escriba el mes: ");
        int m = sc.nextInt();
        if (m > 0 && m <= 12) {
            calendario.setMes(m);
        } else{
            System.out.println("El mes no es válido. Vuelve a introucirlo: ");
            m=sc.nextInt();

        }
        System.out.println("Escribe el dia: ");
        int d = sc.nextInt();
        //Controlar entrada de datos.
            if (m == 2 && d <= 29) {
                calendario.setDia(d);
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d <= 30) {
                calendario.setDia(d);
            } else if ((m==1||m==3||m==5||m==7||m==8||m==12) && d <= 31) {
                calendario.setDia(d);
            } else {
                System.out.println("El mes no es válido para el día que has introducido. Vuelva a introducir el mes: ");
                d = sc.nextInt();
            }


        //Mostramos la fecha para ver que está correcta
        calendario.mostrar();
       // Como tenia antes la función apartada en programa --> validarFecha(d,m,a);
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
        Calendario otraFecha = new Calendario();
        otraFecha.setDia(14);
        otraFecha.setMes(2);
        otraFecha.setAño(2024);


        // Utilizamos el método iguales y mostramos el resultado
        boolean sonIguales = calendario.iguales(otraFecha);
        //Mostramos otra fecha
        otraFecha.mostrar();
        //Miramos si funciona el metodo iguales
        System.out.println("¿Son iguales? :" + sonIguales);
    }

    //Programa para validar entrada de datos que no se por donde ponerlo ya...
    //Al final lo he introducido entre el código, no sé como meter esta función para validar los datos.
    //La dejo comentada para que cuando corrijas me dieras alguna manera de usarla en este programa(si la hay)

    //public static boolean validarFecha(int dia, int mes, int año) {
      //  boolean res = true;
       // if (dia < 1 || dia > 31) {
        //    res = false;
        //} else if (mes < 1 || mes > 12) {
          //  res = false;
       // } else if (mes == 2 && dia > 29) {//El mes que tiene 29 dias
         //   res = false;
        //} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {   //Los meses que tienen 30  dias
          //  res = false;
       // }
        //return res;
   // }
}