package com.example.javadesignpattern.prototype;

import java.util.HashMap;

public class RamenManager {
    private HashMap ramenMachine = new HashMap();

    public void register(String name, Ramen proto) {
        ramenMachine.put(name, proto);
    }

    public Ramen create(String ramenname) {
        Ramen r = (Ramen) ramenMachine.get(ramenname);
        return r.createClone();
    }

}
