package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class ra0 {
    public final /* synthetic */ byte g;
    public static final ra0 y = new ra0(0);
    public static final ra0 r = new ra0(1);

    public /* synthetic */ ra0(byte b) {
        this.g = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:101:0x0154  */
    /* JADX WARN: Code duplicated, block: B:104:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    public static rr g(z74 z74Var, tl1 tl1Var, p34 p34Var) throws ProtocolException {
        String strG;
        rr rrVar;
        z82 z82Var;
        a92 a92VarA;
        cp1 cp1VarY;
        int i;
        z74 z74Var2;
        pa4 pa4Var = tl1Var != null ? tl1Var.y().r : null;
        int i2 = z74Var.m;
        String str = z74Var.j.y;
        boolean z = false;
        if (i2 == 307 || i2 == 308) {
            if (p34Var.g.j.j) {
                strG = z74Var.w.g("Location");
                if (strG == null) {
                    strG = null;
                }
                rrVar = z74Var.j;
                if (strG != null) {
                    a92 a92Var = (a92) rrVar.r;
                    a92Var.getClass();
                    try {
                        z82Var = new z82();
                        z82Var.c(a92Var, strG);
                    } catch (IllegalArgumentException unused) {
                        z82Var = null;
                    }
                    if (z82Var != null) {
                        a92VarA = z82Var.a();
                    } else {
                        a92VarA = null;
                    }
                    if (a92VarA != null && (yf2.p(a92VarA.g, ((a92) rrVar.r).g) || p34Var.g.j.t)) {
                        cp1VarY = rrVar.y();
                        if (fh6.r(str)) {
                            i = z74Var.m;
                            if (i == 303) {
                                z = !str.equals("PROPFIND");
                            } else if (i != 307 && i != 308 && !str.equals("PROPFIND") && !str.equals("QUERY")) {
                                z = true;
                            }
                            if (z) {
                                cp1VarY.m("GET", null);
                                ((fa4) cp1VarY.r).J("Transfer-Encoding");
                                ((fa4) cp1VarY.r).J("Content-Length");
                                ((fa4) cp1VarY.r).J("Content-Type");
                            } else {
                                cp1VarY.m(str, (d74) rrVar.v);
                            }
                        }
                        if (!ws5.g((a92) rrVar.r, a92VarA)) {
                            ((fa4) cp1VarY.r).J("Authorization");
                        }
                        cp1VarY.g = a92VarA;
                        return new rr(cp1VarY);
                    }
                }
            }
        } else {
            if (i2 == 401) {
                p34Var.t.getClass();
                return null;
            }
            if (i2 != 421) {
                if (i2 == 503) {
                    z74 z74Var3 = z74Var.p;
                    if ((z74Var3 == null || z74Var3.m != 503) && n(z74Var, Integer.MAX_VALUE) == 0) {
                        return z74Var.j;
                    }
                } else {
                    if (i2 == 407) {
                        pa4Var.getClass();
                        if (pa4Var.y.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        p34Var.b.getClass();
                        return null;
                    }
                    if (i2 != 408) {
                        switch (i2) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                if (p34Var.g.j.j) {
                                    strG = z74Var.w.g("Location");
                                    if (strG == null) {
                                        strG = null;
                                    }
                                    rrVar = z74Var.j;
                                    if (strG != null) {
                                        a92 a92Var2 = (a92) rrVar.r;
                                        a92Var2.getClass();
                                        z82Var = new z82();
                                        z82Var.c(a92Var2, strG);
                                        if (z82Var != null) {
                                            a92VarA = z82Var.a();
                                        } else {
                                            a92VarA = null;
                                        }
                                        if (a92VarA != null) {
                                            cp1VarY = rrVar.y();
                                            if (fh6.r(str)) {
                                                i = z74Var.m;
                                                if (i == 303) {
                                                    z = !str.equals("PROPFIND");
                                                } else if (i != 307) {
                                                    z = true;
                                                }
                                                if (z) {
                                                    cp1VarY.m("GET", null);
                                                    ((fa4) cp1VarY.r).J("Transfer-Encoding");
                                                    ((fa4) cp1VarY.r).J("Content-Length");
                                                    ((fa4) cp1VarY.r).J("Content-Type");
                                                } else {
                                                    cp1VarY.m(str, (d74) rrVar.v);
                                                }
                                            }
                                            if (!ws5.g((a92) rrVar.r, a92VarA)) {
                                                ((fa4) cp1VarY.r).J("Authorization");
                                            }
                                            cp1VarY.g = a92VarA;
                                            return new rr(cp1VarY);
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (p34Var.p && (((z74Var2 = z74Var.p) == null || z74Var2.m != 408) && n(z74Var, 0) <= 0)) {
                        return z74Var.j;
                    }
                }
            } else if (tl1Var != null && !yf2.p(tl1Var.y.x().a.t.n, tl1Var.r.x().x().g.t.n)) {
                m34 m34VarY = tl1Var.y();
                synchronized (m34VarY) {
                    m34VarY.q = true;
                }
                return z74Var.j;
            }
        }
        return null;
    }

    public static int n(z74 z74Var, int i) {
        String strG = z74Var.w.g("Retry-After");
        if (strG == null) {
            strG = null;
        }
        if (strG == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strG).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strG);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public static boolean r(IOException iOException, l34 l34Var, p34 p34Var, rr rrVar) {
        boolean z = iOException instanceof lq0;
        if (!p34Var.p) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        tl1 tl1Var = l34Var.d;
        if (tl1Var == null || !tl1Var.n) {
            return false;
        }
        wl1 wl1Var = l34Var.i;
        wl1Var.getClass();
        r34 r34VarX = wl1Var.x();
        tl1 tl1Var2 = l34Var.d;
        return r34VarX.g(tl1Var2 != null ? tl1Var2.y() : null);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:143:0x0317  */
    /* JADX WARN: Code duplicated, block: B:155:0x0363  */
    /* JADX WARN: Code duplicated, block: B:158:0x0371  */
    /* JADX WARN: Code duplicated, block: B:366:0x082e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0835  */
    /* JADX WARN: Code duplicated, block: B:373:0x083f A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:374:0x084b A[PHI: r17
  0x084b: PHI (r17v3 y74) = (r17v2 y74), (r17v4 y74) binds: [B:369:0x0833, B:372:0x083d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:388:0x0881 A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:392:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:393:0x08af  */
    /* JADX WARN: Code duplicated, block: B:395:0x08b2 A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:397:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:398:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:400:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:401:0x08c0 A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x08ca A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:406:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:409:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:410:0x08db  */
    /* JADX WARN: Code duplicated, block: B:414:0x0902 A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:417:0x092c A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:419:0x0934  */
    /* JADX WARN: Code duplicated, block: B:420:0x0936  */
    /* JADX WARN: Code duplicated, block: B:423:0x093d A[Catch: IOException -> 0x084e, TryCatch #8 {IOException -> 0x084e, blocks: (B:371:0x0836, B:373:0x083f, B:377:0x0851, B:386:0x0878, B:388:0x0881, B:389:0x0888, B:390:0x08a1, B:395:0x08b2, B:401:0x08c0, B:402:0x08c7, B:404:0x08ca, B:407:0x08d3, B:413:0x08e0, B:415:0x0919, B:417:0x092c, B:421:0x0937, B:428:0x094e, B:431:0x095b, B:432:0x097f, B:423:0x093d, B:414:0x0902), top: B:452:0x0836 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x0988 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:476:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0888 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x0213  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220 A[LOOP:5: B:94:0x0211->B:98:0x0220, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14, types: [vl1] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final z74 y(p34 p34Var) {
        boolean z;
        y74 y74VarN;
        ?? r7;
        IOException iOException;
        boolean z2;
        ?? r8;
        y74 y74Var;
        boolean z3;
        z74 z74VarG;
        int i;
        ?? r1;
        ?? r3;
        z74 z74VarG2;
        rr rrVar;
        String strG;
        String str;
        String strG2;
        ?? r5;
        boolean z4;
        vl1 f82Var;
        boolean z5;
        cd2 cd2Var;
        c52 c52Var;
        int i2;
        int length;
        int length2;
        String string;
        String string2;
        int length3;
        int i3;
        l34 l34Var;
        List list;
        boolean z6;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        jc0 jc0Var;
        switch (this.g) {
            case 0:
                tl1 tl1Var = p34Var.n;
                tl1Var.getClass();
                rr rrVar2 = p34Var.v;
                d74 d74Var = (d74) rrVar2.v;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ?? EqualsIgnoreCase = (!fh6.r(rrVar2.y) || d74Var == null) ? 0 : 1;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(((c52) rrVar2.n).g("Connection"));
                try {
                    try {
                        tl1Var.g.m.getClass();
                        tl1Var.r.t(rrVar2);
                        tl1Var.g.m.getClass();
                        try {
                            if (EqualsIgnoreCase != 0) {
                                try {
                                    EqualsIgnoreCase = "100-continue".equalsIgnoreCase(((c52) rrVar2.n).g("Expect"));
                                    if (EqualsIgnoreCase != 0) {
                                        try {
                                            EqualsIgnoreCase = tl1Var.r;
                                            EqualsIgnoreCase.n();
                                            r7 = 1;
                                            EqualsIgnoreCase = 1;
                                            y74 y74VarN2 = tl1Var.n(true);
                                            try {
                                                tl1Var.g.m.getClass();
                                                y74VarN = y74VarN2;
                                                z4 = false;
                                            } catch (IOException e) {
                                                e = e;
                                                z = true;
                                                y74VarN = y74VarN2;
                                                if (e instanceof lq0) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e2) {
                                            tl1Var.g.m.getClass();
                                            tl1Var.v(e2);
                                            throw e2;
                                        }
                                    } else {
                                        EqualsIgnoreCase = 1;
                                        z4 = true;
                                        y74VarN = null;
                                    }
                                    if (y74VarN == null) {
                                        d74Var.getClass();
                                        d74 d74Var2 = (d74) rrVar2.v;
                                        d74Var2.getClass();
                                        long jG = d74Var2.g();
                                        tl1Var.g.m.getClass();
                                        g34 g34Var = new g34(new rl1(tl1Var, tl1Var.r.j(rrVar2, jG), jG, false));
                                        byte[] bArr = d74Var.r;
                                        int i4 = d74Var.y;
                                        if (g34Var.a) {
                                            l0.z("closed");
                                        } else {
                                            g34Var.t.C(i4, bArr);
                                            g34Var.y();
                                        }
                                        g34Var.close();
                                    } else {
                                        tl1Var.g.l(tl1Var, true, false, false, false, null);
                                        if (!(tl1Var.y().a != null ? EqualsIgnoreCase == true ? 1 : 0 : false)) {
                                            tl1Var.r.x().j();
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    EqualsIgnoreCase = 1;
                                    z = EqualsIgnoreCase == true ? 1 : 0;
                                    y74VarN = null;
                                    r7 = EqualsIgnoreCase;
                                    if ((e instanceof lq0) || !tl1Var.n) {
                                        throw e;
                                    }
                                    iOException = e;
                                    if (y74VarN == null) {
                                        r8 = r7;
                                        z2 = z;
                                        try {
                                            y74VarN = tl1Var.n(false);
                                            y74VarN.getClass();
                                            if (z2) {
                                                tl1Var.g.m.getClass();
                                                y74Var = y74VarN;
                                                z3 = false;
                                            } else {
                                                r8 = r7;
                                                z2 = z;
                                                y74Var = y74VarN;
                                                z3 = z2;
                                            }
                                        } catch (IOException e4) {
                                            if (iOException == null) {
                                                throw e4;
                                            }
                                            kf6.g(iOException, e4);
                                            throw iOException;
                                        }
                                    } else {
                                        r8 = r7;
                                        z2 = z;
                                        y74Var = y74VarN;
                                        z3 = z2;
                                    }
                                    y74Var.g = rrVar2;
                                    y74Var.v = tl1Var.y().x;
                                    y74Var.q = jCurrentTimeMillis;
                                    y74Var.w = System.currentTimeMillis();
                                    z74VarG = y74Var.g();
                                    i = z74VarG.m;
                                    while (true) {
                                        if (i != 100) {
                                            tl1Var.g.m.getClass();
                                            if (i == 101) {
                                                r1 = r8;
                                            } else {
                                                r1 = 0;
                                            }
                                            if (r1 != 0) {
                                                if (tl1Var.y().a != null) {
                                                    r5 = r8;
                                                } else {
                                                    r5 = 0;
                                                }
                                                if (r5 == 0) {
                                                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                                }
                                            }
                                            if (r1 == 0) {
                                                r3 = 0;
                                            } else {
                                                strG2 = z74VarG.w.g("Connection");
                                                if (strG2 == null) {
                                                    strG2 = null;
                                                }
                                                if ("upgrade".equalsIgnoreCase(strG2)) {
                                                    r3 = r8;
                                                } else {
                                                    r3 = 0;
                                                }
                                            }
                                            if (zEqualsIgnoreCase) {
                                                q34 q34VarR = tl1Var.r(z74VarG);
                                                y74 y74VarY = z74VarG.y();
                                                y74VarY.l = q34VarR;
                                                y74VarY.i = new bi6((byte) 15);
                                                z74VarG2 = y74VarY.g();
                                            } else {
                                                q34 q34VarR2 = tl1Var.r(z74VarG);
                                                y74 y74VarY2 = z74VarG.y();
                                                y74VarY2.l = q34VarR2;
                                                y74VarY2.i = new bi6((byte) 15);
                                                z74VarG2 = y74VarY2.g();
                                            }
                                            rrVar = z74VarG2.j;
                                            rrVar.getClass();
                                            if ("close".equalsIgnoreCase(((c52) rrVar.n).g("Connection"))) {
                                                tl1Var.r.x().j();
                                            } else {
                                                strG = z74VarG2.w.g("Connection");
                                                if (strG == null) {
                                                    str = null;
                                                } else {
                                                    str = strG;
                                                }
                                                if ("close".equalsIgnoreCase(str)) {
                                                    tl1Var.r.x().j();
                                                }
                                            }
                                            if (i == 204) {
                                                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + z74VarG2.c.y());
                                            }
                                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + z74VarG2.c.y());
                                            return z74VarG2;
                                        }
                                        y74 y74VarN3 = tl1Var.n(false);
                                        y74VarN3.getClass();
                                        if (z3) {
                                            tl1Var.g.m.getClass();
                                        }
                                        y74VarN3.g = rrVar2;
                                        y74VarN3.v = tl1Var.y().x;
                                        y74VarN3.q = jCurrentTimeMillis;
                                        y74VarN3.w = System.currentTimeMillis();
                                        z74VarG = y74VarN3.g();
                                        i = z74VarG.m;
                                    }
                                }
                            } else {
                                EqualsIgnoreCase = 1;
                                tl1Var.g.l(tl1Var, true, false, false, false, null);
                                z4 = true;
                                y74VarN = null;
                            }
                            try {
                                tl1Var.r.y();
                                iOException = null;
                                r8 = EqualsIgnoreCase;
                                z2 = z4;
                                while (true) {
                                    if (i != 100 && (102 > i || i >= 200)) {
                                    }
                                    y74 y74VarN4 = tl1Var.n(false);
                                    y74VarN4.getClass();
                                    if (z3) {
                                        tl1Var.g.m.getClass();
                                    }
                                    y74VarN4.g = rrVar2;
                                    y74VarN4.v = tl1Var.y().x;
                                    y74VarN4.q = jCurrentTimeMillis;
                                    y74VarN4.w = System.currentTimeMillis();
                                    z74VarG = y74VarN4.g();
                                    i = z74VarG.m;
                                }
                            } catch (IOException e5) {
                                tl1Var.g.m.getClass();
                                tl1Var.v(e5);
                                throw e5;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            r7 = EqualsIgnoreCase;
                            z = z4;
                            if (e instanceof lq0) {
                                throw e;
                            }
                            throw e;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    }
                    if (y74VarN == null) {
                        r8 = r7;
                        z2 = z;
                        y74VarN = tl1Var.n(false);
                        y74VarN.getClass();
                        if (z2) {
                            tl1Var.g.m.getClass();
                            y74Var = y74VarN;
                            z3 = false;
                        } else {
                            r8 = r7;
                            z2 = z;
                            y74Var = y74VarN;
                            z3 = z2;
                        }
                    } else {
                        r8 = r7;
                        z2 = z;
                        y74Var = y74VarN;
                        z3 = z2;
                    }
                    y74Var.g = rrVar2;
                    y74Var.v = tl1Var.y().x;
                    y74Var.q = jCurrentTimeMillis;
                    y74Var.w = System.currentTimeMillis();
                    z74VarG = y74Var.g();
                    i = z74VarG.m;
                    tl1Var.g.m.getClass();
                    if (i == 101) {
                        r1 = r8;
                    } else {
                        r1 = 0;
                    }
                    if (r1 != 0) {
                        if (tl1Var.y().a != null) {
                            r5 = r8;
                        } else {
                            r5 = 0;
                        }
                        if (r5 == 0) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (r1 == 0) {
                        r3 = 0;
                    } else {
                        strG2 = z74VarG.w.g("Connection");
                        if (strG2 == null) {
                            strG2 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(strG2)) {
                            r3 = r8;
                        } else {
                            r3 = 0;
                        }
                    }
                    if (zEqualsIgnoreCase || r3 == 0) {
                        q34 q34VarR3 = tl1Var.r(z74VarG);
                        y74 y74VarY3 = z74VarG.y();
                        y74VarY3.l = q34VarR3;
                        y74VarY3.i = new bi6((byte) 15);
                        z74VarG2 = y74VarY3.g();
                    } else {
                        y74 y74VarY4 = z74VarG.y();
                        y74VarY4.l = new zg5(z74VarG.c.x(), z74VarG.c.y());
                        y74VarY4.j = tl1Var.x();
                        z74VarG2 = y74VarY4.g();
                    }
                    rrVar = z74VarG2.j;
                    rrVar.getClass();
                    if ("close".equalsIgnoreCase(((c52) rrVar.n).g("Connection"))) {
                        tl1Var.r.x().j();
                    } else {
                        strG = z74VarG2.w.g("Connection");
                        if (strG == null) {
                            str = null;
                        } else {
                            str = strG;
                        }
                        if ("close".equalsIgnoreCase(str)) {
                            tl1Var.r.x().j();
                        }
                    }
                    if ((i == 204 && i != 205) || z74VarG2.c.y() <= 0) {
                        return z74VarG2;
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + z74VarG2.c.y());
                } catch (IOException e8) {
                    tl1Var.g.m.getClass();
                    tl1Var.v(e8);
                    throw e8;
                }
            case 1:
                l34 l34Var2 = p34Var.g;
                synchronized (l34Var2) {
                    if (!l34Var2.f) {
                        throw new IllegalStateException("released");
                    }
                    if (l34Var2.z || l34Var2.u || l34Var2.o || l34Var2.h) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                wl1 wl1Var = l34Var2.i;
                wl1Var.getClass();
                m34 m34VarN = wl1Var.n();
                hj3 hj3Var = l34Var2.j;
                m34VarN.getClass();
                int i5 = p34Var.l;
                q70 q70Var = m34VarN.j;
                p82 p82Var = m34VarN.a;
                if (p82Var != null) {
                    f82Var = new q82(hj3Var, m34VarN, p34Var, p82Var);
                } else {
                    m34VarN.v.setSoTimeout(i5);
                    ((h34) q70Var.a).j.r().l(i5);
                    ((g34) q70Var.m).j.r().l(p34Var.j);
                    f82Var = new f82(hj3Var, m34VarN, q70Var);
                }
                tl1 tl1Var2 = new tl1(l34Var2, wl1Var, f82Var);
                l34Var2.p = tl1Var2;
                l34Var2.d = tl1Var2;
                synchronized (l34Var2) {
                    l34Var2.u = true;
                    l34Var2.z = true;
                }
                if (!l34Var2.k) {
                    return p34.g(p34Var, 0, tl1Var2, null, 2097149).y(p34Var.v);
                }
                uo1.t("Canceled");
                return null;
            case 2:
                bi6 bi6Var = p34Var.q;
                rr rrVar3 = p34Var.v;
                cp1 cp1VarY = rrVar3.y();
                a92 a92Var = (a92) rrVar3.r;
                c52 c52Var2 = (c52) rrVar3.n;
                d74 d74Var3 = (d74) rrVar3.v;
                if (d74Var3 != null) {
                    e43 e43Var = d74Var3.g;
                    if (e43Var != null) {
                        cp1VarY.j("Content-Type", e43Var.g);
                    }
                    long jG2 = d74Var3.g();
                    if (jG2 != -1) {
                        cp1VarY.j("Content-Length", String.valueOf(jG2));
                        ((fa4) cp1VarY.r).J("Transfer-Encoding");
                    } else {
                        cp1VarY.j("Transfer-Encoding", "chunked");
                        ((fa4) cp1VarY.r).J("Content-Length");
                    }
                }
                if (c52Var2.g("Host") == null) {
                    cp1VarY.j("Host", ws5.m(a92Var, false));
                }
                if (c52Var2.g("Connection") == null) {
                    cp1VarY.j("Connection", "Keep-Alive");
                }
                if (c52Var2.g("Accept-Encoding") == null && c52Var2.g("Range") == null) {
                    cp1VarY.j("Accept-Encoding", "gzip");
                    z5 = true;
                } else {
                    z5 = false;
                }
                bi6Var.getClass();
                a92Var.getClass();
                if (c52Var2.g("User-Agent") == null) {
                    cp1VarY.j("User-Agent", "okhttp/5.5.0");
                }
                rr rrVar4 = new rr(cp1VarY);
                z74 z74VarY = p34Var.y(rrVar4);
                c52 c52Var3 = z74VarY.w;
                y82.y(bi6Var, (a92) rrVar4.r, c52Var3);
                y74 y74VarY5 = z74VarY.y();
                y74VarY5.g = rrVar4;
                if (z5) {
                    String strG3 = c52Var3.g("Content-Encoding");
                    if (strG3 == null) {
                        strG3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strG3) && y82.g(z74VarY)) {
                        o42 o42Var = new o42(z74VarY.c.t());
                        fa4 fa4VarX = ec6.x(c52Var3);
                        fa4VarX.J("Content-Encoding");
                        fa4VarX.J("Content-Length");
                        y74VarY5.x = ec6.x(ec6.n(fa4VarX));
                        String strG4 = c52Var3.g("Content-Type");
                        if (strG4 == null) {
                            strG4 = null;
                        }
                        y74VarY5.l = new q34(strG4, -1L, new h34(o42Var));
                    }
                }
                return y74VarY5.g();
            case 3:
                System.currentTimeMillis();
                rr rrVar5 = p34Var.v;
                cd2 cd2Var2 = new cd2((byte) 6, rrVar5, null, false);
                ha0 ha0Var = (ha0) rrVar5.l;
                if (ha0Var == null) {
                    int i6 = ha0.c;
                    c52 c52Var4 = (c52) rrVar5.n;
                    int size = c52Var4.size();
                    String str2 = null;
                    boolean z7 = true;
                    int i7 = 0;
                    boolean z8 = false;
                    boolean z9 = false;
                    int iC = -1;
                    int iC2 = -1;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    int iC3 = -1;
                    int iC4 = -1;
                    boolean z13 = false;
                    boolean z14 = false;
                    boolean z15 = false;
                    while (i7 < size) {
                        String strV = ec6.v(c52Var4, i7);
                        String strL = ec6.l(c52Var4, i7);
                        if (strV.equalsIgnoreCase("Cache-Control")) {
                            if (str2 == null) {
                                str2 = strL;
                            }
                            i2 = 0;
                            while (i2 < strL.length()) {
                                cd2Var2 = cd2Var2;
                                length = strL.length();
                                c52Var4 = c52Var4;
                                length2 = i2;
                                while (true) {
                                    if (length2 < length) {
                                        i3 = length;
                                        if (tx4.R("=,;", strL.charAt(length2))) {
                                            length2++;
                                            length = i3;
                                        }
                                    } else {
                                        length2 = strL.length();
                                    }
                                }
                                string = tx4.q0(strL.substring(i2, length2)).toString();
                                if (length2 != strL.length() || strL.charAt(length2) == ',' || strL.charAt(length2) == ';') {
                                    str2 = str2;
                                    i2 = length2 + 1;
                                    string2 = null;
                                } else {
                                    int i8 = length2 + 1;
                                    byte[] bArr2 = us5.g;
                                    int length4 = strL.length();
                                    while (true) {
                                        if (i8 < length4) {
                                            char cCharAt = strL.charAt(i8);
                                            int i9 = i8;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                i8 = i9 + 1;
                                            } else {
                                                length3 = i9;
                                            }
                                        } else {
                                            length3 = strL.length();
                                        }
                                    }
                                    if (length3 >= strL.length() || strL.charAt(length3) != '\"') {
                                        int length5 = strL.length();
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                str2 = str2;
                                                if (!tx4.R(",;", strL.charAt(length6))) {
                                                    length6++;
                                                    str2 = str2;
                                                }
                                            } else {
                                                str2 = str2;
                                                length6 = strL.length();
                                            }
                                        }
                                        string2 = tx4.q0(strL.substring(length3, length6)).toString();
                                        i2 = length6;
                                    } else {
                                        int i10 = length3 + 1;
                                        int iV = tx4.V(strL, '\"', i10, 4);
                                        string2 = strL.substring(i10, iV);
                                        i2 = iV + 1;
                                        str2 = str2;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string)) {
                                    z8 = true;
                                } else if ("no-store".equalsIgnoreCase(string)) {
                                    z9 = true;
                                } else if ("max-age".equalsIgnoreCase(string)) {
                                    iC = us5.c(string2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(string)) {
                                    iC2 = us5.c(string2, -1);
                                } else if ("private".equalsIgnoreCase(string)) {
                                    z10 = true;
                                } else if ("public".equalsIgnoreCase(string)) {
                                    z11 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                    z12 = true;
                                } else if ("max-stale".equalsIgnoreCase(string)) {
                                    iC3 = us5.c(string2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(string)) {
                                    iC4 = us5.c(string2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                    z13 = true;
                                } else if ("no-transform".equalsIgnoreCase(string)) {
                                    z14 = true;
                                } else if ("immutable".equalsIgnoreCase(string)) {
                                    z15 = true;
                                }
                            }
                            i7++;
                            cd2Var2 = cd2Var2;
                            c52Var4 = c52Var4;
                            size = size;
                        } else {
                            if (strV.equalsIgnoreCase("Pragma")) {
                            }
                            i7++;
                            cd2Var2 = cd2Var2;
                            c52Var4 = c52Var4;
                            size = size;
                        }
                        z7 = false;
                        i2 = 0;
                        while (i2 < strL.length()) {
                            cd2Var2 = cd2Var2;
                            length = strL.length();
                            c52Var4 = c52Var4;
                            length2 = i2;
                            while (true) {
                                if (length2 < length) {
                                    i3 = length;
                                    if (tx4.R("=,;", strL.charAt(length2))) {
                                        length2++;
                                        length = i3;
                                    }
                                } else {
                                    length2 = strL.length();
                                }
                            }
                            string = tx4.q0(strL.substring(i2, length2)).toString();
                            if (length2 != strL.length()) {
                                str2 = str2;
                                i2 = length2 + 1;
                                string2 = null;
                            } else {
                                str2 = str2;
                                i2 = length2 + 1;
                                string2 = null;
                            }
                            if ("no-cache".equalsIgnoreCase(string)) {
                                z8 = true;
                            } else if ("no-store".equalsIgnoreCase(string)) {
                                z9 = true;
                            } else if ("max-age".equalsIgnoreCase(string)) {
                                iC = us5.c(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iC2 = us5.c(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z10 = true;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z11 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z12 = true;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iC3 = us5.c(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iC4 = us5.c(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z13 = true;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z14 = true;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z15 = true;
                            }
                        }
                        i7++;
                        cd2Var2 = cd2Var2;
                        c52Var4 = c52Var4;
                        size = size;
                    }
                    cd2Var = cd2Var2;
                    ha0Var = new ha0(z8, z9, iC, iC2, z10, z11, z12, iC3, iC4, z13, z14, z15, !z7 ? null : str2);
                    rrVar5.l = ha0Var;
                } else {
                    cd2Var = cd2Var2;
                }
                cd2 cd2Var3 = ha0Var.a ? new cd2((byte) 6, null, null, false) : cd2Var;
                rr rrVar6 = (rr) cd2Var3.t;
                z74 z74Var = (z74) cd2Var3.a;
                if (rrVar6 == null && z74Var == null) {
                    z74 z74Var2 = new z74(p34Var.v, i14.m, "Unsatisfiable Request (only-if-cached)", 504, null, new c52((String[]) new ArrayList(20).toArray(new String[0])), b84.j, null, null, null, null, -1L, System.currentTimeMillis(), null, pb5.x);
                    p34Var.g.m.getClass();
                    return z74Var2;
                }
                if (rrVar6 == null) {
                    z74Var.getClass();
                    y74 y74VarY6 = z74Var.y();
                    z74 z74VarI = rz5.i(z74Var);
                    y74.y("cacheResponse", z74VarI);
                    y74VarY6.a = z74VarI;
                    z74 z74VarG3 = y74VarY6.g();
                    p34Var.g.m.getClass();
                    return z74VarG3;
                }
                if (z74Var != null) {
                    p34Var.g.m.getClass();
                }
                z74 z74VarY2 = p34Var.y(rrVar6);
                if (z74Var != null) {
                    if (z74VarY2.m == 304) {
                        y74 y74VarY7 = z74Var.y();
                        c52 c52Var5 = z74Var.w;
                        c52 c52Var6 = z74VarY2.w;
                        ArrayList arrayList = new ArrayList(20);
                        int size2 = c52Var5.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            String strV2 = ec6.v(c52Var5, i11);
                            String strL2 = ec6.l(c52Var5, i11);
                            if ("Warning".equalsIgnoreCase(strV2)) {
                                c52Var = c52Var5;
                                if (ay4.P(strL2, "1", false)) {
                                }
                                i11++;
                                c52Var5 = c52Var;
                            } else {
                                c52Var = c52Var5;
                            }
                            if ("Content-Length".equalsIgnoreCase(strV2) || "Content-Encoding".equalsIgnoreCase(strV2) || "Content-Type".equalsIgnoreCase(strV2) || !zz5.y(strV2) || c52Var6.g(strV2) == null) {
                                arrayList.add(strV2);
                                arrayList.add(tx4.q0(strL2).toString());
                            }
                            i11++;
                            c52Var5 = c52Var;
                        }
                        int size3 = c52Var6.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            String strV3 = ec6.v(c52Var6, i12);
                            if (!"Content-Length".equalsIgnoreCase(strV3) && !"Content-Encoding".equalsIgnoreCase(strV3) && !"Content-Type".equalsIgnoreCase(strV3) && zz5.y(strV3)) {
                                String strL3 = ec6.l(c52Var6, i12);
                                arrayList.add(strV3);
                                arrayList.add(tx4.q0(strL3).toString());
                            }
                        }
                        y74VarY7.x = ec6.x(new c52((String[]) arrayList.toArray(new String[0])));
                        y74VarY7.q = z74VarY2.u;
                        y74VarY7.w = z74VarY2.z;
                        z74 z74VarI2 = rz5.i(z74Var);
                        y74.y("cacheResponse", z74VarI2);
                        y74VarY7.a = z74VarI2;
                        z74 z74VarI3 = rz5.i(z74VarY2);
                        y74.y("networkResponse", z74VarI3);
                        y74VarY7.t = z74VarI3;
                        y74VarY7.g();
                        z74VarY2.c.close();
                        throw null;
                    }
                    us5.r(z74Var.c);
                }
                y74 y74VarY8 = z74VarY2.y();
                z74 z74VarI4 = z74Var != null ? rz5.i(z74Var) : null;
                y74.y("cacheResponse", z74VarI4);
                y74VarY8.a = z74VarI4;
                z74 z74VarI5 = rz5.i(z74VarY2);
                y74.y("networkResponse", z74VarI5);
                y74VarY8.t = z74VarI5;
                return y74VarY8.g();
            default:
                rr rrVar7 = p34Var.v;
                l34 l34Var3 = p34Var.g;
                List listX0 = pi1.j;
                z74 z74Var3 = null;
                int i13 = 0;
                rr rrVarG = rrVar7;
                while (true) {
                    boolean z16 = true;
                    while (true) {
                        if (l34Var3.p != null) {
                            l0.z("Check failed.");
                            return null;
                        }
                        synchronized (l34Var3) {
                            try {
                                try {
                                    if (l34Var3.z) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (l34Var3.u || l34Var3.o || l34Var3.h) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                l34Var = l34Var3;
                            }
                            throw th;
                        }
                        if (z16) {
                            hj3 hj3Var2 = l34Var3.j;
                            b35 b35Var = hj3Var2.E;
                            o34 o34Var = (o34) p34Var.m.t;
                            int i14 = p34Var.l;
                            int i15 = p34Var.j;
                            List list2 = listX0;
                            int i16 = p34Var.x;
                            int i17 = hj3Var2.A;
                            boolean z17 = p34Var.p;
                            boolean z18 = hj3Var2.x;
                            a92 a92Var2 = (a92) rrVarG.r;
                            a92Var2.getClass();
                            if (yf2.p(a92Var2.g, "https")) {
                                sSLSocketFactory = p34Var.z;
                                hostnameVerifier = p34Var.c;
                                jc0Var = p34Var.a;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                jc0Var = null;
                            }
                            String str3 = a92Var2.n;
                            int i18 = a92Var2.v;
                            nb1 nb1Var = p34Var.w;
                            SocketFactory socketFactory = p34Var.u;
                            bi6 bi6Var2 = p34Var.b;
                            Proxy proxy = p34Var.i;
                            hj3 hj3Var3 = p34Var.g.j;
                            rr rrVar8 = rrVarG;
                            l34 l34Var4 = l34Var3;
                            list = list2;
                            r34 r34Var = new r34(b35Var, o34Var, i14, i15, i16, i14, i17, z17, z18, new t5(str3, i18, nb1Var, socketFactory, sSLSocketFactory, hostnameVerifier, jc0Var, bi6Var2, proxy, hj3Var3.u, hj3Var3.p, p34Var.s), l34Var3.j.D, l34Var4, rrVar8);
                            l34Var = l34Var4;
                            rrVarG = rrVar8;
                            hj3 hj3Var4 = l34Var.j;
                            l34Var.i = hj3Var4.x ? new nn1(r34Var, hj3Var4.E) : new fa4((Object) r34Var, (byte) 25);
                        } else {
                            l34Var = l34Var3;
                            list = listX0;
                        }
                        try {
                            if (l34Var.k) {
                                throw new IOException("Canceled");
                            }
                            try {
                            } catch (IOException e9) {
                                boolean zR = r(e9, l34Var, p34Var, rrVarG);
                                l34Var.m.getClass();
                                if (!zR) {
                                    byte[] bArr3 = us5.g;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        kf6.g(e9, (Exception) it.next());
                                    }
                                    throw e9;
                                }
                                listX0 = cj0.x0(list, e9);
                                l34Var.v(true);
                                l34Var3 = l34Var;
                                z16 = false;
                            }
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            z6 = true;
                        }
                        l34Var.v(z6);
                        throw th;
                    }
                    y74 y74VarY9 = p34Var.y(rrVarG).y();
                    y74VarY9.g = rrVarG;
                    y74VarY9.m = z74Var3 != null ? rz5.i(z74Var3) : null;
                    z74 z74VarG4 = y74VarY9.g();
                    rrVarG = g(z74VarG4, l34Var.p, p34Var);
                    if (rrVarG == null) {
                        try {
                            l34Var.m.getClass();
                            l34Var.v(false);
                            return z74VarG4;
                        } catch (Throwable th4) {
                            th = th4;
                            z6 = false;
                        }
                    } else {
                        us5.r(z74VarG4.c);
                        int i19 = i13 + 1;
                        dl1 dl1Var = l34Var.m;
                        if (i19 > 20) {
                            dl1Var.getClass();
                            throw new ProtocolException("Too many follow-up requests: " + i19);
                        }
                        dl1Var.getClass();
                        l34Var.v(true);
                        z74Var3 = z74VarG4;
                        listX0 = list;
                        l34Var3 = l34Var;
                        i13 = i19;
                    }
                }
                break;
        }
    }
}
