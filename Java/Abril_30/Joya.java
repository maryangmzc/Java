package Java.Abril_30;

public class Joya {

    /*PRIVATE ES PARA QUE NO SE MODIFIQUE POR ERROR */
    /*EN ESTOS CASOS HAY QUE CREAR GETTERS Y SETTERS */
    private String material;
    private double gramaje;
    private String piedra;
    private String tipo;
    private String marca;
    private String origen;
    private char genero;
    private double precio;

    /*GETTERS Y SETTERS */

    /*public para que se pueda hacer, tipo de variable String, nombre
     * retorna material
     * 
     * setter public void porque no retorna nombre 
     * creacion de la instancia
     */
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getGramaje() {
        return gramaje;
    }
    public void setGramaje(double gramaje) {
        this.gramaje = gramaje;
    }
    public String getPiedra() {
        return piedra;
    }
    public void setPiedra(String piedra) {
        this.piedra = piedra;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
