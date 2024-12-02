public class Character {

    private String name ;
    private int level ;
    private Status status ;
    private Jobb jb ;
    private Bow equippedBow ;
    private Armor equippedArmor ;
    private MagicStuff equippedMagicStuff ;
    private Sword equippedSword ;
    private Flowerr flowerr ;
    private Boots boots ;
    private Circlett circlett ;

    public Character(String name) {
        this.name = name ;
        this.level = 1 ;
        this.status = new Status() ;
        this.jb = new Jobb(this) ;
    }

    public String getName() {
        return this.name;
    }

    public void levelUp() {
        this.level++ ;
        status.levelUp() ;
        System.out.println(name + " leveled up! Current Level: " + level);
    }

    public void chooseJob(String jobname) {
        if (jb.chooseJob(jobname)) {
            System.out.println("Job selected successfully.");
            this.jb.increaseStatus(this) ;
        } else {
            System.out.println("Invalid job. Please try again.");
        }
    }

    public Jobb getJob() {
        return this.jb ;
    }

//    public void updateStatus() {
//        this.jb.increaseStatus() ;
//    }

    public Status getStatus() {
        return this.status ;
    }

    public void printStatus() {
        this.status.printStatus() ;
    }

    public void equipBow() {
        if ( this.jb.currentJob().equals("Archer") ) {
            if (this.equippedBow != null) {
                System.out.println(this.name + " already equip a bow") ;
            } else {
                this.equippedBow = new Bow(this) ;
                this.equippedBow.equip() ;
            }
        } else {
            System.out.println("You are not the Archer, you cant equip a bow") ;
        }
    }

    public void unequipBow() {
        if ( this.jb.currentJob().equals("Archer") ) {
            if (this.equippedBow != null) {
                this.equippedBow.unequip() ;
                this.equippedBow = null;
            } else {
                System.out.println(this.name + " has no bow to unequipped.");
            }
        } else {
            System.out.println("You are not the Archer, you dont have a bow") ;
        }
    }

    public void levelUpBow() {
        if (this.equippedBow != null) {
            this.equippedBow.levelUp();
        } else {
            System.out.println(this.name + " does not have a bow to level up.");
        }
    }

    public void equipArmor() {
        if ( this.jb.currentJob().equals("Archer") || this.jb.currentJob().equals("Knight") ) {
            if (this.equippedArmor != null) {
                System.out.println(this.name + " already equip a armor") ;
            } else {
                this.equippedArmor = new Armor(this) ;
                this.equippedArmor.equip() ;
            }
        } else {
            System.out.println("You are not the Archer/Knight, you cant have a armor") ;
        }
    }

    public void unequipArmor() {
        if ( this.jb.currentJob().equals("Archer") || this.jb.currentJob().equals("Knight") ) {
            if (this.equippedArmor != null) {
                this.equippedArmor.unequip() ;
                this.equippedArmor = null;
            } else {
                System.out.println(this.name + " has no armor to unequip") ;
            }
        } else {
            System.out.println("You are not the Archer/Knight, you dont have a armor") ;
        }
    }

    public void levelUpArmor() {
        if (this.equippedArmor != null) {
            this.equippedArmor.levelUp();
        } else {
            System.out.println(this.name + " does not have a armor to level up.");
        }
    }

    public void equipMagicStuff() {
        if ( this.jb.currentJob().equals("Mage")) {
            if (this.equippedMagicStuff != null) {
                System.out.println(this.name + " already equip a armor") ;
            } else {
                this.equippedMagicStuff = new MagicStuff(this) ;
                this.equippedMagicStuff.equip() ;
            }
        } else {
            System.out.println("You are not the Mage, you cant have a magic stuff") ;
        }
    }

    public void unequipMagicStuff() {
        if ( this.jb.currentJob().equals("Mage")) {
            if (this.equippedMagicStuff != null) {
                this.equippedMagicStuff.unequip() ;
                this.equippedMagicStuff = null;
            } else {
                System.out.println(this.name + " has no magic stuff to unequip") ;
            }
        } else {
            System.out.println("You are not the Mage, you dont have a magic stuff") ;
        }
    }

    public void levelUpMagicStuff() {
        if (this.equippedMagicStuff != null) {
            this.equippedMagicStuff.levelUp();
        } else {
            System.out.println(this.name + " does not have a magic stuff to level up.");
        }
    }

    public void equipSword() {
        if ( this.jb.currentJob().equals("Knight")) {
            if (this.equippedSword != null) {
                System.out.println(this.name + " already equip a sword") ;
            } else {
                this.equippedSword = new Sword(this) ;
                this.equippedSword.equip() ;
            }
        } else {
            System.out.println("You are not the Knight, you cant have a sword") ;
        }
    }

    public void unequipSword() {
        if ( this.jb.currentJob().equals("Knight")) {
            if (this.equippedSword != null) {
                this.equippedSword.unequip() ;
                this.equippedSword = null;
            } else {
                System.out.println(this.name + " has no sword to unequip") ;
            }
        } else {
            System.out.println("You are not the Mage, you dont have a sword") ;
        }
    }

    public void levelUpSword() {
        if (this.equippedSword != null) {
            this.equippedSword.levelUp();
        } else {
            System.out.println(this.name + " does not have a sword to level up.");
        }
    }

    public void equipFlower() {
        if ( this.flowerr != null ) {
            System.out.println(this.name + " already equip a flower") ;
        } else {
            this.flowerr = new Flowerr(this) ;
            flowerr.wearing();
        }
    }

    public void unequipFlower() {
        if ( this.flowerr != null ) {
            this.flowerr = null ;
            System.out.println(this.name + " unequipped a flower") ;
        } else {
            System.out.println(this.name + " has no flower to unequip") ;
        }
    }

    public void useFlower() {
        if ( this.flowerr != null ) {
            this.flowerr.use() ;
        } else {
            System.out.println(this.name + " has no flower to use") ;
        }
    }

    public void equipCirclet() {
        if ( this.circlett != null ) {
            System.out.println(this.name + " already equip a circlet") ;
        } else {
            this.circlett = new Circlett(this) ;
            circlett.wearing();
        }
    }

    public void unequipCirclet() {
        if ( this.circlett != null ) {
            this.circlett = null ;
            System.out.println(this.name + " unequipped a circlet") ;
        } else {
            System.out.println(this.name + " has no circlet to unequip") ;
        }
    }

    public void useCirclet() {
        if ( this.circlett != null ) {
            this.circlett.use() ;
        } else {
            System.out.println(this.name + " has no circlet to use") ;
        }
    }

    public void equipBoot() {
        if ( this.boots != null ) {
            System.out.println(this.name + " already equip a boot") ;
        } else {
            this.boots = new Boots(this) ;
            boots.wearing();
        }
    }

    public void unequipBoot() {
        if ( this.boots != null ) {
            this.boots = null ;
            System.out.println(this.name + " unequipped a boot") ;
        } else {
            System.out.println(this.name + " has no boot to unequip") ;
        }
    }

    public void useBoot() {
        if ( this.boots != null ) {
            this.boots.use() ;
        } else {
            System.out.println(this.name + " has no boot to use") ;
        }
    }

    public void attack(Character target) {
        if (this == target) {
            System.out.println("You cannot attack yourself!");
            return;
        }

        double damage = this.status.getDamage();
        double targetHp = target.getStatus().getCurrentHp();

        if (targetHp <= 0) {
            System.out.println(target.getName() + " is already defeated!");
            return;
        }

        target.getStatus().reduceHp(damage);

        System.out.println(this.name + " attacked " + target.getName() + " for " + damage + " damage!");

        // ตรวจสอบว่าเป้าหมายยังมีชีวิตอยู่หรือไม่
        if (target.getStatus().getCurrentHp() <= 0) {
            System.out.println(target.getName() + " has been defeated!");
        } else {
            System.out.println(target.getName() + " has " + target.getStatus().getCurrentHp() + " HP left.");
        }
    }

}
