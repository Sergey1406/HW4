public class Dog extends Animal {

    public Dog() {
        NumOfDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500)
            distance = 500;

        System.out.println("Собачка біжить" + " " + distance + " " + "м");
    }

    @Override
    public void swim(int distance) {
        if (distance > 10)
            distance = 10;

        System.out.println("Собачка пливе" + " " + distance + " " + "м");
    }

    public static void main(String[] args) {

    }
}
