package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class kk2 implements lz1, Serializable {
    public final byte j;

    /* JADX WARN: Multi-variable type inference failed */
    public kk2(int i) {
        this.j = i;
    }

    @Override // defpackage.lz1
    public final int r() {
        return this.j;
    }

    public final String toString() {
        v54.g.getClass();
        return w54.g(this);
    }
}
