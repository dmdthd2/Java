package Practice;

public class LEDTv implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");

	}

	@Override
	public void CV(int v) {
		// TODO Auto-generated method stub
		System.out.println("볼륨조절");

	}

	@Override
	public void CC(int c) {
		// TODO Auto-generated method stub
		System.out.println("채널지정");

	}

}
