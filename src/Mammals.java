import java.awt.desktop.SystemEventListener;

public class Mammals extends Animal{
    protected String name;
    protected String family;
    protected int limbsNumber;
    protected boolean isCarnivorous;

    public Mammals(String name, String family, int limbsNumber, boolean isCarnivorous){
        this.name = name;
        this.family = family;
        this.limbsNumber = limbsNumber;
        this.isCarnivorous = isCarnivorous;
    }

    public void findFood(){
        System.out.print(this.name);
        System.out.println(isCarnivorous ? " пошла на охоту" : " пошла на луг");
    }

    public void makeSound(){
        System.out.println(this.name + " подала голос");
    }

    @Override
    public void born() {
        System.out.println(this.name + " появилась из мамы!");
    }

    @Override
    public void eat() {
        System.out.print(this.name);
        System.out.println(isCarnivorous ? " съела мясо!" : " поела травы!");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " уснул(a)!");
    }

    @Override
    public void move() {
        System.out.println(this.name + " ходит по земле!");
    }

    @Override
    public void createOffspring() {
        System.out.println(this.name + " родила потомство!");
    }
}
