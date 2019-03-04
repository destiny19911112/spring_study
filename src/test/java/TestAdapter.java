import com.xiongxl.DesignMode.Adapter.*;
import org.junit.Test;

/**
 * @author xiongxl
 * @version $Id: TestAdapter.java, v 0.1 2019-03-01 9:35 xiongxl Exp $$
 * @desc
 */
public class TestAdapter {

    @Test
    public void test() {
        A a = new Ashili();
        a.a();
        a.b();
    }
}
