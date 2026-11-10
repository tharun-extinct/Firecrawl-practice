package defpackage;

import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ep4 implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl a;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ m74 t;

    public ep4(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, m74 m74Var) {
        this.a = shortcutInfoCompatSaverImpl;
        this.j = arrayList;
        this.t = m74Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    @Override // java.lang.Runnable
    public final void run() {
        String resourceName;
        String absolutePath;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.a;
            if (i >= size) {
                shortcutInfoCompatSaverImpl.x(this.t);
                return;
            }
            int i2 = i + 1;
            zo4 zo4Var = (zo4) arrayList.get(i);
            Set setY = zo4Var.y();
            if (setY != null && !setY.isEmpty()) {
                IconCompat iconCompatN = zo4Var.n();
                if (iconCompatN == null) {
                    resourceName = null;
                    absolutePath = null;
                } else {
                    int iL = iconCompatN.l();
                    if (iL == 1) {
                        absolutePath = new File(shortcutInfoCompatSaverImpl.l, UUID.randomUUID().toString()).getAbsolutePath();
                        resourceName = null;
                    } else if (iL == 2) {
                        resourceName = shortcutInfoCompatSaverImpl.g.getResources().getResourceName(iconCompatN.x());
                        absolutePath = null;
                    } else if (iL != 5) {
                        resourceName = null;
                        absolutePath = null;
                    } else {
                        absolutePath = new File(shortcutInfoCompatSaverImpl.l, UUID.randomUUID().toString()).getAbsolutePath();
                        resourceName = null;
                    }
                }
                v92 v92Var = new v92(zo4Var);
                v92Var.W(null);
                hp4 hp4Var = new hp4(v92Var.A(), resourceName, absolutePath);
                Bitmap bitmapV = absolutePath != null ? zo4Var.n().v() : null;
                String strV = zo4Var.v();
                shortcutInfoCompatSaverImpl.y.put(strV, hp4Var);
                if (bitmapV != null) {
                    i26 i26Var = new i26(shortcutInfoCompatSaverImpl, bitmapV, absolutePath);
                    m74 m74Var = new m74();
                    shortcutInfoCompatSaverImpl.v.submit(new tu2(m74Var, i26Var, (byte) 7));
                    vw2 vw2Var = (vw2) shortcutInfoCompatSaverImpl.r.put(strV, m74Var);
                    if (vw2Var != null) {
                        vw2Var.cancel(false);
                    }
                    m74Var.g(new ks0(this, strV, m74Var, (byte) 4, false), shortcutInfoCompatSaverImpl.n);
                }
            }
            i = i2;
        }
    }
}
