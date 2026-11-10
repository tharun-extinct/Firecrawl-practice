package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ur implements bw4 {
    public final xy1 a;
    public final List j;
    public final tp3 m;
    public boolean q = true;
    public final hf5 t;

    public ur(List list, Object obj, hf5 hf5Var, ro roVar, xy1 xy1Var, q64 q64Var) {
        this.j = list;
        this.t = hf5Var;
        this.a = xy1Var;
        this.m = kq2.M(obj);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:35:0x0096, B:21:0x0047, B:23:0x004c, B:27:0x0073, B:33:0x008c), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0096 -> B:36:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(defpackage.ou0 r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.g(ou0):java.lang.Object");
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return this.m.getValue();
    }
}
