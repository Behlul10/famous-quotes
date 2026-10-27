package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuoteApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Creating an array of 10 quotes
        ArrayList<String> myVar = new ArrayList<>(Arrays.asList(
                "Your time is limited, so don't waste it living someone else's life - Steve Jobs",
                "The people who are crazy enough to think they can change the world are the ones who do - Steve Jobs",
                "Simple can be harder than complex: You have to work hard to get your thinking clean to make it simple. But it's worth it in the end because once you get there, you can move mountains - Steve Jobs",
                "Imagination is more important than knowledge. For knowledge is limited, whereas imagination embraces the entire world, stimulating progress, giving birth to evolution - Albert Einstein",
                "The world as we have created it is a process of our thinking. It cannot be changed without changing our thinking - Albert Einstein",
                "The first principle is that you must not fool yourself — and you are the easiest person to fool - Richard Feynman",
                "What I cannot create, I do not understand - Richard Feynman",
                "I think I can safely say that nobody understands quantum mechanics - Richard Feynman",
                "Who you are is defined by what you're willing to struggle for - Mark Manson",
                "The desire for more positive experience is itself a negative experience. And, paradoxically, the acceptance of one's negative experience is itself a positive experience - Mark Manson"
        ));

        String userInput;
        int command;

        do {
            System.out.println("select a number between 1 and 10");
            String input = myScanner.nextLine();

            try {
                command = Integer.parseInt(input) - 1;

                if (command < 0 || command >= myVar.size()) {
                    System.out.println("Invalid range. Try again.");
                    continue; // <--- Jumps back to "select a number..."
                }

                System.out.println(myVar.get(command));

            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Please enter a number.");
                continue; // <--- Jumps back to "select a number..."
            }

            // Only reached if we successfully printed a quote
            System.out.println("Would You like to see another quote? Y/n");
            userInput = myScanner.nextLine().toLowerCase();

            if (userInput.length() > 0 && userInput.charAt(0) == 'n') {
                System.out.println("ok... Then...");
                break;
            }
        } while (true);
    }
}