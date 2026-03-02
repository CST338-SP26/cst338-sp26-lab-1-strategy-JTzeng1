import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHp;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHp,Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;

    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Monster monster)) return false;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHp, monster.maxHp) && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, items);
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHp;
    }

//    @Override
//    public String toString() {
//        return "Monster{" +
//                "hp=" + hp +
//                ", xp=" + xp +
//                ", maxHp=" + maxHp +
//                ", items=" + items +
//                '}';
//    }

}
