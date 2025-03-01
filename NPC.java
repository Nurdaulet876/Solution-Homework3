// Class representing an NPC in the game
public class NPC implements CloneableGameEntity{
    private final String name;
    private final String description;
    private final int health;

    // NPC constructor
    public NPC(String name, String description, int health){
        this.name = name;
        this.description = description;
        this.health = health;
    }

    // Method to clone the NPC
    public NPC cloneEntity(){
        return new NPC(this.name, this.description, this.health);
    }

    // Getters to get NPC information
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth(){
        return health;
    }
}

