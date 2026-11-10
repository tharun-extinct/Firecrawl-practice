package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ej2 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ jz1 w;

    public /* synthetic */ ej2(nm0 nm0Var, j73 j73Var, ja3 ja3Var, boolean z, nm0 nm0Var2, int i) {
        this.a = nm0Var;
        this.m = j73Var;
        this.q = ja3Var;
        this.t = z;
        this.w = nm0Var2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        jz1 jz1Var = this.w;
        Object obj3 = this.q;
        Object obj4 = this.m;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1);
                zx5.n((String) obj5, (String) obj4, this.t, (my1) obj3, (xy1) jz1Var, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(24967);
                hy5.y((nm0) obj5, (j73) obj4, (ja3) obj3, this.t, (nm0) jz1Var, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ ej2(String str, String str2, boolean z, my1 my1Var, xy1 xy1Var, int i) {
        this.a = str;
        this.m = str2;
        this.t = z;
        this.q = my1Var;
        this.w = xy1Var;
    }
}
