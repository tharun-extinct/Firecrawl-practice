package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class da3 {
    public final ff g;
    public final o05 n;
    public final o05 r;
    public boolean v;
    public final ff y;

    public da3(Context context, ff ffVar, ff ffVar2) {
        context.getClass();
        this.g = ffVar;
        this.y = ffVar2;
        this.r = new o05(new mn(context, (byte) 3));
        this.n = new o05(new mn(context, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e4 A[Catch: g63 -> 0x0045, TRY_ENTER, TryCatch #1 {g63 -> 0x0045, blocks: (B:18:0x0040, B:43:0x00f7, B:40:0x00e4), top: B:61:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7 A[Catch: g63 -> 0x0045, PHI: r14
  0x00f7: PHI (r14v22 java.lang.Object) = (r14v21 java.lang.Object), (r14v1 java.lang.Object) binds: [B:41:0x00f4, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {g63 -> 0x0045, blocks: (B:18:0x0040, B:43:0x00f7, B:40:0x00e4), top: B:61:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ou0 ou0Var) throws Exception {
        ca3 ca3Var;
        nj6 nj6VarY;
        String str;
        if (ou0Var instanceof ca3) {
            ca3Var = (ca3) ou0Var;
            int i = ca3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ca3Var.w = i - Integer.MIN_VALUE;
            } else {
                ca3Var = new ca3(this, ou0Var);
            }
        } else {
            ca3Var = new ca3(this, ou0Var);
        }
        Object objR = ca3Var.m;
        int i2 = ca3Var.w;
        o05 o05Var = this.n;
        o05 o05Var2 = this.r;
        ff ffVar = this.y;
        og5 og5Var = og5.g;
        Object obj = px0.j;
        try {
            try {
                if (i2 == 0) {
                    js2.o(objR);
                    nj6 nj6VarR = ((zv5) o05Var.getValue()).r((i46) o05Var2.getValue());
                    nj6VarR.getClass();
                    ca3Var.w = 1;
                    objR = hh6.r(nj6VarR, ca3Var);
                    if (objR == obj) {
                    }
                    return obj;
                }
                if (i2 == 1) {
                    js2.o(objR);
                } else {
                    if (i2 == 2) {
                        js2.o(objR);
                        nj6 nj6VarY2 = ((i46) o05Var2.getValue()).y();
                        ca3Var.w = 3;
                        objR = hh6.r(nj6VarY2, ca3Var);
                        if (objR == obj) {
                        }
                        return obj;
                    }
                    if (i2 != 3) {
                        if (i2 == 4) {
                            js2.o(objR);
                            return og5Var;
                        }
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(objR);
                }
                objR.getClass();
                str = ((oi6) ((vw) objR).g.j).a;
                if (str != null) {
                    this.g.a(str);
                }
                if (this.v) {
                    ca3Var.w = 4;
                    if (g(ca3Var) == obj) {
                        return obj;
                    }
                }
                return og5Var;
                if (((p73) objR).j) {
                    nj6 nj6VarY3 = ((i46) o05Var2.getValue()).y();
                    ca3Var.w = 3;
                    objR = hh6.r(nj6VarY3, ca3Var);
                    if (objR == obj) {
                        objR.getClass();
                        str = ((oi6) ((vw) objR).g.j).a;
                        if (str != null) {
                            this.g.a(str);
                        }
                        if (this.v) {
                            ca3Var.w = 4;
                            if (g(ca3Var) == obj) {
                            }
                        }
                        return og5Var;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((i46) o05Var2.getValue());
                    jr2.l("APIs must not be empty.", !arrayList.isEmpty());
                    zv5 zv5Var = (zv5) o05Var.getValue();
                    zv5Var.getClass();
                    bk bkVarR = bk.r(arrayList, true);
                    if (bkVarR.j.isEmpty()) {
                        nj6VarY = br2.s(new r73(0, false));
                    } else {
                        w25 w25VarY = w25.y();
                        w25VarY.g = new tn1[]{nf6.g};
                        w25VarY.y = true;
                        w25VarY.r = (short) 27304;
                        w25VarY.n = new cd2((byte) 27, zv5Var, bkVarR, false);
                        nj6VarY = zv5Var.y(0, w25VarY.g());
                    }
                    nj6VarY.getClass();
                    ca3Var.w = 2;
                    if (hh6.r(nj6VarY, ca3Var) != obj) {
                        nj6 nj6VarY4 = ((i46) o05Var2.getValue()).y();
                        ca3Var.w = 3;
                        objR = hh6.r(nj6VarY4, ca3Var);
                        if (objR == obj) {
                            objR.getClass();
                            str = ((oi6) ((vw) objR).g.j).a;
                            if (str != null) {
                                this.g.a(str);
                            }
                            if (this.v) {
                                ca3Var.w = 4;
                                if (g(ca3Var) == obj) {
                                }
                            }
                            return og5Var;
                        }
                    }
                }
                return obj;
            } catch (Exception e) {
                ffVar.a(String.valueOf(e.getMessage()));
                return og5Var;
            }
        } catch (g63 e2) {
            if (e2.j != 201) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unknown";
                }
                ffVar.a(message);
            }
        }
    }
}
