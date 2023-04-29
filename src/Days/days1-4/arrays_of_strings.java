public class arrays_of_strings {
    public static void main(String[] args) {
        int [] number = new int[5];
        String[] strings = {"Маша", "Саша", "Петя", "Ваня"};

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        // Попробуем применить цикл for...each
        System.out.println(" ");
        for(String x:strings){                  //В объявленную переменную "X" мы засунули значение из *strings*1
            System.out.println(x);
        }

        int[] numbers = {1,2,3,4};  // Работать с существующей переменной нельзя
        for(int x1:numbers){
            System.out.println(x1);
        }

        int a = 0; // Выделили память в размере 32 бит под значение переменной
        String s; // Здесь память не выделена, т.к. s - ссылка.
                  // По умолчанию s укзаывает на null - пустоту.
                 // ее можно вывести на экран
        s = null;
        System.out.println(s);
        /* В данном случае S можно воспринимать как адрес дома, однако самого дома (объекта) из класса (дома) создано не было*/

    }
}
