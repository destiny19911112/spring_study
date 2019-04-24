import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.xiongxl.ibatis.entity.Menu;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 *
 * @author xiongxl
 * @version $Id: TestIBatis.java, v 0.1 2019-04-22 上午9:36 xiongxl Exp $$
 */
public class TestIBatis {

    @Test
    public void test() throws Exception{
        String config = "SqlMapConfig.xml";
        Reader reader = Resources.getResourceAsReader(config);
        SqlMapClient sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
        List<Menu> menuList = sqlMapClient.queryForList("getAllMenus");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }
}
