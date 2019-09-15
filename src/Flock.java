import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    private ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        boolean isFirst = true;

        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            if (isFirst) {
                quacker.quack();
                quacker.quack();
                isFirst = false;
            }
            quacker.quack();
        }
    }
}
