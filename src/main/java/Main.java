public class Main {
    public static void main(String args[]) {

            Home home = new Home();
            home.makeAllSounds();
            Dog dog1 = new Dog(); //This is dog 1 instance
            home.AdoptPet(dog1);
            Dog dog2 = new Dog();  //This is dog 2
            home.AdoptPet(dog2);
            Cat cat1 = new Cat(); //This is Cat 1
            home.AdoptPet(cat1);
            home.makeAllSounds();

            //dog1.setName("Stormy");
            //System.out.println(dog1.getName());
    }
}

