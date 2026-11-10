package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x60 implements xy1 {
    public final /* synthetic */ byte j;
    public Object t;

    public /* synthetic */ x60(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        long j;
        switch (this.j) {
            case 0:
                ((jb0) this.t).cancel();
                return og5.g;
            case 1:
                ((List) this.t).get(((Number) obj).intValue());
                return null;
            case 2:
                gt4 gt4Var = (gt4) obj;
                synchronized (it4.r) {
                    j = it4.v;
                    it4.v = 1 + j;
                }
                return new e34(j, gt4Var, (xy1) this.t);
            case 3:
                ib0 ib0Var = (ib0) this.t;
                og5 og5Var = og5.g;
                ib0Var.j(og5Var);
                return og5Var;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yu3 yu3Var = (yu3) this.t;
                if (yu3Var != null) {
                    yu3Var.r = zBooleanValue;
                }
                return og5.g;
        }
    }

    public /* synthetic */ x60() {
        this.j = (byte) 4;
    }
}
