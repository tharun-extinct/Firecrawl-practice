package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xd implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ xd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
        this.w = obj5;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        Object obj = this.w;
        Object obj2 = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                ((sv3) obj5).i((my1) obj4, (wv3) obj3, (String) obj2, (fl2) obj);
                return og5.g;
            default:
                ik1 ik1Var = (ik1) obj5;
                ob3 ob3Var = (ob3) obj4;
                ox0 ox0Var = (ox0) obj3;
                ss2 ss2Var = (ss2) obj2;
                ob3 ob3Var2 = (ob3) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : ik1Var) {
                    if (tx4.Q(((ft0) obj6).t, (String) ob3Var.getValue(), true)) {
                        arrayList.add(obj6);
                    }
                }
                m50.T(ox0Var, null, new s3(arrayList, ik1Var, ss2Var, ob3Var2, null, (byte) 11), 3);
                return arrayList;
        }
    }
}
