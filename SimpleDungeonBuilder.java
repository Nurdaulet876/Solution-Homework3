import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    // Set the name of the dungeon
    public IDungeonBuilder setDungeonName(String name){
        this.name = name;
        return this;
    }

    // Add a room to the dungeon
    public IDungeonBuilder addRoom(Room room){
        rooms.add(room);
        return this;
    }

    // Add an NPC to the dungeon
    public IDungeonBuilder addNPC(NPC npc){
        npcs.add(npc);
        return this;
    }

    // Build and return the final dungeon object
    public Dungeon build(){
        return new Dungeon(name, rooms, npcs);
    }
}

