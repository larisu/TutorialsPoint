package ObjectsAndClasses;

public class Puppy {
	int puppyAge;
	
	public Puppy(String name){
		System.out.println("Name is " + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Age is " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("Tommy");
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		
		System.out.println("Variable: " + myPuppy.puppyAge);
	}

}
