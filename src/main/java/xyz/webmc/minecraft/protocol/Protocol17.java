package xyz.webmc.minecraft.protocol;

import uk.betacraft.uberbukkit.protocol.extension.Protocol2000;

public class Protocol17 extends Protocol2000 {
  @Override
  public boolean canReceivePacket(final int id) {
    switch (id) {
      case 62:
        return false;
      case 63:
        return false;
      default:
        return super.canReceivePacket(id);
    }
  }
}
