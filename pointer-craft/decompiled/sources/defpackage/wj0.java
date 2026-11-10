package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj0 {
    public static final c94 a;
    public static final c94 b;
    public static final c94 c;
    public static final uj0[] d;
    public static final c94 f;
    public static final float[] g;
    public static final c94 h;
    public static final c94 i;
    public static final c94 j;
    public static final ij3 k;
    public static final c94 l;
    public static final c94 m;
    public static final ub5 n;
    public static final c94 o;
    public static final c94 p;
    public static final c94 q;
    public static final ub5 r;
    public static final c94 s;
    public static final c94 t;
    public static final ik2 u;
    public static final c94 v;
    public static final c94 w;
    public static final c94 x;
    public static final float[] y;
    public static final ik2 z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        g = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        y = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        ub5 ub5Var = new ub5(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        ub5 ub5Var2 = new ub5(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        ub5 ub5Var3 = new ub5(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        r = ub5Var3;
        ub5 ub5Var4 = new ub5(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        n = ub5Var4;
        fn5 fn5Var = c93.u;
        c94 c94Var = new c94("sRGB IEC61966-2.1", fArr, fn5Var, ub5Var, 0);
        v = c94Var;
        c94 c94Var2 = new c94("sRGB IEC61966-2.1 (Linear)", fArr, fn5Var, 1.0d, 0.0f, 1.0f, 1);
        x = c94Var2;
        c94 c94Var3 = new c94("scRGB-nl IEC 61966-2-2:2003", fArr, fn5Var, null, new l0((byte) 12), new l0((byte) 13), -0.799f, 2.399f, ub5Var, 2);
        l = c94Var3;
        c94 c94Var4 = new c94("scRGB IEC 61966-2-2:2003", fArr, fn5Var, 1.0d, -0.5f, 7.499f, 3);
        j = c94Var4;
        c94 c94Var5 = new c94("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, fn5Var, new ub5(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        t = c94Var5;
        c94 c94Var6 = new c94("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, fn5Var, new ub5(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        a = c94Var6;
        c94 c94Var7 = new c94("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new fn5(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        m = c94Var7;
        c94 c94Var8 = new c94("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, fn5Var, ub5Var, 7);
        q = c94Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        c94 c94Var9 = new c94("NTSC (1953)", fArr2, c93.b, new ub5(d4, d5, d6, d2, d3), 8);
        w = c94Var9;
        c94 c94Var10 = new c94("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, fn5Var, new ub5(d4, d5, d6, d2, d3), 9);
        c = c94Var10;
        c94 c94Var11 = new c94("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, fn5Var, 2.2d, 0.0f, 1.0f, 10);
        i = c94Var11;
        c94 c94Var12 = new c94("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, c93.s, new ub5(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        b = c94Var12;
        fn5 fn5Var2 = c93.p;
        c94 c94Var13 = new c94("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, fn5Var2, 1.0d, -65504.0f, 65504.0f, 12);
        s = c94Var13;
        c94 c94Var14 = new c94("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, fn5Var2, 1.0d, -65504.0f, 65504.0f, 13);
        p = c94Var14;
        ik2 ik2Var = new ik2("Generic XYZ", 12884901889L, 14, (byte) 1);
        u = ik2Var;
        ik2 ik2Var2 = new ik2("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        z = ik2Var2;
        c94 c94Var15 = new c94("None", fArr, fn5Var, ub5Var2, 16);
        h = c94Var15;
        c94 c94Var16 = new c94("Hybrid Log Gamma encoding", fArr3, fn5Var, null, new l0((byte) 14), new l0((byte) 15), 0.0f, 1.0f, ub5Var3, 17);
        o = c94Var16;
        c94 c94Var17 = new c94("Perceptual Quantizer encoding", fArr3, fn5Var, null, new l0((byte) 16), new l0((byte) 17), 0.0f, 1.0f, ub5Var4, 18);
        f = c94Var17;
        ij3 ij3Var = new ij3("Oklab", 12884901890L, 19);
        k = ij3Var;
        d = new uj0[]{c94Var, c94Var2, c94Var3, c94Var4, c94Var5, c94Var6, c94Var7, c94Var8, c94Var9, c94Var10, c94Var11, c94Var12, c94Var13, c94Var14, ik2Var, ik2Var2, c94Var15, c94Var16, c94Var17, ij3Var};
    }

    public static double g(ub5 ub5Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = ub5Var.y;
        double d6 = ub5Var.r;
        double d7 = ub5Var.n;
        double d8 = ub5Var.v;
        double d9 = ub5Var.x;
        double d10 = d5 * d4;
        return (ub5Var.l + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double n(ub5 ub5Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -ub5Var.y;
        double d6 = ub5Var.v;
        double d7 = 1.0d / ub5Var.l;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-ub5Var.x)) + ub5Var.r), 1.0d / ub5Var.n) * d3;
    }

    public static double r(ub5 ub5Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = ub5Var.y;
        double d6 = ub5Var.n;
        double dPow = (Math.pow(d4, d6) * ub5Var.r) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * ub5Var.x) + ub5Var.v), ub5Var.l) * d3;
    }

    public static double y(ub5 ub5Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / ub5Var.y;
        double d5 = 1.0d / ub5Var.r;
        double d6 = 1.0d / ub5Var.n;
        double d7 = ub5Var.v;
        double d8 = ub5Var.x;
        double d9 = (d2 * d3) / (ub5Var.l + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }
}
