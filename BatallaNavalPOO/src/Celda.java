public class Celda {
    protected int id;
    protected int[] pos;
    public Celda(){
        id = 0;
        pos = new int[2];
    }
    protected void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    protected void setPos(int[] pos){
        this.pos = pos;
    }
    protected int[] getPos(){
        return this.pos;
    }
    protected String _toString(){
        return "id" + id + " pos" + pos;
    }
}
