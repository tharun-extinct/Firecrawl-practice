package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu4 implements no1 {
    public final float g;
    public final Object r;
    public final float y;

    public zu4(float f, float f2, Object obj) {
        this.g = f;
        this.y = f2;
        this.r = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zu4) {
            zu4 zu4Var = (zu4) obj;
            if (zu4Var.g == this.g && zu4Var.y == this.y && yf2.p(zu4Var.r, this.r)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oi
    public final jj5 g(te5 te5Var) {
        Object obj = this.r;
        return new jy3(this.g, this.y, obj == null ? null : (vi) te5Var.g.a(obj));
    }

    public final int hashCode() {
        Object obj = this.r;
        return Float.hashCode(this.y) + fj.y(this.g, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ zu4(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
