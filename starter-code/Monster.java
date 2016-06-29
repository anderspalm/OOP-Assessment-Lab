/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 
//    private static Monster inst = null;
    private int mhealth;
    private int mdamage;

    public Monster(int health, int damage){
        mhealth = health;
        mdamage = damage;
    }

    public Monster(){
        mhealth = 0;
        mdamage = 0;
    }

    public void setMhealth(int mhealth1) {
        mhealth = mhealth1;
    }

    public int getMhealth(){
        return mhealth;
    }

    public void setMdamage(int mdamage1) {
        mdamage= mdamage1;
    }

    public int getMdamage() {
        return mdamage;
    }

    public abstract String aboutMe();
}
