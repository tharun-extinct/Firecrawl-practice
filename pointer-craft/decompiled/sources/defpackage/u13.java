package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u13 implements ve2 {
    public final long g;
    public final wv0 r;
    public final LinkedHashMap y = new LinkedHashMap();

    public u13(ja3 ja3Var, long j) {
        this.g = j;
        this.r = new wv0(ja3Var.g, this, (byte) 2);
    }

    @Override // defpackage.ve2
    public final er1 g() {
        return this.r;
    }
}
