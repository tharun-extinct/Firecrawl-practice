package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g72 {
    public int g;
    public final Object r;
    public float y;

    public g72(h75 h75Var) {
        this.r = h75Var;
        this.g = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float g(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        h75 h75Var = (h75) this.r;
        int i2 = 1;
        if (z) {
            int iR = wy5.r(h75Var.x, i, z);
            int lineStart = h75Var.x.getLineStart(iR);
            int iV = h75Var.v(iR);
            if (i == lineStart || i == iV) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.g == i4) {
            return this.y;
        }
        float fT = z3 ? h75Var.t(i, z) : h75Var.a(i, z);
        if (z2) {
            this.g = i4;
            this.y = fT;
        }
        return fT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(float f, ou0 ou0Var) {
        h64 h64Var;
        if (ou0Var instanceof h64) {
            h64Var = (h64) ou0Var;
            int i = h64Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                h64Var.w = i - Integer.MIN_VALUE;
            } else {
                h64Var = new h64(this, ou0Var);
            }
        } else {
            h64Var = new h64(this, ou0Var);
        }
        Object objL = h64Var.m;
        int i2 = h64Var.w;
        if (i2 == 0) {
            js2.o(objL);
            do0 do0Var = (do0) this.r;
            Float f2 = new Float(f);
            h64Var.w = 1;
            objL = do0Var.l(f2, h64Var);
            px0 px0Var = px0.j;
            if (objL == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objL);
        }
        this.y += ((Number) objL).floatValue();
        return og5.g;
    }

    public g72(int i, do0 do0Var) {
        this.g = i;
        this.r = do0Var;
    }
}
