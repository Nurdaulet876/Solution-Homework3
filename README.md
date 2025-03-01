# Solution-Homework3
TASK #1
Implement a Builder for a Complex Object

•Overview
This project demonstrates the Builder design pattern in a text-based game (MUD). The pattern is used to construct complex Dungeon objects step by step, providing a flexible and readable way to create game environments.

•Approach
- Builder Pattern: Separates object construction from its representation, making it easier to create complex objects.

- Encapsulation: Ensures that fields in Dungeon, Room, and NPC classes are managed through the builder.

- Code Organization:
IDungeonBuilder.java → Interface for building dungeon objects step by step.
SimpleDungeonBuilder.java → Implements IDungeonBuilder for constructing dungeons.
Dungeon.java → Represents the dungeon, including its name, rooms, and NPCs.
MUDBuilderDemo.java → Demonstrates the usage of the builder pattern to construct a dungeon.

TASK #2
MUD Prototype Pattern Implementation

•Overview
This project demonstrates the Prototype design pattern in a text-based game (MUD). The pattern is used to create copies of game entities (e.g., Rooms and NPCs) without instantiating them from scratch. Each entity implements the CloneableGameEntity interface to support cloning.

•Approach
- Prototype Pattern: Allows cloning of objects instead of creating new instances manually.

- Encapsulation: Fields in Room and NPC are kept private and final to ensure immutability.

- Code Organization:
CloneableGameEntity.java → Interface for cloneable entities.
Room.java → Represents a dungeon room.
NPC.java → Represents a non-playable character.
MUDPrototypeDemo.java → Demonstrates object cloning.
