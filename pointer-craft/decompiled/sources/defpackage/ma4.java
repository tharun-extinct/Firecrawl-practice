package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma4 extends zw0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma4)) {
            return false;
        }
        ma4 ma4Var = (ma4) obj;
        return yf2.p(this.g, ma4Var.g) && yf2.p(this.y, ma4Var.y) && yf2.p(this.r, ma4Var.r) && yf2.p(this.n, ma4Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.zw0
    public final br2 n(long j, float f, float f2, float f3, float f4, fl2 fl2Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new ym3(kq2.r(0L, j));
        }
        k44 k44VarR = kq2.r(0L, j);
        fl2 fl2Var2 = fl2.j;
        float f5 = fl2Var == fl2Var2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float f6 = fl2Var == fl2Var2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        float f7 = fl2Var == fl2Var2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = fl2Var == fl2Var2 ? f4 : f3;
        return new zm3(new ha4(k44VarR.g, k44VarR.y, k44VarR.r, k44VarR.n, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.g + ", topEnd = " + this.y + ", bottomEnd = " + this.r + ", bottomStart = " + this.n + ")";
    }

    @Override // defpackage.zw0
    public final zw0 y(cx0 cx0Var, cx0 cx0Var2, cx0 cx0Var3, cx0 cx0Var4) {
        return new ma4(cx0Var, cx0Var2, cx0Var3, cx0Var4);
    }
}
