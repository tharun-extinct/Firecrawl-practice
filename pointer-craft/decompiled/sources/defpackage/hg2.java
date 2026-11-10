package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class hg2 extends IOException {
    public boolean j;

    public static hg2 g() {
        return new hg2("Protocol message contained an invalid tag (zero).");
    }

    public static hg2 n() {
        return new hg2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static fg2 r() {
        return new fg2("Protocol message tag had invalid wire type.");
    }

    public static hg2 v() {
        return new hg2("Failed to parse the message.");
    }

    public static hg2 x() {
        return new hg2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static hg2 y() {
        return new hg2("Protocol message had invalid UTF-8.");
    }
}
