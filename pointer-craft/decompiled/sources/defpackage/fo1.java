package defpackage;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fo1 extends zn1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(Object obj, ou0 ou0Var) {
        eo1 eo1Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (ou0Var instanceof eo1) {
            eo1Var = (eo1) ou0Var;
            int i = eo1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo1Var.i = i - Integer.MIN_VALUE;
            } else {
                eo1Var = new eo1(this, ou0Var);
            }
        } else {
            eo1Var = new eo1(this, ou0Var);
        }
        Object obj2 = eo1Var.w;
        int i2 = eo1Var.i;
        og5 og5Var = og5.g;
        if (i2 == 0) {
            js2.o(obj2);
            if (this.r.get()) {
                l0.z("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.g);
            try {
                nk4 nk4Var = this.y;
                eg5 eg5Var = new eg5(fileOutputStream3);
                eo1Var.m = fileOutputStream3;
                eo1Var.q = fileOutputStream3;
                eo1Var.i = 1;
                nk4Var.t(obj, eg5Var);
                px0 px0Var = px0.j;
                if (og5Var == px0Var) {
                    return px0Var;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = eo1Var.q;
            fileOutputStream = eo1Var.m;
            try {
                js2.o(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    gp4.C(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        gp4.C(fileOutputStream, null);
        return og5Var;
    }
}
