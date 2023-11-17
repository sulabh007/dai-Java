import java.io.*;


class Laptop implements Serializable
{
	private int lid;
	private String make;
	private double cost;

	Laptop(int lid, String make, double cost) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "]";
	}
	
}
public class FileHandlingDemo {

	public static void main(String[] args) {
		File file=new File("xyz.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Laptop(101,"hp",34000));
			oos.writeObject(new Laptop(102,"lenovo",31000));
			oos.close();
			fos.close();
			System.out.println("Object is saved");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Laptop l=(Laptop)ois.readObject();
			System.out.println(l);
			Laptop l2=(Laptop)ois.readObject();
			System.out.println(l2);
			ois.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
