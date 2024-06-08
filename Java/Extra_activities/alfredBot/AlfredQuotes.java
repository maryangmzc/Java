package Java.Extra_activities.alfredBot;
@SuppressWarnings("preview")

import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String nombre) {
        return String.format("Hola, %s. Encantado de verte", nombre);
    }
    
    public String dateAnnouncement() {
        Date fechaActual = new Date();
        return String.format("Actualmente es %tA, %<td de %<tB a las %tT %<tz de %<tY", fechaActual);
    }
    
    public String respondBeforeAlexis(String conversacion) {
        if (conversacion.contains("Alexis")) {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso.";
        } else if (conversacion.contains("Alfred")) {
            return "A su servicio. Como desee, naturalmente.";
        } else {
            return "Bien. Y con eso, me retiraré.";
        }
    }
}
