package com.futurelabs.basics;

import java.util.Arrays;

enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    public String getQuantityName() {
        return quantityName;
    }

    public static SI getByQuantityName(String quantityName) {
        return Arrays.stream(values()).filter(e -> e.quantityName.equals(quantityName)).findFirst().orElse(null);
    }

}

public class EnumAdvanced {
    public static void main(String[] args) {
        SI s = SI.getByQuantityName("mass");
        System.out.println(s.getQuantityName());
    }
}
