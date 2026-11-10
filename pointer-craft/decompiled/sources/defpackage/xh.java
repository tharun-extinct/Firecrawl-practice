package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class xh extends kk2 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, byte b) {
        super(0);
        this.t = b;
        this.a = obj;
    }

    @Override // defpackage.my1
    public final Object g() {
        switch (this.t) {
            case 0:
                ((ob3) this.a).setValue(Boolean.FALSE);
                return og5.g;
            case 1:
                nc5 nc5Var = (nc5) this.a;
                Object objN = nc5Var.g.n();
                mj1 mj1Var = mj1.a;
                return Boolean.valueOf(objN == mj1Var && nc5Var.n.getValue() == mj1Var);
            default:
                Object obj = ao1.v;
                File file = (File) this.a;
                synchronized (obj) {
                    ao1.n.remove(file.getAbsolutePath());
                }
                return og5.g;
        }
    }
}
