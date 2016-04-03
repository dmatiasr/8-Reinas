/**
 * Esta clase representa un tablero de Ajedrez especializado para el problema de las reinas.
 * 
*/
public class Tablero {
    private int[][] tab;
    private int columna;
    private int fila;
    
    /**
     * Constructor de la clase.
     */
    public Tablero() {
        columna=8;
        fila=8;
        tab = new int[fila][columna];
        //Cargar el tablero aletoriamente con 8 fichas de reinas. 
        //(1,2,3,4,5,6,7,8) : cada uno representa a una reina diferente.
        for (int fila=0; fila < tab.length; fila++) {
            for (int col=0; col < tab[fila].length; col++) {
                tab[fila][col] = 0;//inicializa el tablero el cero
                //(int) (Math.random()*7+1); //carga 8 posiciones random
            }
        }
        
        //TAREA: el constructor debe crear un nuevo tablero
        //la configuracion del tablero debe cumplir con que haya 8 reinas en el tablero (las posiciones de las mismas no estan restringidas)
    }
    
    /**
     * @return {@code true} sii existe al menos una reina amenazada por otra. 
     */
    public boolean hayAmenaza() {
        //TAREA: implemente esta funcion para que devuelva true si existe al menos una reina en el tablero que amenaza a otra.
        

        throw new UnsupportedOperationException("Tablero#hayAmenaza() : no implementado");

    }
    
    /**
     * @param columna   :   una de las columnas del tablero :   {@code int}
     * @param fila      :   una de las filas del tablero    :   {@code int}
     * 
     * @return {@code true} sii el tablero esta ocupado en la casilla especificada por los argumentos {@code columna} y {@code fila} 
     * @throws IllegalArgumentException : si columna < 0 || fila < 0 || columna > 7 || fila > 7
     */
    public boolean ocupado(int columna, int fila) throws IllegalArgumentException {
        //TAREA:    implemente esta funcion para que devuelva true si existe una reina en la casilla especificada por los argumentos columna y fila.
        //          Por ejemplo en el siguiente tablero
        //             0   1   2   3   4   5   6   7
        //  0        |   |   |   |   |   |   |   | R |
        //  1        |   |   |   |   |   |   |   |   |
        //  2        | R |   |   | R | R |   |   |   |
        //  3        |   |   |   |   |   | R |   |   |
        //  4        |   |   |   |   |   |   |   |   |
        //  5        |   |   |   |   |   |   |   |   |
        //  6        |   |   | R |   |   |   |   |   |
        //  7        |   |   |   |   |   |   | R |   |
        //          
        //          deberian ser ciertas las siguientes expresiones
        //          ocupado(0,2) == true
        //          ocupado(2,0) == false
        //          ocupado(2,6) == true
        //          ocupado(6,7) == true
        //          ocupado(7,6) == false
            
        //throw new UnsupportedOperationException("Tablero#ocupado(int, int) : no implementado");
        //VER SI ESTA FUERA DE RANGO !!!
        
        return (tab[fila][columna] ==0);
          
    }
    
    /**
     * @param columnaOrigen   :   una de las columnas del tablero en donde esta la reina a mover    :   {@code int}
     * @param filaOrigen      :   una de las filas del tablero en donde esta la reina a mover       :   {@code int}
     * 
     * @param columnaDestino   :   una de las columnas del tablero en donde estara la reina a mover    :   {@code int}
     * @param filaDestino      :   una de las filas del tablero en donde estara la reina a mover       :   {@code int} 
     * 
     * @throws IllegalArgumentException : si columna < 0 || fila < 0 || columna > 7 || fila > 7 || !ocupado(columnaOrigen, filaOrigen) || ocupado(columnaDestino, filaDestino)
     */
    public void mover(int columnaOrigen, int filaOrigen, int columnaDestino, int filaDestino) throws IllegalArgumentException { 
        //TAREA:    implemente esta funcion para que mueva una reina desde una casilla especificada por los argumentos columnaOrigen y filaOrigen
        //          a una casilla especificada por los argumentos columnaDestino, filaDestino.
        //          Si la casilla origen no esta ocupada o la casilla destino esta ocupada se debe arrojar una IllegalArgumentException.
        //          Por ejemplo en el siguiente tablero
        //
        //             0   1   2   3   4   5   6   7
        //  0        |   |   |   |   |   |   |   | R |
        //  1        |   |   |   |   |   |   |   |   |
        //  2        | R |   |   | R | R |   |   |   |
        //  3        |   |   |   |   |   | R |   |   |
        //  4        |   |   |   |   |   |   |   |   |
        //  5        |   |   |   |   |   |   |   |   |
        //  6        |   |   | R |   |   |   |   |   |
        //  7        |   |   |   |   |   |   | R |   |
        //          
        //          la llamada mover(0,2,2,5) deberia producir el siguiente tablero
        //          
        //             0   1   2   3   4   5   6   7
        //  0        |   |   |   |   |   |   |   | R |
        //  1        |   |   |   |   |   |   |   |   |
        //  2        |   |   |   | R | R |   |   |   |
        //  3        |   |   |   |   |   | R |   |   |
        //  4        |   |   |   |   |   |   |   |   |
        //  5        |   |   | R |   |   |   |   |   |
        //  6        |   |   | R |   |   |   |   |   |
        //  7        |   |   |   |   |   |   | R |   |
        throw new UnsupportedOperationException("Tablero#mover(int, int, int, int) : no implementado");
    }
    
    /**
     * Colocar una reina en una casilla especifica, la cual esta vacia.
     * 
     * @param columna   :   la columna donde colocar la reina   :   {@code int}
     * @param fila      :   la fila donde colocar la reina      :   {@code int}
    */
    public void colocarReina(int columna, int fila) throws IllegalArgumentException {
        //TAREA:    implemente esta funcion para que coloque una reina en la columna y fila especificada.
        //          Si ya existe una reina en esa casilla o si la columna y la fila no estan dentro de los valores (0, 7),
        //          el metodo debe retornar una excepcion (IllegalArgumentException).
        //throw new UnsupportedOperationException("Tablero#colocarReina(int, int) : no implementado");
             
    }
    
    /**
     * Limpia el tablero, ninguna casilla esta ocupada luego de llamar a este metodo 
    */
    public void limpiarTablero() {
        //TAREA:    implemente esta funcion para que limpie el tablero (ninguna casilla debe quedar ocupada)
        //throw new UnsupportedOperationException("Tablero#limpiarTablero() : no implementado");
        tab=new int[fila][columna];
    }
    
    @Override
    public String toString() {
        String s = "\n\t  ------------------------------- \n\t";
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
               s = s + " | "+tab[f][c];
            }
            s = s + " | \n\t  ------------------------------- \n\t";
        }
        s = s + "   1   2   3   4   5   6   7   8\n";
        return s;
        //TAREA: implemente esta funcion para que retorne una representacion (en forma de String) de este tablero
        //throw new UnsupportedOperationException("Tablero#toString() : no implementado");
    }
    
    
}