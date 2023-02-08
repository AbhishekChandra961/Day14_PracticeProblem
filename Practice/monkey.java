package Practice;

class monkey1 {
	void jump() {
		System.out.println("jumping");
	}
	void bite() {
		System.out.println("biting");
	}
}
interface basicAnimal{
	void eat();
	void sleep();
}
class human extends monkey1 implements basicAnimal{
	void speak() {
		System.out.println("hello");
	}
	@Override
	public void eat() {
		System.out.println("eating");
		
	}
	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}
}
public class monkey{
	public static void main(String[] args) {
		human obj=new human();
		obj.sleep();
		
		monkey1 obj1=new human();
		obj1.jump();
		obj1.bite();
		basicAnimal obj2=new human();
		obj2.eat();
		obj2.sleep();
	}
} 

