package utilidades;

import modelos.Personaje;
import modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UtilidadesPersonaje {

    public UtilidadesPersonaje() {
    }

    public static Personaje levelUp(Personaje personaje){
        if (personaje.getNivel()<18){
            personaje.setNivel(personaje.getNivel()+1);
            personaje.setAtaque(personaje.getAtaque() + personaje.getEscalabilidad().getIncrementoDanioNivel() * personaje.getNivel());
            personaje.setDefensa(personaje.getDefensa() + personaje.getEscalabilidad().getIncrementoDefensaNivel() * personaje.getNivel());
            personaje.setMana(personaje.getMana() + personaje.getEscalabilidad().getIncrementoManaNivel() * personaje.getNivel());
            personaje.setVida(personaje.getVida() + personaje.getEscalabilidad().getIncrementoSaludNivel() * personaje.getNivel());
        }

        return personaje;
    }

    public static Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> lista = new HashMap<>();

        List<Personaje> Demaciano = new ArrayList<>();
        List<Personaje> Noxiano = new ArrayList<>();
        List<Personaje> Jonio = new ArrayList<>();
        List<Personaje> Shurimanos = new ArrayList<>();
        List<Personaje> Targoniano = new ArrayList<>();
        List<Personaje> Freijordiano = new ArrayList<>();
        List<Personaje> Piltillo = new ArrayList<>();
        List<Personaje> Zaunita = new ArrayList<>();
        List<Personaje> Bandle = new ArrayList<>();
        List<Personaje> AguasEstancadas = new ArrayList<>();
        List<Personaje> Desconocido = new ArrayList<>();

        for (Personaje x : personajes){
            if (x.getRegion2() == Region.DEMACIA){
                Demaciano.add(x);
            }
            if (x.getRegion2() == Region.NOXUS){
                Noxiano.add(x);
            }
            if (x.getRegion2() == Region.JONIA){
                Jonio.add(x);
            }
            if (x.getRegion2() == Region.SHURIMA){
                Shurimanos.add(x);
            }
            if (x.getRegion2() == Region.TARGON){
                Targoniano.add(x);
            }
            if (x.getRegion2() == Region.FREIJORD){
                Freijordiano.add(x);
            }
            if (x.getRegion2() == Region.PILTOVER){
                Piltillo.add(x);
            }
            if (x.getRegion2() == Region.ZAUN){
                Zaunita.add(x);
            }
            if (x.getRegion2() == Region.BANDLE){
                Bandle.add(x);
            }
            if (x.getRegion2() == Region.AGUAS_ESTANCADAS){
                AguasEstancadas.add(x);
            }
            if (x.getRegion2() == Region.DESCONOCIDA){
                Desconocido.add(x);
            }
        }

        if (Demaciano.isEmpty() == false){
            lista.put(Region.DEMACIA, Demaciano);
        }

        if (Noxiano.isEmpty() == false){
            lista.put(Region.NOXUS, Noxiano);
        }

        if (Shurimanos.isEmpty() == false){
            lista.put(Region.SHURIMA, Shurimanos);
        }

        if (Targoniano.isEmpty() == false){
            lista.put(Region.TARGON, Targoniano);
        }

        if (Freijordiano.isEmpty() == false){
            lista.put(Region.FREIJORD, Freijordiano);
        }

        if (Piltillo.isEmpty() == false){
            lista.put(Region.PILTOVER, Piltillo);
        }

        if (Zaunita.isEmpty() == false){
            lista.put(Region.ZAUN, Zaunita);
        }

        if (Bandle.isEmpty() == false){
            lista.put(Region.BANDLE, Bandle);
        }

        if (AguasEstancadas.isEmpty() == false){
            lista.put(Region.AGUAS_ESTANCADAS,AguasEstancadas);
        }

        if (Desconocido.isEmpty() == false){
            lista.put(Region.DESCONOCIDA, Desconocido);
        }

        return lista;

    }

    public static Personaje getMasPoderoso(List<Personaje> personaje){
        Personaje campeon = new Personaje();

        for (Personaje x : personaje){
            while (x.getNivel()<18){
                x = levelUp(x);
            }

            if (campeon.getNombre()==null){
                campeon = x;
            }

            double stats1 = campeon.getAtaque()+ campeon.getDefensa()+campeon.getMana()+campeon.getVida();
            double stats2 = x.getAtaque()+x.getDefensa()+x.getMana()+x.getVida();

            if (stats2 > stats1){
                campeon = x;
            }
        }
        return campeon;
    }

    public static Map<Region, Personaje> getMasPoderosoPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> lista2 = getPersonajesPorRegion(personajes);
        Map<Region, Personaje> mapa = new HashMap<>();

        mapa.put(Region.DEMACIA, getMasPoderoso(lista2.get(Region.DEMACIA)));
        mapa.put(Region.NOXUS, getMasPoderoso(lista2.get(Region.NOXUS)));
        mapa.put(Region.SHURIMA, getMasPoderoso(lista2.get(Region.SHURIMA)));
        mapa.put(Region.TARGON, getMasPoderoso(lista2.get(Region.TARGON)));
        mapa.put(Region.FREIJORD, getMasPoderoso(lista2.get(Region.FREIJORD)));
        mapa.put(Region.PILTOVER, getMasPoderoso(lista2.get(Region.PILTOVER)));
        mapa.put(Region.ZAUN, getMasPoderoso(lista2.get(Region.ZAUN)));
        mapa.put(Region.AGUAS_ESTANCADAS, getMasPoderoso(lista2.get(Region.AGUAS_ESTANCADAS)));
        mapa.put(Region.DESCONOCIDA, getMasPoderoso(lista2.get(Region.DESCONOCIDA)));

        return mapa;
    }
}
