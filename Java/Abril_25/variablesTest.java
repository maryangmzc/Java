package Java.Abril_25;

import java.util.ArrayList;

public class variablesTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double estatura=1.87;

        /*SE INTENTA CONVERTIR LA VARIABLE A OTRO TIPO DE VARIABLE */
            int estaturaCerrada=(int) estatura;
            /*no va a tomar por si solo estatura=estaturaCerrada sin el valor porque es de decimal a entero */
            System.out.println(estatura);
            System.out.println(estaturaCerrada);

            /*En este caso float entera y la vuelve decimal */
            float estaturaFlotante = estaturaCerrada;
            System.out.println(estaturaFlotante);

            /*Explicito = cambiarlo a otro */
            /*implicito es cuando la variable tolera el otro tipo de datos */



            /* Usar los datos correctos no primitivos para optimizar */
            /*esta parte tarda mucho */
                /*long start = System.currentTimeMillis();
                Integer sum = 0;
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    sum += i;
                }
                System.out.println("Suma: " + sum);
                long end = System.currentTimeMillis();
                double total = (double) (end - start) / 1000;
                System.out.println("Tiempo de ejecución: " + total + " segundos");
                */

                long start2 = System.currentTimeMillis();
                int sum2 = 0; // Corregido: usar sum2 en lugar de sum
                for (byte i = 0; i < Byte.MAX_VALUE; i++) { // Corregido: usar Byte.MAX_VALUE como límite
                    sum2 += i;
                }
                System.out.println("Suma: " + sum2);
                long end2 = System.currentTimeMillis();
                double total2 = (double) (end2 - start2) / 1000;
                System.out.println("Tiempo de ejecución: " + total2 + " segundos");
            

                /*CREAR UNA LISTA */
                int[] bingo;
                bingo = new int[5];
                bingo[0]=12;
                bingo[1]=16;
                bingo[2]=17;
                bingo[3]=18;
                bingo[4]=9;

                System.out.println(bingo[3]);

                int[] lotery = {3, 4, 5, 6, 70};
                lotery[4]=14;


                // Imprimir todos los valores del arreglo
                for (int i = 0; i < lotery.length; i++) {
                    System.out.println("Valor en la posición " + i + ": " + lotery[i]);
                }

                /*ARRAY LIST SE MODIFICA Y SE PUEDE ANADIR INCLUSO DISTINTOS TIPOS 
                 * DE DATOS
                 */

                /*array list tipo de valor > nombres = nueva lista */
                /*si se pone como dato object deja poner lo que se quiera luego */

                ArrayList<Integer> chance = new ArrayList<Integer>();
                chance.add(42);
                chance.add(38);
                chance.add(22);
                System.out.println(chance);
                System.out.println((Integer.MAX_VALUE));

                /*BUCLE WHILE */
                
                /*int num= (int) Math.random()*10;*/
                double num = Math.random() * 10;

                while (num < 7){
                    num = Math.random() * 10;
                    System.out.println(num);
                }

                System.out.println("Otro ejemplo");

                /* int num3 = (int) (Math.random() * 10);

                    while (num3 > 7) {
                    num3 = (int) (Math.random() * 10);
                    System.out.println(num3);
                }
                */

                for( int i=0;i<20;i++){
                    System.out.println(i);
                }

                System.out.println("-------");
                for(int i=0; i<lotery.length;i++){
                    System.out.println(lotery[i]);
                }

                for(Integer numero : chance){
                    System.out.println(numero);
                }




    }

}
