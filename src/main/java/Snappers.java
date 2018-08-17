public class Snappers {

	static {
		System.loadLibrary("snappers");
	}

	public static native byte[] compress(byte[] input);

}
