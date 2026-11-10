package defpackage;

import io.appground.blek.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ ln(ob3 ob3Var, byte b) {
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
                ob3Var.setValue(null);
                return og5Var;
            case 2:
                List list = (List) ob3Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((g61) obj).i) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 3:
                ob3Var.setValue(Boolean.TRUE);
                return og5Var;
            case 4:
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
            case 5:
                return (yq2) ((my1) ob3Var.getValue()).g();
            case 6:
                return new es2((xy1) ob3Var.getValue());
            default:
                int i = MainActivity.Q;
                ob3Var.setValue(Boolean.FALSE);
                return og5Var;
        }
    }
}
