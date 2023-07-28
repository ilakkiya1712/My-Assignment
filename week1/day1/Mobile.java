package week1.day1;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel="Realmi 10i";
		Float mobileWeight= 55.5f ; //IT's specified in grams
			
		System.out.println("     Mobile model Name is:"+ mobileModel);		
		System.out.println("     Mobileweight is:"+mobileWeight +"\n");
		
		
	}
	
	public void sendMsg() {
		
		boolean isFullyCharged = false;
		int mobileCost= 10000;
		System.out.println("     Is it fullycharged:"+isFullyCharged);
		System.out.println("     Mobile cost is (in Rupees):"+mobileCost+"\n");
		System.out.println("-----End-----");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classname objectname= new classname() - to call the method by creating the obj for the class
		System.out.println("---- Assignment 2 _ Calling methods------"+"\n");
           Mobile mob=new Mobile();
           mob.makeCall();
           mob.sendMsg();

	}

}
