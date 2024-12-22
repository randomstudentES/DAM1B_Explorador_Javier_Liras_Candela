public class Enemigo {
    private Clases.Posicion posicionActual;
    private String nombre;

    public Enemigo(Clases.Posicion posicionJugador){
        posicionActual = new Clases.Posicion(0, (int) (Math.random() * 5));
    }

    public void Moverse(){
        int direccion = (int) (Math.random() * 4 + 1);
        int x = this.posicionActual.getCoordenadaCol();
        int y = this.posicionActual.getCoordenadaFila();

        if(direccion == 1 & x > 0){
            this.posicionActual.setCoordenadaCol(x - 1);
        } else if (direccion == 2 & x < 5) {
            this.posicionActual.setCoordenadaCol(x + 1);
        } else if (direccion == 3 & y < 19) {
            this.posicionActual.setCoordenadaFila(y + 1);
        } else if (direccion == 4 & y > 0) {
            this.posicionActual.setCoordenadaFila(y - 1);
        }
    }

    public void setPosicionActual(Clases.Posicion posicionActualACambiar){
        this.posicionActual = posicionActualACambiar;
    }

    public Clases.Posicion getPosicionActual(){
        return posicionActual;
    }

}
