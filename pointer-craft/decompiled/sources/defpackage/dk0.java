package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk0 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 2;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object w;

    public /* synthetic */ dk0(we1 we1Var, int i, ArrayList arrayList, ob3 ob3Var, pp3 pp3Var) {
        this.a = we1Var;
        this.t = i;
        this.m = arrayList;
        this.q = ob3Var;
        this.w = pp3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Object value;
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = 0;
        Object obj2 = this.w;
        int i2 = this.t;
        Object obj3 = this.q;
        Object obj4 = this.m;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                us3[] us3VarArr = (us3[]) obj5;
                ek0 ek0Var = (ek0) obj4;
                v33 v33Var = (v33) obj3;
                int[] iArr = (int[]) obj2;
                ts3 ts3Var = (ts3) obj;
                int length = us3VarArr.length;
                int i3 = 0;
                while (i < length) {
                    us3 us3Var = us3VarArr[i];
                    int i4 = i3 + 1;
                    us3Var.getClass();
                    Object objA = us3Var.a();
                    gb4 gb4Var = objA instanceof gb4 ? (gb4) objA : null;
                    fl2 layoutDirection = v33Var.getLayoutDirection();
                    ay0 ay0Var = gb4Var != null ? gb4Var.r : null;
                    ts3Var.j(us3Var, ay0Var != null ? ay0Var.G.g(us3Var.j, i2, layoutDirection) : ek0Var.y.g(us3Var.j, i2, layoutDirection), iArr[i3], 0.0f);
                    i++;
                    i3 = i4;
                }
                return og5Var;
            case 1:
                ArrayList arrayList = (ArrayList) obj4;
                ob3 ob3Var = (ob3) obj3;
                pp3 pp3Var = (pp3) obj2;
                ts3 ts3Var2 = (ts3) obj;
                q8 q8Var = ((we1) obj5).y;
                l11 l11VarY = q8Var.y();
                xe1 xe1Var = xe1.j;
                float fR = l11VarY.r(xe1Var);
                float f = -i2;
                qe5 qe5Var = ef3.g;
                if (!((Boolean) ob3Var.getValue()).booleanValue() || fR != f) {
                    if (!((Boolean) ob3Var.getValue()).booleanValue()) {
                        ob3Var.setValue(Boolean.TRUE);
                    }
                    pp3Var.e(f);
                    gd1 gd1Var = new gd1();
                    gd1Var.g(xe1Var, pp3Var.d());
                    gd1Var.g(xe1.t, 0.0f);
                    float[] fArr = gd1Var.y;
                    ArrayList arrayList2 = gd1Var.g;
                    int size = arrayList2.size();
                    a11.t(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    l11 l11Var = new l11(arrayList2, fArrCopyOfRange);
                    pp3 pp3Var2 = q8Var.a;
                    z51 z51Var = q8Var.t;
                    if (Float.isNaN(pp3Var2.d()) || (value = l11Var.g(q8Var.a.d())) == null) {
                        value = z51Var.getValue();
                    }
                    if (!yf2.p(q8Var.y(), l11Var)) {
                        q8Var.w.setValue(l11Var);
                        if (!q8Var.x(value)) {
                            q8Var.q.setValue(value);
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ts3.m(ts3Var2, (us3) arrayList.get(i5), 0, 0);
                }
                return og5Var;
            default:
                cu1 cu1Var = (cu1) obj4;
                k44 k44Var = (k44) obj3;
                bc bcVar = (bc) obj2;
                f00 f00Var = (f00) obj;
                if (((cu1) obj5) != ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).x()) {
                    return Boolean.TRUE;
                }
                boolean zT = kq2.T(i2, bcVar, cu1Var, k44Var);
                Boolean boolValueOf = Boolean.valueOf(zT);
                if (zT || !f00Var.g()) {
                    return boolValueOf;
                }
                return null;
        }
    }

    public /* synthetic */ dk0(cu1 cu1Var, cu1 cu1Var2, k44 k44Var, int i, bc bcVar) {
        this.a = cu1Var;
        this.m = cu1Var2;
        this.q = k44Var;
        this.t = i;
        this.w = bcVar;
    }

    public /* synthetic */ dk0(us3[] us3VarArr, ek0 ek0Var, int i, v33 v33Var, int[] iArr) {
        this.a = us3VarArr;
        this.m = ek0Var;
        this.t = i;
        this.q = v33Var;
        this.w = iArr;
    }
}
