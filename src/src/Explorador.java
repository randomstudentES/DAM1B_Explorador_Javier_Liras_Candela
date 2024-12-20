import Clases.Posicion;

public class Explorador {
    private String nombre;
    private Clases.Posicion posicionActual;
    public Explorador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Clases.Posicion getPosicionActual(){
        return this.posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void Moverse(int direccion){
        int x = this.getPosicionActual().getCoordenadaCol();
        int y = this.posicionActual.getCoordenadaFila();
        if(direccion == 1){
            this.posicionActual.setCoordenadaFila(y - 1);
        } else if (direccion == 2) {
            this.posicionActual.setCoordenadaFila(y + 1);
        } else if (direccion == 3) {
            this.posicionActual.setCoordenadaCol(x + 1);
        } else if (direccion == 4) {
            this.posicionActual.setCoordenadaCol(x - 1);
        }
    }

}
