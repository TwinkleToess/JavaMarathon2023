public class contin {
    public static void main(String[] args) {
        for(int value=0; value<=15; value++){
            if(value%2==0){
                continue;  //заново итерирует функцию, если value четное
            }
            System.out.println("Это нечетное число: "+value);
        }
    }
}
