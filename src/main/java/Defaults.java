import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Defaults {

    private static Object DEFAULT = new Object();

    private int i = 1;

    private int i0 = 0;

    private short s = 1;

    private Object o = DEFAULT;

    @JsonProperty("i")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT) //doesn't work
    public int getI() {
        return i;
    }

    @JsonProperty("i0")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT) //works, because the default happens to be 0
    public int getI0() {
        return i0;
    }

    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT) //doesn't work, maybe doesn't work for all primitives
    public short getS() {
        return s;
    }

    @JsonProperty("o")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT) //works
    public void getO(Object o) {
        this.o = o;
    }

}
