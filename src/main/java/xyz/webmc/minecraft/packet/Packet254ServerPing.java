package xyz.webmc.minecraft.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.server.NetHandler;
import net.minecraft.server.Packet;

public final class Packet254ServerPing extends Packet {
	@Override
	public final void a(final DataInputStream dataStream) {
	}

	@Override
	public final void a(final DataOutputStream dataStream) {
	}

	@Override
	public final void a(final NetHandler netHandler) {
		netHandler.a(this);
	}

	@Override
	public final int a() {
		return 0;
	}
}
