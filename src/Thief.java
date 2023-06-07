public class Thief  extends Character {

    Thief(){

    }

    public Thief(String charName, String lastName, String charGender, String houseName, double attackPoint, int persuasion, String job, double charHealth, int charLevel) {
        super(charName, lastName, charGender, houseName, persuasion,job, charHealth, charLevel);

    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage();
    }
}


