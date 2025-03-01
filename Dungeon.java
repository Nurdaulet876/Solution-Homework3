import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    // Dungeon constructor
    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }
    // Method to display dungeon details
    public void getDungeonInfo() {
        System.out.println("Dungeon Name: " + name);
        System.out.println();
        for (Room room : rooms) {
            System.out.println("Rooms: " + room.getName() + " - " + room.getDescription());
        }
        System.out.println();
        for (NPC npc : npcs) {
            System.out.println("NPCs: " + npc.getName() + " (Health - " + npc.getHealth() + ") - " + npc.getDescription());
        }
    }
}
