package com.codeinterview;

public class Noodle extends Food {
    private NoodleType type;

    public NoodleType getType()
    {
        return this.type;
    }

    public Noodle(double price) throws Exception {
        super("Noodle", price);

        this.type = NoodleType.Thin;
    }

    public Noodle(double price, NoodleType type) throws Exception {
        super("Noodle", price);

        this.type = type;
    }
}
