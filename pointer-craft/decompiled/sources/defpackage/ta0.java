package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta0 implements uh2, Serializable {
    public final Class a;
    public transient uh2 j;
    public final String m;
    public final String q;
    public final Object t;
    public final boolean w;

    public ta0(Object obj, Class cls, String str, String str2, boolean z) {
        this.t = obj;
        this.a = cls;
        this.m = str;
        this.q = str2;
        this.w = z;
    }

    public uh2 n() {
        v54.g.getClass();
        return this;
    }

    public final sf0 v() {
        boolean z = this.w;
        Class cls = this.a;
        if (!z) {
            return v54.g(cls);
        }
        v54.g.getClass();
        return new un3(cls);
    }
}
