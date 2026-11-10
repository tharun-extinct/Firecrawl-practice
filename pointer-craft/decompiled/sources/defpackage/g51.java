package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g51 implements Iterator, vh2 {
    public int a;
    public final /* synthetic */ byte j;
    public int m;
    public Object q;
    public int t;
    public final Object w;

    public g51(h51 h51Var) {
        this.j = (byte) 0;
        this.w = h51Var;
        this.t = -1;
        int iW = xs2.w(0, 0, ((CharSequence) h51Var.y).length());
        this.a = iW;
        this.m = iW;
    }

    public void g() {
        h51 h51Var = (h51) this.w;
        CharSequence charSequence = (CharSequence) h51Var.y;
        int i = this.m;
        if (i < 0) {
            this.t = 0;
            this.q = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.a;
            charSequence.getClass();
            this.q = new me2(i2, charSequence.length() - 1, 1);
            this.m = -1;
        } else {
            fp3 fp3Var = (fp3) ((bz1) h51Var.r).l(charSequence, Integer.valueOf(this.m));
            if (fp3Var == null) {
                int i3 = this.a;
                charSequence.getClass();
                this.q = new me2(i3, charSequence.length() - 1, 1);
                this.m = -1;
            } else {
                int iIntValue = ((Number) fp3Var.j).intValue();
                int iIntValue2 = ((Number) fp3Var.t).intValue();
                this.q = xs2.K(this.a, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.a = i4;
                this.m = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.t = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.j) {
            case 0:
                if (this.t == -1) {
                    g();
                }
                return this.t == 1;
            default:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                if (this.t == -1) {
                    g();
                }
                if (this.t == 0) {
                    uo1.b();
                    return null;
                }
                me2 me2Var = (me2) this.q;
                me2Var.getClass();
                this.q = null;
                this.t = -1;
                return me2Var;
            default:
                qo0.y("Unexpected group information structure");
                throw new il0();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g51(mr4 mr4Var, int i, j02 j02Var, ig6 ig6Var) {
        this.j = (byte) 1;
        this.q = mr4Var;
        this.t = i;
        this.w = ig6Var;
        this.a = mr4Var.i;
    }
}
