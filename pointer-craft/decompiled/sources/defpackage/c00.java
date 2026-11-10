package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends cs0 {
    public final /* synthetic */ byte v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(ss0 ss0Var, byte b) {
        super(ss0Var);
        this.v = b;
    }

    @Override // defpackage.cs0
    public final boolean g(sr5 sr5Var) {
        switch (this.v) {
            case 0:
                return sr5Var.a.l();
            case 1:
                return sr5Var.a.x();
            case 2:
                return sr5Var.a.y() == 2;
            case 3:
                if (sr5Var.a.y() != 3) {
                    return Build.VERSION.SDK_INT >= 30 && sr5Var.a.y() == 6;
                }
                return true;
            default:
                return sr5Var.a.t();
        }
    }

    @Override // defpackage.cs0
    public final boolean y(Object obj) {
        boolean zBooleanValue;
        switch (this.v) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                pg3 pg3Var = (pg3) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (pg3Var.g() && pg3Var.n()) ? false : true;
                }
                return !pg3Var.g();
            case 3:
                pg3 pg3Var2 = (pg3) obj;
                return !pg3Var2.g() || pg3Var2.y();
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
