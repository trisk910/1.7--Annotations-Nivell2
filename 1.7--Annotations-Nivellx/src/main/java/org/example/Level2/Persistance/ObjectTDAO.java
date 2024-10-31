package org.example.Level2.Persistance;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class ObjectTDAO {

    public static void writeJson(Object obj) throws IOException{
        Class<?> objClass = obj.getClass();
        if (objClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objClass.getAnnotation(JsonSerializable.class);
            String directory = annotation.directory();
            Gson gson = new Gson();
            String jsonString = gson.toJson(obj);
            try (FileWriter writer = new FileWriter(directory + "/" + objClass.getSimpleName() + ".json")) {
                writer.write(jsonString);
                System.out.println("Object serialized to JSON successfully.");
            }catch (IOException e){
                throw new IOException("Error writing to file.");
            }
        }else {
           System.err.println("Class is not serializable.");
        }
    }
}
