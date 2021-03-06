package net.stellar.mining.utils;

import java.util.HashMap;
import java.util.Map;

public class StellarPlaceholder {

    private Map<String, String> placeholders;

    public StellarPlaceholder() {
        placeholders = new HashMap<>();
    }

    public StellarPlaceholder addPlaceholder(String key, String value) {
        placeholders.put(key, value);
        return this;
    }

    public StellarPlaceholder removePlaceholder(String key) {
        if(placeholders.containsKey(key)) placeholders.remove(key);
        return this;
    }

    public String parse(String args) {
        for(String key : placeholders.keySet()) {
            String value = placeholders.get(key);
            args = args.replace(key, value);
        }
        return args;
    }

}
