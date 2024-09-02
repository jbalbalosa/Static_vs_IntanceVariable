public class Main {
    public static void main(String[] args) {
        System.out.println("Static vs Instance Variable!");

        Dog rex = new Dog("rex"); //Create Instance
        Dog fluffy = new Dog("fluffy");

        //Same result 'fluffy'
        rex.printName();   //Call instance method
        fluffy.printName();

    }
}