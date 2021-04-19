package com.niczo.netty.server;

import com.niczo.netty.handler.DiscardServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

public class DiscardServer {

	public static void main(String[] args) {
		ServerBootstrap serverBootstrap = new ServerBootstrap();

		EventLoopGroup parentGroup = new NioEventLoopGroup();

		EventLoopGroup childGroup = new NioEventLoopGroup();

		try {
			serverBootstrap.group(parentGroup, childGroup)
					.channel(NioServerSocketChannel.class)
					.childHandler(new ChannelInitializer<SocketChannel>() {
						@Override
						protected void initChannel(SocketChannel ch) {
							ch.pipeline().addLast(new LineBasedFrameDecoder(80))
									.addLast(new StringDecoder())
									.addLast(new DiscardServerHandler());
						}
					})
					.option(ChannelOption.SO_BACKLOG, 128)
					.childOption(ChannelOption.SO_KEEPALIVE, true);

			ChannelFuture channelFuture = serverBootstrap.bind(8888).sync();
			System.out.println("服务器启动成功，端口号：8888");
			channelFuture.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			parentGroup.shutdownGracefully();
			childGroup.shutdownGracefully();
		}
	}
}
