package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v90 {
    public byte[] g;
    public int y;

    public final void g(int i) {
        byte[] bArr = this.g;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.g = Arrays.copyOf(bArr, i);
        }
    }

    public final int y() {
        return this.y;
    }
}
