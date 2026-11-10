package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jg2 extends IOException {
    public static jg2 g() {
        return new jg2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
