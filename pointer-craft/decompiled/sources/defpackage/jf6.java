package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jf6 {
    public static ha2 r;
    public static final m75 g = new m75(4);
    public static final m75 y = new m75(5);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(gg4 gg4Var, float f, zu4 zu4Var, ou0 ou0Var) {
        ff4 ff4Var;
        r54 r54Var;
        if (ou0Var instanceof ff4) {
            ff4Var = (ff4) ou0Var;
            int i = ff4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff4Var.w = i - Integer.MIN_VALUE;
            } else {
                ff4Var = new ff4(ou0Var);
            }
        } else {
            ff4Var = new ff4(ou0Var);
        }
        Object obj = ff4Var.q;
        int i2 = ff4Var.w;
        if (i2 == 0) {
            js2.o(obj);
            r54 r54Var2 = new r54();
            bz1 gf4Var = new gf4(f, zu4Var, r54Var2, null);
            ff4Var.m = r54Var2;
            ff4Var.w = 1;
            Object objN = gg4Var.n(ub3.j, gf4Var, ff4Var);
            Object obj2 = px0.j;
            if (objN == obj2) {
                return obj2;
            }
            r54Var = r54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r54Var = ff4Var.m;
            js2.o(obj);
        }
        return new Float(r54Var.j);
    }

    public static final j73 n(j73 j73Var, xy1 xy1Var) {
        return j73Var.n(new b15(xy1Var));
    }

    public static final j73 r() {
        return n(g73.g, g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(gg4 gg4Var, float f, ou0 ou0Var) {
        hf4 hf4Var;
        r54 r54Var;
        if (ou0Var instanceof hf4) {
            hf4Var = (hf4) ou0Var;
            int i = hf4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf4Var.w = i - Integer.MIN_VALUE;
            } else {
                hf4Var = new hf4(ou0Var);
            }
        } else {
            hf4Var = new hf4(ou0Var);
        }
        Object obj = hf4Var.q;
        int i2 = hf4Var.w;
        if (i2 == 0) {
            js2.o(obj);
            r54 r54Var2 = new r54();
            bz1 if4Var = new if4(r54Var2, f, null);
            hf4Var.m = r54Var2;
            hf4Var.w = 1;
            Object objN = gg4Var.n(ub3.j, if4Var, hf4Var);
            Object obj2 = px0.j;
            if (objN == obj2) {
                return obj2;
            }
            r54Var = r54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r54Var = hf4Var.m;
            js2.o(obj);
        }
        return new Float(r54Var.j);
    }
}
