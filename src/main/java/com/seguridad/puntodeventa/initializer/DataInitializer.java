package com.seguridad.puntodeventa.initializer;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
public class DataInitializer {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void initData() {
        try {
            // Lee el archivo data.sql desde resources
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data.sql");
            if (inputStream != null) {
                String sql = new BufferedReader(new InputStreamReader(inputStream))
                        .lines()
                        .collect(Collectors.joining("\n"));

                // Divide el contenido del archivo en sentencias individuales
                String[] sqlStatements = sql.split(";");

                // Ejecuta cada sentencia
                for (String statement : sqlStatements) {
                    if (!statement.trim().isEmpty()) {
                        jdbcTemplate.execute(statement);
                    }
                }
                System.out.println("Datos iniciales cargados correctamente desde data.sql.");
            } else {
                System.err.println("No se encontró el archivo data.sql en el classpath.");
            }
        } catch (Exception e) {
            System.err.println("Error al cargar los datos iniciales: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
