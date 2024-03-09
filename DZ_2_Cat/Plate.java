package DZ_2_Cat;
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Сейчас в тарелке: " + food + " ед. еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
