package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jr3 implements j64 {
    public final Set j;
    public final rb3 t = new rb3(new l02[16]);

    public jr3(Set set) {
        this.j = set;
    }

    @Override // defpackage.j64
    public final void g() {
        rb3 rb3Var = this.t;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            j64 j64Var = ((l02) objArr[i2]).g;
            this.j.remove(j64Var);
            j64Var.g();
        }
    }

    public final rb3 y() {
        return this.t;
    }

    @Override // defpackage.j64
    public final void n() {
    }

    @Override // defpackage.j64
    public final void r() {
    }
}
