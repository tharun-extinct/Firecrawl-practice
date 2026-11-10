package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kd6 extends sb6 {
    public final byte[] v;

    public kd6(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.v = bArr;
    }

    @Override // defpackage.sb6
    public final byte[] l() {
        return this.v;
    }
}
