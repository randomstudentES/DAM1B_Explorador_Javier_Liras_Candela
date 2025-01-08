import Clases.Posicion;

import java.util.Scanner;

public class Main {
        public static void main(String [] args){
            Scanner texto = new Scanner(System.in);

            System.out.println("\033[32m ****************************************************************");
            System.out.println("\033[32mBienvenido al juego del explorador");
            System.out.println("\033[32m****************************************************************");

            String nombre = texto.nextLine();
            Explorador explorador = new Explorador(nombre);
            Mapa mapa = new Mapa(explorador.getPosicionActual());

            boolean jugando = true;
            do{
                mapa.mostrar();

                System.out.println("\033[36m1 = Arriba | 2 = Abajo | 3 = Derecha | 4 = Izquierda");
                int direccion = texto.nextInt();

                Clases.Posicion antiguaPosicionExplorador = new Posicion(explorador.getPosicionActual().getCoordenadaFila(), explorador.getPosicionActual().getCoordenadaCol());
                explorador.moverse(direccion);
                if (mapa.getTablero()[explorador.getPosicionActual().getCoordenadaFila()][explorador.getPosicionActual().getCoordenadaCol()] == 'T') {
                    System.out.println("\033[31mHas caido en una trampa, has perdido");
                    jugando = false;
                } else if (mapa.getTablero()[explorador.getPosicionActual().getCoordenadaFila()][explorador.getPosicionActual().getCoordenadaCol()] == 'E') {
                    System.out.println("\033[31mOh no, te ha atrapado un enemigo, has perdido");
                } else if (explorador.getPosicionActual().getCoordenadaCol() == mapa.getPosTesoro().getCoordenadaCol() & explorador.getPosicionActual().getCoordenadaFila() == mapa.getPosTesoro().getCoordenadaFila()) {
                    System.out.println("\033[32mFelicidades, has encontrado el tesoro");
                    jugando = false;
                }
                mapa.actualizar(antiguaPosicionExplorador);

            } while (jugando);

        }
}
