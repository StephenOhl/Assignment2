
import java.nio.file.*;
import java.io.*;

public class HouseSimulator {
    public static void main(String[] args) {
        final int SIZE = 5;
        RoomSensor[] roomSensors = new RoomSensor[SIZE];
        ReadConfigurationFile getConfiguration = new ReadConfigurationFile();
        roomSensors = getConfiguration.getConfiguration(SIZE);
    }
}
