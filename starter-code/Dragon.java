/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{

    public Dragon(int health, int damage){
        super(health,damage);
    }

    public Dragon(){
        super();
    }

    @Override
    public String aboutMe() {
        System.out.println("Your health is " + getMhealth());
        System.out.println("Your damage is " + getMdamage());
    return "";
    }
}
