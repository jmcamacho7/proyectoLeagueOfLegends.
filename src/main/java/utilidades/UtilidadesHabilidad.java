package utilidades;

import modelos.Habilidad;
import modelos.Item;
import modelos.Personaje;

public class UtilidadesHabilidad {
    public static void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){
        UtilidadesPersonaje nivel = new UtilidadesPersonaje();

        while (emisor.getNivel()>18){
            emisor = nivel.levelUp(emisor);
        }
        while (receptor.getNivel()>18){
            receptor = nivel.levelUp(receptor);
        }


        if (emisor.getEquipamiento().isEmpty() == false){
            for (Item x : emisor.getEquipamiento()){
                emisor.setAtaque(emisor.getAtaque() + x.getAumentoDanio());
                emisor.setDefensa(emisor.getDefensa() + x.getAumentoDefensa());
                emisor.setMana(emisor.getMana() + x.getAumentoMana());
                emisor.setVida(emisor.getVida() + x.getAumentoSalud());
            }
        }

        if (receptor.getEquipamiento().isEmpty() == false){
            for (Item x : emisor.getEquipamiento()){
                receptor.setAtaque(receptor.getAtaque() + x.getAumentoDanio());
                receptor.setDefensa(receptor.getDefensa() + x.getAumentoDefensa());
                receptor.setMana(receptor.getMana() + x.getAumentoMana());
                receptor.setVida(receptor.getVida() + x.getAumentoSalud());
            }
        }

        double daniototal;
        daniototal = habilidadEmisor.getDanioBase() + (0.2 * emisor.getAtaque()) - (0.1 * receptor.getDefensa());

        emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana());
        receptor.setVida(receptor.getVida() - daniototal);
    }
}
