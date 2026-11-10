package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vg extends kk2 implements xy1 {
    public static final vg A;
    public static final vg B;
    public static final vg a;
    public static final vg b;
    public static final vg c;
    public static final vg d;
    public static final vg e;
    public static final vg f;
    public static final vg h;
    public static final vg i;
    public static final vg k;
    public static final vg m;
    public static final vg o;
    public static final vg p;
    public static final vg q;
    public static final vg s;
    public static final vg u;
    public static final vg w;
    public static final vg z;
    public final /* synthetic */ byte t;

    static {
        int i2 = 1;
        a = new vg(i2, (byte) 0);
        m = new vg(i2, (byte) 1);
        q = new vg(i2, (byte) 2);
        w = new vg(i2, (byte) 3);
        c = new vg(i2, (byte) 4);
        i = new vg(i2, (byte) 5);
        b = new vg(i2, (byte) 6);
        s = new vg(i2, (byte) 7);
        p = new vg(i2, (byte) 8);
        u = new vg(i2, (byte) 9);
        z = new vg(i2, (byte) 10);
        h = new vg(i2, (byte) 11);
        o = new vg(i2, (byte) 12);
        f = new vg(i2, (byte) 13);
        k = new vg(i2, (byte) 14);
        d = new vg(i2, (byte) 15);
        e = new vg(i2, (byte) 16);
        A = new vg(i2, (byte) 17);
        B = new vg(i2, (byte) 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(int i2, byte b2) {
        super(i2);
        this.t = b2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b2 = this.t;
        og5 og5Var = og5.g;
        switch (b2) {
            case 0:
                return new zt0(yj1.v(m50.e0(220, 90, null, 4), 2).g(new ek1(new mc5((hn1) null, (vq4) null, (wc0) null, new ae4(0.92f, vb5.y, m50.e0(220, 90, null, 4)), (LinkedHashMap) null, 119))), yj1.x(m50.e0(90, 0, null, 6), 2), (sq4) null, 12);
            case 1:
                return obj;
            case 2:
                return null;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 6:
                long jG = jj0.g(((jj0) obj).g, wj0.k);
                return new ui(jj0.r(jG), jj0.l(jG), jj0.x(jG), jj0.n(jG));
            case 7:
                return obj;
            case 8:
                long j = ((vb5) obj).g;
                return new si(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 9:
                si siVar = (si) obj;
                return new vb5(xs2.r(siVar.g, siVar.y));
            case 10:
                return m50.b0(0.0f, 0.0f, null, 7);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                long j2 = ((qe2) obj).g;
                return new qe2(0L);
            case 12:
                long j3 = ((qe2) obj).g;
                return new qe2(0L);
            case 13:
                long j4 = ((qe2) obj).g;
                return new je2(0L);
            case 14:
                return yj1.n;
            case kq2.x /* 15 */:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new xp4(absolutePath);
            case 16:
                return og5Var;
            case 17:
                xd1.B((xd1) obj, jj0.l, 0L, 0L, 0.0f, 126);
                return og5Var;
            case 18:
                ((Context) obj).getClass();
                return pi1.j;
            case 19:
                return new qe2((((long) ((int) (((qe2) obj).g & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 20:
                return new qe2((((long) ((int) (((qe2) obj).g >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 21:
                return new qe2((((long) ((int) (((qe2) obj).g & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new qe2((((long) ((int) (((qe2) obj).g >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
