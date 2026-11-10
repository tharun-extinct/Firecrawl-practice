package defpackage;

import android.content.Context;
import io.appground.blek.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hf6 {
    public static long a(InputStream inputStream, int i) {
        byte[] bArrX = x(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrX[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final void g(jj jjVar, my1 my1Var, j73 j73Var, h02 h02Var, int i) {
        jjVar.getClass();
        my1Var.getClass();
        h02Var.Z(-2105562571);
        int i2 = i | (h02Var.j(jjVar) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            c93.x(my1Var, j73Var, false, null, null, null, null, null, ue5.m0(-1533489083, new tn((Object) jjVar, (byte) 19), h02Var), h02Var, ((i2 >> 3) & 14) | 805306416, 508);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm4((Object) jjVar, my1Var, (Object) j73Var, i, (byte) 4);
        }
    }

    public static final List j(cc4 cc4Var) {
        int iP = lr2.p(cc4Var, "id");
        int iP2 = lr2.p(cc4Var, "seq");
        int iP3 = lr2.p(cc4Var, "from");
        int iP4 = lr2.p(cc4Var, "to");
        uv2 uv2VarC = pw5.c();
        while (cc4Var.H()) {
            uv2VarC.add(new aw1((int) cc4Var.getLong(iP), (int) cc4Var.getLong(iP2), cc4Var.q(iP3), cc4Var.q(iP4)));
        }
        return cj0.A0(pw5.a(uv2VarC));
    }

    public static byte[] l(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void m(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static final void n(ne5 ne5Var, h02 h02Var, int i, int i2) {
        h02Var.Z(-967099207);
        int i3 = (((i2 & 1) == 0 && h02Var.x(ne5Var)) ? 4 : 2) | i;
        byte b = 1;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                Object objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new m75(b);
                    h02Var.i0(objK);
                }
                ne5Var = gz5.n((xy1) objK, h02Var);
                i3 &= -15;
            }
            h02Var.s();
            j73 j73VarE0 = ue5.e0(mq4.r, 16.0f);
            ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var, 48);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarE0);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, ek0VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            if (((Boolean) ne5Var.v.getValue()).booleanValue()) {
                h02Var.X(-226480770);
                y(ne5Var, h02Var, i3 & 14);
                h02Var.b(false);
            } else {
                h02Var.X(-226791452);
                me5 me5Var = (me5) ne5Var.r.getValue();
                ra.g(gk0.g, me5Var instanceof le5 ? (le5) me5Var : null, ue5.m0(1579095648, new tn((Object) ne5Var, (byte) 18), h02Var), h02Var, 454);
                h02Var.b(false);
            }
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new db((Object) ne5Var, i, i2, (byte) 9);
        }
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m(byteArrayOutputStream, i, 2);
    }

    public static final void r(le5 le5Var, xy1 xy1Var, h02 h02Var, int i) {
        h02 h02Var2 = h02Var;
        xy1Var.getClass();
        h02Var2.Z(800275870);
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? h02Var2.x(le5Var) : h02Var2.j(le5Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= h02Var2.j(xy1Var) ? 32 : 16;
        }
        int i3 = i2;
        if (h02Var2.N(i3 & 1, (i3 & 19) != 18)) {
            j73 j73VarP = gp4.P(mq4.r, gp4.O(h02Var2), true);
            ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarP);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            String strI = xs2.I(le5Var.r(), h02Var2);
            k85 k85Var = ((mf5) h02Var2.a(of5.g)).l;
            g73 g73Var = g73.g;
            g75.y(strI, ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var, h02Var, 48, 0, 131068);
            h02Var2 = h02Var;
            h02Var2.X(1732276782);
            for (jj jjVar : le5Var.y()) {
                boolean zJ = h02Var2.j(jjVar) | ((i3 & 112) == 32);
                Object objK = h02Var2.K();
                if (zJ || objK == oo0.g) {
                    objK = new o82((Object) xy1Var, (Object) jjVar, (byte) 21);
                    h02Var2.i0(objK);
                }
                g(jjVar, (my1) objK, ue5.g0(mq4.r(g73Var, 1.0f), 0.0f, 4.0f, 1), h02Var2, 392);
            }
            h02Var2.b(false);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ej((byte) 6, i, (Object) le5Var, (Object) xy1Var);
        }
    }

    public static final e25 t(tb4 tb4Var, String str, boolean z) {
        cc4 cc4VarO = tb4Var.O("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iP = lr2.p(cc4VarO, "seqno");
            int iP2 = lr2.p(cc4VarO, "cid");
            int iP3 = lr2.p(cc4VarO, "name");
            int iP4 = lr2.p(cc4VarO, "desc");
            if (iP != -1 && iP2 != -1 && iP3 != -1 && iP4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cc4VarO.H()) {
                    if (((int) cc4VarO.getLong(iP2)) >= 0) {
                        int i = (int) cc4VarO.getLong(iP);
                        String strQ = cc4VarO.q(iP3);
                        String str2 = cc4VarO.getLong(iP4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strQ);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listB0 = cj0.B0(linkedHashMap.entrySet(), new fu1((byte) 12));
                ArrayList arrayList = new ArrayList(dj0.Y(listB0, 10));
                Iterator it = listB0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listF0 = cj0.F0(arrayList);
                List listB1 = cj0.B0(linkedHashMap2.entrySet(), new fu1((byte) 13));
                ArrayList arrayList2 = new ArrayList(dj0.Y(listB1, 10));
                Iterator it2 = listB1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                e25 e25Var = new e25(str, listF0, cj0.F0(arrayList2), z);
                c93.h(cc4VarO, null);
                return e25Var;
            }
            c93.h(cc4VarO, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    public static byte[] v(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] x(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                l0.z(xi3.j("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static final void y(ne5 ne5Var, h02 h02Var, int i) {
        int i2;
        byte b;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1418958760);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = i | (h02Var2.x(ne5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (h02Var2.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new m75(b2);
                h02Var2.i0(objK);
            }
            xy1 xy1Var = (xy1) objK;
            xy1Var.getClass();
            Context context = (Context) h02Var2.a(sa.y);
            Object objK2 = h02Var2.K();
            if (objK2 == l76Var) {
                objK2 = k33.E(h02Var2);
                h02Var2.i0(objK2);
            }
            ox0 ox0Var = (ox0) objK2;
            boolean zJ = h02Var2.j(ox0Var) | h02Var2.j(context);
            Object objK3 = h02Var2.K();
            if (zJ || objK3 == l76Var) {
                objK3 = new lt(ox0Var, context, xy1Var);
                h02Var2.i0(objK3);
            }
            my1 my1Var = (my1) objK3;
            j73 j73VarP = gp4.P(mq4.r, gp4.O(h02Var2), true);
            ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarP);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            String strI = xs2.I(R.string.proposed_solution, h02Var2);
            vf1 vf1Var = of5.g;
            k85 k85Var = ((mf5) h02Var2.a(vf1Var)).l;
            g73 g73Var = g73.g;
            g75.y(strI, ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var, h02Var, 48, 0, 131068);
            me5 me5Var = (me5) ne5Var.r.getValue();
            ce5 ce5Var = me5Var instanceof ce5 ? (ce5) me5Var : null;
            g75.y(xs2.I(ce5Var != null ? ce5Var.g() : R.string.empty, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).a, h02Var, 0, 0, 131070);
            m50.p(ue5.g0(g73Var, 0.0f, 16.0f, 1), 0.0f, 0L, h02Var, 6, 6);
            b = 1;
            g75.y(xs2.I(R.string.connection_help_discord_text, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).a, h02Var, 48, 0, 131068);
            boolean zX = h02Var.x(my1Var);
            Object objK4 = h02Var.K();
            if (zX || objK4 == l76Var) {
                objK4 = new ss(my1Var, (byte) 12);
                h02Var.i0(objK4);
            }
            c93.s((my1) objK4, null, false, null, null, null, zz5.g, h02Var, 805306368, 510);
            h02Var2 = h02Var;
            h02Var2.b(true);
        } else {
            b = 1;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new m80(ne5Var, i, b);
        }
    }
}
