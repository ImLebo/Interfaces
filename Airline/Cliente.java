package Airline;

public class Cliente {
    
    private String customer_name = "";
    private String customer_id = "";

    public Cliente(String customer_name, String customer_id) {
        this.customer_name = customer_name;
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    
    
    
}
