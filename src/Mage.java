public class Mage extends Character {


    public Mage() {

    }

    public Mage(String charName, String lastName, String charGender, String houseName, int persuasion, String job, double charHealth, int charLevel) {
        super(charName, lastName, charGender,houseName, persuasion, job, charHealth, charLevel);


    }

    @Override
    public void CharacterInfo() {
        super.CharacterInfo();
    }

    @Override
    public double calculateDamage() {
        return super.calculateDamage()*0.8;
    }



}
