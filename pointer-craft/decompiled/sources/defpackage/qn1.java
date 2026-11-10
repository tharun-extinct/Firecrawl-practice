package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class qn1 extends b54 {
    public final /* synthetic */ sn1 g;

    public qn1(sn1 sn1Var) {
        this.g = sn1Var;
    }

    @Override // defpackage.b54
    public final void y(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        sn1 sn1Var = this.g;
        int i3 = sn1Var.g;
        int iComputeVerticalScrollRange = sn1Var.u.computeVerticalScrollRange();
        int i4 = sn1Var.p;
        sn1Var.z = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = sn1Var.u.computeHorizontalScrollRange();
        int i5 = sn1Var.s;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        sn1Var.h = z;
        boolean z2 = sn1Var.z;
        if (!z2 && !z) {
            if (sn1Var.o != 0) {
                sn1Var.a(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            sn1Var.q = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            sn1Var.m = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (sn1Var.h) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            sn1Var.i = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            sn1Var.c = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        byte b = sn1Var.o;
        if (b == 0 || b == 1) {
            sn1Var.a(1);
        }
    }
}
