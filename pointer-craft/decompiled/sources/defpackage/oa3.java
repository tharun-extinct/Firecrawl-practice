package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oa3 extends j13 implements xh2 {
    public final yr3 a;
    public Object m;

    public oa3(yr3 yr3Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.a = yr3Var;
        this.m = obj2;
    }

    @Override // defpackage.j13, java.util.Map.Entry
    public final Object getValue() {
        return this.m;
    }

    @Override // defpackage.j13, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.m;
        this.m = obj;
        wr3 wr3Var = (wr3) this.a.t;
        sr3 sr3Var = wr3Var.m;
        Object obj3 = this.j;
        if (!sr3Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = wr3Var.a;
        if (!z) {
            sr3Var.put(obj3, obj);
        } else {
            if (!z) {
                uo1.b();
                return null;
            }
            pd5 pd5Var = wr3Var.j[wr3Var.t];
            Object obj4 = pd5Var.j[pd5Var.a];
            sr3Var.put(obj3, obj);
            wr3Var.r(obj4 != null ? obj4.hashCode() : 0, sr3Var.t, obj4, 0);
        }
        wr3Var.c = sr3Var.m;
        return obj2;
    }
}
