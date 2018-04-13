package com.codeinterview;

import java.util.ArrayList;
import java.util.List;

public enum NoodleType {
    Wide("Wide"), Thin("Thin");

    public static List<NoodleType> types = new ArrayList<NoodleType>() {{
        add(Wide);
        add(Thin);
    }};

    private String noodleType;

    NoodleType(String type) {
        this.noodleType = type;
    }

    public String getName() {
        return this.noodleType;
    }
}
