package com.nmuzychuk;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void testSingleton() throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            Future<Singleton> result = service.submit(Singleton::getInstance);
            assertSame(Singleton.getInstance(), result.get());
        }
    }

}
