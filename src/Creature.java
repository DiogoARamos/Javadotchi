/**
 * Created by k1763917 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;
    public Creature(String name) {
        energy=15;
        fullness=15;
        happiness=15;
        this.name=name;

    }
    public void eat(){
        if (fullness >=13) {
            System.out.println("whoops" +getName() + "is already full.");
        }
        fullness += 8;
        energy -= 4;
        happiness-=6;
        if(fullness>15) {
            fullness = 15;
        }

    }
    public void play() {
        if (happiness >=13) {
            System.out.println(getName() + "is not that bored.");
        }
        happiness += 8;
        fullness -= 4;
        energy-= 6;
        if(happiness>15) {
            happiness = 15;
        }

    }
    public void sleep() {
        if (energy >=13) {
            System.out.println("whoops" + getName() + "is not that sleepy.");
        }
        energy += 8;
        fullness -= 5;
        happiness-= 5;
        if(energy>15) {
            energy = 15;
        }


    }
    public String checkStatus(){
        String status = "";
        if (happiness <= 0 || energy <= 0 || fullness <= 0){
            print("Oh no!" + this.getName() + "has died.");
            System.exit(status:0);
        }
        if (happiness <=6){
            status+="oh " + this.getName() +  " is feeling sad! \n";
        }
        if (energy<=6){
            status+="oh " + this.getName() +  " is feeling sleepy! \n";
        }
        if (fullness<=6){
            status+="oh " + this.getName() +  " is feeling hungry! \n";
        }
        return status;
    }
    public String getName() {
        return name;
    }
    public void print(String s){
        System.out.println(s);
    }


}
