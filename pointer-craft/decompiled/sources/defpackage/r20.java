package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r20 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ v20 t;

    public /* synthetic */ r20(v20 v20Var, byte b) {
        this.j = b;
        this.t = v20Var;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        switch (this.j) {
            case 0:
                int iOrdinal = ((x14) obj).ordinal();
                v20 v20Var = this.t;
                if (iOrdinal == 0) {
                    String str = v20.r;
                    v20Var.n(R.string.message_error_purchase_failed);
                } else {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return null;
                    }
                    String str2 = v20.r;
                    v20Var.n(R.string.message_purchase_not_finalized);
                }
                return og5.g;
            default:
                return g((List) obj, mu0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0074 -> B:28:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object g(java.util.List r5, defpackage.mu0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.s20
            if (r0 == 0) goto L13
            r0 = r6
            s20 r0 = (defpackage.s20) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s20 r0 = new s20
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            int r1 = r0.c
            r2 = 1
            r3 = 2131952169(0x7f130229, float:1.9540773E38)
            v20 r4 = r4.t
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            java.util.Iterator r5 = r0.m
            defpackage.js2.o(r6)
            goto L77
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r4)
            r4 = 0
            return r4
        L33:
            defpackage.js2.o(r6)
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "donation"
            boolean r1 = defpackage.yf2.p(r6, r1)
            if (r1 == 0) goto L54
            java.lang.String r6 = defpackage.v20.r
            r4.n(r3)
            goto L3a
        L54:
            java.lang.String r1 = defpackage.v20.r
            boolean r1 = defpackage.yf2.p(r6, r1)
            if (r1 == 0) goto L60
            r4.n(r3)
            goto L3a
        L60:
            java.lang.String r1 = "premium_yearly"
            boolean r6 = defpackage.yf2.p(r6, r1)
            if (r6 == 0) goto L3a
            w10 r6 = r4.g
            r0.m = r5
            r0.c = r2
            java.lang.Object r6 = r6.k(r0)
            px0 r1 = defpackage.px0.j
            if (r6 != r1) goto L77
            return r1
        L77:
            java.lang.String r6 = defpackage.v20.r
            r4.n(r3)
            goto L3a
        L7d:
            og5 r4 = defpackage.og5.g
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r20.g(java.util.List, mu0):java.lang.Object");
    }
}
