import java.util.ArrayList;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {

        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        ArrayList<Integer> monsters = new ArrayList<>();

        Dragon dragon_new = new Dragon();
        dragon_new.setMdamage(100);
        dragon_new.setMhealth(1000);
        monsters.add(dragon_new.getMdamage());
        monsters.add(dragon_new.getMhealth());

        Zombie zombie_new = new Zombie();
        zombie_new.setMhealth(100);
        zombie_new.setMdamage(20);
        monsters.add(zombie_new.getMhealth());
        monsters.add(zombie_new.getMdamage());



        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for(int i = 0; i < monsters.size()-1; i+= 3){
            System.out.println("Dragon's Data");
            System.out.println(dragon_new.aboutMe());

            System.out.println("Zombie's Data");
            System.out.println(zombie_new.aboutMe());
        }


    }
}
