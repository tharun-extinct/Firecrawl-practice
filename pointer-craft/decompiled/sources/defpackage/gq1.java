package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface gq1 extends oi {
    @Override // defpackage.oi
    default jj5 g(te5 te5Var) {
        return new kb5(this);
    }

    long n(float f, float f2, float f3);

    float r(long j, float f, float f2, float f3);

    default float v(float f, float f2, float f3) {
        return r(n(f, f2, f3), f, f2, f3);
    }

    float y(long j, float f, float f2, float f3);
}
