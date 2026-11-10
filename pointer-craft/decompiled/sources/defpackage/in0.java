package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in0 implements xy1 {
    public final /* synthetic */ byte j;
    public static final in0 t = new in0(0);
    public static final in0 a = new in0(1);
    public static final in0 m = new in0(2);
    public static final in0 q = new in0(3);
    public static final in0 w = new in0(4);

    public /* synthetic */ in0(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return og5Var;
            case 1:
                float[] fArr = ((l33) obj).g;
                return og5Var;
            case 2:
                return Boolean.valueOf(((n22) obj) instanceof ow);
            case 3:
                return Boolean.valueOf(((n22) obj) instanceof e4);
            default:
                if (yf2.p(obj, Boolean.FALSE)) {
                    return new jj0(jj0.j);
                }
                obj.getClass();
                return new jj0(ra.n(((Integer) obj).intValue()));
        }
    }
}
