package Airline;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vuelo> vuelos = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        Implementacion gestorVuelos = new Implementacion(vuelos, reservas);
    
        Vuelo vuelo = new Vuelo("123", "Manizales", "Bogota", new Date(), "10kilos", 100);
        gestorVuelos.crearVuelo(vuelo);
        gestorVuelos.reservarVuelo(new Reserva(new Cliente("Pablo", "1234"), vuelo, 4));
        

        ArrayList<Vuelo> disp = gestorVuelos.obtenerVuelos();

        for (int i = 0; i < disp.size(); i++) {
            System.out.println(disp.get(i).getFlight_number());
        }

        gestorVuelos.cancelarVuelo("1234", "123");
    }
}
