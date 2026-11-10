package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ox4 extends IOException {
    public final kk1 j;

    public ox4(kk1 kk1Var) {
        super("stream was reset: " + kk1Var);
        this.j = kk1Var;
    }
}
