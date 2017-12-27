package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String name;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String name) {
        this.name = name;
    }

    public boolean addCountry(Country country) {

        return countries.add(country);
    }

    public boolean removeCountry(Country country) {

        return countries.remove(country);
    }

    public String getName() {
        return name;
    }

    public Set<Country> getCountries() {
        return countries;
    }
}


