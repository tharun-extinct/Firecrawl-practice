package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 implements InputFilter {
    public final TextView g;
    public xh1 y;

    public yh1(TextView textView) {
        this.g = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.g
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            ph1 r1 = defpackage.ph1.g()
            int r1 = r1.r()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            ph1 r3 = defpackage.ph1.g()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.l(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            ph1 r5 = defpackage.ph1.g()
            xh1 r6 = r3.y
            if (r6 != 0) goto L58
            xh1 r6 = new xh1
            r6.<init>(r0, r3)
            r3.y = r6
        L58:
            r5.j(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh1.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
