package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class of implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ of(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        long j;
        switch (this.j) {
            case 0:
                nf nfVar = (nf) this.t;
                pf pfVar = (pf) this.a;
                synchronized (nfVar.q) {
                    nfVar.c.remove(pfVar);
                }
                return og5.g;
            default:
                gt4 gt4Var = (gt4) obj;
                synchronized (it4.r) {
                    j = it4.v;
                    it4.v = 1 + j;
                }
                return new nb3(j, gt4Var, (xy1) this.t, (xy1) this.a);
        }
    }
}
