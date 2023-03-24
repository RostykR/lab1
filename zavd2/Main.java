public class Main {
    public static void main(String[] args) {
        MyException myException = new MyException();
        myException.litr();
        try {
            myException.zaps(0);
        } catch (Zapas e){
            System.out.println("Брак палива становить: " + e.getLit());

        }

    }
}