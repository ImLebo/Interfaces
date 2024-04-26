package Airline;

import java.util.ArrayList;

public class Implementacion implements GestorVuelos {
    
    public ArrayList<Vuelo> avaliable_flight = new ArrayList<>();
    public ArrayList<Reserva> reservation_list = new ArrayList<>(); 

    


    public Implementacion(ArrayList<Vuelo> avaliable_flight, ArrayList<Reserva> reservation_list) {
        this.avaliable_flight = avaliable_flight;
        this.reservation_list = reservation_list;
    }

    public void crearVuelo(Vuelo vuelo){
        avaliable_flight.add(vuelo);
    }

    public void verificarVuelos(){
        for (int i = 0; i < avaliable_flight.size(); i++) {
            Vuelo vuelo = avaliable_flight.get(i);
            if (vuelo.getFlight_seats_avaliable()<=0) {
                avaliable_flight.remove(vuelo);
                i--;
            }
        }
    }


    public void reservarVuelo(Reserva reserva){
        reservation_list.add(reserva);
    }

    public void cancelarVuelo(String customer_id, String flight_id){

        for (int i = 0; i < reservation_list.size(); i++) {
            Reserva reservation = reservation_list.get(i);
            if (reservation.getReserved_customer().getCustomer_id().equalsIgnoreCase(customer_id) &&
            reservation.getReserved_flight().getFlight_number().equalsIgnoreCase(flight_id)) {
                reservation_list.remove(i);
                i--;
            }

        }
    }

    public ArrayList<Vuelo> obtenerVuelos(){
        return avaliable_flight;
    }

}
