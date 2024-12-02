public class Circlett implements circlet {
    public static final double buff = 0.25 ;
    public Character character ;

    public Circlett(Character character) {
        this.character = character;
    }

    @Override
    public void wearing() {
        System.out.println(this.character.getName() + " is wearing circlet");
    }

    @Override
    public void use() {
        System.out.println(this.character.getName() + " is used circlet");
        buffDMG() ;
    }

    @Override
    public void description() {
        System.out.println("You can use circlet for increase your damage 25%");
    }

    @Override
    public void buffDMG() {
        Status status = character.getStatus() ;
        double buffdmg = (status.getDamage())*buff ;
        status.increaseDamage(buffdmg) ;
        System.out.println(this.character.getName() + " increased " + buffdmg + " damage");

    }
}
