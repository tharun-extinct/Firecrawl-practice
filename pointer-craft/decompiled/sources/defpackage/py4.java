package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class py4 {
    public final sy4 g;
    public final my4 n;
    public final my4 r;
    public final my4 v;
    public in2 y;

    /* JADX WARN: Type inference failed for: r2v1, types: [my4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [my4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [my4] */
    public py4(sy4 sy4Var) {
        this.g = sy4Var;
        final byte b = 0;
        this.r = new bz1(this) { // from class: my4
            public final /* synthetic */ py4 t;

            {
                this.t = this;
            }

            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                byte b2 = b;
                og5 og5Var = og5.g;
                py4 py4Var = this.t;
                switch (b2) {
                    case 0:
                        sy4 sy4Var2 = py4Var.g;
                        um2 um2Var = (um2) obj;
                        in2 in2Var = um2Var.O;
                        if (in2Var == null) {
                            in2Var = new in2(um2Var, sy4Var2);
                            um2Var.O = in2Var;
                        }
                        py4Var.y = in2Var;
                        py4Var.g().t();
                        in2 in2VarG = py4Var.g();
                        if (in2VarG.a != sy4Var2) {
                            in2VarG.a = sy4Var2;
                            in2VarG.a(false);
                            um2.X(in2VarG.j, false, 7);
                        }
                        break;
                    case 1:
                        py4Var.g().t = (to0) obj2;
                        break;
                    default:
                        in2 in2VarG2 = py4Var.g();
                        ((um2) obj).e0(new fn2(in2VarG2, (bz1) obj2, in2VarG2.f));
                        break;
                }
                return og5Var;
            }
        };
        final byte b2 = 1;
        this.n = new bz1(this) { // from class: my4
            public final /* synthetic */ py4 t;

            {
                this.t = this;
            }

            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                byte b3 = b2;
                og5 og5Var = og5.g;
                py4 py4Var = this.t;
                switch (b3) {
                    case 0:
                        sy4 sy4Var2 = py4Var.g;
                        um2 um2Var = (um2) obj;
                        in2 in2Var = um2Var.O;
                        if (in2Var == null) {
                            in2Var = new in2(um2Var, sy4Var2);
                            um2Var.O = in2Var;
                        }
                        py4Var.y = in2Var;
                        py4Var.g().t();
                        in2 in2VarG = py4Var.g();
                        if (in2VarG.a != sy4Var2) {
                            in2VarG.a = sy4Var2;
                            in2VarG.a(false);
                            um2.X(in2VarG.j, false, 7);
                        }
                        break;
                    case 1:
                        py4Var.g().t = (to0) obj2;
                        break;
                    default:
                        in2 in2VarG2 = py4Var.g();
                        ((um2) obj).e0(new fn2(in2VarG2, (bz1) obj2, in2VarG2.f));
                        break;
                }
                return og5Var;
            }
        };
        final byte b3 = 2;
        this.v = new bz1(this) { // from class: my4
            public final /* synthetic */ py4 t;

            {
                this.t = this;
            }

            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                byte b4 = b3;
                og5 og5Var = og5.g;
                py4 py4Var = this.t;
                switch (b4) {
                    case 0:
                        sy4 sy4Var2 = py4Var.g;
                        um2 um2Var = (um2) obj;
                        in2 in2Var = um2Var.O;
                        if (in2Var == null) {
                            in2Var = new in2(um2Var, sy4Var2);
                            um2Var.O = in2Var;
                        }
                        py4Var.y = in2Var;
                        py4Var.g().t();
                        in2 in2VarG = py4Var.g();
                        if (in2VarG.a != sy4Var2) {
                            in2VarG.a = sy4Var2;
                            in2VarG.a(false);
                            um2.X(in2VarG.j, false, 7);
                        }
                        break;
                    case 1:
                        py4Var.g().t = (to0) obj2;
                        break;
                    default:
                        in2 in2VarG2 = py4Var.g();
                        ((um2) obj).e0(new fn2(in2VarG2, (bz1) obj2, in2VarG2.f));
                        break;
                }
                return og5Var;
            }
        };
    }

    public final in2 g() {
        in2 in2Var = this.y;
        if (in2Var != null) {
            return in2Var;
        }
        l0.u("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
