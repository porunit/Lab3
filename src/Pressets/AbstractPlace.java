package Pressets;

public abstract class AbstractPlace{
    protected String name;

    public AbstractPlace(String name){
        this.name = name;
        System.out.println("Мы находимся в " + this.name);
    }
    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode();
    }
    @Override
    public String toString(){
        return "Местонахождение: " + this.name;
    }
    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
