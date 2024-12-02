public class Bow {

    private static final double DefaultBowdmg = 10.0 ;
    private Character character ;
    private double bowdmg ;
    private int level ;

    public Bow(Character character) {
        this.character = character;
        this.level = 1 ;
        this.bowdmg = DefaultBowdmg ;
    }

    public void levelUp() {
        this.level++;
        System.out.println("Sword level up -> " + this.level);
        this.bowdmg = this.DefaultBowdmg * (1 + 0.1 * level);
    }

    public double getDamage() {
        return this.bowdmg ;
    }

    public void equip() {
        Status status = character.getStatus() ;
        status.increaseDamage(this.bowdmg) ;
        System.out.println(character.getName() + " unequipped a bow and Damage increased by " + this.bowdmg) ;
    }

    public void unequip() {
        Status status = character.getStatus() ;
        status.increaseDamage(-this.bowdmg) ;
        System.out.println(character.getName() + " unequipped a bow and Damage decreased by " + this.bowdmg) ;
    }

}
