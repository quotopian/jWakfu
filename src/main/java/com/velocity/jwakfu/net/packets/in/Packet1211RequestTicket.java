package com.velocity.jwakfu.net.packets.in;

import com.velocity.jwakfu.net.packets.IncomingPacket;
import com.velocity.jwakfu.net.packets.out.Packet1200ListWorlds;
import com.velocity.jwakfu.net.packets.out.Packet1212GrantTicket;
import com.velocity.jwakfu.session.ClientSession;
import com.velocity.jwakfu.util.LoggingUtil;
import io.netty.buffer.ByteBuf;
import org.slf4j.Logger;

public class Packet1211RequestTicket implements IncomingPacket {

	private static final Logger logger = LoggingUtil.log();
	
	@Override
	public void decode(ClientSession session, ByteBuf buffer, int size) {
		int serverId = buffer.readInt();
		long unknownLong = buffer.readLong();

		session.write(new Packet1212GrantTicket("4b5c1e76-e312-4987-9ee2-bf957f87e1a3"));
	}

}
