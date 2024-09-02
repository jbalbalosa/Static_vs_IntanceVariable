public class Dog {

    //private Static String name;  //Static Variable declaration.
    private String name;           //Instance Variable declaration

    //Constructor
    public Dog(String name){
        //Dog.name = name;       //Static declaration
        this.name = name;        //Instance declaration
    }

    public void printName(){
        System.out.println("name = " + name);
    }

}
