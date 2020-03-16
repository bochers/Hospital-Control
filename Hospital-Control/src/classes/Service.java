/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author erick
 */
public class Service {

    private int id;
    private String type;
    private int price;
    private String clientName;
    private String description;

    public void Service() {
        this.id = 0;
        this.type = "undefined";
        this.price = 0;
        this.clientName = "undefined";
        this.description = "undefined";
    }

    public void set(Service s) {
        setId(s.getId());
        setType(s.getType());
        setPrice(s.getPrice());
        setClientName(s.getClientName());
        setDescription(s.getDescription());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setType(String type) {
        this.type = type != null ? type : "undefined";
    }

    public String getType() {
        return this.type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setClientName(String name) {
        this.clientName = name;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
