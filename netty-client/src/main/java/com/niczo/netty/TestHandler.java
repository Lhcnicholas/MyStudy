package com.niczo.netty;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lhc
 */
@Slf4j
public class TestHandler extends ChannelHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
//        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello World\n".getBytes()));
        ctx.writeAndFlush("Hello, world");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        log.info((String) msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("异常结束");
        ctx.close();
    }
}
