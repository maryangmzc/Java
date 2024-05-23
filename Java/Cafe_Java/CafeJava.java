package Java.Cafe_Java;

public class CafeJava {

        public static void main(String[] args) {
            // VARIABLES DE LA APP
            // Líneas de texto que aparecerán en la app 
            String saludoGeneral = "Bienvenido al Café Java, ";
            String mensajePendiente = ", tu pedido estará listo en breve";
            String mensajeListo = ", tu pedido está listo";
            String mensajeMostrarTotal = "Tu total es $";
            
            // VARIABLES DEL MENU
            double precioMocha = 3.5;
            double precioCafeConLeche = 2.0;
            double precioCafeConFiltro = 1.5;
            double precioCafeCapuchino = 4.0;
        
            // VARIABLES DE CLIENTES
            String clienteNoah="Noah";
            String clienteSam= "Sam";
            String clienteJimmy= "Jimmy";
            String clienteCindhuri = "Cindhuri";

        
            // VARIABLES FINALIZACION DE PEDIDOS
            boolean estaListoOrden1 = false;
            boolean estaListoOrden2 = true;
            boolean estaListoOrden3 = true;
            boolean estaListoOrden4 = true;
        
            // SIMULACIÓN DE INTERACCIÓN DE APP(ORDENES)

            /*SALUDO DE CINDHURI*/
            System.out.println(saludoGeneral + clienteCindhuri);

            /*PEDIDO DE NOAH */
            System.out.println(saludoGeneral + clienteNoah);
            if (estaListoOrden1){
                System.out.println(clienteNoah + mensajeListo);
                System.out.println(mensajeMostrarTotal + precioCafeCapuchino);
            } else {
            System.out.println(clienteNoah + mensajePendiente);
            }

            /*PEDIDO DE SAM */
            System.out.println(saludoGeneral + clienteSam);
            if (estaListoOrden2){
                System.out.println(clienteSam + mensajeListo);
                System.out.println(mensajeMostrarTotal + (precioCafeConLeche + precioCafeConLeche));
            } else {
            System.out.println(clienteSam + mensajePendiente);
            }

            /*PEDIDO DE JIMMY */
            System.out.println(saludoGeneral + clienteJimmy);
            if (estaListoOrden3){
                System.out.println(clienteJimmy + mensajeListo);
                System.out.println(mensajeMostrarTotal + (precioCafeConLeche - precioCafeConFiltro));
            } else {
            System.out.println(clienteJimmy + mensajePendiente);
            }
            

        }
    
}
