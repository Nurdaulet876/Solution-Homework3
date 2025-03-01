public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Creating an original room and its clone
        Room realRoom = new Room("Hall", "A large hall with stone walls.");
        Room clonedRoom = realRoom.cloneEntity();

        // Creating an original NPC and its clone
        NPC realNPC = new NPC("Wizard", "Mysterious stranger with magical powers.", 150);
        NPC clonedNPC = realNPC.cloneEntity();

        // Output information about the room and its clone
        System.out.println("Real room: " + realRoom.getName() + " ,with description - " + realRoom.getDescription());
        System.out.println("Cloned room: " + clonedRoom.getName() + " ,with description - " + clonedRoom.getDescription());

        System.out.println();

        // Output information about the NPC and its clone
        System.out.println("Real NPC: " + realNPC.getName() + " ,with description - " + realNPC.getDescription() + " Health: " + realNPC.getHealth());
        System.out.println("Cloned NPC: " + clonedNPC.getName() + " ,with description - " + clonedNPC.getDescription() + " Health: " + clonedNPC.getHealth());
    }
}
