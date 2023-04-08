public class arrays {
    public static void main(String[] args) {

        String s = "Hello";
        String s1 = new String("Hello1");

        int[] numbers = new int[5];
        for(int i = 0; i<numbers.length; i++){
            numbers[i]=i*10;
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3,4,5,6};
        for (int i1=0; i1<numbers1.length; i1++) {
            System.out.println(numbers1[i1]);
        }
    }
}
