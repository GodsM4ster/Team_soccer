
package team_soccer;

public class Team_Soccer {

    public static void main(String[] args) {
        
        Futbolista nuevo_jugador = new Futbolista();
        String name_juga = nuevo_jugador.getNombre();
        System.out.println("el nombre del futbolista es: " + name_juga);
        nuevo_jugador.setNombre("Edwin");
        System.out.println("ahora tu futbolista se llama: " + nuevo_jugador.getNombre());
        
        System.out.println("el valor doble del futbolista es:  " + nuevo_jugador.multip_dos());
        
    }
    
}
