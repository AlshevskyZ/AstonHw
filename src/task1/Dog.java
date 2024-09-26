package task1;

class Dog extends Animal
{
    static final int maxRunDistance = 500;
    static final int maxSwimDistance = 10;
    static int dogCounter;
    public Dog(String name) {
        super(name);
        dogCounter++;
    }
    @Override
    void run(int distance) {
        if(distance<=maxRunDistance && distance>0) {
            System.out.println("Собака " + this.name + " пробежала " + distance + " метров");
        }
        else {
            System.out.println("Собаки столько не бегают)");
        }
    }
    @Override
    void swim(int distance) {
        if(distance<=maxSwimDistance && distance>0) {
            System.out.println("Собака " + this.name + " проплыла " + distance + " метров");
        }
        else {
            System.out.println("Собаки столько не плавают)");
        }
    }
}
