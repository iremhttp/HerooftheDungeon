public class Enemy {

    private String enemyName, enemyStatus;
    private double enemyAttackPoint, enemyHealth;
    private int persuasionLimit, coinEnemy;

    Enemy(){
        setEnemyName("None");
        setEnemyHealth(0);
        setEnemyAttackPoint(0);
        setPersuasionLimit(0);
        setCoinEnemy(0);
        setEnemyStatus("None");
    }

    Enemy(String enemyName, double enemyHealth, double enemyAttackPoint, int persuasionLimit, int coinEnemy, String enemyStatus){
        setEnemyName(enemyName);
        setEnemyHealth(enemyHealth);
        setEnemyAttackPoint(enemyAttackPoint);
        setPersuasionLimit(persuasionLimit);
        setCoinEnemy(coinEnemy);
        setEnemyStatus(enemyStatus);

    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyAttackPoint(double enemyAttackPoint) {
        this.enemyAttackPoint = enemyAttackPoint;
    }

    public void setPersuasionLimit(int persuasionLimit) {
        this.persuasionLimit = persuasionLimit;
    }

    public void setCoinEnemy(int coinEnemy) {
        this.coinEnemy = coinEnemy;
    }

    public void setEnemyHealth(double enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public void setEnemyStatus(String enemyStatus) {
        this.enemyStatus = enemyStatus;
    }

    public String getEnemyStatus() {
        return enemyStatus;
    }

    public double getEnemyHealth() {
        return enemyHealth;
    }

    public int getCoinEnemy() {
        return coinEnemy;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public double getEnemyAttackPoint() {
        return enemyAttackPoint;
    }

    public int getPersuasionLimit() {
        return persuasionLimit;
    }




    public void EnemyInfo(){
        System.out.println();
        System.out.println("          *** INFO ***");
        System.out.println("NAME               : " + getEnemyName());
        System.out.println("HEALTH             : " + getEnemyHealth());
        System.out.println("ATTACK POINT       : " + getEnemyAttackPoint());
        System.out.println("PERSUASION LIMIT   : " + getPersuasionLimit());
        System.out.println("COIN               : " + getCoinEnemy());
        System.out.println("STATUS             : " + getEnemyStatus() );
    }




}
