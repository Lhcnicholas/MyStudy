package com.niczo.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;


public class Client {

    public static void main(String[] args) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();

        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try {
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new TestHandler())
                                    .addLast(new StringEncoder());
                        }
                    });

            ChannelFuture future = bootstrap.connect("127.0.0.1", 8888).sync();
            ChannelFuture sync = future.channel().closeFuture().sync();
            sync.addListener(future1 -> {
                if (future1.isSuccess()) {
                    System.out.println("关闭成功");
                } else if (future1.isCancelled()) {
                    System.out.println("close cancelled");
                } else {
                    System.out.println("close error");
                }
            });
        } finally {
            eventLoopGroup.shutdownGracefully();
        }
    }
}
