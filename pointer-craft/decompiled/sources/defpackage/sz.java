package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sz extends f84 implements bz1 {
    public ku3 a;
    public final /* synthetic */ ox0 c;
    public final /* synthetic */ ya5 i;
    public long m;
    public byte q;
    public ew4 t;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(ox0 ox0Var, ya5 ya5Var, mu0 mu0Var) {
        super(mu0Var);
        this.c = ox0Var;
        this.i = ya5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        sz szVar = new sz(this.c, this.i, mu0Var);
        szVar.w = obj;
        return szVar;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((sz) b((mu0) obj2, (f05) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #2 {all -> 0x001a, blocks: (B:8:0x0015, B:41:0x00be, B:43:0x00c2), top: B:52:0x0015 }] */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        ew4 ew4VarW;
        ku3 ku3Var;
        long j;
        f05 f05Var;
        ew4 ew4Var;
        ew4 ew4Var2;
        qu3 qu3Var;
        byte b = this.q;
        byte b2 = 0;
        mu0 mu0Var = null;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            f05 f05Var2 = (f05) this.w;
            ew4VarW = y94.w(Boolean.FALSE);
            long jR = f05Var2.x().r();
            this.w = f05Var2;
            this.t = ew4VarW;
            ku3Var = ku3.j;
            this.a = ku3Var;
            this.m = jR;
            this.q = (byte) 1;
            Object objY = r25.y(f05Var2, this, 1);
            if (objY != px0Var) {
                j = jR;
                f05Var = f05Var2;
                obj = objY;
            }
            return px0Var;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ew4Var2 = (ew4) this.w;
                try {
                    js2.o(obj);
                    qu3Var = (qu3) obj;
                    if (qu3Var != null) {
                        qu3Var.g();
                    }
                    Boolean bool = Boolean.FALSE;
                    ew4Var2.getClass();
                    ew4Var2.m(null, bool);
                    return og5.g;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    ew4Var2.getClass();
                    ew4Var2.m(null, bool2);
                    throw th;
                }
            }
            ku3 ku3Var2 = this.a;
            ew4Var = this.t;
            f05Var = (f05) this.w;
            try {
                js2.o(obj);
                Boolean bool3 = Boolean.FALSE;
                ew4Var.getClass();
                ew4Var.m(null, bool3);
            } catch (lu3 unused) {
                ku3Var = ku3Var2;
                ew4VarW = ew4Var;
                m50.T(this.c, null, new rz(ew4VarW, this.i, mu0Var, b2), 1);
                this.w = ew4VarW;
                this.t = null;
                this.a = null;
                this.q = (byte) 3;
                obj = r25.t(f05Var, ku3Var, this);
                if (obj != px0Var) {
                    ew4Var2 = ew4VarW;
                    qu3Var = (qu3) obj;
                    if (qu3Var != null) {
                        qu3Var.g();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    ew4Var2.getClass();
                    ew4Var2.m(null, bool4);
                }
                return px0Var;
            } catch (Throwable th2) {
                th = th2;
                ew4Var2 = ew4Var;
                Boolean bool5 = Boolean.FALSE;
                ew4Var2.getClass();
                ew4Var2.m(null, bool5);
                throw th;
            }
            return og5.g;
        }
        long j2 = this.m;
        ku3 ku3Var3 = this.a;
        ew4 ew4Var3 = this.t;
        f05 f05Var3 = (f05) this.w;
        js2.o(obj);
        ku3Var = ku3Var3;
        ew4VarW = ew4Var3;
        j = j2;
        f05Var = f05Var3;
        long j3 = j;
        int i = ((qu3) obj).t;
        if (i == 1 || i == 3) {
            try {
                try {
                    qz qzVar = new qz(ku3Var, mu0Var, b2);
                    this.w = f05Var;
                    this.t = ew4VarW;
                    this.a = ku3Var;
                    this.q = (byte) 2;
                    if (f05Var.t(j3, qzVar, this) != px0Var) {
                        ew4Var = ew4VarW;
                        Boolean bool6 = Boolean.FALSE;
                        ew4Var.getClass();
                        ew4Var.m(null, bool6);
                    }
                } catch (lu3 unused2) {
                    m50.T(this.c, null, new rz(ew4VarW, this.i, mu0Var, b2), 1);
                    this.w = ew4VarW;
                    this.t = null;
                    this.a = null;
                    this.q = (byte) 3;
                    obj = r25.t(f05Var, ku3Var, this);
                    if (obj != px0Var) {
                        ew4Var2 = ew4VarW;
                        qu3Var = (qu3) obj;
                        if (qu3Var != null) {
                            qu3Var.g();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        ew4Var2.getClass();
                        ew4Var2.m(null, bool7);
                        return og5.g;
                    }
                }
                return px0Var;
            } catch (Throwable th3) {
                th = th3;
                ew4Var2 = ew4VarW;
                Boolean bool8 = Boolean.FALSE;
                ew4Var2.getClass();
                ew4Var2.m(null, bool8);
                throw th;
            }
        }
        return og5.g;
    }
}
