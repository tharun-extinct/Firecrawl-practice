package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;

    public /* synthetic */ hg(yq2 yq2Var, Object obj, int i, Object obj2, int i2) {
        this.j = (byte) 4;
        this.a = yq2Var;
        this.m = obj;
        this.t = i;
        this.q = obj2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        int i = this.t;
        Object obj3 = this.m;
        Object obj4 = this.q;
        og5 og5Var = og5.g;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                k33.y((xy1) obj5, (j73) obj4, (xy1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                m50.g((jd3) obj5, (wm4) obj3, (ik) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                m50.f((wm4) obj5, (qr0) obj3, (jd3) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((nm0) obj5).q(obj3, obj4, (h02) obj, aq2.J(i) | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1);
                xq2.r((yq2) obj5, this.m, this.t, this.q, (h02) obj, iJ);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((vs2) obj5).y(obj3, (nm0) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                aq2.v((gu2) obj3, (ou2) obj4, (xy1) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((sc4) obj5).y(obj3, (nm0) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jr2.g((wr4) obj5, (j73) obj4, (cz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gp4.f((py4) obj5, (j73) obj4, (bz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ hg(gu2 gu2Var, ou2 ou2Var, xy1 xy1Var, int i) {
        this.j = (byte) 6;
        this.m = gu2Var;
        this.q = ou2Var;
        this.a = xy1Var;
        this.t = i;
    }

    public /* synthetic */ hg(Object obj, j73 j73Var, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.q = j73Var;
        this.m = jz1Var;
        this.t = i;
    }

    public /* synthetic */ hg(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.q = obj3;
        this.t = i;
    }
}
