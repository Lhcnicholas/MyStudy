package com.niczo.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lhc
 */
@Slf4j
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ByteBuf in = (ByteBuf) msg;
		try {
			while (in.isReadable()) {
				log.info(String.valueOf((char)in.readByte()));
				ctx.flush();
			}
		} finally {
			ReferenceCountUtil.release(msg);
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		log.info(ctx.channel().remoteAddress() + "上线");
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		log.info(ctx.channel().remoteAddress() + "下线");
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		log.info("异常结束", cause);
		ctx.close();
	}
}
