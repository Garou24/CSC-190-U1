package RPG2;

public class Warlock extends Character {

    public Warlock() {
        super();
    }

    public static String classDescription = "Warlock - A powerful spell caster that is able to leach life from their foes.\n\tWarlocks gain health equal to 1/3rd of the damage dealt from each successful attack.";

    // classDescription
    public static String getClassDescription() {
        return classDescription;
    }
    


    public double attack() {
        System.out.println(name + "  attacks!");
        return -1;
    }
}