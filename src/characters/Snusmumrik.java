package characters;

import Pressets.AbstractCharacter;
import Pressets.LaughAble;

public class Snusmumrik extends AbstractCharacter implements LaughAble {
    public Snusmumrik(String name){
        super(name);
    }
    @Override
    public void laugh(){
        System.out.println(this.name + " расхохотался");
    }

    public void takeBreath(){
        System.out.println(this.name + " остановился перевести дух");
    }

}
