package oops;

interface TVremote {
	public void volume();
	public void nextbutton();
	public void switchoff();
	}
interface smartTvremote extends TVremote {
	public void netflix();
	public void youtube();
	public void amazoneprime();
}

class TV implements smartTvremote
{


@Override
public void volume() {
	System.out.println("High Volume");
	
}

@Override
public void nextbutton() {
	System.out.println("Buttons");
	
}

@Override
public void switchoff() {
	System.out.println("SwitchON");
	
}

@Override
public void netflix() {
	System.out.println("Amazone");
	
}

@Override
public void youtube() {
	System.out.println("High Quality");
	
}

@Override
public void amazoneprime() {
	System.out.println("Chanels");
	
}
}
public class InterfaceTaskPblm {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.amazoneprime();
		ob.youtube();
		ob.netflix();
		ob.switchoff();
		ob.nextbutton();
		ob.volume();
		
		
	}
}
	
