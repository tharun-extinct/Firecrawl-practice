package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class tc extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
        this.s = obj4;
        this.p = obj5;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.p;
        Object obj3 = this.s;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                tc tcVar = new tc((yt3) this.i, (xy1) obj4, (uc) obj3, (gt2) obj2, mu0Var, (byte) 0);
                tcVar.c = obj;
                return tcVar;
            case 1:
                return new tc((mt2) this.c, (ob3) this.i, (v65) obj4, (b65) obj3, (ma2) obj2, mu0Var, (byte) 1);
            case 2:
                return new tc((l60) this.c, (k65) this.i, (mt2) obj4, (k75) obj3, (aj3) obj2, mu0Var, (byte) 2);
            case 3:
                tc tcVar2 = new tc((my1) this.i, (ox0) obj4, (ce4) obj3, (r54) obj2, mu0Var, (byte) 3);
                tcVar2.c = obj;
                return tcVar2;
            case 4:
                return new tc((es4) this.c, (String) this.i, (String) obj4, (gp) obj3, (by3) obj2, mu0Var, (byte) 4);
            case 5:
                tc tcVar3 = new tc((vu3) this.i, (o55) obj4, (ff) obj3, (kx3) obj2, mu0Var, (byte) 5);
                tcVar3.c = obj;
                return tcVar3;
            case 6:
                tc tcVar4 = new tc((bz1) this.i, (up) obj4, (ox0) obj3, (AtomicReference) obj2, mu0Var, (byte) 6);
                tcVar4.c = obj;
                return tcVar4;
            default:
                tc tcVar5 = new tc((nb5) obj4, (ng4) obj3, (u54) obj2, mu0Var);
                tcVar5.c = obj;
                return tcVar5;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return px0.j;
            case 1:
                return ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((tc) b((mu0) obj2, (er1) obj)).u(og5Var);
            case 4:
                return ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((tc) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((tc) b((mu0) obj2, (lg4) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:15:0x0083  */
    /* JADX WARN: Code duplicated, block: B:18:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0083 -> B:16:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(Object obj, Object obj2, Object obj3, Object obj4, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
        this.s = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(nb5 nb5Var, ng4 ng4Var, u54 u54Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 7;
        this.b = nb5Var;
        this.s = ng4Var;
        this.p = u54Var;
    }
}
