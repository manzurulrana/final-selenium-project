package javaCodes.ClassworkCodes;

public class Dog extends Animal {

        private int teeth;

        public Dog(String name, int size, int weight, int teeth) {
            super(name, size, weight);
            this.teeth = teeth;
        }

        public void play() {
            System.out.println("Dog is playing");
        }

        @Override
        public void eat() {
            System.out.println("Eat from child class is called");
        }

        @Override
        public void move(int speed) {
            System.out.println("Child class move is called");
            moveLegs();
            super.move(speed);
        }

        private void moveLegs() {
            System.out.println("Local method move legs is called");
        }
}