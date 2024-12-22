package Clases;

public class Posicion {
    private int coordenadaFila;
    private int coordenadaCol;

    public Posicion(int coordenadaFila, int coordenadaCol){
        this.coordenadaFila = coordenadaFila;
        this.coordenadaCol = coordenadaCol;
    }

    public int getCoordenadaFila(){
        return this.coordenadaFila;
    }

    public int getCoordenadaCol(){
        return this.coordenadaCol;
    }

    public void setCoordenadaFila(int coordenadaFila) {
        this.coordenadaFila = coordenadaFila;
    }

    public void setCoordenadaCol(int coordenadaCol) {
        this.coordenadaCol = coordenadaCol;
    }
    // creada para que sea más fácil comparar 2 posiciones
    public int[] getCoordenadas(){
        return new int[]{getCoordenadaFila(), getCoordenadaCol()};
    }

}
