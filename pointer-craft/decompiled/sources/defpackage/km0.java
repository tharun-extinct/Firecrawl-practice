package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km0 implements n14 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ km0(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // defpackage.n14
    public final Object get() {
        byte b = this.g;
        Object obj = this.r;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                lm0 lm0Var = (lm0) obj2;
                ll0 ll0Var = (ll0) obj;
                gm0 gm0Var = ll0Var.x;
                vl vlVar = new vl();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<p51> set = ll0Var.r;
                Set set2 = ll0Var.l;
                for (p51 p51Var : set) {
                    byte b2 = p51Var.r;
                    byte b3 = p51Var.y;
                    boolean z = b2 == 0;
                    e24 e24Var = p51Var.g;
                    if (z) {
                        if (b3 == 2) {
                            hashSet4.add(e24Var);
                        } else {
                            hashSet.add(e24Var);
                        }
                    } else if (b2 == 2) {
                        hashSet3.add(e24Var);
                    } else if (b3 == 2) {
                        hashSet5.add(e24Var);
                    } else {
                        hashSet2.add(e24Var);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(e24.g(s14.class));
                }
                vlVar.g = Collections.unmodifiableSet(hashSet);
                vlVar.y = Collections.unmodifiableSet(hashSet2);
                vlVar.r = Collections.unmodifiableSet(hashSet3);
                vlVar.n = Collections.unmodifiableSet(hashSet4);
                vlVar.v = Collections.unmodifiableSet(hashSet5);
                vlVar.x = lm0Var;
                return gm0Var.c(vlVar);
            default:
                ro1 ro1Var = (ro1) obj2;
                String strN = ro1Var.n();
                return new sz0((Context) obj, strN);
        }
    }
}
