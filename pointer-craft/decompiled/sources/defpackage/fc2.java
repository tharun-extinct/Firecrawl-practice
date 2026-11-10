package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fc2 implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ fc2(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // defpackage.va1
    public final void g() throws Exception {
        byte b = this.g;
        Object obj = this.r;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ((ec2) obj2).g.q((bc2) obj);
                break;
            case 1:
                ((vs2) obj2).a.m(obj);
                break;
            case 2:
                Iterator it = ((List) ((bw4) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((un0) obj).y().r((mc3) it.next());
                }
                break;
            case 3:
                ((ju2) obj2).x((du2) obj);
                break;
            case 4:
                ((wv) obj2).y((ao0) obj);
                break;
            case 5:
                ((nc5) obj2).m.remove((nc5) obj);
                break;
            case 6:
                nc5 nc5Var = (nc5) obj2;
                nc5Var.getClass();
                bc5 bc5Var = (bc5) ((cc5) obj).y.getValue();
                if (bc5Var != null) {
                    nc5Var.a.remove(bc5Var.j);
                }
                break;
            case 7:
                ((nc5) obj2).a.remove((hc5) obj);
                break;
            default:
                yp5 yp5Var = (yp5) obj2;
                View view = (View) obj;
                int i = yp5Var.o - 1;
                yp5Var.o = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = xk5.g;
                    pk5.r(view, null);
                    yo5.g(view, null);
                    view.removeOnAttachStateChangeListener(yp5Var.f);
                }
                break;
        }
    }
}
