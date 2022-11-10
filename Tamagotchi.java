import java.util.ArrayList;

public class Tamagotchi { // implements Contract 
     
    // Attributes
    public String name;  // can make private and use accessors and manipulators 
    public String color; 
    private int age;
    private int locationX;
    priavte int locationY;
    private ArrayList <String> inventory;



    // Constrtuctor 
    public Tamagotchi (String name, String color) {
        this.name = name;
        this.color = color; 
        this.age = 1;
        this.locationX =1 ;
        this.locationY;
    }

    // Accessors & Manipulators 


    // Methods 
    public void grab(String item){

    }
    public String drop(String item){

    }
    public void examine(String item){

    }
    public void use(String item){

    }
    public boolean walk(String direction){

    }
    public boolean fly(int x, int y){

    }
    public Number shrink(){

    }
    public Number grow(){

    }
    public void rest(){

    }
    public void undo(){

    }

    // Main
    
}
