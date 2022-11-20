package Pressets;

public abstract class AbstractCharacter{
    protected String name;
    public AbstractCharacter(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode();
    }

    @Override
    public String toString(){
        return "Объект: " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
