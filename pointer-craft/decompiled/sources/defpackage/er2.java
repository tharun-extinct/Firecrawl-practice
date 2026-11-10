package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er2 implements bw4 {
    public final tp3 j;
    public int t;

    public er2(int i) {
        int i2 = (i / 30) * 30;
        this.j = new tp3(xs2.K(Math.max(i2 - 100, 0), i2 + 130), f73.w);
        this.t = i;
    }

    public final void g(int i) {
        if (i != this.t) {
            this.t = i;
            int i2 = (i / 30) * 30;
            this.j.setValue(xs2.K(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return (me2) this.j.getValue();
    }
}
