package Pressets;

public abstract class AbstractEmotionalCharacter extends AbstractCharacter{
    public Sentiments sentiment;
    public TypeSetter setter;
    public AbstractEmotionalCharacter(String name){
        super(name);
        setter = new TypeSetter();
    }

}
