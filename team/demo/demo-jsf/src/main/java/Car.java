/**
 * Created by linhtran on 25/07/17.
 */
public class Car {
    private  String name;
    private  double weight;
    private  String brand;
    private  boolean isNew;
    private  int year;
    private  String color;


    public Car(String name, String brand, int year, String color, double weight,boolean isNew) {
        this.name = name;
        this.weight = weight;
        this.brand = brand;
        this.isNew = isNew;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", isNew=" + isNew +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
