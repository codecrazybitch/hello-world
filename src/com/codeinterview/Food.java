package com.codeinterview;

public class Food {
    protected String name;
    protected double price;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) throws Exception {
        if (price <= 0.0) {
            throw new Exception("The price must be bigger than 0.");
        } else {
            this.price = price;
        }
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, double price) throws Exception {
        this.name = name;

        this.setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("Food name: %s and the price is %f", this.name, this.price);
    }
}
