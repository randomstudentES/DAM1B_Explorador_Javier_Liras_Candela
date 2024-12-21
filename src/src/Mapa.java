import Clases.Posicion;

public class Mapa {

    private char[][] tablero = new char[6][20];
    private Clases.Posicion posTesoro;
    private Clases.Posicion posJugador;
    private Enemigo[] listadoEnemigos = new Enemigo[3];
    private Clases.Posicion[] posicionTrampas = new Posicion[3];

    public Mapa(){
        String simbolo = " ";
        int y = posJugador.getCoordenadaCol();
        int x = posJugador.getCoordenadaFila();
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("---------------------------------------------------------------------------------");
            for (int j = 0; j < tablero[i].length; j++) {

                if (y == i & j == x){
                    simbolo = "J";
                } else{
                    simbolo = " ";
                }

                System.out.print("| "+simbolo+" ");
            }
            System.out.println("|");
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

}
