package defpackage;

import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;
import io.appground.blek.ui.controls.TextInputView;

/* JADX INFO: loaded from: classes2.dex */
public final class rx extends zz4 implements bz1 {
    public final /* synthetic */ gy b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TextInputEditText i;
    public final /* synthetic */ KeyEvent p;
    public byte q;
    public final /* synthetic */ TextInputView s;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(int i, boolean z, TextInputEditText textInputEditText, gy gyVar, TextInputView textInputView, KeyEvent keyEvent, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = i;
        this.c = z;
        this.i = textInputEditText;
        this.b = gyVar;
        this.s = textInputView;
        this.p = keyEvent;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new rx(this.w, this.c, this.i, this.b, this.s, this.p, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((rx) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (defpackage.m50.f0(r0, r1, r9) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (defpackage.m50.f0(r10, r0, r9) == r8) goto L37;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.q
            r1 = 66
            r2 = 3
            int r3 = r9.w
            r4 = 2
            r5 = 1
            r6 = 0
            gy r7 = r9.b
            px0 r8 = defpackage.px0.j
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 == r4) goto L1d
            if (r0 != r2) goto L17
            goto L1d
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r9)
            return r6
        L1d:
            defpackage.js2.o(r10)
            goto L97
        L22:
            defpackage.js2.o(r10)
            goto L3c
        L26:
            defpackage.js2.o(r10)
            if (r1 != r3) goto L3c
            boolean r10 = r9.c
            if (r10 == 0) goto L3c
            com.google.android.material.textfield.TextInputEditText r10 = r9.i
            if (r10 == 0) goto L3c
            r9.q = r5
            java.lang.Object r10 = r7.a0(r10, r9)
            if (r10 != r8) goto L3c
            goto L96
        L3c:
            io.appground.blek.ui.controls.TextInputView r10 = r9.s
            if (r10 == 0) goto L4e
            r0 = 21
            if (r3 == r0) goto L4b
            r0 = 22
            if (r3 == r0) goto L4b
            if (r3 == r1) goto L4b
            goto L4e
        L4b:
            r10.j()
        L4e:
            android.view.KeyEvent r10 = r9.p
            int r0 = r10.getUnicodeChar()
            if (r0 == 0) goto L79
            int r10 = r10.getUnicodeChar()
            char r10 = (char) r10
            qr0 r0 = r7.T()
            char r10 = (char) r10
            java.lang.String r1 = java.lang.String.valueOf(r10)
            defpackage.qr0.b(r0, r1)
            x21 r0 = defpackage.na1.g
            t42 r0 = defpackage.p03.g
            px r1 = new px
            r1.<init>(r7, r10, r6)
            r9.q = r4
            java.lang.Object r9 = defpackage.m50.f0(r0, r1, r9)
            if (r9 != r8) goto L97
            goto L96
        L79:
            int r10 = defpackage.gy.U(r10)
            qr0 r0 = r7.T()
            r0.w(r10, r3, r5)
            x21 r10 = defpackage.na1.g
            t42 r10 = defpackage.p03.g
            qx r0 = new qx
            r1 = 0
            r0.<init>(r7, r6, r1)
            r9.q = r2
            java.lang.Object r9 = defpackage.m50.f0(r10, r0, r9)
            if (r9 != r8) goto L97
        L96:
            return r8
        L97:
            og5 r9 = defpackage.og5.g
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.u(java.lang.Object):java.lang.Object");
    }
}
