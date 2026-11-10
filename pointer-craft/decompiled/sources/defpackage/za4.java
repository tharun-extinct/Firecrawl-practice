package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class za4 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ za4(ob3 ob3Var, byte b) {
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
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 1:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 2:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 3:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 4:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 5:
                List list = (List) ob3Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((g61) obj).i) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 6:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 7:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 8:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 9:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 10:
                return (bl2) ob3Var.getValue();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 12:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 13:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 14:
                ob3Var.setValue(null);
                return og5Var;
            default:
                ob3Var.setValue(null);
                return og5Var;
        }
    }
}
