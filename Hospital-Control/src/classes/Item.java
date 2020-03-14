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
public class Item {

    private int id;
    private String name;
    private String type;
    private int price;
    private int amount;
    private String expiration;

    public void Item() {
        this.id = 0;
        this.name = "";
        this.type = "undefined";
        this.price = 0;
        this.amount = 0;
        this.expiration = "";
    }

    public void set(Item i) {
        setId(i.getId());
        setName(i.getName());
        setType(i.getType());
        setPrice(i.getPrice());
        setAmount(i.getAmount());
        setExpiration(i.getExpiration());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getExpiration() {
        return this.expiration;
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

}
