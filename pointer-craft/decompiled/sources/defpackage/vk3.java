package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vk3 extends bm3 {
    public static final vk3 r = new vk3(0, 2, 1);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        int i = ((oe2) ti0Var.r(0)).g;
        List list = (List) ti0Var.r(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            mqVar.y(i3, obj);
            mqVar.x(i3, obj);
        }
    }
}
