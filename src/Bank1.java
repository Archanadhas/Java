
public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		Axis a=new Axis();
		Icc i=new Icc();
		Hdfc h=new Hdfc();
		System.out.println("Sbi rate of interst is:"+s.RateOfInterest());
		System.out.println("Axis rate of interst is:"+a.RateOfInterest());
		System.out.println("Icc rate of interst is:"+i.RateOfInterest());
		System.out.println("Hdfc rate of interst is:"+h.RateOfInterest());

	}

}
