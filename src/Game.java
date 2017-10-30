/**
 * Created by k1763917 on 30/10/17.
 */

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Creature creature;
    boolean userQuit = false;
    public void run(){
        startTutorial();
        while(!userQuit){
            interact();
            print(this.creature.checkStatus());

        }
        print("Aww " + this.creature.getName() + "is going to sleep :(");


    }

    private void startTutorial() {
        print("Hello, welcome to Javagotchi!");
        print("What's the name of your creature?");
        String name = scanner.nextLine();

        this.creature= new Creature(name);
        print("Great, you can now meet " + this.creature.getName() + "!");
    }
    private void interact() {
        print("what would you like to do?");
        print("1. Play");
        print("2. Eat");
        print("3. Sleep");
        print("4. Quit");

        int choice= scanner.nextInt();

        switch (choice){
            case 1: creature.play();
                break;
            case 2: creature.eat();
                break;
            case 3: creature.sleep();
                break;
            case 4: userQuit=true;
                break;
            default:
                break;

        }

    }


    public void print(String s){
        System.out.println(s);
    }
}
