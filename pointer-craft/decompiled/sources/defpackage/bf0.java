package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bf0 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ zn3 c;
    public final /* synthetic */ nm0 j;
    public final /* synthetic */ me0 m;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ k85 t;
    public final /* synthetic */ float w;

    public bf0(nm0 nm0Var, k85 k85Var, long j, me0 me0Var, boolean z, float f, zn3 zn3Var) {
        this.j = nm0Var;
        this.t = k85Var;
        this.a = j;
        this.m = me0Var;
        this.q = z;
        this.w = f;
        this.c = zn3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            me0 me0Var = this.m;
            boolean z = this.q;
            ff0.r(this.j, this.t, this.a, z ? me0Var.r : me0Var.l, z ? me0Var.n : me0Var.j, this.w, this.c, h02Var, 24576);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
