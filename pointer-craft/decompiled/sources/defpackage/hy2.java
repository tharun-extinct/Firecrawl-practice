package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class hy2 extends Writer {
    public final StringBuilder j = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        y();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                y();
            } else {
                this.j.append(c);
            }
        }
    }

    public final void y() {
        StringBuilder sb = this.j;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
