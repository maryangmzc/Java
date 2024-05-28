package Java.Abril_24;

public class Variables {
    
    public static void saludar(String nombre, Double hora){
        String saludo = "";
            if(hora >8 && hora <12){
                saludo=saludo.concat("Buenos dias ");
            }else if(hora < 19){
                saludo=saludo.concat("Buenas tardes ");
            }else{
                saludo=saludo.concat("Buenas noches ");
            }
            saludo = saludo.concat(nombre);
            System.out.println(saludo);
        }
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

        /*AGREGAR ALGO AL FINAL */

        String ninja = String.format("Hola %s, me debes $%.2f !", "Jack", 25.0);
System.out.println(ninja);

        /*HAY UNA DIFERENCIA ENTRE LOS OBJETOS */
        System.out.println("Maryan");
        System.out.println(new String("Maryan"));

        /*Este guarda la palabra */
        String a = "Maryan";
        /*Este guarda el objeto nuevo que se ha creado en el string, otro objeto otra variable */
        String b = new String("Maryan");

        /*Imprimir inicio staaticc porque esta fuera de main */
        saludar("Wendy",20.5);


        }


    }
