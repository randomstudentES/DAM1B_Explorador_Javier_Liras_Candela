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
        if(direccion == 1 & y > 0){
            this.posicionActual.setCoordenadaFila(y - 1);
        } else if (direccion == 2 & y < 19) {
            this.posicionActual.setCoordenadaFila(y + 1);
        } else if (direccion == 3 & x < 5) {
            this.posicionActual.setCoordenadaCol(x + 1);
        } else if (direccion == 4 & x > 0) {
            this.posicionActual.setCoordenadaCol(x - 1);
        }
    }

}
