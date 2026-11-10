package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends kk2 implements xy1 {
    public final /* synthetic */ gh a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh(gh ghVar, byte b) {
        super(1);
        this.t = b;
        this.a = ghVar;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.t;
        og5 og5Var = og5.g;
        int i = 0;
        gh ghVar = this.a;
        switch (b) {
            case 0:
                ts3 ts3Var = (ts3) obj;
                us3[] us3VarArr = ghVar.r;
                us3VarArr.getClass();
                int i2 = ghVar.v;
                int i3 = ghVar.l;
                int length = us3VarArr.length;
                while (i < length) {
                    us3 us3Var = us3VarArr[i];
                    if (us3Var != null) {
                        long jG = ghVar.g.y.g((((long) us3Var.j) << 32) | (((long) us3Var.t) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), fl2.j);
                        ts3Var.j(us3Var, (int) (jG >> 32), (int) (jG & 4294967295L), 0.0f);
                    }
                    i++;
                    us3VarArr = us3VarArr;
                }
                break;
            default:
                ts3 ts3Var2 = (ts3) obj;
                us3[] us3VarArr2 = ghVar.y;
                us3VarArr2.getClass();
                int i4 = ghVar.n;
                int i5 = ghVar.x;
                int length2 = us3VarArr2.length;
                while (i < length2) {
                    us3 us3Var2 = us3VarArr2[i];
                    if (us3Var2 != null) {
                        u6 u6Var = ghVar.g.y;
                        int i6 = us3Var2.j;
                        long jG2 = u6Var.g((((long) us3Var2.t) & 4294967295L) | (((long) i6) << 32), (((long) i4) << 32) | (((long) i5) & 4294967295L), fl2.j);
                        ts3Var2.j(us3Var2, (int) (jG2 >> 32), (int) (jG2 & 4294967295L), 0.0f);
                    }
                    i++;
                    og5Var = og5Var;
                }
                break;
        }
        return og5Var;
    }
}
