package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 {
    public int g;
    public final Serializable y;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Object[]] */
    public ra2() {
        this.y = new Object[256];
    }

    public void g(Object obj) {
        int i = this.g;
        Object[] objArr = (Object[]) this.y;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.g = i + 1;
        }
    }

    public ra2(String str, int i) {
        this.g = i;
        this.y = str;
    }
}
