public class MyException {
    private int litriv = 10000;

    public void litr(){
        System.out.println("В цистерні знаходиться " + litriv);
    }

    public void zaps(int zap) throws Zapas {
        if (zap < litriv){
            System.out.println("Все внормі");
        } else {
            int l = litriv + zap;
            throw new Zapas(l);

        }

    }

    public int getLitriv() {
        return litriv;
    }
}
