package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sq2 {
    public final /* synthetic */ uq2 j;
    public int l;
    public int n;
    public int r;
    public int x;
    public ws0 y;
    public qq2[] g = v70.u;
    public int v = 1;

    public sq2(uq2 uq2Var) {
        this.j = uq2Var;
    }

    public static void y(sq2 sq2Var, ms2 ms2Var, ox0 ox0Var, w32 w32Var, int i, int i2, boolean z) {
        sq2Var.j.getClass();
        long jR = ms2Var.r(0);
        sq2Var.g(ms2Var, ox0Var, w32Var, i, i2, (int) (!z ? jR & 4294967295L : jR >> 32));
    }

    public final void g(ms2 ms2Var, ox0 ox0Var, w32 w32Var, int i, int i2, int i3) {
        qq2[] qq2VarArr;
        List list = ms2Var.y;
        qq2[] qq2VarArr2 = this.g;
        int length = qq2VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.x = i;
                this.l = i2;
                break;
            } else {
                qq2 qq2Var = qq2VarArr2[i4];
                if (qq2Var != null && qq2Var.l) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = list.size();
        int length2 = this.g.length;
        while (true) {
            qq2VarArr = this.g;
            if (size >= length2) {
                break;
            }
            qq2 qq2Var2 = qq2VarArr[size];
            if (qq2Var2 != null) {
                qq2Var2.r();
            }
            size++;
        }
        if (qq2VarArr.length != list.size()) {
            this.g = (qq2[]) Arrays.copyOf(this.g, list.size());
        }
        this.y = new ws0(ms2Var.c);
        this.r = i3;
        this.n = 0;
        this.v = 1;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objA = ((us3) list.get(i5)).a();
            dq2 dq2Var = objA instanceof dq2 ? (dq2) objA : null;
            qq2[] qq2VarArr3 = this.g;
            if (dq2Var == null) {
                qq2 qq2Var3 = qq2VarArr3[i5];
                if (qq2Var3 != null) {
                    qq2Var3.r();
                }
                this.g[i5] = null;
            } else {
                qq2 qq2Var4 = qq2VarArr3[i5];
                if (qq2Var4 == null) {
                    qq2Var4 = new qq2(ox0Var, w32Var, new qd((Object) this.j, (byte) 27));
                    this.g[i5] = qq2Var4;
                }
                qq2Var4.n = dq2Var.o;
                qq2Var4.v = dq2Var.f;
                qq2Var4.x = dq2Var.k;
            }
        }
    }
}
