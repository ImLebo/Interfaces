package Airline;

public class Reserva {
    
    private Cliente reserved_customer;
    private Vuelo reserved_flight; 
    private int reserved_seats;

    public Reserva(Cliente reserved_customer, Vuelo reserved_flight, int reserved_seats) {
        this.reserved_customer = reserved_customer;
        this.reserved_flight = reserved_flight;
        this.reserved_seats = reserved_seats;
    }

    public Cliente getReserved_customer() {
        return reserved_customer;
    }

    public void setReserved_customer(Cliente reserved_customer) {
        this.reserved_customer = reserved_customer;
    }

    public Vuelo getReserved_flight() {
        return reserved_flight;
    }

    public void setReserved_flight(Vuelo reserved_flight) {
        this.reserved_flight = reserved_flight;
    }

    public int getReserved_seats() {
        return reserved_seats;
    }

    public void setReserved_seats(int reserved_seats) {
        this.reserved_seats = reserved_seats;
    }

    

    
}
