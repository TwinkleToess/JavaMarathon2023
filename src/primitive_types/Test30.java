package primitive_types;

public class Test30 {
    public static void main(String[] args) {
/*        float f = 123.2f;
        int a = 123;
        long l = a; *//*Явное приведение типов*//*
        int x = (int)l; *//*Неявное*//*
        System.out.println(x);
        double z = x;
        System.out.println(z);
        int k = (int) z;
        System.out.println(k);*/

        long x = (byte)129;
        System.out.println(x);
    }
}
