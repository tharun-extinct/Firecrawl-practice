package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public final class ht3 implements dt3 {
    public static final ht3 g = new ht3();

    @Override // defpackage.dt3
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dt3
    public final ct3 y(View view, boolean z, long j, float f, float f2, boolean z2, j51 j51Var, float f3) {
        if (z) {
            return new gt3(new Magnifier(view));
        }
        long jH0 = j51Var.h0(j);
        float fE = j51Var.e(f);
        float fE2 = j51Var.e(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jH0 != 9205357640488583168L) {
            builder.setSize(k33.Z(Float.intBitsToFloat((int) (jH0 >> 32))), k33.Z(Float.intBitsToFloat((int) (jH0 & 4294967295L))));
        }
        if (!Float.isNaN(fE)) {
            builder.setCornerRadius(fE);
        }
        if (!Float.isNaN(fE2)) {
            builder.setElevation(fE2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new gt3(builder.build());
    }
}
