package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class op1 implements qo5 {
    public final int g;

    public op1(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op1) && this.g == ((op1) obj).g;
    }

    @Override // defpackage.qo5
    public final int g(j51 j51Var) {
        return 0;
    }

    public final int hashCode() {
        return this.g * 961;
    }

    @Override // defpackage.qo5
    public final int n(j51 j51Var, fl2 fl2Var) {
        return 0;
    }

    @Override // defpackage.qo5
    public final int r(j51 j51Var, fl2 fl2Var) {
        return 0;
    }

    public final String toString() {
        return du4.w(this.g, "Insets(left=0, top=", ", right=0, bottom=0)");
    }

    @Override // defpackage.qo5
    public final int y(j51 j51Var) {
        return this.g;
    }
}
