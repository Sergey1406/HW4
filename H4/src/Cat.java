public class Cat extends Animal {

    public Cat() {
        NumOfCats++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200)
            distance = 200;

        System.out.println("Котик біжить" + " " + distance + " " + "м");
    }

        @Override
    public void swim(int distance) {
        System.out.println("Котик не вміє плавати");
    }


    public static void main(String[] args) {
    }
}
