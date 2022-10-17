package Game;

public class Character {


    private String charName, lastName, houseName, charGender, Job;
    private double attackPoint, charHealth;
    private int persuasion, charLevel;

    Character(){
        setCharName("None");
        setLastName("None");
        setCharGender("None");
        setHouseName("None");
        attackPoint=10;
        setPersuasion(0);
        setJob("None");
        setCharHealth(0);
        setCharLevel(0);


    }

    Character(String charName, String lastName, String charGender,String houseName,int persuasion,String job,double charHealth, int charLevel ){
        setCharName(charName);
        setLastName(lastName);
        setCharGender(charGender);
        setHouseName(houseName);
        attackPoint=10;
        setPersuasion(persuasion);
        setJob(job);
        setCharHealth(charHealth);
        setCharLevel(charLevel);
    }



    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAttackPoint(double attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getCharName() {
        return charName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCharHealth(double charHealth) {
        this.charHealth = charHealth;
    }

    public double getCharHealth() {
        return charHealth;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setCharGender(String charGender) {
        this.charGender = charGender;
    }

    public String getCharGender() {
        return charGender;

    }

    public void setCharLevel(int charLevel) {
        this.charLevel = charLevel;
    }

    public int getCharLevel() {
        return charLevel;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getJob() {
        return Job;
    }


    public double calculateDamage() {

        return attackPoint*charLevel;
    }

    public double criticalHit(){
        return calculateDamage()*2;
    }


    public void CharacterInfo(){
        System.out.println();

        System.out.println("          *** CHARACTER'S INFO ***");
        System.out.println("NAME, LAST NAME   : " + getCharName()+ " "+getLastName());
        System.out.println("HOUSE NAME        : " + getHouseName());
        System.out.println("GENDER            : " + getCharGender());
        System.out.println("CLASS             : " + getJob());
        System.out.println("PERSUASION LEVEL  : " + getPersuasion());
        System.out.println("HEALTH            : " + getCharHealth()+"/"+ (getCharLevel()*100));
        System.out.println("ATTACK DAMAGE     : " + getAttackPoint());
        System.out.println("LEVEL             : " + getCharLevel());

    }







}


