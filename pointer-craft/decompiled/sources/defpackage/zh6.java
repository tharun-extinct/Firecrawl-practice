package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zh6 extends ho0 {
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh6(byte b) {
        super((byte) 1);
        this.y = b;
    }

    @Override // defpackage.ho0
    public final Object r(Object obj) {
        switch (this.y) {
            case 0:
                f63 f63VarY = f63.y();
                return new qh6((Context) f63VarY.g(Context.class), (io4) f63VarY.g(io4.class), new oh6((Context) f63.y().g(Context.class), (mh6) obj));
            default:
                f63 f63VarY2 = f63.y();
                Context context = (Context) f63.y().g(Context.class);
                ArrayList arrayList = new ArrayList();
                ob5 ob5Var = new ob5();
                ga0 ga0Var = ga0.v;
                fd5.y(context);
                fd5.g().r(ga0Var);
                ga0.n.contains(new dj1("json"));
                arrayList.add(ob5Var);
                return new ui6((Context) f63VarY2.g(Context.class), (io4) f63VarY2.g(io4.class));
        }
    }
}
