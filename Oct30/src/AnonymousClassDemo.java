interface A
{
	public void show();
}
 class AnonymousClassDemo {

	public static void main(String[] args) {
		A a=new A() {
			public void show() {
				System.out.println("this is inner class demo..");
			}
		};
		a.show();

	}

}
