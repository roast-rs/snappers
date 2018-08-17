public class Snappers {

	static {
		System.loadLibrary("snappers");
	}

	public static native byte[] compress(byte[] input);

	public static native byte[] decompress(byte[] input);

}
