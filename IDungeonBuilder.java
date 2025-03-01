public interface IDungeonBuilder {
    // Method to set dungeon name
    IDungeonBuilder setDungeonName(String name);
    // Method to add a room to the dungeon
    IDungeonBuilder addRoom(Room room);
    // Method to add an NPC to the dungeon
    IDungeonBuilder addNPC(NPC npc);
    // Method to build the final dungeon object
    Dungeon build();
}
