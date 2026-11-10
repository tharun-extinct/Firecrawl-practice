package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey extends zz4 implements bz1 {
    public final /* synthetic */ gy b;
    public final /* synthetic */ tw1 c;
    public final /* synthetic */ boolean i;
    public byte q;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(boolean z, tw1 tw1Var, boolean z2, gy gyVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = z;
        this.c = tw1Var;
        this.i = z2;
        this.b = gyVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new ey(this.w, this.c, this.i, this.b, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((ey) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (defpackage.yf2.e(100, r8) == r4) goto L29;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.q
            r1 = 2
            r2 = 1
            boolean r3 = r8.w
            px0 r4 = defpackage.px0.j
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.js2.o(r9)
            goto L63
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            r8 = 0
            return r8
        L19:
            defpackage.js2.o(r9)
            goto L2d
        L1d:
            defpackage.js2.o(r9)
            if (r3 != 0) goto L2d
            r8.q = r2
            r5 = 400(0x190, double:1.976E-321)
            java.lang.Object r9 = defpackage.yf2.e(r5, r8)
            if (r9 != r4) goto L2d
            goto L62
        L2d:
            tw1 r9 = r8.c
            android.widget.LinearLayout r0 = r9.x
            android.widget.LinearLayout r5 = r9.j
            io.appground.blek.ui.controls.TextInputView r6 = r9.t
            boolean r7 = r8.i
            if (r7 == 0) goto L3b
            r7 = 0
            goto L3d
        L3b:
            r7 = 8
        L3d:
            r0.setVisibility(r7)
            r6.setEnabled(r3)
            if (r3 != 0) goto L48
            r6.j()
        L48:
            if (r3 == 0) goto L69
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L69
            com.google.android.material.textfield.TextInputEditText r9 = r9.n
            boolean r9 = r9.isFocused()
            if (r9 != 0) goto L69
            r8.q = r1
            r0 = 100
            java.lang.Object r9 = defpackage.yf2.e(r0, r8)
            if (r9 != r4) goto L63
        L62:
            return r4
        L63:
            gy r8 = r8.b
            r8.b0()
            goto L84
        L69:
            if (r3 != 0) goto L84
            r8 = 2131362983(0x7f0a04a7, float:1.8345762E38)
            android.view.View r8 = r5.findViewById(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r9 < r0) goto L81
            if (r8 == 0) goto L81
            boolean r8 = defpackage.y8.k(r8)
            if (r8 != r2) goto L81
            goto L84
        L81:
            r5.requestFocus()
        L84:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.u(java.lang.Object):java.lang.Object");
    }
}
