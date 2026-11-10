package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b13 extends d13 implements Iterator, vh2 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b13(f13 f13Var, byte b) {
        super(f13Var);
        this.q = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.q) {
            case 0:
                y();
                int i = this.j;
                f13 f13Var = (f13) this.m;
                if (i >= f13Var.w) {
                    uo1.b();
                    return null;
                }
                this.j = i + 1;
                this.t = i;
                c13 c13Var = new c13(f13Var, i);
                r();
                return c13Var;
            default:
                y();
                int i2 = this.j;
                f13 f13Var2 = (f13) this.m;
                if (i2 >= f13Var2.w) {
                    uo1.b();
                    return null;
                }
                this.j = i2 + 1;
                this.t = i2;
                Object obj = f13Var2.j[i2];
                r();
                return obj;
        }
    }
}
