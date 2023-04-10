/*1. WAP to find the duplicates present in an array.
2. WAP to sort an array using Quick Sort Algorithm.
3. WAP to sort an array using Bubble Sort Algorithm.
4. WAP to sort an array using Merge Sort Algorithm.
5. WAP to sort an array using Selection Sort Algorithm.
6. WAP to check whether an array is a subset of another array.*/


package AccessSpecifiers;

class loans{
	final int age=4;
	void add()
	{
		
	}
	
}
class personalloan extends loans{
	int age=45;
	void add()
	{
		System.out.println(age);
		age=super.age;
		System.out.println(age);
	}
	
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personalloan pl=new personalloan();
		pl.add();
	}

}
