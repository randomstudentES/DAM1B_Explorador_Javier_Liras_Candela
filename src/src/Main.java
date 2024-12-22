import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Explorador jugador = new Explorador("hola");
        Mapa mapero = new Mapa(jugador.getPosicionActual());
        mapero.mostrar();
        for (int i = 0; i < 20; i++) {
            int direccion = teclado.nextInt();
            jugador.Moverse(direccion);
            mapero.mostrar();
        }
        //fixed explorador movimiento y sus limites
    }
    public static void Frame(){

    }
}