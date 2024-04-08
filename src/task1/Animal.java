package task1;

abstract class Animal
{
    static int animalCounter;
    protected String name;
    public Animal(String name)
    {
        this.name = name;
        animalCounter++;
    }
    abstract void run(int distance);
    abstract void swim(int distance);
}
