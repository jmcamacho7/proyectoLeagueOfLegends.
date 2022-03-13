package utilidades;

import modelos.Personaje;
import modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesPersonaje {
    public Personaje levelUp(Personaje personaje){
        if (personaje.getNivel()<18){
            personaje.setNivel(personaje.getNivel()+1);
            personaje.setAtaque(personaje.getAtaqueBase() + personaje.getEscalabilidad().getIncrementoDanioNivel() * personaje.getNivel());
            personaje.setDefensa(personaje.getDefensaBase() + personaje.getEscalabilidad().getIncrementoDefensaNivel() * personaje.getNivel());
            personaje.setMana(personaje.getManaBase() + personaje.getEscalabilidad().getIncrementoManaNivel() * personaje.getNivel());
            personaje.setVida(personaje.getVidaBase() + personaje.getEscalabilidad().getIncrementoSaludNivel() * personaje.getNivel());
        }

        return personaje;
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
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
            if (x.getRegion2() == Region.ZAUM){
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

        lista.put(Region.DEMACIA, Demaciano);
        lista.put(Region.NOXUS, Noxiano);
        lista.put(Region.JONIA, Jonio);
        lista.put(Region.SHURIMA, Shurimanos);
        lista.put(Region.TARGON, Targoniano);
        lista.put(Region.FREIJORD, Freijordiano);
        lista.put(Region.PILTOVER, Piltillo);
        lista.put(Region.ZAUM, Zaunita);
        lista.put(Region.BANDLE, Bandle);
        lista.put(Region.AGUAS_ESTANCADAS,AguasEstancadas);
        lista.put(Region.DESCONOCIDA, Desconocido);

        return lista;

    }

    public Personaje getMasPoderoso(List<Personaje> personaje){
        Personaje campeon = new Personaje();

        for (Personaje x : personaje){
            while (x.getNivel()>18){
                x = levelUp(x);
            }

            if (x.getNivel()==null){
                campeon = x;
            }

            if (campeon.getAtaque()+ campeon.getDefensa()+campeon.getMana()+campeon.getVida() > x.getAtaque()+x.getDefensa()+x.getMana()+x.getVida()){
                campeon = x;
            }
        }
        return campeon;
    }

    public Map<Region, Personaje> getMasPoderosoPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> lista2 = getPersonajesPorRegion(personajes);
        Map<Region, Personaje> mapa = new HashMap<>();

        mapa.put(Region.DEMACIA, getMasPoderoso(lista2.get(Region.DEMACIA)));
        mapa.put(Region.NOXUS, getMasPoderoso(lista2.get(Region.NOXUS)));
        mapa.put(Region.SHURIMA, getMasPoderoso(lista2.get(Region.SHURIMA)));
        mapa.put(Region.TARGON, getMasPoderoso(lista2.get(Region.TARGON)));
        mapa.put(Region.FREIJORD, getMasPoderoso(lista2.get(Region.FREIJORD)));
        mapa.put(Region.PILTOVER, getMasPoderoso(lista2.get(Region.PILTOVER)));
        mapa.put(Region.ZAUM, getMasPoderoso(lista2.get(Region.ZAUM)));
        mapa.put(Region.AGUAS_ESTANCADAS, getMasPoderoso(lista2.get(Region.AGUAS_ESTANCADAS)));
        mapa.put(Region.DESCONOCIDA, getMasPoderoso(lista2.get(Region.DESCONOCIDA)));

        return mapa;
    }
}
