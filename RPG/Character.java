// NAME: Brian Coe
// DATE: 06/24/2020
// DESC: 
package RPG;
public class Character {
    
    final static String VERSION = "2020-SU-V0.9";
    final static boolean DEBUG = true;
    
    
    private String name;
    private int hp;       // health
    private int armor;    // defense
    private int strength; // attack
    private int points;   // to divide across armor, strength, and hp
    
    // ===================== CONSTRUCTORS
    
    public Character() {
        name = "";
        hp = 0;
        armor = 0;
        strength = 0;
        points = 0;
    }
    
    public Character(String name, int hp, int armor, int strength, int points) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.strength = strength;
        this.points = points;
    }
    
    // ===================== GETTERS & SETTERS

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getArmor() {
        return armor;
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }   
    

    // ===================== OTHER METHODS
    
    public String toString() {

        String str = "";
        str += "\nName: " + name;
        str += "\nHP: " + hp;
        str += "\nArmor: " + armor;
        str += "\nStrength: " + strength;
        
        return str;
        
    }
    
    public void attack(Character enemy) {
        
        System.out.println("TESTING " + getName() + " vs " + enemy.getName()); 

        int damage = strength + (int)(Math.random() * 6 + 1);
        int enemyDefense = enemy.getArmor() + (int)(Math.random() * 6 + 1);
        
        if (DEBUG) {
            System.out.println("\n========================");
            System.out.println("My damage to inflict is: " + damage);
            System.out.println("Their armor is: " + enemyDefense);
            System.out.println("\n========================");
        }

        if ((damage) > enemyDefense) {
            
            if (DEBUG) {
                System.out.println("\n========================");
                System.out.println("My HP: " + hp);
                System.out.println("My Strength: " + strength);
                System.out.println("My Armor: " + armor);
                System.out.println("");
                System.out.println("Their HP: " + enemy.getHp());
                System.out.println("Their Strength: " + enemy.getStrength());
                System.out.println("Their Armor: " + enemy.getArmor());
                System.out.println("========================\n\n");            
            }            
            
            enemy.setHp(enemy.getHp() - damage);
            
        } else {
            
            hp--;
            
        }

    }
    
    
    
}


























