// VERSION 2.0.6

// CHANGELOG
//  - Updated version number to match Battle.java
//  - Added constructors
//  - Added mechanism to affect 'debug' from main driver
package RPG2;
public class Character {

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

    private static boolean debug = true; // Will be changed to false during official battle

    private int[] myStats = new int[5]; //    [currentHealth, strength, defense, special, points]
    private int[] oppInfo; //    [currentHealth, strength, defense, special, points]

    // Constructors
    public Character() {
        name = "";
        className = "";
        currentHealth = 0;
        strength = 0;
        defense = 0;
        special = 0;
        points = 0;
    }
    
    public Character (String name, int strength, int defense, int special, int points) {
        this.name = name;
        className = "Boring Character";
        this.currentHealth = 100;
        this.strength = strength;
        this.defense = defense;
        this.special = special;
        this.points = points;
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
        System.out.println(name + "  attacks!");
        return -1;
    }
    
    public double defend() {
        System.out.println(name + "  defends!");
        return -1;
    }
    
    public void specialEffect() {
        System.out.println(name + "  implements SPECIAL!");
    }




}






