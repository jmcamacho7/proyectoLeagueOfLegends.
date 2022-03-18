package utilidades;

import modelos.*;

import java.util.*;

import com.opencsv.CSVReader;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.lang.Integer.parseInt;


public class UtilidadesFichero {

    public UtilidadesFichero() {
    }

    public static final char SEPARATOR=',';
    public static final char QUOTE='"';

    public static List<Personaje>  leerPersonajes() throws IOException {


        List<Personaje> campeon = new ArrayList<>();
        CSVReader reader = null;

        try {
            reader = new CSVReader(new FileReader("C:\\Users\\hakue\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\personajes.csv"),SEPARATOR,QUOTE);
            String[] nextLine= null ;
            int count = 0;

            while ((nextLine = reader.readNext()) != null) {

                if(count >0) {
                    String[] valores = nextLine;
                    Personaje x = new Personaje();
                    x.setId(parseInt(valores[0]));
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

    public static List<Personaje> leerYAprenderHabilidades() throws IOException {
        List<Personaje> campeon = leerPersonajes() ;
        List<Habilidad>  skill = new ArrayList<>();
        Map<Personaje, List<Habilidad>> mapa = new HashMap<>();
        CSVReader reader = null;

        try {
            reader = new CSVReader(new FileReader("C:\\Users\\hakue\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\habilidades.csv"),SEPARATOR,QUOTE);
            String[] nextLine= null ;
            int count = 0;

            for (Personaje x: campeon){
                while ((nextLine = reader.readNext()) != null) {

                    if(count >0) {
                        String[] valores = nextLine;
                        Habilidad y = new Habilidad();
                        y.setId(parseInt(valores[0]));
                        int idpersonaje = parseInt(valores[1]);
                        y.setNombre(valores[2]);
                        y.setDanioBase(Double.valueOf(valores[3]));
                        y.setCosteMana(Double.valueOf(valores[4]));
                        y.setTipohabilidad2(TipoHabilidad.valueOf(valores[5]));
                        if (idpersonaje == x.getId()){
                            skill.add(y);
                        }
                    }
                    count++;
                }
                x.setHabilidades(skill);
            }


        } catch (Exception e) {
            throw e;
        }

        reader.close();
        return campeon;
    }


    public static List<Item> leerItems() throws IOException{

        List<Item> objeto = new ArrayList<>();
        CSVReader reader = null;

        try {
            reader = new CSVReader(new FileReader("C:\\Users\\hakue\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\items.csv"),SEPARATOR,QUOTE);
            String[] nextLine= null ;
            int count = 0;

            while ((nextLine = reader.readNext()) != null) {

                if(count >0) {
                    String[] valores = nextLine;
                    Item x = new Item();
                    x.setId(parseInt(valores[0]));
                    x.setNombre(valores[1]);
                    x.setAumentoDanio(Double.valueOf(valores[2]));
                    x.setAumentoDefensa(Double.valueOf(valores[3]));
                    x.setAumentoSalud(Double.valueOf(valores[4]));
                    x.setAumentoMana(Double.valueOf(valores[5]));
                    objeto.add(x);
                }
                count++;
            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();

        return objeto;
    }

}

