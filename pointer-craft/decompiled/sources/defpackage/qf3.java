package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qf3 extends zz4 implements bz1 {
    public final /* synthetic */ wm4 c;
    public final /* synthetic */ byte q;
    public final /* synthetic */ bf4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf3(bf4 bf4Var, wm4 wm4Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = bf4Var;
        this.c = wm4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        wm4 wm4Var = this.c;
        bf4 bf4Var = this.w;
        switch (b) {
            case 0:
                return new qf3(bf4Var, wm4Var, mu0Var, (byte) 0);
            default:
                return new qf3(bf4Var, wm4Var, mu0Var, (byte) 1);
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
                ((qf3) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((qf3) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        wm4 wm4Var = this.c;
        bf4 bf4Var = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                List<ik> list = bf4Var.x;
                if (list != null) {
                    for (ik ikVar : list) {
                        gk gkVar = ikVar instanceof gk ? (gk) ikVar : null;
                        if (gkVar != null) {
                            wm4Var.a.setValue(gkVar.g);
                        }
                    }
                }
                break;
            default:
                js2.o(obj);
                int iIndexOf = ri5.y.indexOf(bf4Var.g);
                if (iIndexOf != -1) {
                    if (iIndexOf >= 0) {
                        SharedPreferences sharedPreferences = d52.b;
                        sharedPreferences.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.putInt("start_screen", iIndexOf);
                        editorEdit.putInt("start_custom_control", -1);
                        editorEdit.apply();
                    }
                    wm4Var.a(iIndexOf, -1);
                }
                break;
        }
        return og5Var;
    }
}
