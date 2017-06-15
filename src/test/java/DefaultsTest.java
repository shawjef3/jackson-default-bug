import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultsTest {

    @Test
    public void test() throws Exception {
        Defaults v = new Defaults();

        String actual = new ObjectMapper().writeValueAsString(v);

        String expected = "{}";

        Assert.assertEquals(actual, expected);
    }

}
