package Pressets;

public interface Typer {
    void setType(Sentiments sentiment, AbstractEmotionalCharacter character);
    String getType(AbstractEmotionalCharacter character);
}
