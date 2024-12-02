public class Jobb implements job {
    //private String[] NameOfJobs = { "Mage", "Archer", "Knight" };
    private String jobName ;
    private Character character ;

    public Jobb(Character character) {
        this.character = character ;
        this.jobName = "None" ;
    }

    @Override
    public boolean chooseJob(String jobname) {
        if (jobname.equalsIgnoreCase("Mage") || jobname.equalsIgnoreCase("Archer") || jobname.equalsIgnoreCase("Knight")) {
            this.jobName = jobname;
            System.out.println(character.getName() + " changed job to: " + jobname);
            return true;
        }
        return false;
    }

    @Override
    public String currentJob() {
        return this.jobName ;
    }

    @Override
    public void increaseStatus(Character character) {
        Status status = character.getStatus() ;
        if (currentJob().equals("Mage")) {
            status.increaseMaxMana(20) ;
            status.increaseDamage(10) ;
        } else if (currentJob().equals("Archer")) {
            status.increaseDamage(10) ;
            status.increaseSpeed(7) ;
        } else if (currentJob().equals("Knight")) {
            status.increaseMaxHp(30);
            status.increaseDamage(20);
            status.decreaseSpeed(2);
        }
    }

}
