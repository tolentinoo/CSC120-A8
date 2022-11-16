import java.util.ArrayList;

public class Tamagotchi implements Contract { 
     
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
    /**
     * Sets the name 
     * @param name2 Name of tamagotchi
     */
    public void setName(String name2) {
        this.name = name2;
    }

    // Methods 

    /**
     * Grabs an item and adds it to inventory
     * @param item
     */
    public void grab(String item){
        System.out.println("You have grabbed" + item +" it is being added to your inventory");
        inventory.add(item);
    }

    /**
     * Removes item from inventory 
     * @param item The item
     * @return The item dropped
     */
    public String drop(String item){
         inventory.remove(item);
         return (item);
         
    }

    /**
     * Examines item if it is a power up then the tamagotchi will grab the item 
     * otherwise they will drop it.
     * @param item The item they want to examine 
     */
    public void examine(String item){
        if (powerUp.contains(item) == true ){
            grab(item);
            this.age += 10;
        }
        else{
            drop(item);
        }
    }

    /**
     * Allows user to use things in their inventory
     * @param item The item in question
     */
    public void use(String item){
        if (inventory.contains(item) == true);
            System.out.println("You have unlocked a new achievement ;) Do you want to use it?");
    }

    /**
     * Allows tamagotchi to walk based on direction given
     * @param direction Direction that they want tamagotchi to walk
     * @return A boolean, true signifies tamagotchi moved
     */
    public boolean walk(String direction){
        direction.toLowerCase();
        if (direction == "north"){
            locationY +=1;
            return(true);
        }
        if (direction == "south"){
            locationY -=1;
            return(true);
        } 
        if (direction == "west"){
            locationX -=1;
            return(true);
        }
        if (direction == "east"){
            locationX += 1;
            return(true);
        }
        else{
            System.out.println("Give a valid direction");
            return (false);
        }
    }

    // public boolean fly(int x, int y){
    //     if (fly )
    //     locationX += x;
    //     locationY += y;
    // }

   
    public Number shrink(){
        this.age -= 10;
        System.out.println(" Your age has gone down by -10 pt");

    }

    public Number grow(){
        System.out.println(" Your age has gone up by 10 pt+");
        this.age += 10;
    }

    /* (non-Javadoc)
     * @see Contract#rest()
     */
    public void rest(){
        System.out.println("You are now resting!");
        this.age += 20;
    }
    // public void undo(){

    // }

    // Main
    
}
