package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class World {

    private final String name;
    private final Set<Continent> continents = new HashSet<>();

    public World(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    public boolean addContinent(Continent continent) {

        return continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }


}
