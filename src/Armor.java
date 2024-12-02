public class Armor {

    private static final int DefaultDefense = 20 ;
    private Character character ;
    private int level ;
    private double defense ;
    private double speedPnlt ;
    private Status status ;

    public Armor(Character character) {
        this.character = character ;
        this.level = 1 ;
        this.defense = DefaultDefense ;
    }

    public double getDefense() {
        return this.defense ;
    }

    public double getSpeedPenalty() {
        return this.speedPnlt ;
    }

    public void levelUp() {
        this.level++ ;
        System.out.println("Sword level up -> " + this.level) ;
        this.defense = this.DefaultDefense*(1+0.7*level)  ;
        status.decreaseSpeed(this.speedPnlt) ;
    }

    public void equip() {
        Status status = character.getStatus() ;
        status.increaseDefense(this.defense) ;
        System.out.println(character.getName() + " unequipped a armor and Defense increased by " + this.defense ) ;
    }

    public void unequip() {
        Status status = character.getStatus() ;
        status.increaseDefense(-this.defense) ;
        System.out.println(character.getName() + " unequipped a armor and Damage decreased by " + this.defense  ) ;
    }

}
