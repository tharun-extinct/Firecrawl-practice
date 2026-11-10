package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k82 implements my1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ p82 t;

    public /* synthetic */ k82(p82 p82Var, int i, List list, boolean z) {
        this.j = (byte) 2;
        this.t = p82Var;
        this.a = i;
    }

    @Override // defpackage.my1
    public final Object g() {
        switch (this.j) {
            case 0:
                p82 p82Var = this.t;
                int i = this.a;
                p82Var.p.getClass();
                try {
                    p82Var.E.b(i, kk1.i);
                    synchronized (p82Var) {
                        p82Var.G.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return og5.g;
            case 1:
                p82 p82Var2 = this.t;
                int i2 = this.a;
                p82Var2.p.getClass();
                synchronized (p82Var2) {
                    p82Var2.G.remove(Integer.valueOf(i2));
                }
                return og5.g;
            default:
                p82 p82Var3 = this.t;
                int i3 = this.a;
                p82Var3.p.getClass();
                try {
                    p82Var3.E.b(i3, kk1.i);
                    synchronized (p82Var3) {
                        p82Var3.G.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return og5.g;
        }
    }

    public /* synthetic */ k82(p82 p82Var, int i, Object obj, byte b) {
        this.j = b;
        this.t = p82Var;
        this.a = i;
    }
}
