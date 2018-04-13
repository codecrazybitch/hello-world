package com.codeinterview;

public class Noodle extends Food {
    private NoodleType type;
    private int length;

    public NoodleType getType() {
        return this.type;
    }

    public void setType(NoodleType type) {
        this.type = type;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) throws Exception {
        if (length <= 0) {
            throw new Exception("There is no noodle which length value is negative.");
        } else {
            this.length = length;
        }
    }

    public Noodle() {
        super("Noodle");
    }

    public Noodle(double price) throws Exception {
        super("Noodle", price);
    }

    public Noodle(double price, NoodleType type) throws Exception {
        super("Noodle", price);

        setType(type);
    }

    public Noodle(double price, int length) throws Exception {
        super("Noodle", price);

        setLength(length);
    }

    public Noodle(double price, NoodleType type, int length) throws Exception {
        super("Noodle", price);

        setType(type);
        setLength(length);
    }

    @Override
    public String toString() {
        return String.format("%s, Length: %d, Type: %s",
                this.getName(),
                this.getLength(),
                this.getType());
    }
}
