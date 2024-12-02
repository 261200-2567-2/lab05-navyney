public class Status {

    private int level ;
    private double hp ;
    private double maxHp ;
    private double mana ;
    private double maxMana ;
    private double speed ;
    private double damage ;
    private double defense ;

    private static final double DefaultHP = 50 ;
    private static final double DefaultSpeed = 5 ;
    private static final double DefaultMana = 50 ;
    private static final double DefaultDamage = 15 ;


    public Status() {
        this.maxHp = DefaultHP ;
        this.maxMana = DefaultMana ;
        this.speed = DefaultSpeed ;
        this.hp = this.maxHp ;
        this.mana = this.maxMana ;
        this.level = 1 ;
        this.damage = DefaultDamage ;
        this.defense = 0 ;
    }
    
    public void levelUp() {
        this.level++ ;
        this.maxHp = 100+10*this.level ;
        this.hp = this.maxHp ;
        this.maxMana = 50+2*this.level ;
        this.mana = this.maxMana ;
        this.speed = (DefaultSpeed * (1.5*this.level)) ;
        this.damage = DefaultDamage * (1.2*this.level) ;
        this.defense *= (1+0.75*this.level)  ;
    }

    public void increaseMaxHp(double health) {
        this.maxHp += health ;
        this.hp = this.maxHp ;
    }

    public void increaseHp(double heal) {
        this.hp += heal ;
    }

    public void reduceHp(double amount) {
        this.hp -= amount;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void increaseMaxMana(double m) {
        this.maxMana += m ;
        this.mana = this.maxMana ;
    }

    public void increaseMana(double mn) {
        this.mana += mn ;
    }

    public void increaseSpeed(double sd) {
        this.speed += sd ;
    }

    public void decreaseSpeed(double sd) {
        this.speed -= sd ;
    }

    public void increaseDamage(double dmg) {
        this.damage += dmg ;
    }

    public void increaseDefense(double def) {
        this.defense += def ;
    }

    public double getSpeed() {
        return this.speed ;
    }

    public double getCurrentHp() {
        return this.hp ;
    }

    public double getMaxHp() {
        return this.maxHp ;
    }

    public double getDamage() {
        return this.damage ;
    }

    public void printStatus() {
        System.out.println("Level: " + this.level) ;
        System.out.println("Max HP: " + this.maxHp) ;
        System.out.println("HP: " + this.hp) ;
        System.out.println("Max Mana: " + this.maxMana) ;
        System.out.println("Mana: " + this.mana) ;
        System.out.println("Speed: " + getSpeed()) ;
        System.out.println("Damage: " + this.damage) ;
        System.out.println("Defense: " + this.defense) ;
    }

}
