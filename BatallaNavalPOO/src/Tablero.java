public class Tablero {
    private Object[][] celdas;
    public Tablero(int[] tamaño){
        celdas = new Object[tamaño[1]][tamaño[0]];
        for(int i=0; i< celdas.length; i++) {
            for(int j=0; j< celdas[i].length; j++) {
                celdas[i][j] = new Barco();
            }
        }
    }
    public void mostrarTablero(){
        String _tablero = "";
        for(int i=0; i< celdas.length; i++) {
            for(int j=0; j< celdas[i].length; j++) {
                if (celdas[i][j].getClass() == Barco.class) {
                    _tablero += "X";
                }
            }
            _tablero += "\n";
        }
        IO.show(_tablero);
    }
}
