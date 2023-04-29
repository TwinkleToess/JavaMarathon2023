import Packet1.Person;

public class test {
    public int id;

    public static void main(String[] args) {
        //public - разрешает доступ к классу, методу или полю везде в любой части проекта
        //private - диаметрально противоположный модификатор доступа
               // класс метод или поля становится видимым только внутри класса
        //default - модификатор по-умолчанию. Модификатор доступа "В пакете (package level)".
            //все, что default доступно в пределах этого пакета
        //protected - поле или метод доступен всем подклассам, даже если эти подклассы вне впакета,
            //где эти поля или элементы не были декларированы. В отличие от default protected более доступен

        // класс или Public или default

        Person person1 = new Person();
        person1.name="name";

    }

}
