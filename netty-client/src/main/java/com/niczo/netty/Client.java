package com.niczo.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import lombok.extern.slf4j.Slf4j;


/**
 * @author lhc
 */
@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {
        Bootstrap bootstrap = new Bootstrap();


        try (EventLoopGroup eventLoopGroup = new NioEventLoopGroup()){
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new StringEncoder())
                                    .addLast(new TestHandler());
                        }
                    });

            ChannelFuture future = bootstrap.connect("127.0.0.1", 8888).sync();
            future.addListener(future1 -> {
                if (future1.isSuccess()) {
                    log.info("连接成功");
                } else if (future1.isCancelled()) {
                    log.warn("connection cancelled");
                } else {
                    log.error("connection error");
                }
            });
            ChannelFuture sync = future.channel().closeFuture().sync();
            sync.addListener(future1 -> {
                if (future1.isSuccess()) {
                    log.info("关闭成功");
                } else if (future1.isCancelled()) {
                    log.info("close cancelled");
                } else {
                    log.info("close error");
                }
            });
        }
    }
}
