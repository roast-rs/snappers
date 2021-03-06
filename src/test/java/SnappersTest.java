import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.nio.charset.Charset;

import org.iq80.snappy.Snappy;

public class SnappersTest {

    @Test
    public void verifySmallJson() {
        byte[] input = "{\"hello\": \"world\"}".getBytes(Charset.forName("UTF-8"));
        byte[] expected = Snappy.compress(input);
        byte[] actual = Snappers.compress(input);
        assertArrayEquals(expected, actual);

        byte[] decoded = Snappers.decompress(expected);
        assertArrayEquals(decoded, input);
    }

}
