// VERSION 1.0.0

package RPG2;
public class Paladin extends Character {

    // Instance variables
    private String name;
    private String className;
    
    private int currentHealth;
    private int strength;
    private int defense;
    private int special;
    private int points;
    
    private int wins;
    private int losses;

    public static String classDescription = "Paladin - A well armored melee fighter who can use powerful blessings and heal themselves.\n\tPaladins have a bonus to their defense and have a one time use heal.";

    private static boolean debug = true; // Will be changed to false during official battle

    private int[] myStats = new int[5]; //    [currentHealth, strength, defense, special, points]
    private int[] oppInfo; //    [currentHealth, strength, defense, special, points]

    private boolean layHands = false;

    // Constructors
    public Paladin() {
        name = "";
        className = "";
        currentHealth = 0;
        strength = 0;
        defense = 0;
        special = 0;
        points = 0;
    }
    
    public Paladin (String name, int strength, int defense, int special, int points) {
        this.name = name;
        className = "Boring Character";
        this.currentHealth = 100;
        this.strength = strength;
        this.defense = defense;
        this.special = special;
        this.points = points;
    }

    // classDescription
    public static String getClassDescription() {
        return classDescription;
    }


    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }    

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }    

    public boolean getDebug() {
        return debug;
    }
    
    public static void setDebug(boolean onOff) {
        debug = onOff;
    }

    public int[] getMyInfo() {

        if (debug) {
            System.out.println(name + "'s stats have been given away");
        }

        return new int[] {getCurrentHealth(),getStrength(),getDefense(),getSpecial(),getPoints()};
    }

    public int[] getOppInfo() {
        return oppInfo;
    }

    public void setMyInfo(){
        myStats[0] = currentHealth;
        myStats[2] = strength;
        myStats[3] = defense;
        myStats[4] = special;
        myStats[5] = points;
    }
    
    // Other methods


    @Override
    public String toString() {
        return  "name='" + name +
                ", className=" + className +
                ", currentHealth=" + currentHealth +
                ", strength=" + strength +
                ", defense=" + defense +
                ", special=" + special +
                ", points=" + points + 
                ", wins= " + wins +
                ", losses= " + losses;
    }

    public void loadOppInfo(int[] oppStats) {

        if (debug) {
            System.out.println("Opponents stats have been received.");
        }

        oppInfo = oppStats;
    }

    public double attack() {
        int basicAttack = getStrength(); //Paladins use just their base strength for their attacks.

        return basicAttack;
    }
    
    public double defend() {
        double armor = getDefense() + getSpecial(); //Paladins are more defensive and add their special to their defense.
        return armor;
    }
    
    public void specialEffect() { //Paladins can boost their defense and gain extra health once per battle
        if (layHands = false) {
            setDefense(getDefense() + 4);
            int currentHp = getCurrentHealth();
            setCurrentHealth(currentHp + 25);
            layHands = true;
        }
    }




}






