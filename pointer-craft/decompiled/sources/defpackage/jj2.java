package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class jj2 extends zz4 implements bz1 {
    public final /* synthetic */ sj2 c;
    public final /* synthetic */ String i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj2(sj2 sj2Var, String str, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = sj2Var;
        this.i = str;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        String str = this.i;
        sj2 sj2Var = this.c;
        switch (b) {
            case 0:
                return new jj2(sj2Var, str, mu0Var, (byte) 0);
            default:
                return new jj2(sj2Var, str, mu0Var, (byte) 1);
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
                break;
        }
        return ((jj2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        String str = this.i;
        px0 px0Var = px0.j;
        sj2 sj2Var = this.c;
        byte b2 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                yi2 yi2Var = sj2Var.y;
                yi2Var.getClass();
                str.getClass();
                byte b3 = 0;
                if (ay4.P(str, "custom:", false)) {
                    zi2 zi2Var = yi2Var.g;
                    zi2Var.getClass();
                    new File(zi2Var.g, tx4.d0("custom:", str).concat(".pb")).delete();
                }
                vz0 vz0VarG = q03.g(sj2Var.r);
                ij2 ij2Var = new ij2(sj2Var, str, mu0Var, b3);
                this.w = true;
                return kq2.k(vz0VarG, ij2Var, this) == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                vz0 vz0VarG2 = q03.g(sj2Var.r);
                ij2 ij2Var2 = new ij2(sj2Var, str, mu0Var, b2);
                this.w = true;
                return kq2.k(vz0VarG2, ij2Var2, this) == px0Var ? px0Var : og5Var;
        }
    }
}
