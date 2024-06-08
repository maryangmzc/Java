package Java.Abril_30;

public class JoyaTest {
    

    public static void main(String[] args) {
        /*Creacuin de la instancia */
        Joya promiseRing = new Joya();

        /*ASIGNACION DE VALOR MATERIAL */
        /*promiseRing objeto - setMaterial es que modifique y le pase el valor platino */
        promiseRing.setMaterial("Platino");
        /*Solo agarra un valor, esta es la segunda modificacion */
        promiseRing.setMaterial("Oro blanco");
        /*Getters  */
        System.out.println(promiseRing.getMaterial());
    
        promiseRing.setMarca("Harry Winston");
        promiseRing.setGramaje(24);
        promiseRing.setPiedra("Diamante");
        promiseRing.setOrigen("Sudafrica");
        promiseRing.setGenero('F');
        promiseRing.setPrecio(25000);
        promiseRing.setTipo("Anillo de Promesa");

        System.out.println(promiseRing.getMarca());

        if(promiseRing.getPrecio()>1000){
            System.out.println("Toco sacar un prestamo");
        }
    }
}
