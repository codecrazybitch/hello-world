package com.codeinterview;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Restaurant {
    public ArrayList<String> foodTypes;

    public Restaurant() {
        foodTypes = new ArrayList<>();
        foodTypes.add("Noodle");
        foodTypes.add("Fish");
        foodTypes.add("刀削面");
        foodTypes.add("重庆小面");
    }

    public void printMenu() {
        System.out.println("Menu: ");
        for (String foodType : foodTypes) {
            System.out.println(foodType);
        }
        System.out.print("What do you want: ");
    }

    public Food buy() throws Exception {
        // Print menu for customer.
        printMenu();

        Scanner console = new Scanner(System.in);
        // Choose food
        String name = console.next();

        if (foodTypes.contains(name)) {
            switch (name.toUpperCase()) {
                case "NOODLE":
                    Noodle noodle = new Noodle(25.0);

                    // Process length
                    System.out.print("Please input length: ");
                    String length = console.next();
                    noodle.setLength(Integer.parseInt(length));

                    // Process type
                    String noodleTypes = NoodleType.types.stream()
                            .map(NoodleType::getName)
                            .collect(Collectors.joining(", "));
                    System.out.printf("Please select type between %s: ", noodleTypes);
                    String noodleTypeInStr = console.next();
                    NoodleType noodleType = null;
                    for (NoodleType type : NoodleType.types) {
                        if (type.getName().compareToIgnoreCase(noodleTypeInStr) == 0) {
                            noodleType = type;
                            break;
                        }
                    }

                    if (noodleType == null) {
                        throw new Exception("The noodle type is not exist.");
                    } else {
                        noodle.setType(noodleType);
                    }

                    // Deliver food
                    return noodle;
                case "FISH":
                    throw new Exception("We don't provide fish yet.");
                default:
                    throw new Exception(String.format("Sorry, we don't provide %s yet.", name));
            }
        } else {
            throw new Exception(String.format("Sorry, we don't provide %s yet.", name));
        }
    }
}
