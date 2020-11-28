public class Birds extends Animal {
    protected String name;
    protected boolean canFly;
    protected boolean isWild;
    protected boolean isMigratory;

    public Birds(String name, boolean canFly, boolean isWild, boolean isMigratory){
        this.name = name;
        this.canFly = canFly;
        this.isWild = isWild;
        this.isMigratory = isMigratory;
    }

    public void migrate(){
        System.out.println(isMigratory ? "Пора валить отсюда!" : "Никуда эта птица отсюда не улетит!");
    }

    public void sing(){
        System.out.println(this.name + " запел(а)!");
    }

    @Override
    public void born() {
        System.out.println(this.name + " вылупился из яйца!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " съел(а) червя");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " уснул(а)!");
    }

    @Override
    public void move() {
        System.out.print(this.name);
        System.out.println(canFly ? " полетела!" : " пошел по земле!");
    }

    @Override
    public void createOffspring() {
        System.out.println(this.name + " отложил(а) яйцо!");
    }


}
