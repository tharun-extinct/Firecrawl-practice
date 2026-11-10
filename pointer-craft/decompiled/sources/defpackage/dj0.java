package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class dj0 extends pw5 {
    public static int Y(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
