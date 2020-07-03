// VERSION 1.0.0

package RPG2;
public class Warlock extends Character {

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

    private static String classDescription = "Warlock - A powerful spell caster that is able to leach life from their foes.\n\tWarlocks gain health equal to 1/3rd of the damage dealt from each successful attack.";

    private static boolean debug = true; // Will be changed to false during official battle

    private int[] myStats = new int[5]; //    [currentHealth, strength, defense, special, points]
    private int[] oppInfo; //    [currentHealth, strength, defense, special, points]

    // Constructors
    public Warlock() {
        name = "";
        className = "";
        currentHealth = 0;
        strength = 0;
        defense = 0;
        special = 0;
        points = 0;
    }
    
    public Warlock (String name, int strength, int defense, int special, int points) {
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
        double basicAttack = (Math.random() * 6 + (strength + 1));
        //double leach = (basicAttack / 3);
        //double currentHP = getCurrentHealth();
        //setCurrentHealth(cuttentHP + leach);

        return basicAttack;
    }
    
    public double defend() {
        double armor = getDefense() - 2;
        return armor;
    }
    
    public void specialEffect() {
        System.out.println(name + "  implements SPECIAL!");
    }




}






