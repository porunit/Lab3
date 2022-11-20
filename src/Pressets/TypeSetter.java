package Pressets;

public class TypeSetter implements Typer{

    public TypeSetter(){}
    @Override
    public void setType(Sentiments sentiment, AbstractEmotionalCharacter character){
        character.sentiment = sentiment;
    }
    @Override
    public String getType(AbstractEmotionalCharacter character){
        if (character.sentiment != null) {
            switch (character.sentiment) {
                case Surpsized -> {
                    return "Удивленный";
                }
                case Ceremonial -> {
                    return "Торжествующий";
                }
            }
        }
        return  "Cпокойный";
    }
}
