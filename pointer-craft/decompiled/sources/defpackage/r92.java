package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r92 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ String t;

    public /* synthetic */ r92(String str, byte b) {
        this.j = b;
        this.t = str;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        String str = this.t;
        switch (b) {
            case 0:
                nj4 nj4Var = (nj4) obj;
                lj4.n(nj4Var, str);
                lj4.t(nj4Var, 5);
                break;
            case 1:
                ((zi4) obj).g.put(m50.q, pw5.k(str));
                break;
            default:
                lj4.n((nj4) obj, str);
                break;
        }
        return og5Var;
    }
}
