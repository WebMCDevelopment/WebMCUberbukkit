package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet255KickDisconnect extends Packet {

    public String a;
    
    // WebMC Start
    private boolean motd = false;
    public Packet255KickDisconnect(final String str, final boolean motd) {
        this(str);
        this.motd = motd;
    }
    // WebMC End

    public Packet255KickDisconnect() {
    }

    public Packet255KickDisconnect(String s) {
        this.a = s;
    }

    public void a(DataInputStream datainputstream) throws IOException {
        // uberbukkit
        if (this.pvn >= 11) {
            this.a = a(datainputstream, 100);
        } else {
            this.a = datainputstream.readUTF();
        }
    }

    public void a(DataOutputStream dataoutputstream) throws IOException {
        // uberbukkit
        if (this.motd || this.pvn >= 11) { // WebMC - use writeString for motd responses
            a(this.a, dataoutputstream);
        } else {
            dataoutputstream.writeUTF(this.a);
        }
    }

    public void a(NetHandler nethandler) {
        nethandler.a(this);
    }

    public int a() {
        return this.a.length();
    }
}
