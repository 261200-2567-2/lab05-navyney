public class Boots implements boot {
    public static final double speedIncreased = 0.50 ;
    public Character character ;

    public Boots(Character character) {
        this.character = character;
    }

    @Override
    public void wearing() {
        System.out.println(this.character.getName() + " is wearing boot");
    }

    @Override
    public void use() {
        System.out.println(this.character.getName() + " is used boot");
        sprint() ;
    }

    @Override
    public void description() {
        System.out.println("You can use boot for increase your speed 50%");
    }

    @Override
    public void sprint() {
        Status status = character.getStatus() ;
        double sp = (status.getSpeed())*speedIncreased ;
        status.increaseSpeed(sp);
        System.out.println(this.character.getName() + " increased " + sp + " speed");

    }
}
