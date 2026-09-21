# Salvage Technician Boarding the Cetus-9

Phase 1 (Journal):
- Arrays of objects store references (memory addresses) to actual object instances, not the objects themselves. When you create an array of objects without explicitly initializing its elements, each element is set to its default value for that type.
- Assigning to obj changes only the local loop variable, not the actual array element. After the loop, the array still contains null values.
