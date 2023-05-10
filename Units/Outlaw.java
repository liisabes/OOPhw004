package Units;
import java.util.ArrayList;
import java.util.Arrays;

public class Outlaw extends Outlaws {

    public Outlaw(ArrayList<BaseUnit> team, String name, int x, int y) {
        super(7, team, new int[] {1, 3}, name, 1, 10, 10, 1, 1, 1, 1, x, y);
    }

    public String toString() {
        return "\nПреступник";
    }

    @Override
    public void step(ArrayList<BaseUnit> team1) {
        

    }

    @Override
    public String getInfo() {
        return 
        "Имя: " + name + 
        "; Damage: " + Arrays.toString(damage) +
        "; Здоровье: " + hp + 
        "; Максимальное здоровье: " + maxhp + 
        "; Кол-во атак: " + attack + 
        "; Кол-во защит: " + defense + 
        "; Скорость: " + speed + 
        "; Кол-во патронов: " + cartridge +
        "; Кол-во золота: " + gold +
        "; Initiative: " + initiative;

    }

}
