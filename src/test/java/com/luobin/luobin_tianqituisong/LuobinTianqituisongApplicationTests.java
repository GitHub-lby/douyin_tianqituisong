package com.luobin.luobin_tianqituisong;

import com.luobin.controller.Pusher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LuobinTianqituisongApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void goodMorning(){
        Pusher.push();
    }
}
