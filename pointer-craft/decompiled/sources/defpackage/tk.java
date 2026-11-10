package defpackage;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ int t;

    public /* synthetic */ tk(int i, String str, Intent intent) {
        this.j = (byte) 11;
        this.t = i;
        this.a = str;
        this.m = intent;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        Object obj4 = this.a;
        int i = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yf2.q((ga1) obj4, (j73) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m50.n((wm4) obj4, (List) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                m50.b((wm4) obj4, (jd3) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((nm0) obj4).j(obj3, (h02) obj, aq2.J(i) | 1);
                break;
            case 4:
                ((Integer) obj2).intValue();
                og0.y((m14) obj4, (bz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                og0.r((m14[]) obj4, (bz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 6:
                yq2 yq2Var = (yq2) obj4;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    yq2Var.n(i, obj3, h02Var, 0);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((fs2) obj4).n(i, obj3, (h02) obj, aq2.J(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ef3.g((we1) obj4, (nm0) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((jo3) obj4).n(i, obj3, (h02) obj, aq2.J(1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                ((nc5) obj4).g(obj3, (h02) obj, aq2.J(i | 1));
                break;
            default:
                String str = (String) obj4;
                Intent intent = (Intent) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    wy5.y(new he(i), str, null, null, new e4(jg6.g(intent), 0), null, h02Var2, 0, 108);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ tk(int i, yq2 yq2Var, Object obj) {
        this.j = (byte) 6;
        this.a = yq2Var;
        this.t = i;
        this.m = obj;
    }

    public /* synthetic */ tk(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = i;
    }

    public /* synthetic */ tk(yq2 yq2Var, int i, Object obj, int i2, byte b) {
        this.j = b;
        this.a = yq2Var;
        this.t = i;
        this.m = obj;
    }
}
