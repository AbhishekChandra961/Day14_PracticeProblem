package Practice;

abstract class telephone1 {
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}
class smartTelephone extends telephone1 {
	void ring() {
		System.out.println("ring");
	}
	void lift() {
		System.out.println("lift");
	}
	void disconnect() {
		System.out.println("disconnect");
	}
}
class telephone{
	public static void main(String[] args) {
		telephone1 obj=new smartTelephone();
		obj.lift();
	}
}