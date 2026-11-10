package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ug5 implements nt5, zf1 {
    public final /* synthetic */ byte j;

    public ug5(k2 k2Var) {
        this.j = (byte) 3;
    }

    public static void n(int i) {
        synchronized (UnmanagedSessionReceiver.g) {
            if (UnmanagedSessionReceiver.y.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // defpackage.nt5
    public Object g() {
        switch (this.j) {
            case 2:
                return new fu5("IntegrityService");
            default:
                return new ob5();
        }
    }

    @Override // defpackage.zf1
    public int r(Context context, boolean z) {
        return bg1.y(context, "com.google.android.gms.providerinstaller.dynamite", z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(Context context, String str, ou0 ou0Var) {
        lr5 lr5Var;
        if (ou0Var instanceof lr5) {
            lr5Var = (lr5) ou0Var;
            int i = lr5Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                lr5Var.w = i - Integer.MIN_VALUE;
            } else {
                lr5Var = new lr5(this, ou0Var);
            }
        } else {
            lr5Var = new lr5(this, ou0Var);
        }
        Object objG = lr5Var.m;
        int i2 = lr5Var.w;
        boolean z = true;
        if (i2 == 0) {
            js2.o(objG);
            kr5 kr5VarG = kr5.g(context);
            ks0 ks0Var = new ks0(kr5VarG, str);
            ((lk4) kr5VarG.n.g).execute(ks0Var);
            ol4 ol4Var = (ol4) ks0Var.t;
            lr5Var.w = 1;
            objG = gz5.g(ol4Var, lr5Var);
            px0 px0Var = px0.j;
            if (objG == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objG);
        }
        List list = (List) objG;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (pw5.d(hr5.t, hr5.j).contains(((ir5) list.get(i3)).y)) {
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zf1
    public int y(Context context) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.com.google.android.gms.providerinstaller.dynamite.ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (lb6.g(declaredField.get(null), "com.google.android.gms.providerinstaller.dynamite")) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + "com.google.android.gms.providerinstaller.dynamite".length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id 'com.google.android.gms.providerinstaller.dynamite'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder("com.google.android.gms.providerinstaller.dynamite".length() + 45);
            sb3.append("Local module descriptor class for com.google.android.gms.providerinstaller.dynamite not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public /* synthetic */ ug5(byte b) {
        this.j = b;
    }
}
