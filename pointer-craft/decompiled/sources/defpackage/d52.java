package defpackage;

import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d52 implements ex0, gm0, s86, yt0, bu3, yx0 {
    public static SharedPreferences b = null;
    public static boolean s = true;
    public final /* synthetic */ byte j;
    public static final /* synthetic */ d52 t = new d52(1);
    public static final d52 a = new d52(2);
    public static final /* synthetic */ d52 m = new d52(3);
    public static final d52 q = new d52(4);
    public static final d52 w = new d52(5);
    public static final /* synthetic */ d52 c = new d52(6);
    public static final d52 i = new d52(7);

    public /* synthetic */ d52(byte b2) {
        this.j = b2;
    }

    public static mc3 g(jq jqVar, ad3 ad3Var, Bundle bundle, wt2 wt2Var, q64 q64Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        ad3Var.getClass();
        wt2Var.getClass();
        return new mc3(jqVar, ad3Var, bundle, wt2Var, q64Var, string, null);
    }

    public static Typeface v(String str, qv1 qv1Var, int i2) {
        if (i2 == 0 && yf2.p(qv1Var, qv1.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i2 == 0 && yf2.p(qv1Var, qv1.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), qv1Var.j, i2 == 1);
    }

    public static Path x(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 2:
                Object objJ = vlVar.j(new e24(ru2.class, Executor.class));
                objJ.getClass();
                return c93.d((Executor) objJ);
            default:
                return new f73((byte) 0);
        }
    }

    @Override // defpackage.bu3
    public Typeface n(g12 g12Var, qv1 qv1Var, int i2) {
        return v(g12Var.w, qv1Var, i2);
    }

    @Override // defpackage.bu3
    public Typeface r(qv1 qv1Var, int i2) {
        return v(null, qv1Var, i2);
    }

    @Override // defpackage.s86
    public p96 t(Class cls) {
        if (!y66.class.isAssignableFrom(cls)) {
            l0.u("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (p96) y66.w(cls.asSubclass(y66.class)).a(3);
        } catch (Exception e) {
            uo1.w("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    public String toString() {
        switch (this.j) {
            case 5:
                return "Start";
            case kq2.x /* 15 */:
                int iHashCode = hashCode();
                a11.x(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return xi3.a("CreationExtras.Key@", string, "<", v54.g(Bundle.class).r(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.s86
    public boolean w(Class cls) {
        return y66.class.isAssignableFrom(cls);
    }

    @Override // defpackage.yt0
    public long y(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i2 = be4.g;
            return jFloatToRawIntBits;
        }
        float fD = gp4.D(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
        int i3 = be4.g;
        return jFloatToRawIntBits2;
    }
}
