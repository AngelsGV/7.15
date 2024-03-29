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
    //gets y sets puestos todos para luego hacer comprobaciones con ellos (o no)

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
        if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&& dia < 31){
            dia++;
        } else if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&& dia == 31) {
            mes++;
            dia=1;
        } else if (mes == 2 && dia < 29) {//El mes que tiene 29 dias
            dia++;
        } else if (mes==2 && dia ==29) {
            dia = 1;
            mes++;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 30) {   //Los meses que tienen 30  dias
            dia++;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
            dia =1;
            mes++;
        }
    }

    public void incrementarMes() {
        // Los meses van del 1 al 12
        if (mes >= 1 && mes <= 11) {
            mes++;
        } else if (mes==12) {
            año ++;
            mes = 1;
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
    public boolean iguales(Calendario otraFecha){

        // Comparar año, mes y día --> he buscado como hacerlo (hasta ahora no había escrito un return así)
        return this.año == otraFecha.año &&
                this.mes == otraFecha.mes &&
                this.dia == otraFecha.dia;
    }

}

//-----------------------------------------
//Problemas a lo largo del código
//1.Solucionnar año 0 --> OK.
//2. Boolean iguales --> ok
//3. Delimitar intervalo de días -->oki
//4. Delimitar intervalo a 12 meses --> oki

//Pruebas:
//1.Limites de dias,meses y años -->OK
//2. True False -->OK

//Cosas a mejorar:
//Si se empieza con año 0 no incrementa o da error --> se puede poner cualquier año que no sea 0 (positivo o negativo)
//El bucle para introducir datos solo te da una oportunidad de equivocarte -->solucionado!
//Una vez has introducido el día, delimita el mes que te pide (si se usan valores 29,30,31). Una forma de soluciona esto
//es pidiendo primero año, mes y después dia (que dependerá la entrada del mes) -->oki