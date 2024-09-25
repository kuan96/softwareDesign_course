package Homework1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		Sheep mySheep = new Sheep();
		PrintSound mySound = new PrintSound();
		
		mySound.print(myDog);
		mySound.print(myCat);
		mySound.print(mySheep);
	}

}
