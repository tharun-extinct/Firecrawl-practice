package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t21 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ List t;

    public /* synthetic */ t21(List list, byte b) {
        this.j = b;
        this.t = list;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        List list = this.t;
        switch (b) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            default:
                return list;
        }
    }
}
