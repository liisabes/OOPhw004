package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements GameInterface, Comparable {

    protected String name;
    protected int hp, maxhp, attack, defense, speed;
    protected int[] damage;
    protected int initiative;

    protected ArrayList<BaseUnit> team;

    protected Coordinate coordinate;

    protected ArrayList <BaseUnit> enemy;

    public BaseUnit(int initiative, ArrayList<BaseUnit> team, int[] damage, String name, int hp, int maxhp, int attack, int defense, int speed, int x, int y) {
        this.team = team;
        this.damage = damage;
        this.name = name;
        this.hp = hp;
        this.maxhp = maxhp;
        if (new Random().nextBoolean()) {
            this.hp-=9;
        }
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.initiative = initiative;
        this.coordinate = new Coordinate(x, y);
    }

    public void Run() {
        System.out.println(name + " is running");
    }

    public void Walk() {
        System.out.println(name + " is walking");
    }

    public void GetDamage(int doneDamage) {
        doneDamage = (int) (doneDamage * ((100 - this.attack)/100));
        if ((this.hp - doneDamage) > 0) {
            this.hp -= doneDamage;
        }
    }

    public void Attack(BaseUnit target) {
        target.GetDamage(new Random().nextInt(this.damage[0], this.damage[1]));
    }

    public void Defense() {
        System.out.println(name + " is defending");
    }

    public void Healed(int hpPlass) {
        this.hp = hpPlass + this.hp > this.maxhp ? this.maxhp : hpPlass + this.hp;
    }

    @Override
    public int compareTo(Object o) {
        BaseUnit baseUnit = (BaseUnit)o;
        return this.initiative - baseUnit.initiative;
    }

    
}