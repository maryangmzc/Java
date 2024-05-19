package Java.Abril_24;

public class Variables {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        /*VARIABLES PRIMITIVAS */
        int edad = 24; /*Int = numerico entero */
        double estatura = 1.67; /*double = numerico decimal */
        char genero = 'M'; /* char = un caracter sencillo */
        boolean casado = true; /* valor logico = true/false */
        long nit = (long) 18237734.0; /* long = numero largo */

        /*VARIABLES NO PRIMITIVAS */
        Integer edad2 = 24; /*Int = numerico entero */
        Double estatura2 = 1.67; /*double = numerico decimal */
        String genero2 = "M"; /* string = cadena de caracteres */
        Boolean casado2 = true; /* valor logico = true/false */
        Long nit2 = (long) 383284.0; /* long = numero largo */

        /*El objetivo es reducir cualquier proceso a una serie de instrucciones */

        /*Comprar huevos */

        Integer numeroHuevos = -4;
        if (numeroHuevos < 4 && numeroHuevos >= 0) {
            System.out.println("No hay suficientes huevos");
        } else if (numeroHuevos >= 8) {
            System.out.println("Hay que cocinarlos pronto");
        } else if (numeroHuevos < 0) {
            System.out.println("Estas debiendo huevos");
        } else {
            System.out.println("Hay suficientes huevos");
        }

        /* SWICTH */

        String saludo = "Hola";

        switch (edad2) {
            case 10:
                System.out.println("Niño");
                break;
            case 17:
            System.out.println("Joven");
            break;

            case 28:
            System.out.println("Señor");

            default:

        }

        System.out.println("HOLA");


        System.out.println(genero =='M'?"Señor":"Senora");

        String greetings = "Hi There";
        System.out.println(greetings.length());
        greetings = greetings.concat("Maryan");
        System.out.println(greetings);
    }
}
