package javaCodes.ClassworkCodes;

public class Animal {

        private String name;
        private int size;
        private int weight;

        public Animal(String name, int size, int weight) {
            this.name = name;
            this.size = size;
            this.weight = weight;
        }

        public void eat() {
            System.out.println("Eat from Parent class is called (ANIMAL)");
        }

        public void move(int speed){
            System.out.println("Animal is moving at speed: " + speed);
        }

        public String getName() {
            return name;
        }

        public void animalDetails() {
            System.out.println("The name of the animal is: " + name);
            System.out.println("The weight of the animal is: " + weight);
            System.out.println("The size of the animal is: " + size);
        }
}