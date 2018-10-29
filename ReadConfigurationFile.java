import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadConfigurationFile {
    static RoomSensor[] getConfiguration(int size) {
        RoomSensor[] roomSensors = new RoomSensor[size];
        try {
            InputStream input = null;
            Path file = Paths.get("configuration.txt");
            input = Files.newInputStream(file);
            BufferedReader reader = new
                    BufferedReader(new InputStreamReader(input));
            String inString = reader.readLine();

            while (inString != null) {
                String[] arr = inString.split(",");
                int index = 0;
                System.out.println("reading file\n" + arr[0] );
                boolean isOnOrOff = false, lightSwitch = false;
                int airconSet = 0, movement = 0;
                double temperature = 0.0;

                for (int i = 1; i < arr.length; i++) {
                    System.out.println("in for i");
                    if (i == 1) {
                        if (arr[i] == "true") {
                            isOnOrOff = true;
                        } else {
                            isOnOrOff = false;
                        }
                    } else if (i == 2) {
                        if (arr[i] == "true") {
                            lightSwitch = true;
                        } else {
                            lightSwitch = false;
                        }
                    } else if (i == 3) {
                        movement = Integer.parseInt(arr[i]);
                    } else if (i == 4) {
                        airconSet = Integer.parseInt(arr[i]);
                    } else if (i == 5) {
                        temperature = Double.parseDouble(arr[i]);
                    }
                    for (int j = 0; j < size; j++) {
                        System.out.println("in for j");
                        roomSensors[j] = new RoomSensor(isOnOrOff, lightSwitch, movement, airconSet, temperature);
                        System.out.println(roomSensors[j].getRoomTemperature());
                    }
                }

                inString = reader.readLine();
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return roomSensors;
    }
}
