public class Sword {

    private static final double DefaultSworddmg = 15.0 ;
    private Character character ;
    private double swordDmg ;
    private int level ;

    public Sword(Character character) {
        this.character = character;
        this.level = 1 ;
        this.swordDmg = DefaultSworddmg ;
    }

    public void levelUp() {
        this.level++;
        System.out.println("Sword level up -> " + this.level);
        this.swordDmg  = this.DefaultSworddmg * (1 + 0.15 * level);
    }

    public double getDamage() {
        return this.swordDmg  ;
    }

    public void equip() {
        Status status = character.getStatus() ;
        status.increaseDamage(this.swordDmg ) ;
        System.out.println(character.getName() + " unequipped a sword and Damage increased by " + this.swordDmg ) ;
    }

    public void unequip() {
        Status status = character.getStatus() ;
        status.increaseDamage(-this.swordDmg ) ;
        System.out.println(character.getName() + " unequipped a sword and Damage decreased by " + this.swordDmg ) ;
    }
}
