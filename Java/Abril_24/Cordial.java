package Java.Abril_24;

public class Cordial {
    
    public static void darSaludosCordiales(String titulo, String nombre) {
        String saludo = "Bienvenido";
        saludo = saludo.concat("    ").concat(titulo).concat("    ").concat(nombre);
        System.out.println(saludo);
    }
}
