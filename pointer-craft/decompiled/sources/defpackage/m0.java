package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements Iterator, vh2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public int t;

    public /* synthetic */ m0(Object obj, byte b) {
        this.j = b;
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.j;
        Object obj = this.a;
        switch (b) {
            case 0:
                return this.t < ((p0) obj).g();
            case 1:
                return this.t < ((nu4) obj).v();
            default:
                return this.t < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.j;
        Object obj = this.a;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    uo1.b();
                    return null;
                }
                int i = this.t;
                this.t = i + 1;
                return ((p0) obj).get(i);
            case 1:
                int i2 = this.t;
                this.t = i2 + 1;
                return ((nu4) obj).x(i2);
            default:
                int i3 = this.t;
                this.t = i3 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.a;
                int i = this.t - 1;
                this.t = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
