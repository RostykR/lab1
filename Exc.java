public class Exc {
    public void first() {

        int a = 100;
        int b = 0;
        int arr[] = new int[3];
        try{
            int dil = a/b;
            System.out.println(dil);
            arr[2] = dil;
        }catch (ArithmeticException k){
            int dil = a;
            System.out.println(dil);
        }catch (ArrayIndexOutOfBoundsException k){
            int array [] = new int[arr.length+3];
            array[5] = 100;
            System.out.println(array[5]);
        }
        System.out.println("Продовження виконання програми після блоку try/catch");



    }
    public void second(){
        int p = 100;
        int z = 0;
        try {
            System.out.println(p/z);
            try {
                System.out.println((p / z) );
            } catch (Exception v){
                System.out.println("Помилка: " + v);
            }
        } catch (ArithmeticException v){
            System.out.println("Ділення на 0 неможливе");
        }
    }
    public void third(){
        try{
            System.out.println(100/0);
        }catch (ArithmeticException g){
            System.out.println("Виникла помилка");
        }finally {
            System.out.println("Роботу завершено недивлячись на помилки");
        }
    }

}
