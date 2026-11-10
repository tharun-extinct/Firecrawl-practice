package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface iz4 extends Closeable {
    zx1 K();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
