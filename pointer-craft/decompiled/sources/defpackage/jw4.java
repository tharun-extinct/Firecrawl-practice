package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jw4 {
    public final int g;
    public final float y;

    public jw4(int i, float f) {
        this.g = i;
        this.y = f;
    }

    public final int g(int i) {
        float f = this.y;
        int i2 = this.g;
        if (i2 == 1) {
            return (int) (f * i);
        }
        if (i2 == 2) {
            return (int) f;
        }
        return 0;
    }
}
