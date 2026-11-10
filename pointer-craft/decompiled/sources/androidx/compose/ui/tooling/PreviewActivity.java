package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.gk2;
import defpackage.l0;
import defpackage.nm0;
import defpackage.r2;
import defpackage.ta;
import defpackage.tx4;
import defpackage.xi3;
import defpackage.yl0;
import defpackage.zl0;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewActivity extends yl0 {
    public static final /* synthetic */ int D = 0;
    public final String C = "PreviewActivity";

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.C;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        int i2 = 0;
        int iZ = tx4.Z(stringExtra, '.', 0, 6);
        String strSubstring = iZ == -1 ? stringExtra : stringExtra.substring(0, iZ);
        int iZ2 = tx4.Z(stringExtra, '.', 0, 6);
        if (iZ2 != -1) {
            stringExtra = stringExtra.substring(iZ2 + 1, stringExtra.length());
        }
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + stringExtra + "' without a parameter provider.");
            zl0.g(this, new nm0(-840626948, true, new ta(strSubstring, stringExtra, (byte) 25)));
            return;
        }
        Log.d(str, xi3.a("Previewing '", stringExtra, "' with parameter provider: '", stringExtra2, "'"));
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + "'", e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls == null) {
            zl0.g(this, new nm0(-1901447514, true, new r2(strSubstring, stringExtra, new Object[0], (byte) 21)));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (gk2 unused) {
            l0.z("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
