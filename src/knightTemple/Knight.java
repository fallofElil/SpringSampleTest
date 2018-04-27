package knightTemple;

public class Knight {
    private String weapon;

    @Override
    public String toString() {
        return "Knight{" +
                "weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                ", health=" + health +
                '}';
    }

    private String armor;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;

    private Quest quest;

    public void emarkOnQuest() {
        quest.embark();
    }
}
