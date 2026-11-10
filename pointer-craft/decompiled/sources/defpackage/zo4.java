package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zo4 {
    public Set a;
    public Context g;
    public IconCompat j;
    public CharSequence l;
    public boolean m;
    public ComponentName n;
    public int q;
    public Intent[] r;
    public os3[] t;
    public CharSequence v;
    public PersistableBundle w;
    public CharSequence x;
    public String y;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.g, this.y).setShortLabel(this.v).setIntents(this.r);
        IconCompat iconCompat = this.j;
        if (iconCompat != null) {
            intents.setIcon(gh6.v(iconCompat, this.g));
        }
        if (!TextUtils.isEmpty(this.x)) {
            intents.setLongLabel(this.x);
        }
        if (!TextUtils.isEmpty(this.l)) {
            intents.setDisabledMessage(this.l);
        }
        ComponentName componentName = this.n;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.a;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.q);
        PersistableBundle persistableBundle = this.w;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            os3[] os3VarArr = this.t;
            if (os3VarArr != null && os3VarArr.length > 0) {
                int length = os3VarArr.length;
                Person[] personArr = new Person[length];
                if (length > 0) {
                    os3 os3Var = os3VarArr[0];
                    throw null;
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.m);
        } else {
            PersistableBundle persistableBundle2 = this.w;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.w = persistableBundle2;
            }
            os3[] os3VarArr2 = this.t;
            if (os3VarArr2 != null && os3VarArr2.length > 0) {
                persistableBundle2.putInt("extraPersonCount", os3VarArr2.length);
                os3[] os3VarArr3 = this.t;
                if (os3VarArr3.length > 0) {
                    os3 os3Var2 = os3VarArr3[0];
                    throw null;
                }
            }
            this.w.putBoolean("extraLongLived", this.m);
            intents.setExtras(this.w);
        }
        if (i >= 33) {
            h2.i(intents);
        }
        return intents.build();
    }

    public final ComponentName g() {
        return this.n;
    }

    public final int j() {
        return this.q;
    }

    public final CharSequence l() {
        return this.x;
    }

    public final IconCompat n() {
        return this.j;
    }

    public final CharSequence r() {
        return this.l;
    }

    public final CharSequence t() {
        return this.v;
    }

    public final String v() {
        return this.y;
    }

    public final Intent[] x() {
        Intent[] intentArr = this.r;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public final Set y() {
        return this.a;
    }
}
