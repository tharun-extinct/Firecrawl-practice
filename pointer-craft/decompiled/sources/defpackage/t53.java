package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t53 {
    public final ji g;
    public final HashMap r;
    public final ro y;

    public t53(Context context, ro roVar) {
        ji jiVar = new ji(context);
        this.r = new HashMap();
        this.g = jiVar;
        this.y = roVar;
    }

    public final synchronized dd5 g(String str) {
        if (this.r.containsKey(str)) {
            return (dd5) this.r.get(str);
        }
        CctBackendFactory cctBackendFactoryB = this.g.B(str);
        if (cctBackendFactoryB == null) {
            return null;
        }
        ro roVar = this.y;
        dd5 dd5VarCreate = cctBackendFactoryB.create(new hu((Context) roVar.m, (di0) roVar.t, (di0) roVar.a, str));
        this.r.put(str, dd5VarCreate);
        return dd5VarCreate;
    }
}
