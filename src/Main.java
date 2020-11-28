public class Main {
    public static void main(String[] args){

        System.out.print("This is a very true story about animals life. Try not to cry!");

        Animal cat = new Mammals("Кошка", "Cat", 4, true);
        cat.born();
        ((Mammals) cat).makeSound();
        cat.eat();
        cat.sleep();
        cat.move();
        ((Mammals) cat).findFood();
        cat.createOffspring();

        System.out.println("\n -----------------------------------------------------------------\n");

        Animal woodpecker = new Birds("Дятел", true, true, false);
        woodpecker.born();
        woodpecker.eat();
        woodpecker.sleep();
        woodpecker.move();
        ((Birds) woodpecker).sing();
        woodpecker.createOffspring();
        ((Birds) woodpecker).migrate();
    }
}
