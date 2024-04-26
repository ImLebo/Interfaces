package Airline;

import java.util.ArrayList;

public interface GestorVuelos {

    public void reservarVuelo(Reserva reserva);

    public void cancelarVuelo(String customer_id, String flight_id);

    public ArrayList<Vuelo> obtenerVuelos();
    
}