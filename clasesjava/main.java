package campeonato;

public class main {
    public static void main(String[] args) {
        jugador jugador1 = new jugador("nombre1 ", "apellido1 ", "ci1",  20);
        jugador jugador2 = new jugador("nombre2 ", "apellido2", "ci2",  20);
        jugador jugador3 = new jugador("nombre3 ", "apellido3 ", "ci3",  20);

        jugador[] jugadoresequipo1 = new jugador[3];
        jugadoresequipo1[0] = jugador1;
        jugadoresequipo1[1] = jugador2;
        jugadoresequipo1[2] = jugador3;

        equipo equipo1 = new equipo ("not found ","varones", jugadoresequipo1);
        equipo[] equipos = new equipo[1];
        equipos [0] = equipo1;

        campeonato camp = new campeonato("campeonato unifranz", equipos);
        camp.imprimircampeonato();




    }
}
