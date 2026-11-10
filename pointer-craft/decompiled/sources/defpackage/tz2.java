package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tz2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ tz2(my1 my1Var, byte b) {
        this.j = b;
        this.t = my1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                my1Var.g();
                return og5Var;
            case 1:
                my1Var.g();
                return og5Var;
            case 2:
                my1Var.g();
                return og5Var;
            case 3:
                my1Var.g();
                return og5Var;
            case 4:
                nj4 nj4Var = (nj4) obj;
                Object objG = my1Var.g();
                Float f = (Float) (Float.isNaN(((Number) objG).floatValue()) ? null : objG);
                lj4.j(nj4Var, new rz3(f != null ? f.floatValue() : 0.0f, new ki0(0.0f, 1.0f)));
                return og5Var;
            case 5:
                nj4 nj4Var2 = (nj4) obj;
                Object objG2 = my1Var.g();
                Float f2 = (Float) (Float.isNaN(((Number) objG2).floatValue()) ? null : objG2);
                lj4.j(nj4Var2, new rz3(f2 != null ? f2.floatValue() : 0.0f, new ki0(0.0f, 1.0f)));
                return og5Var;
            case 6:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) my1Var.g()).floatValue());
            default:
                return (wi3) my1Var.g();
        }
    }
}
