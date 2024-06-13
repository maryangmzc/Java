package Java.Mayo_02;

public class Vehiculo {

    private int pasajeros;
    private int velocidad;
    private int ruedas;
    private int peso;
    private int puertas;
    private String carroceria;
    private String categoria;
    private boolean automatico;
    private double cilindraje;

    /*FUNCION PARA ACELERAR UN CARRO, recibe la velocidad objetivo */
    public void acelerar(int velocidad) {
        System.out.print("Acelerando a" + velocidad);
        } else {
            System.out.println("se quemó el motor");
        }
    }

    /*CONSTRUCTOR */
    

    public Vehiculo(){}

    public Vehiculo(int pasajeros, int velocidad, int ruedas, int peso, int puertas, String carroceria,
    String categoria, boolean automatico, double cilindraje) {

        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
        this.ruedas = ruedas;
        this.peso = peso;
        this.puertas = puertas;
        this.carroceria = carroceria;
        this.categoria = categoria;
        this.automatico = automatico;
        this.cilindraje = cilindraje;
}

    /*GETTERS Y SETTERS */



    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad<=340){
            this.velocidad = velocidad;
        } else {
            this.velocidad=340;
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    
    
}
