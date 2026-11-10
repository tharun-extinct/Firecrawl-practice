package defpackage;

import android.content.Context;
import com.google.firebase.iid.Registrar;
import io.appground.blek.R;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements w70, l84, ot4, gm0, iq1, ex0, hz4, gm5, so4, yx0, s86 {
    public static hi0 F;
    public final /* synthetic */ byte j;
    public static final k00 t = new k00(-1.0f, -1.0f);
    public static final k00 a = new k00(0.0f, -1.0f);
    public static final k00 m = new k00(1.0f, -1.0f);
    public static final k00 q = new k00(-1.0f, 0.0f);
    public static final k00 w = new k00(0.0f, 0.0f);
    public static final k00 c = new k00(1.0f, 0.0f);
    public static final k00 i = new k00(-1.0f, 1.0f);
    public static final k00 b = new k00(0.0f, 1.0f);
    public static final k00 s = new k00(1.0f, 1.0f);
    public static final j00 p = new j00(-1.0f);
    public static final j00 u = new j00(0.0f);
    public static final j00 z = new j00(1.0f);
    public static final i00 h = new i00(-1.0f);
    public static final i00 o = new i00(0.0f);
    public static final i00 f = new i00(1.0f);
    public static final hi0 k = new hi0(2);
    public static final fl2 d = fl2.j;
    public static final m51 e = new m51(1.0f, 1.0f);
    public static final hi0 A = new hi0(3);
    public static final hi0 B = new hi0(4);
    public static final hi0 C = new hi0(5);
    public static final hi0 D = new hi0(6);
    public static final /* synthetic */ hi0 E = new hi0(7);

    public /* synthetic */ hi0(byte b2) {
        this.j = b2;
    }

    @Override // defpackage.hz4
    public iz4 a(ok2 ok2Var) {
        return new ey1((Context) ok2Var.y, (String) ok2Var.r, (gz4) ok2Var.n, ok2Var.g);
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 5:
                return Registrar.lambda$getComponents$0$Registrar(vlVar);
            default:
                lh0 lh0Var = new lh0();
                ReferenceQueue referenceQueue = lh0Var.g;
                Set set = lh0Var.y;
                set.add(new t26(lh0Var, referenceQueue, set));
                Thread thread = new Thread(new i26((Object) referenceQueue, (Object) set, (byte) 17), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return lh0Var;
        }
    }

    @Override // defpackage.so4
    public er1 g(uy4 uy4Var) {
        return new f10(uy4Var, (byte) 2);
    }

    @Override // defpackage.w70
    public fl2 getLayoutDirection() {
        return d;
    }

    @Override // defpackage.iq1
    public float j(float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.gm5
    public int l() {
        return R.id.view_tree_view_model_store_owner;
    }

    @Override // defpackage.iq1
    public float m(float f2, long j) {
        return 0.0f;
    }

    @Override // defpackage.w70
    public long n() {
        return 9205357640488583168L;
    }

    @Override // defpackage.iq1
    public float q(float f2, float f3, long j) {
        return 0.0f;
    }

    @Override // defpackage.ot4
    public boolean r(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.s86
    public p96 t(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public String toString() {
        switch (this.j) {
            case 4:
                return "NeverEqualPolicy";
            case 10:
                return "CompositionErrorContext";
            case 16:
                return "SharingStarted.Lazily";
            case 18:
                int iHashCode = hashCode();
                a11.x(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return xi3.a("CreationExtras.Key@", string, "<", v54.g(String.class).r(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.iq1
    public long v(float f2) {
        return 0L;
    }

    @Override // defpackage.s86
    public boolean w(Class cls) {
        return false;
    }

    @Override // defpackage.iq1
    public float x() {
        return 0.0f;
    }

    @Override // defpackage.w70
    public j51 y() {
        return e;
    }
}
