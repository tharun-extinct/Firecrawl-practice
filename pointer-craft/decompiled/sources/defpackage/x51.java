package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x51 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;

    public /* synthetic */ x51(z51 z51Var, oe2 oe2Var, ta3 ta3Var, int i) {
        this.a = z51Var;
        this.m = oe2Var;
        this.q = ta3Var;
        this.t = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        int iG;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.q;
        int i = this.t;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                oe2 oe2Var = (oe2) obj3;
                ta3 ta3Var = (ta3) obj2;
                if (obj == ((z51) obj4)) {
                    l0.z("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof ww4)) {
                    return og5Var;
                }
                int i2 = oe2Var.g - i;
                int iN = ta3Var.n(obj);
                ta3Var.l(Math.min(i2, iN >= 0 ? ta3Var.r[iN] : Integer.MAX_VALUE), obj);
                return og5Var;
            default:
                us3[] us3VarArr = (us3[]) obj4;
                kb4 kb4Var = (kb4) obj3;
                int[] iArr = (int[]) obj2;
                ts3 ts3Var = (ts3) obj;
                int length = us3VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    us3 us3Var = us3VarArr[i3];
                    int i5 = i4 + 1;
                    us3Var.getClass();
                    Object objA = us3Var.a();
                    gb4 gb4Var = objA instanceof gb4 ? (gb4) objA : null;
                    ay0 ay0Var = gb4Var != null ? gb4Var.r : null;
                    if (ay0Var != null) {
                        iG = ay0Var.G.g(us3Var.t, i, fl2.j);
                    } else {
                        iG = kb4Var.y.g(us3Var.t, i);
                    }
                    ts3Var.j(us3Var, iArr[i4], iG, 0.0f);
                    i3++;
                    i4 = i5;
                }
                return og5Var;
        }
    }

    public /* synthetic */ x51(us3[] us3VarArr, kb4 kb4Var, int i, int[] iArr) {
        this.a = us3VarArr;
        this.m = kb4Var;
        this.t = i;
        this.q = iArr;
    }
}
