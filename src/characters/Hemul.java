package characters;

import Pressets.*;

public class Hemul extends AbstractEmotionalCharacter{

    public Hemul(String name){
        super(name);
    }

    public void lookAround(){
        System.out.println(this.name + " " + this.setter.getType(this) + " поглядел на своих друзей");
    }
}
