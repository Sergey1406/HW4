public class Animal {
    private int NumOfAnimals = 0;
    public int NumOfCats = 0;
    public int NumOfDogs = 0;

    public Animal() {
        NumOfAnimals++;
    }

    public void run(int distance) {
        System.out.println(" біжить" + " " + distance + " " + "м");
    }

    public void swim(int distance) {
        System.out.println(distance);
    }


    public static void main(String[] args) {


    }
}

