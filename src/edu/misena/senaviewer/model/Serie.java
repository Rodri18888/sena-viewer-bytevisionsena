package edu.misena.senaviewer.model;

public class Serie extends Film {

    private int timeViewed;      // Tiempo total visto en minutos
    private int sessionQuantity; // Número total de temporadas

    public Serie(String title, String genre, int duration) {
        super(title, genre, null, duration); 
        this.timeViewed = 0;
        this.sessionQuantity = 0;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
