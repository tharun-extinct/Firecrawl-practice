package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cx3 {
    public final List g;
    public int n;
    public int r;
    public boolean v;
    public final /* synthetic */ dx3 x;
    public final List[] y;

    public cx3(dx3 dx3Var, List list) {
        this.x = dx3Var;
        this.g = list;
        this.y = new List[list.size()];
        if (list.isEmpty()) {
            pc2.g("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
