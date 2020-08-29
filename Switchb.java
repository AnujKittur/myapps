public class Switchb{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Starting Letter of your Country");
	char letter=sc.next().charAt(0);
	switch(letter)
	{
		case 'i':
		System.out.println("INDIA");
		break;
		case 's':
		System.out.println("Sweden);
		break;
		case'd':
		System.of.println("Denmark");
		case'g':
		System.out.println("Germany");
		break;
		default:System.out.println("Different Country from our Registry");
		}
	}
}