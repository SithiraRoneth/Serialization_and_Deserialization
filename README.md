# Serialization and De-serialization

Data structures or object states can be transformed using the serialization and deserialization procedures into a format that can be transferred, saved, and rebuilt.

![java-serialization-deserialization-process.png](src%2Fmain%2Fjava%2Flk%2Fijse%2Fserialization_and_deserialization%2Fassets%2Fjava-serialization-deserialization-process.png)

- Serialization: The state of an object converting to a byte stream.
- De-serialization: Reverse process in Serialization. Byte stream convert to actual java object in memory.

## Benefits of Serialization and De-serialization:

- Data persistence : To save an object in database
- Communication : To exchange data between different part of system or between different network.(To travel Object across a network)
- Performance : Improve data storage(Memory) efficiently.

## Mechanism of the Serialization and De-serialization   

Serialization :

1. Create an object : An object is create using program.
2. Serialization : Convert object to byte stream using created object (Can we use Json,XML or Binary).
3. Storage : Converted byte stream store in a file , database or over network.


De-serialization :

1. Byte stream retrieval : Get byte stream from storage(file,database or over network).
2. De-serialization : Convert byte stream to back on that object using got byte from storage.
3. Usage of Object : Use that object in program
