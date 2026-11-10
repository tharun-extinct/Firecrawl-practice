package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class l46 {
    public static final l46 r;
    public static final l46 y;
    public final Throwable g;

    static {
        if (wh6.m) {
            r = null;
            y = null;
        } else {
            r = new l46(null);
            y = new l46(null);
        }
    }

    public l46(CancellationException cancellationException) {
        this.g = cancellationException;
    }
}
