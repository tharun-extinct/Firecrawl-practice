package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bi1 implements ai1 {
    public final int j;
    public int t = -1;
    public int a = -1;

    public bi1(int i) {
        this.j = i;
    }

    @Override // defpackage.ai1
    public final boolean v(CharSequence charSequence, int i, int i2, ff5 ff5Var) {
        int i3 = this.j;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.t = i;
        this.a = i2;
        return false;
    }

    @Override // defpackage.ai1
    public final Object g() {
        return this;
    }
}
