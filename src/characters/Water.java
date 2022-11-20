package characters;

import Pressets.AbstractCharacter;
import Pressets.Liquid;

public class Water extends AbstractCharacter implements Liquid {

    public Water(String name){
        super(name);
    }
    @Override
    public void pour() {
        System.out.println(this.name + " перестала лить из шляпы и растеклась по полу веранды");
    }
}
