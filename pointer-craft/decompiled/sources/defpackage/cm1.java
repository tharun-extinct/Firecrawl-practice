package defpackage;

import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements gm0, ex0, i41, yt0, yx0, lt3 {
    public static final za m;
    public static final cm1 q;
    public final /* synthetic */ byte j;
    public static final za t = new za(0);
    public static final za a = new za(1);
    public static final /* synthetic */ cm1 w = new cm1(3);
    public static final cm1 c = new cm1(4);
    public static final cm1 i = new cm1(5);
    public static final iq5 b = new iq5();
    public static final /* synthetic */ cm1 s = new cm1(7);

    static {
        byte b2 = 2;
        m = new za(b2);
        q = new cm1(b2);
    }

    public /* synthetic */ cm1(byte b2) {
        this.j = b2;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 2:
                Object objJ = vlVar.j(new e24(iw.class, Executor.class));
                objJ.getClass();
                return c93.d((Executor) objJ);
            default:
                return new d93(vlVar.n(e24.g(c93.class)));
        }
    }

    @Override // defpackage.i41
    public boolean g(SSLSocket sSLSocket) {
        return ay4.P(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(x84 x84Var, og ogVar, eh0 eh0Var, ou0 ou0Var) {
        tg0 tg0Var;
        if (ou0Var instanceof tg0) {
            tg0Var = (tg0) ou0Var;
            int i2 = tg0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tg0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                tg0Var = new tg0(this, ou0Var);
            }
        } else {
            tg0Var = new tg0(this, ou0Var);
        }
        Object obj = tg0Var.q;
        int i3 = tg0Var.c;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (i3 == 0) {
            js2.o(obj);
            if (x84Var instanceof v84) {
                long jG = ((v84) x84Var).g();
                tg0Var.m = ogVar;
                tg0Var.c = 1;
                if (yf2.e(jG, tg0Var) != px0Var) {
                }
            }
            if (yf2.p(x84Var, u84.g)) {
                eh0Var.g();
                return og5Var;
            }
            if (!yf2.p(x84Var, w84.g) && !yf2.p(x84Var, t84.g)) {
                uo1.g();
                return null;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ogVar = tg0Var.m;
        js2.o(obj);
        tg0Var.m = null;
        tg0Var.c = 2;
        return ogVar.a(tg0Var) == px0Var ? px0Var : og5Var;
    }

    @Override // defpackage.i41
    public wt4 r(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new te(superclass);
    }

    public String toString() {
        switch (this.j) {
            case kq2.x /* 15 */:
                int iHashCode = hashCode();
                a11.x(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return xi3.a("CreationExtras.Key@", string, "<", v54.g(wl5.class).r(), ">");
            case 16:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yt0
    public long y(long j, long j2) {
        float fD = gp4.D(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
        int i2 = be4.g;
        return jFloatToRawIntBits;
    }
}
