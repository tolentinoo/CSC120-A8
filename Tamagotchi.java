import java.util.ArrayList;

public class Tamagotchi { // implements Contract 
     
    // Attributes
    public String name;  // can make private and use accessors and manipulators 
    public String color; 
    private int age;
    private int locationX;
    private int locationY;
    private ArrayList <String> inventory;
    private ArrayList <String> powerUp;
    


    // Constrtuctor 
    public Tamagotchi (String name, String color) {
        this.name = name;
        this.color = color; 
        this.age = 1;
        this.locationX = 0 ;
        this.locationY= 0 ;
    }

    // Accessors & Manipulators 
    public void setName(String name2) {
        this.name = name2;
    }

    // Methods 
    public void grab(String item){
        System.out.println("You have grabbed" + item +" it is being added to your inventory");
        inventory.add(item);
    }

    public String drop(String item){
         inventory.remove(item);
    }

    public void examine(String item){
        if (powerUp.contains(item) == true ){
            grab(item);
        }
        else{
            drop(item);
        }
    }

    public void use(String item){
        if (inventory.contains(item) == true);
            System.out.println("You have unlocked a new achievement ;) Do you want to use it?");
    }

    public boolean walk(String direction){
        direction.toLowerCase();
        if (direction == "north"){
            locationY +=1;   
        }
        if (direction == "south"){
            locationY -=1;
        } 
        if (direction == "west"){
            locationX -=1;
        }
        if (direction == "east"){
            locationX += 1;
        }
        else{
            System.out.println("Give a valid direction");
        }
    }

    // public boolean fly(int x, int y){
    //     if (fly )
    //     locationX += x;
    //     locationY += y;
    // }

    public Number shrink(){
        this.age -= 10;
    }

    public Number grow(){
        this.age += 10;
    }
    // public void rest(){

    // }
    // public void undo(){

    }

    // Main
    
}
