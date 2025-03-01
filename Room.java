// Class representing a room in the dungeon
public class Room implements CloneableGameEntity {
    private final String name;
    private final String description;

    // Room constructor
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Method to clone the room
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    // Getters to get room information
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
