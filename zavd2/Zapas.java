public class Zapas extends Exception{
    private int lit;

    public Zapas(int lit){
        this.lit = lit;
    }

    public int getLit() {
        return lit;
    }
}

