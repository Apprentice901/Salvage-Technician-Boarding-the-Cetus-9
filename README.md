# Salvage Technician Boarding the Cetus-9

Phase 1 (Journal):
- Arrays of objects store references (memory addresses) to actual object instances, not the objects themselves. When you create an array of objects without explicitly initializing its elements, each element is set to its default value for that type.
- Assigning to obj changes only the local loop variable, not the actual array element. After the loop, the array still contains null values.

Phase 2 (Journal):
- In Phase 2, I used a For-each loop (Nested for Loop) to iterate within displayManifest()Method looping through all CargoPod arrays verses in Phase 1 using standard for loops to update the pod.length with "i++" through the Cargo Pod Array within the Storage Bay Class.
- When you read through all elements in an array (linear traversal), you gain two key benefits: improved code readability and reduced risk of off-by-one errors.

Phase 3 (Journal):
- Looking at the heavy mess of code, the while loop is used to keep track of the suit's oxygen levels and keeps tabs on CargoPod within its indexes and some null if statements returning Invalid prompts. The Break statement is used for when the condition is true (As in Mission Success).
- Oxygen tracking to a SpaceSuit object improves encapsulation by initializing instance variables compared to managing loose integers variables with main which is limited and difficult to align indexes constantly.
