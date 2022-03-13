package utilidades;

import modelos.Personaje;

import java.util.List;

import com.opencsv.CSVReader;
import modelos.Region;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilidadesFichero {

    public UtilidadesFichero() {
    }

    public static final char SEPARATOR=',';
    public static final char QUOTE='"';

    public static List<Personaje>  leerPersonajes() throws IOException {

        List<Personaje> campeon = new ArrayList<>();
        CSVReader reader = null;

        try {
            reader = new CSVReader(new FileReader("C:\\Users\\hakue\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos"),SEPARATOR,QUOTE);
            String[] nextLine= null ;
            int count = 0;

            while ((nextLine = reader.readNext()) != null) {

                if(count >0) {
                    String[] valores = nextLine;
                    Personaje x = new Personaje();
                    x.setId(Integer.parseInt(valores[0]));
                    x.setNombre(valores[1]);
                    x.setFechaCreacion(LocalDate.parse(valores[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    x.setAtaqueBase(Double.valueOf(valores[3]));
                    x.setDefensaBase(Double.valueOf(valores[4]));
                    x.setVidaBase(Double.valueOf(valores[5]));
                    x.setManaBase(Double.valueOf(valores[6]));
                    x.setRegion2(Region.valueOf(valores[7]));
                    campeon.add(x);
                }
                count++;
            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();

        return campeon;
    }


}

