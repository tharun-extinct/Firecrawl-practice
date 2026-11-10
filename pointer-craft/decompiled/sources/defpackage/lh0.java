package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 {
    public final ReferenceQueue g = new ReferenceQueue();
    public final Set y = Collections.synchronizedSet(new HashSet());
}
