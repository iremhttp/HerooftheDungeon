package Game;

public class Weapon {

    private double weaponAttackPoint, weaponValue;
    private String weaponName, weaponType;
    boolean usabilityWeapon;

    Weapon() {
        setWeaponName("None");
        setWeaponAttackPoint(0);
        setWeaponType("None");
        setWeaponValue(0);
        setUsabilityWeapon(false);
    }

    Weapon (String weaponName, String weaponType, double weaponAttackPoint, double weaponValue, boolean usabilityWeapon){
        setWeaponName(weaponName);
        setWeaponType(weaponType);
        setWeaponAttackPoint(weaponAttackPoint);
        setWeaponValue(weaponValue);
        setUsabilityWeapon(usabilityWeapon);
    }

    public void setUsabilityWeapon(boolean usability) {
        this.usabilityWeapon = usability;
    }

    public boolean getUsabilityWeapon() {
        return usabilityWeapon;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setWeaponAttackPoint(double weaponAttackPoint) {
        this.weaponAttackPoint = weaponAttackPoint;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponValue(double weaponValue) {
        this.weaponValue = weaponValue;
    }

    public double getWeaponValue() {
        return weaponValue;
    }

    public double getWeaponAttackPoint() {
        return weaponAttackPoint;
    }


    public void WeaponInfo(){
        System.out.println("          *** WEAPON INFO ***");
        System.out.println("WEAPON NAME         : " + getWeaponName());
        System.out.println("WEAPON TYPE         : " + getWeaponType());
        System.out.println("WEAPON ATTACK       : " + getWeaponAttackPoint());
        System.out.println("WEAPON VALUE        : " + getWeaponValue());
        System.out.println("USABILITY           : " + getUsabilityWeapon());

    }



}
