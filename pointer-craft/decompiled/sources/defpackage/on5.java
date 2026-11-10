package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class on5 implements my1 {
    public final /* synthetic */ st4 j;
    public final /* synthetic */ int t;

    public on5(st4 st4Var, int i) {
        this.j = st4Var;
        this.t = i;
    }

    @Override // defpackage.my1
    public final Object g() {
        st4 st4Var = this.j;
        int i = this.t;
        st4Var.set(i, Boolean.valueOf(!((Boolean) st4Var.get(i)).booleanValue()));
        return og5.g;
    }
}
