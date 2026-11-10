package defpackage;

import io.appground.blek.R;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nm1 implements my1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ nm1(ob3 ob3Var, xy1 xy1Var, boolean z) {
        this.a = ob3Var;
        this.m = xy1Var;
        this.t = z;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.m;
        boolean z = this.t;
        ob3 ob3Var = this.a;
        switch (b) {
            case 0:
                ob3Var.setValue(new hm1());
                ((xy1) obj).a(Boolean.valueOf(!z));
                break;
            case 1:
                gx3 gx3Var = (gx3) obj;
                Integer numValueOf = Integer.valueOf(R.string.premium_feature_fullscreen_mode);
                if ((2 & 2) != 0) {
                    numValueOf = null;
                }
                if ((2 & 4) != 0) {
                    z = true;
                }
                gx3Var.getClass();
                if (z && !gx3Var.g) {
                    gx3Var.n.l("layout_item_more", numValueOf);
                } else {
                    ob3Var.setValue(true);
                }
                break;
            default:
                String str = (String) obj;
                Set setI0 = cj0.I0((Set) ob3Var.getValue());
                if (z) {
                    setI0.add(str);
                } else {
                    setI0.remove(str);
                }
                ob3Var.setValue(setI0);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ nm1(ob3 ob3Var, boolean z, String str) {
        this.a = ob3Var;
        this.t = z;
        this.m = str;
    }

    public /* synthetic */ nm1(gx3 gx3Var, boolean z, ob3 ob3Var) {
        this.m = gx3Var;
        this.t = z;
        this.a = ob3Var;
    }
}
