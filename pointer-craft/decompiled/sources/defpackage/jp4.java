package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jp4 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ jp4(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        u75 u75Var;
        byte b = this.j;
        s35 s35Var = null;
        byte b2 = 1;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kp4.r((hp2[]) obj4, (xy1) obj3, (h02) obj, aq2.J(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dg6.g((j73) obj4, (nm0) obj3, (h02) obj, aq2.J(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((t32) obj4).w((Drawable) obj3, (h02) obj, aq2.J(49));
                break;
            case 3:
                b65 b65Var = (b65) obj4;
                ox0 ox0Var = (ox0) obj3;
                t35 t35Var = (t35) obj;
                Context context = (Context) obj2;
                boolean zJ = b65Var.j();
                cj cjVarM = b65Var.m();
                String str = cjVarM != null ? cjVarM.t : null;
                u75 u75Var2 = b65Var.o;
                if (u75Var2 != null) {
                    long j = u75Var2.g;
                    aj3 aj3Var = b65Var.y;
                    u75Var = new u75(sp2.y(aj3Var.j((int) (j >> 32)), aj3Var.j((int) (j & 4294967295L))));
                } else {
                    u75Var = null;
                }
                mt3 mt3Var = b65Var.t;
                nn5 nn5Var = new nn5(b65Var, ox0Var, context, b2);
                vf1 vf1Var = st3.g;
                if (Build.VERSION.SDK_INT < 28 || str == null || u75Var == null || mt3Var == null || !(mt3Var instanceof rt3)) {
                    nn5Var.a(t35Var);
                    if (str != null && u75Var != null) {
                        ae6.g(t35Var, context, zJ, str, u75Var.g);
                    }
                } else {
                    rt3 rt3Var = (rt3) mt3Var;
                    long j2 = u75Var.g;
                    Object obj5 = rt3Var.j;
                    ec3 ec3Var = rt3Var.v;
                    if (ec3Var.v()) {
                        s35 s35Var2 = (s35) rt3Var.l.getValue();
                        if (s35Var2 == null || !u75.y(j2, s35Var2.y) || !yf2.p(str, s35Var2.g)) {
                            s35Var2 = null;
                        }
                        ec3Var.x(null);
                        s35Var = s35Var2;
                    }
                    if (s35Var == null) {
                        nn5Var.a(t35Var);
                    } else {
                        ArrayList arrayList = s35Var.n;
                        TextClassification textClassification = s35Var.r;
                        if (!textClassification.getActions().isEmpty()) {
                            t35Var.g.g(new i45(obj5, textClassification, 0, (Drawable) arrayList.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            t35Var.g.g(new i45(obj5, textClassification, -1, textClassification.getIcon()));
                        }
                        nn5Var.a(t35Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i = 0; i < size; i++) {
                            al0.z(actions.get(i));
                            if (i > 0) {
                                t35Var.g.g(new i45(obj5, textClassification, i, (Drawable) arrayList.get(i)));
                            }
                        }
                    }
                    ae6.g(t35Var, context, zJ, str, u75Var.g);
                }
                break;
            case 4:
                qj0 qj0Var = (qj0) obj4;
                he heVar = (he) obj3;
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    ra.j(heVar, "", xq2.J(m22.g, 24.0f), 0, qj0Var != null ? new mj0(new u95(qj0Var)) : null, h02Var, 32816);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                cz5.r((r04) obj4, (xy1) obj3, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ib6.v((b30) obj4, (my1) obj3, (h02) obj, aq2.J(9));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ jp4(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
