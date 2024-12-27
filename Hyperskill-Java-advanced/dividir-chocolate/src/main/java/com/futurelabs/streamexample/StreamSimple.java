package com.futurelabs.streamexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Tablon {
    public String telefono;
    public String nombre;

    public Tablon(String telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tablon{" +
                "telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

class TablonRepository {
    List<Tablon> tablons = Arrays.asList(
            new Tablon("975757409", "Manuel"),
            new Tablon("986543339", "Eli")
    );
    public Tablon findByTelefono(String telefono) {
        return tablons.stream().filter(e -> telefono.equals(e.telefono)).findFirst().orElse(null);
    }
}


public class StreamSimple {
    private final static TablonRepository tablonRepository = new TablonRepository();
    public static void main(String[] args) {
        List<String> telefonos = Arrays.asList("975757409");
        telefonos.stream().map(tablonRepository::findByTelefono).forEach(System.out::println);
    }
}
