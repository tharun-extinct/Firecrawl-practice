package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class zn1 implements ii0 {
    public final File g;
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final nk4 y;

    public zn1(File file, nk4 nk4Var) {
        this.g = file;
        this.y = nk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [zn1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, zn1] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [zn1] */
    public static Object g(zn1 zn1Var, ou0 ou0Var) {
        yn1 yn1Var;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (ou0Var instanceof yn1) {
            yn1Var = (yn1) ou0Var;
            int i = yn1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn1Var.i = i - Integer.MIN_VALUE;
            } else {
                yn1Var = new yn1(zn1Var, ou0Var);
            }
        } else {
            yn1Var = new yn1(zn1Var, ou0Var);
        }
        Object obj = yn1Var.w;
        ?? r1 = yn1Var.i;
        px0 px0Var = px0.j;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    fileInputStream = yn1Var.q;
                    r1 = (zn1) yn1Var.m;
                    try {
                        js2.o(obj);
                        gp4.C(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            gp4.C(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r1 != 2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) yn1Var.m;
                try {
                    js2.o(obj);
                    gp4.C(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        gp4.C(closeable, th);
                        throw th6;
                    }
                }
            }
            js2.o(obj);
            if (zn1Var.r.get()) {
                l0.z("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(zn1Var.g);
                try {
                    nk4 nk4Var = zn1Var.y;
                    yn1Var.m = zn1Var;
                    yn1Var.q = fileInputStream2;
                    yn1Var.i = 1;
                    Object objI = nk4Var.i(fileInputStream2);
                    if (objI != px0Var) {
                        fileInputStream = fileInputStream2;
                        obj = objI;
                        gp4.C(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r1 = zn1Var;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                File file = zn1Var.g;
                nk4 nk4Var2 = zn1Var.y;
                if (!file.exists()) {
                    return nk4Var2.n();
                }
                FileInputStream fileInputStream3 = new FileInputStream(zn1Var.g);
                try {
                    yn1Var.m = fileInputStream3;
                    yn1Var.q = null;
                    yn1Var.i = 2;
                    Object objI2 = nk4Var2.i(fileInputStream3);
                    if (objI2 != px0Var) {
                        obj = objI2;
                        closeable = fileInputStream3;
                        gp4.C(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return px0Var;
        } catch (FileNotFoundException unused2) {
            zn1Var = r1;
        }
    }

    @Override // defpackage.ii0
    public final void close() {
        this.r.set(true);
    }
}
