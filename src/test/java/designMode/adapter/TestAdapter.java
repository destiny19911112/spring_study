package designMode.adapter;

import com.xiongxl.designMode.adapter.Adapter;
import com.xiongxl.designMode.adapter.Ps2;
import org.junit.Test;

/**
 * 测试适配器模式
 * @author xiongxl
 * @version $Id: TestAdapter.java, v 0.1 2019-02-28 下午10:53 xiongxl Exp $$
 */
public class TestAdapter {

    @Test
    public void test() {
        Ps2 ps2 = new Adapter(new com.xiongxl.designMode.adapter.Usber());
        ps2.isPs2();
    }
}
