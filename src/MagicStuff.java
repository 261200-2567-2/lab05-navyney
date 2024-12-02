public class MagicStuff {

    private static final double DefaultMagicStuffdmg = 13.0 ;
    private Character character ;
    private double stuffDmg ;
    private int level ;

    public MagicStuff(Character character) {
        this.character = character;
        this.level = 1 ;
        this.stuffDmg = DefaultMagicStuffdmg ;
    }

    public void levelUp() {
        this.level++;
        System.out.println("Sword level up -> " + this.level);
        this.stuffDmg  = this.DefaultMagicStuffdmg * (1 + 0.17 * level);
    }

    public double getDamage() {
        return this.stuffDmg  ;
    }

    public void equip() {
        Status status = character.getStatus() ;
        status.increaseDamage(this.stuffDmg ) ;
        System.out.println(character.getName() + " unequipped a magic stuff and Damage increased by " + this.stuffDmg ) ;
    }

    public void unequip() {
        Status status = character.getStatus() ;
        status.increaseDamage(-this.stuffDmg ) ;
        System.out.println(character.getName() + " unequipped a magic stuff and Damage decreased by " + this.stuffDmg ) ;
    }
}
