package campeonato;

public class campeonato {
     private String nombrecampeonato;
     private equipo[] equipos;

     public   campeonato (String nombrecampeonato, equipo[] equipos)  {
         this.nombrecampeonato = nombrecampeonato;
         this. equipos = equipos;
     }
     public equipo[] getequipos() {
         return  equipos;

     }
     public void setEquipos(equipo[] equipos ) {
          this.equipos = equipos;


     }
     public void imprimircampeonato() {

         System.out.println(this.nombrecampeonato);
         for(int i=0; i< this.equipos.length; i++);
     }

}
