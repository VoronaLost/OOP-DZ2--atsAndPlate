package DZ_2_Cat;
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat() {
        System.out.println("Котик " + name + " кушает из тарелки " + getAppetite() + " единиц еды"); 
        this.satiety = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return this.satiety;
    }

}
