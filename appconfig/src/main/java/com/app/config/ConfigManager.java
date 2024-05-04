package com.app.config;

import java.util.HashMap;

public class ConfigManager {
    private static ConfigManager instance = null;
    private HashMap<String, String> config;

    private ConfigManager() {
        config = new HashMap<>();
        loadConfig();
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private void loadConfig() {
        config.put("lenguaje", "es");
        config.put("tema", "oscuro");
        config.put("fuente", "Arial");
        config.put("zonaHoraria", "UTC");

        System.out.println("Configuración cargada");
    }

    public String getConfig(String key) {
        return config.get(key);
    }
}
