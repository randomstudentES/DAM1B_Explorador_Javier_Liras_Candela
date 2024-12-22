import Clases.Posicion;

public class Explorador {
    private String nombre;
    private Clases.Posicion posicionActual;

    public Explorador(String nombre){
        this.nombre = nombre;
        posicionActual = new Posicion(0, (int) (Math.random() * 5));
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
        int y = this.posicionActual.getCoordenadaCol();
        int x = this.posicionActual.getCoordenadaFila();

        if(direccion == 1 & x > 0){
            this.posicionActual.setCoordenadaCol(y - 1);
        } else if (direccion == 2 & x < 5) {
            this.posicionActual.setCoordenadaCol(y + 1);
        } else if (direccion == 3 & y < 19) {
            this.posicionActual.setCoordenadaFila(x + 1);
        } else if (direccion == 4 & y > 0) {
            this.posicionActual.setCoordenadaFila(x - 1);
        }

    }

}
