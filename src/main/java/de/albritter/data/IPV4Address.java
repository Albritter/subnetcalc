package de.albritter.data;

import java.io.IOException;

/**
 * Created by henrik on 12.10.16.
 */
public abstract class IPV4Address {
    private byte[] bytes;

    public void setAddress(String str) throws IOException {

        throw new IOException("Keine oder ungülige Werte als Adresse angegeben");
    }

    public void setAddress(byte[] b) throws IOException {
        if (b.length == 3)
            bytes = b;
        throw new IOException("Keine oder ungülige Werte als Adresse angegeben");
    }

    public String getAdressString() throws IOException {
        if (bytes.length == 3)
            return new StringBuilder().append(bytes[0]).append(bytes[1]).append(bytes[2]).append(bytes[3]).toString();
        throw new IOException("Keine oder ungülige Werte als Adresse angegeben");
    }

    public byte[] getAddress() throws IOException {
        if (bytes.length == 3)
            return bytes;
        throw new IOException("Keine oder ungülige Werte als Adresse angegeben");
    }
}
