package com.timbuchalka;

import java.io.*;
import java.util.*;

public class Locations {

    public static Map<Integer, Location> locations = new HashMap();

    static {

        Scanner scanner = null;

        // Read locations
        try {
            scanner = new Scanner(new FileReader("locations_big.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                locations.put(loc, new Location(loc, description));
            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }

        // Now read the exits
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}
