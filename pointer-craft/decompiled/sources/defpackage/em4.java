package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class em4 extends zz4 implements bz1 {
    public final /* synthetic */ ob3 c;
    public final /* synthetic */ byte q;
    public final /* synthetic */ st4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em4(st4 st4Var, ob3 ob3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = st4Var;
        this.c = ob3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        ob3 ob3Var = this.c;
        st4 st4Var = this.w;
        switch (b) {
            case 0:
                return new em4(st4Var, ob3Var, mu0Var, (byte) 0);
            default:
                return new em4(st4Var, ob3Var, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((em4) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((em4) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.c;
        st4 st4Var = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                st4Var.clear();
                st4Var.addAll((Set) ob3Var.getValue());
                break;
            default:
                js2.o(obj);
                st4Var.clear();
                st4Var.add((String) ob3Var.getValue());
                break;
        }
        return og5Var;
    }
}
