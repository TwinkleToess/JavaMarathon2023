public class this_keyword {

    public static void main(String[] args) {

        Human2 human1 = new Human2();
        human1.setName("Кирилл");
        human1.setAge(12);
        human1.getInfo();

    }
}

class Human2{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+" "+age);
    }
}