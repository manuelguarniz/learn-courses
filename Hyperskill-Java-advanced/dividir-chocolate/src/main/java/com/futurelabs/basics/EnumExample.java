package com.futurelabs.basics;

import java.util.Arrays;

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Currency {
    USD,EUR,GBP,RUB,UAH,KZT,CAD,JPY,CNY;

    public static void getCurrency(String currency) {
        switch (currency) {
            case "USD" -> System.out.println("USD");
            case "EUR" -> System.out.println("EUR");
            case "GBP" -> System.out.println("GBP");
            case "RUB" -> System.out.println("RUB");
            default -> System.out.println("Unknown currency");
        }
    }
}
enum Role {
    ADMIN, USER;
}

enum Secret {
    STAR, CRASH, START, // ...
}

enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        long counter = Arrays.stream(secrets).map(String::valueOf).filter(e -> e.startsWith("STAR")).count();
        System.out.println(counter);

        System.out.println("============");
        for (Currency currency : Currency.values()) {
            System.out.println(currency.name());
        }

        System.out.println("== is USD? ==");
        try {
            if (Currency.valueOf("usd") == Currency.USD) {
                System.out.println("Es USD");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("No es USD");
        }

        System.out.println("============");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        System.out.println("============");

        Role role1 = Role.ADMIN;
        Role role2 = Role.ADMIN;
        Role role3 = Role.USER;

        System.out.println(role1 == Role.ADMIN);  // (1)
        System.out.println(role1.equals(role2)); // (2)
        System.out.println(role1 == role2);    // (3)
        System.out.println(role1 == role3);    // (4)

        System.out.println("============");

        System.out.println(Direction.NORTH.name());
        System.out.println(Direction.NORTH.getShortCode());
    }
}
