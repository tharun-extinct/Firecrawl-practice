package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pn5 implements xy1 {
    public final /* synthetic */ st4 j;
    public final /* synthetic */ int t;

    public pn5(st4 st4Var, int i) {
        this.j = st4Var;
        this.t = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.j.set(this.t, bool);
        return og5.g;
    }
}
