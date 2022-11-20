package characters;

import Pressets.AbstractEmotionalCharacter;

public class Hedgehog extends AbstractEmotionalCharacter {

    public Hedgehog(String name) {
        super(name);
    }

    public void goDown(){
        System.out.println(this.name + " " + this.setter.getType(this) + " прошествовал к выходу и спустился с крыльца");
    }
}
