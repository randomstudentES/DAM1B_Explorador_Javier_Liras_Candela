import Clases.Posicion;

public class Explorador {
    private final int ARRIBA = 1;
    private final int ABAJO = 2;
    private final int DERECHA = 3;
    private final int IZQUIERDA = 4;

    private String nombre;
    private Clases.Posicion posicionActual;

    public Explorador(String nombre) {
        this.nombre = nombre;
        this.posicionActual = new Posicion((int) (Math.random() * 6), 0);

    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void moverse(int direccion) {
        if (direccion >= 1 && direccion <= 4) {
            switch (direccion) {
                case ARRIBA:
                    if (posicionActual.getCoordenadaFila() > 0)
                        posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila() - 1);
                    break;
                case ABAJO:
                    if (posicionActual.getCoordenadaFila() < 5)
                        posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila() + 1);
                    break;
                case DERECHA:
                    if (posicionActual.getCoordenadaCol() < 19)
                        posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol() + 1);
                    break;
                case IZQUIERDA:
                    if (posicionActual.getCoordenadaCol() > 0)
                        posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol() - 1);
                    break;
            }
        }

    }
}