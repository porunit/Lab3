package characters;

import Pressets.AbstractCharacter;
import Pressets.LaughAble;

public class Others extends AbstractCharacter implements LaughAble {
    public Others(String name){
        super(name);
    }
    @Override
    public void laugh(){
        System.out.println(name + " смеялись, буквально ревели и катались от радости под столом");
    }
}
