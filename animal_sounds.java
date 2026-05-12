class animal_sounds {
    public static void main(String[] args){
        
        Animal animal = new Animal();
        animal.sound();
        
        Dog dog = new Dog();
        dog.sound();
        
        Cat cat = new Cat();
        cat.sound();
        
        Lion lion = new Lion();
        lion.sound();
        
    }
}

class Animal{
    void sound(){
        System.out.println("Some sound!");
    }
}

class Dog extends Animal{
    
    @Override
    void sound(){
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal{
    
    @Override 
    void sound(){
        System.out.println("Meow Meow!");
    }
}

class Lion extends Animal{
    
    @Override
    void sound(){
        System.out.println("Roarrr!");
    }
}
