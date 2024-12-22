import Clases.Posicion;

import java.util.Arrays;
import java.util.Objects;

public class Mapa {

    private char[][] tablero;
    private Clases.Posicion posTesoro;
    private Clases.Posicion posJugador;
    private Enemigo[] listadoEnemigos = new Enemigo[3];
    private Clases.Posicion[] posicionTrampas = new Posicion[3];

    public Mapa(Posicion posJugador){
        this.tablero = new char[6][20];
        this.posJugador = posJugador;
        this.listadoEnemigos[0] = new Enemigo(this.posJugador);
        this.listadoEnemigos[1] = new Enemigo(this.posJugador);
        this.listadoEnemigos[2] = new Enemigo(this.posJugador);
    }

    public char[][] getTablero(){
        return this.tablero;
    }

    public Posicion getPosTesoro(){
        return posTesoro;
    }

    public void mostrar(){
        char simbolo = ' ';

        // Divide las coordenadas de jugador al no poder compararlas directamente
        int y = posJugador.getCoordenadaCol();
        int x = posJugador.getCoordenadaFila();

        for (int i = 0; i < tablero.length; i++) {
            System.out.println("---------------------------------------------------------------------------------");
            for (int j = 0; j < tablero[i].length; j++) {
                int[] casilla = {j, i};
                if (Arrays.equals(casilla, posJugador.getCoordenadas())){
                    simbolo = 'J';
                } else if (Arrays.equals(casilla, this.listadoEnemigos[0].getPosicionActual().getCoordenadas()) ||
                        Arrays.equals(casilla, this.listadoEnemigos[1].getPosicionActual().getCoordenadas()) ||
                        Arrays.equals(casilla, this.listadoEnemigos[2].getPosicionActual().getCoordenadas())){
                    simbolo ='E';
                } else{
                    simbolo = ' ';
                }

                System.out.print("| "+simbolo+" ");
                this.tablero[i][j] = simbolo;
            }
            System.out.println("|");
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

}
