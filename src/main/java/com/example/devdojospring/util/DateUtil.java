package com.example.devdojospring.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
//Classe que será scaneada pelo component scan. Passando para o spring que essa classe pode ser utilizada para injeção de dependencias
public class DateUtil {
    public String formatLocalDateTimeDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
