package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.cp4;
import defpackage.gh6;
import defpackage.if0;
import defpackage.le6;
import defpackage.xn4;
import defpackage.yn4;
import defpackage.zo4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompatV;
        Context applicationContext = getApplicationContext();
        if (le6.g == null) {
            synchronized (le6.y) {
                try {
                    if (le6.g == null) {
                        le6.g = le6.v(applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ArrayList arrayList = le6.g;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yn4 yn4Var = (yn4) obj;
            if (yn4Var.y.equals(componentName.getClassName())) {
                for (xn4 xn4Var : yn4Var.g) {
                    if (intentFilter.hasDataType(xn4Var.g)) {
                        arrayList2.add(yn4Var);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
        try {
            List<zo4> list = (List) shortcutInfoCompatSaverImpl.n.submit(new cp4(shortcutInfoCompatSaverImpl, (byte) 0)).get();
            if (list == null || list.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList3 = new ArrayList();
            for (zo4 zo4Var : list) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    yn4 yn4Var2 = (yn4) obj2;
                    if (zo4Var.a.containsAll(Arrays.asList(yn4Var2.r))) {
                        arrayList3.add(new if0(zo4Var, new ComponentName(applicationContext.getPackageName(), yn4Var2.y)));
                        break;
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                return new ArrayList();
            }
            Collections.sort(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int i3 = ((if0) arrayList3.get(0)).j.q;
            int size3 = arrayList3.size();
            float f = 1.0f;
            int i4 = i3;
            int i5 = 0;
            while (i5 < size3) {
                int i6 = i5 + 1;
                if0 if0Var = (if0) arrayList3.get(i5);
                zo4 zo4Var2 = if0Var.j;
                try {
                    iconCompatV = shortcutInfoCompatSaverImpl.v(zo4Var2.y);
                } catch (Exception e) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                    iconCompatV = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", zo4Var2.y);
                int i7 = zo4Var2.q;
                if (i4 != i7) {
                    f -= 0.01f;
                    i4 = i7;
                }
                float f2 = f;
                arrayList4.add(new ChooserTarget(zo4Var2.v, iconCompatV != null ? gh6.v(iconCompatV, null) : null, f2, if0Var.t, bundle));
                i5 = i6;
                f = f2;
            }
            return arrayList4;
        } catch (Exception e2) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e2);
            return Collections.EMPTY_LIST;
        }
    }
}
