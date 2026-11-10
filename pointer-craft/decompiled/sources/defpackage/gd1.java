package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gd1 {
    public final ArrayList g = new ArrayList();
    public float[] y;

    public gd1() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.y = fArr;
    }

    public final void g(Object obj, float f) {
        ArrayList arrayList = this.g;
        arrayList.add(obj);
        if (this.y.length < arrayList.size()) {
            this.y = Arrays.copyOf(this.y, arrayList.size() + 2);
        }
        this.y[arrayList.size() - 1] = f;
    }
}
