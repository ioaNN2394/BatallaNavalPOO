public class Barco extends Celda{
    private  int tamaño;
    private int[] orientacion;
    public Barco(){
        this.tamaño = 0;
        this.orientacion = new int[2];
        super.setId(1);
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public int getTamaño(){
        return this.tamaño;
    }
    public void setOrientacion(int[] orientacion){
        this.orientacion = orientacion;
    }
    public int[] getOrientacion(){
        return this.orientacion;
    }
    @Override 
    public String _toString(){
        return super._toString() + "tamaño=" + tamaño + "orientacion=" + orientacion;
    }  
}
