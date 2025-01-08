import Clases.Posicion;

public class Mapa {
    private char[][] tablero;
    private Clases.Posicion posTesoro;
    private Clases.Posicion posJugador;
    private Enemigo[] listadoEnemigos;
    private Clases.Posicion[] posicionTramapas;
    
    public Mapa(Posicion posicionExplorador){
        this.tablero = new char[6][20];
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {
                this.tablero[i][j] = ' ';
            }
        }
        
        this.posTesoro = new Posicion((int) (Math.random() * 6), (int) (Math.random() * 20));
        this.tablero[this.posTesoro.getCoordenadaFila()][this.posTesoro.getCoordenadaCol()] = 'T';
        
        this.posicionTramapas = new Posicion[3];

        for (int i = 0; i < this.posicionTramapas.length; i++) {
            this.posicionTramapas[i] = new Posicion((int) (Math.random() * 6), (int) (Math.random() * 6));
            this.tablero[this.posicionTramapas[i].getCoordenadaFila()][this.posicionTramapas[i].getCoordenadaCol()] = 'T';
        }

        this.listadoEnemigos = new Enemigo[3];

        for (int i = 0; i < listadoEnemigos.length; i++) {
            listadoEnemigos[i] = new Enemigo();
            tablero[listadoEnemigos[i].getPosicionActual().getCoordenadaFila()][listadoEnemigos[i].getPosicionActual().getCoordenadaCol()] = 'E';
        }

        this.posJugador = posicionExplorador;
        this.tablero[this.posJugador.getCoordenadaFila()][this.posJugador.getCoordenadaCol()] = 'J';

    }

    public char[][] getTablero() {
        return tablero;
    }

    public Posicion getPosTesoro() {
        return posTesoro;
    }

    public Enemigo[] getListadoEnemigos() {
        return listadoEnemigos;
    }

    public void mostrar(){

        for (int i = 0; i < this.tablero.length; i++) {
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.print("| ");
            for (int j = 0; j < this.tablero[0].length; j++) {
                System.out.print(this.tablero[i][j] + " | ");
            }

        }
        System.out.println("\n---------------------------------------------------------------------------------");
    }

    public void actualizar(Posicion posicionAntigua){

        for (int i = 0; i < listadoEnemigos.length; i++) {
            tablero[listadoEnemigos[i].getPosicionActual().getCoordenadaFila()][listadoEnemigos[i].getPosicionActual().getCoordenadaCol()] = ' ';
            listadoEnemigos[i].moverse((int)(Math.random() * 4));
            tablero[listadoEnemigos[i].getPosicionActual().getCoordenadaFila()][listadoEnemigos[i].getPosicionActual().getCoordenadaCol()] = 'E';
        }
        tablero[posicionAntigua.getCoordenadaFila()][posicionAntigua.getCoordenadaCol()] = ' ';
        tablero[posJugador.getCoordenadaFila()][posJugador.getCoordenadaCol()] = 'J';
    }

}
