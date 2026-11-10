package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public final class gt3 extends et3 {
    @Override // defpackage.et3, defpackage.ct3
    public final void g(long j, long j2, float f) {
        if (!Float.isNaN(f)) {
            this.g.setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.g;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
