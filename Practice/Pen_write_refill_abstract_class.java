package Practice;

 abstract class pen{
	 abstract void write();
	 abstract void refill();
 }
 class fountainPen extends pen{
	 void write() {
		 System.out.println("Write");
	 }
	 void refill() {
		 System.out.println("Refiil");
	 }
	 void changeNib() {
		 System.out.println("changeing the nib");
	 }
 }
public class Pen_write_refill_abstract_class {
	public static void main(String[] args) {
		
		fountainPen pen=new fountainPen();
		pen.changeNib();
	}
}
