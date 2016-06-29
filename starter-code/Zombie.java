/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    public Zombie() {
        super();
    }

//    public int sethealthtimestwo(){
//        int a = getMhealth() * 2;
//        return a;
//    }

    @Override
    public String aboutMe() {
        System.out.println("Your health is " + getMhealth());
        System.out.println("Your damage is " + getMdamage());
        return "";
    }
}
