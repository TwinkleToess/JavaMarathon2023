public class BuilderOfStrings {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());
        System.out.printf("String %10d \n", 100);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1);
        System.out.printf("String %.2f \n", 1.123123);
    }

}
