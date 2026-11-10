package defpackage;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
public final class if0 implements Comparable {
    public final zo4 j;
    public final ComponentName t;

    public if0(zo4 zo4Var, ComponentName componentName) {
        this.j = zo4Var;
        this.t = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.j.q - ((if0) obj).j.q;
    }
}
