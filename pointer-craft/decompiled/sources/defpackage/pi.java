package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi implements bw4 {
    public vi a;
    public final te5 j;
    public long m;
    public long q;
    public final tp3 t;
    public boolean w;

    public pi(te5 te5Var, Object obj, vi viVar, long j, long j2, boolean z) {
        vi viVarU;
        this.j = te5Var;
        this.t = kq2.M(obj);
        if (viVar != null) {
            viVarU = og0.u(viVar);
        } else {
            viVarU = (vi) te5Var.g.a(obj);
            viVarU.n();
        }
        this.a = viVarU;
        this.m = j;
        this.q = j2;
        this.w = z;
    }

    public final Object g() {
        return this.j.y.a(this.a);
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return this.t.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.t.getValue() + ", velocity=" + g() + ", isRunning=" + this.w + ", lastFrameTimeNanos=" + this.m + ", finishedTimeNanos=" + this.q + ")";
    }

    public /* synthetic */ pi(te5 te5Var, Object obj, vi viVar, int i) {
        this(te5Var, obj, (i & 4) != 0 ? null : viVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
