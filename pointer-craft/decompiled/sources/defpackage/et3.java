package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public class et3 implements ct3 {
    public final Magnifier g;

    public et3(Magnifier magnifier) {
        this.g = magnifier;
    }

    @Override // defpackage.ct3
    public void g(long j, long j2, float f) {
        this.g.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void n() {
        this.g.update();
    }

    public final long r() {
        return (((long) this.g.getWidth()) << 32) | (((long) this.g.getHeight()) & 4294967295L);
    }

    public final void y() {
        this.g.dismiss();
    }
}
