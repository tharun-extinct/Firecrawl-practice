package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 extends rm2 {
    public static final ea4 r = new ea4("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea4(String str, byte b) {
        super(str);
        this.y = b;
    }

    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        switch (this.y) {
            case 0:
                int size = list.size();
                qi1 qi1Var = qi1.j;
                if (size == 0) {
                    return v33Var.k0(ws0.m(j), ws0.a(j), qi1Var, new rn3((byte) 8));
                }
                if (size == 1) {
                    us3 us3VarV = ((p33) list.get(0)).v(j);
                    return v33Var.k0(zs0.l(us3VarV.j, j), zs0.x(us3VarV.t, j), qi1Var, new t9(us3VarV, (byte) 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    us3 us3VarV2 = ((p33) list.get(i)).v(j);
                    iMax = Math.max(us3VarV2.j, iMax);
                    iMax2 = Math.max(us3VarV2.t, iMax2);
                    arrayList.add(us3VarV2);
                }
                return v33Var.k0(zs0.l(iMax, j), zs0.x(iMax2, j), qi1Var, new ko3(arrayList, (byte) 1));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
