
package team_soccer;

public class Team_Soccer {

    public static void main(String[] args) {
        
        Futbolista nuevo_jugador;
        nuevo_jugador = new Futbolista();
        String name_jugaf = nuevo_jugador.getNombre();
        System.out.println("el nombre del futbolista es: " + name_jugaf);
        String name_new = "David";
        nuevo_jugador.setNombre(name_new);
        System.out.println("ahora tu futbolista se llama: " + nuevo_jugador.getNombre());
         
        System.out.println("el valor doble del futbolista es:  " + nuevo_jugador.multip_dos());
        
        System.out.println("ahora tu futbolista se llama: " + nuevo_jugador.getNombre());
        
    }
    
}
