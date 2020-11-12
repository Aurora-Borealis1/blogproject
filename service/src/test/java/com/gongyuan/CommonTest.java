package com.gongyuan;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.ByteProcessor;
import org.junit.Test;

/**
 * @author Tww
 * @date 2020/11/9 10:21
 */
public class CommonTest {
    @Test
    public void test01(){
        ByteBuf byteBuf = Unpooled.buffer(1,200);
        byteBuf.writeByte(1);
        byteBuf.writeByte(1);
        byteBuf.writeByte(1);
        byteBuf.writeByte(1);
        System.out.println(byteBuf.readableBytes());
        byteBuf.forEachByte(ByteProcessor.FIND_LF);
    }
}
