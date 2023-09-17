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


    public static void main(String[] args) {
    }
}
