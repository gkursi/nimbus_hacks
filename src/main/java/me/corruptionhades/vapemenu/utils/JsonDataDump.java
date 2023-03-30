package me.corruptionhades.vapemenu.utils;

import java.io.FileWriter;
import java.io.IOException;

public class JsonDataDump {
    private StringBuilder data;
    private String dir;

    public JsonDataDump(String output){
        this.dir = output;
        this.data = new StringBuilder("{\"pseudo-element\": \"START\"");
    }

    public void addData(String key, String value){
        this.data.append("\"").append(key).append("\": \"").append(value).append("\",");
    }

    private String buildStr(){
        return this.data.append("\"pseudo-element\": \"END\"}").toString();
    }

    public void write(){
        try {
            FileWriter fileWriter = new FileWriter(this.dir);
            fileWriter.write(buildStr());
            fileWriter.close();
        } catch (IOException e){
            new ChatUtils().sendMsg("An error occurred while writing to file! (JavaIOException");
        }
    }
}
