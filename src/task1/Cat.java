package task1;

class Cat extends Animal
{
    static int catCounter;
    static final int maxRunDistance = 200;

    public boolean isNotHungry() {
        return notHungry;
    }

    private boolean notHungry;
    public Cat(String name) {
        super(name);
        this.notHungry = false;
        catCounter++;
    }
    @Override
    void run(int distance) {
        if(distance<=maxRunDistance && distance>0) {
            System.out.println("Кот " + this.name + " пробежал " + distance + " метров");
        }
        else {
            System.out.println("Котики столько не бегают)");
        }
    }
    @Override
    void swim(int distance) {
        System.out.println("Котики не плавают)");
    }
    void feed(Plate plate , int amount){
        if(this.notHungry==true){
            System.out.println("Я сыт!");
        }
        else{
            this.notHungry = plate.canTakeFood(25);
        }
    }
}
