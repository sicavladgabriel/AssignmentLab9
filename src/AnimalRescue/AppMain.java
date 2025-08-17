package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Dog Stavros = new Dog();
        System.out.println("The name of the dog is: "+ Stavros.name);

        System.out.println("The age of the dog is: "+Stavros.age +" "+"years");

        System.out.println("The breed of the dog is: "+Stavros.breed);

        System.out.println("The favourite recreation type of the dog is: "+Stavros.favouriteRecreationType);

        System.out.println("The happiness level of the dog is: "+Stavros.happinessLevel);


       Stavros.eat();

       Stavros.bark();

       Stavros.run();

       Stavros.sleep();



       AnimalAdopter Juan = new AnimalAdopter();
        System.out.println("The animal adopter name is; "+Juan.name);

        System.out.println("The animal adopter's available money is: "+Juan.moneyAvailableBank);

        System.out.println("The age of the animal adopter is: "+Juan.age);

        Juan.drinkingCoffe();

        Juan.walk();

        Juan.drive();


        Monkey Jack = new Monkey();
        System.out.println("The monkey's breed is: "+Jack.breed);

        System.out.println("The monkey's favourite food is: "+ Jack.favouriteFood);

        System.out.println("The monkey's weight is: "+Jack.weight);

        Jack.chatter();

        Jack.jump();



        Veterinarian Dejan = new Veterinarian();
        System.out.println("The Vet's name is: "+Dejan.name);

        System.out.println("The Vet's specialization is: "+Dejan.specialization);

        Dejan.consulting();
        Dejan.giveInjection();



        AnimalFood Bisciotti = new AnimalFood();
        System.out.println("The price of the food is: "+Bisciotti.price);

        System.out.println("The remaining quantity of the food is: "+Bisciotti.quantity);

        System.out.println("The name of the animal food is: "+Bisciotti.name);


        RecreationType Fun = new RecreationType();
        System.out.println("Stavros's favourite thing is to: "+Fun.sixth);

        System.out.println("Jacks favourite thing to do is: "+Fun.third);




    }}
