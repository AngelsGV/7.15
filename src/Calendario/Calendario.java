package Calendario;

public class Calendario {
    //Se crean los atributos necesarios para las clases
    int año;
    int mes;
    int dia;
    int añoIncrementar;

    //Se especifica que Calendario lleva esos atributos y se definen
    public Calendario(){
        this.dia=dia;
        this.mes=mes;
        this.año=año;

    }
    //gets y sets puestos todos para luego hacer comprobaciones con ellos

    public int getAñoIncrementar() {
        return añoIncrementar;
    }

    public void setAñoIncrementar(int añoIncrementar) {
        this.añoIncrementar = añoIncrementar;
    }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    //Las funciones que me pide el ejercicio
    public void incrementarDia(){
        //Los meses que tienen 31 días
        while (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            if(dia>0&&dia<=31){
                dia++;
            }
        }
        //El mes que tiene 29 dias
        while (mes==2){
            if(dia>0&&dia<=29){
                dia++;
            }
        }
        //Los meses que tienen 30  dias
        while (mes==4||mes==6||mes==9||mes==11){
            if(dia>0&&dia<=30){
                dia++;
            }
        }

    }
    public void incrementarMes(){
        while (mes>=1&&mes<=12){
            mes++;
        }

    }
    public void incrementarAño() { // No cojemos años bisiestos

        if (año != 0) {
            int añoNuevo = año + añoIncrementar;

            if (año < 0 && añoNuevo == 0) {
                añoNuevo = 1;
                año = añoNuevo;
            } else if (año < 0 && añoNuevo > 0) {
                añoNuevo += 1;
                año = añoNuevo;
            } else {
                // Manejar el caso si año >= 0
                año = añoNuevo;
            }
        } else {
            System.out.println("No existe el año 0.");
        }
    }



    public void mostrar(){
        System.out.println("La fecha introducida es: " + dia + "/" + mes +"/"+ año);
    }

    }

