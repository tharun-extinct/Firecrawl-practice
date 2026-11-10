package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b71 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final Object t;

    public b71(p82 p82Var, s82 s82Var) {
        this.j = (byte) 1;
        this.a = p82Var;
        this.t = s82Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [b71] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [kk1] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p82] */
    @Override // defpackage.my1
    public final Object g() throws Throwable {
        IOException iOException;
        byte b = this.j;
        byte b2 = 0;
        byte b3 = 1;
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        og5 og5Var = og5.g;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                ((xy1) obj2).a(((g61) obj).t);
                return og5Var;
            case 1:
                ?? r5 = (p82) obj;
                s82 s82Var = (s82) obj2;
                kk1 kk1Var = kk1.q;
                try {
                    try {
                        try {
                            if (s82Var.y(true, this)) {
                                do {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } while (s82Var.y(false, this));
                                kk1 kk1Var2 = kk1.a;
                                try {
                                    r5.y(kk1Var2, kk1.i, null);
                                    this = kk1Var2;
                                } catch (IOException e) {
                                    iOException = e;
                                    kk1 kk1Var3 = kk1.m;
                                    r5.y(kk1Var3, kk1Var3, iOException);
                                    r3 = iOException;
                                    this = kk1Var3;
                                }
                                us5.r(s82Var);
                                return og5Var;
                            }
                            try {
                                throw new IOException("Required SETTINGS preface not received");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                }
                this = kk1Var;
                r5.y(this, kk1Var, r3);
                us5.r(s82Var);
                throw th;
            case 2:
                ((xy1) obj2).a(((hm2) obj).r);
                return og5Var;
            case 3:
                sj2 sj2Var = (sj2) obj2;
                String str = ((hm2) obj).r;
                str.getClass();
                m50.T(v70.d(sj2Var), null, new jj2(sj2Var, str, r3, b2), 3);
                return og5Var;
            case 4:
                ob3 ob3Var = (ob3) obj;
                String str2 = (String) ob3Var.getValue();
                String str3 = ((mk2) obj2).g;
                if (yf2.p(str2, str3)) {
                    str3 = "";
                }
                ob3Var.setValue(str3);
                return og5Var;
            case 5:
                ao2 ao2Var = (ao2) obj2;
                sk2 sk2VarG = sk2.g((sk2) obj, 0, null, null, null, null, null, 150);
                ao2Var.getClass();
                ji0 ji0VarD = v70.d(ao2Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new yn2(ao2Var, sk2VarG, r3, b3), 2);
                return og5Var;
            default:
                ((xy1) obj2).a(((qp0) obj).g);
                return og5Var;
        }
    }

    public /* synthetic */ b71(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
