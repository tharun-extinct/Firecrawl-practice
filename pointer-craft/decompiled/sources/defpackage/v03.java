package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class v03 extends zz4 implements bz1 {
    public final /* synthetic */ ql4 c;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v03(Context context, ql4 ql4Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = context;
        this.c = ql4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        ql4 ql4Var = this.c;
        Context context = this.w;
        switch (b) {
            case 0:
                return new v03(context, ql4Var, mu0Var, (byte) 0);
            default:
                return new v03(context, ql4Var, mu0Var, (byte) 1);
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
                ((v03) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((v03) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ql4 ql4Var = this.c;
        Context context = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                yl0 yl0VarF = gp4.F(context);
                if (!ql4Var.z) {
                    yl0VarF.getWindow().clearFlags(128);
                } else {
                    yl0VarF.getWindow().addFlags(128);
                }
                break;
            default:
                js2.o(obj);
                yl0 yl0VarF2 = gp4.F(context);
                boolean z = ql4Var.h;
                if (Build.VERSION.SDK_INT >= 27) {
                    yl0VarF2.setShowWhenLocked(z);
                } else if (!z) {
                    yl0VarF2.getWindow().clearFlags(524288);
                } else {
                    yl0VarF2.getWindow().addFlags(524288);
                }
                break;
        }
        return og5Var;
    }
}
