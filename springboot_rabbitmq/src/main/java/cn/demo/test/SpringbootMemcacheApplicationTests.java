package cn.demo.test;
import com.danga.MemCached.MemCachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMemcacheApplicationTests {

    @Autowired
    private MemCachedClient memCachedClient;

    //@Test
    public void contextLoads() throws InterruptedException {
        // 放入缓存
        boolean flag = memCachedClient.set("aa", "1a");

        // 取出缓存
        Object a = memCachedClient.get("aa");
        System.out.println(a);

        // 3s后过期
        memCachedClient.set("bb", "2b", new Date(3000));
        Object b = memCachedClient.get("bb");
        System.out.println(b);

        Thread.sleep(3000);
        b = memCachedClient.get("b");
        System.out.println(b);

    }

}
