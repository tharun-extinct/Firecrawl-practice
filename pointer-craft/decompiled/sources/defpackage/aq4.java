package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq4 {
    public static final zu4 g = m50.b0(0.0f, 0.0f, null, 7);

    public static final bw4 g(long j, zu4 zu4Var, String str, h02 h02Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            zu4Var = g;
        }
        zu4 zu4Var2 = zu4Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zX = h02Var.x(jj0.v(j));
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            te5 te5Var = new te5(vg.b, new zg(jj0.v(j), (byte) 3));
            h02Var.i0(te5Var);
            objK = te5Var;
        }
        return ug.n(new jj0(j), (te5) objK, zu4Var2, null, str2, h02Var, (i << 6) & 57344, 8);
    }
}
