package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ig2 extends IOException {
    public boolean j;

    public static ig2 g() {
        return new ig2("Protocol message had invalid UTF-8.");
    }

    public static ig2 n() {
        return new ig2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ig2 r() {
        return new ig2("CodedInputStream encountered a malformed varint.");
    }

    public static ig2 v() {
        return new ig2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static gg2 y() {
        return new gg2("Protocol message tag had invalid wire type.");
    }
}
