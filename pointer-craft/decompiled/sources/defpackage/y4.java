package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y4 implements my1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ y4(byte b) {
        this.j = b;
    }

    @Override // defpackage.my1
    public final Object g() {
        Choreographer choreographer;
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                z0 z0Var = w24.j;
                return Integer.valueOf(w24.j.g().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                sa.g("LocalConfiguration");
                throw null;
            case 3:
                sa.g("LocalContext");
                throw null;
            case 4:
                sa.g("LocalImageVectorCache");
                throw null;
            case 5:
                sa.g("LocalResourceIdCache");
                throw null;
            case 6:
                sa.g("LocalView");
                throw null;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    x21 x21Var = na1.g;
                    choreographer = (Choreographer) v70.N(p03.g, new kf());
                }
                nf nfVar = new nf(choreographer, k33.D(Looper.getMainLooper()));
                return a11.k(nfVar, nfVar.u);
            case 9:
            case 10:
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return og5Var;
            case 12:
                vf1 vf1Var = mk.g;
                return h31.g;
            case 13:
                vf1 vf1Var2 = mk.g;
                return aj6.q;
            case 14:
                return kq2.M(null);
            case kq2.x /* 15 */:
                return null;
            case 16:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                executorServiceNewSingleThreadExecutor.getClass();
                return new bm1(executorServiceNewSingleThreadExecutor);
            case 17:
                return Executors.newSingleThreadExecutor();
            case 18:
                return og5Var;
            case 19:
                return tj0.x(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 20:
                return Boolean.TRUE;
            case 21:
                return new um2(2);
            case 22:
                throw new IllegalStateException("No default size");
            case 23:
            case 24:
            case 25:
                return null;
            case 26:
                throw new IllegalStateException("No default context");
            case 27:
                return new gx3(false, false, new yj2((byte) 6), new bn0((byte) 22));
            case 28:
                hp0.y("LocalViewConfiguration");
                throw null;
            default:
                hp0.y("LocalWindowInfo");
                throw null;
        }
    }
}
