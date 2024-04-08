package task1;

class Plate
{
    private int foodAmount;
    public Plate(int foodAmount){
        this.foodAmount=foodAmount;
    }
    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.println("В миску добавили " + amount + " единиц корма. Всего: " + this.foodAmount);
    }
    public boolean canTakeFood(int amount)
    {
        if(amount<=this.foodAmount){
            this.foodAmount -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}
