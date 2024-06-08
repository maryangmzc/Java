package Java.Abril_30;

public class MedioTransporteTest {

    /*PERMITE QUE CORRA */
    public static void main(String[] args) {
        
        /*SE AGREGA LA INFORMACION */

        String nombre = new String();

        /*crea la instancia pero no es necesario siempre en variables */

        MedioTransporte chino = new MedioTransporte();
        chino.capacidad=5000;
        /*en toneladas */
        chino.medio="Terrestre";
        chino.velocidadMaxima=90;
        chino.carga=false;
        chino.masivo=true;
        chino.unidadVelocidad="km/h";

        MedioTransporte metropolitano = new MedioTransporte();
        metropolitano.capacidad=10500;
        metropolitano.medio="Terrestre";
        metropolitano.velocidadMaxima=80;
        metropolitano.carga=false;
        metropolitano.masivo=true;
        metropolitano.unidadVelocidad="km/h";

        MedioTransporte barcoGeneral = new MedioTransporte();
        barcoGeneral.capacidad=100000;
        barcoGeneral.medio="Acuático";
        barcoGeneral.velocidadMaxima=8;
        barcoGeneral.carga=true;
        barcoGeneral.masivo=false;
        barcoGeneral.unidadVelocidad="kn/h";

        System.out.println();
        System.out.println(nombre);
        System.out.println(chino);
        System.out.println(metropolitano);
        System.out.println(barcoGeneral);
    }
}
