public class MUDBuilderDemo {
    public static void main(String[] args) {
        // Create a dungeon builder
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        // Build a dungeon with a name, a room, and an NPC
        Dungeon dungeon = builder.setDungeonName("Mysterious cave")
                .addRoom(new Room("Tunnel", "A narrow tunnel with light at the end."))
                .addNPC(new NPC("Stranger", "An unknown wanderer exploring the cave.", 100))
                .build();
        // Display dungeon information
        dungeon.getDungeonInfo();
    }
}

