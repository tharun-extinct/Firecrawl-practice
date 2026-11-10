package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ef implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ ef(ob3 ob3Var, byte b) {
        this.j = b;
        this.t = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.t;
        switch (b) {
            case 0:
                bl2 bl2Var = (bl2) ob3Var.getValue();
                if (bl2Var != null) {
                    return bl2Var;
                }
                pc2.n("Required value was null.");
                up.q();
                return null;
            case 1:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 2:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 3:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 4:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 5:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 6:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 7:
                bl2 bl2Var2 = (bl2) ob3Var.getValue();
                if (bl2Var2 != null) {
                    return bl2Var2;
                }
                pc2.n("Required value was null.");
                up.q();
                return null;
            case 8:
                if (ob3Var != null) {
                    return (List) ob3Var.getValue();
                }
                return null;
            case 9:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 10:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 12:
                ob3Var.setValue(true);
                return og5Var;
            case 13:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 14:
                Boolean bool = (Boolean) ob3Var.getValue();
                bool.booleanValue();
                return bool;
            case kq2.x /* 15 */:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 16:
                ob3Var.setValue(og5Var);
                return og5Var;
            case 17:
                ((hm1) ob3Var.getValue()).getClass();
                ob3Var.setValue(new hm1());
                return og5Var;
            case 18:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 19:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 20:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 21:
                ob3Var.setValue(null);
                return og5Var;
            case 22:
                ob3Var.setValue(null);
                return og5Var;
            case 23:
                ob3Var.setValue(null);
                return og5Var;
            case 24:
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 25:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 26:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 27:
                bl2 bl2Var3 = (bl2) ob3Var.getValue();
                if (bl2Var3 != null) {
                    return bl2Var3;
                }
                pc2.n("Required value was null.");
                up.q();
                return null;
            case 28:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            default:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
        }
    }
}
