public class Flowerr implements flower {
    public static final double healPercentage = 0.10 ;
    public Character character ;

    public Flowerr(Character character) {
        this.character = character;
    }

    @Override
    public void wearing() {
        System.out.println(this.character.getName() + " is wearing flower");
    }

    @Override
    public void use() {
        System.out.println(this.character.getName() + " is used flower");
        heal() ;
    }

    @Override
    public void description() {
        System.out.println("You can use flower for healing you 10% of your current hp");
    }

    @Override
    public void heal() {
        Status status = character.getStatus() ;
        double healAmount = (status.getMaxHp())*healPercentage ;
        status.increaseHp(healAmount) ;
        System.out.println(this.character.getName() + " healed " + healAmount);

    }
}
