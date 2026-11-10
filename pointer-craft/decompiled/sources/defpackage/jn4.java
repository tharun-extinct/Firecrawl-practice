package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jn4 extends pn4 {
    public final /* synthetic */ Matrix n;
    public final /* synthetic */ ArrayList r;

    public jn4(ArrayList arrayList, Matrix matrix) {
        this.r = arrayList;
        this.n = matrix;
    }

    @Override // defpackage.pn4
    public final void g(Matrix matrix, an4 an4Var, int i, Canvas canvas) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((pn4) obj).g(this.n, an4Var, i, canvas);
        }
    }
}
