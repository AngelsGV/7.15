package Calendario;

public class Calendario {
    int año;
    int mes;
    int dia;
    public Calendario(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;

    }

    public void incrementarDia(){
        while (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            if(dia>0&&dia<=31){
                dia++;
            }
        }
        while (mes==2){
            if(dia>0&&dia<=29){
                dia++;
            }
        }
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
    public void incrementarAño(){


    }
    public void mostrar(){
        System.out.println("Estamos a: " + dia + "/" + mes +"/"+
                año);
    }

    }

