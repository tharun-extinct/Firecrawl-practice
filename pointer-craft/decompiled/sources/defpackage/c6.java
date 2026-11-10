package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c6 {
    public int g;
    public Object y;

    public c6(Context context, int i) {
        this.y = new y5(new ContextThemeWrapper(context, d6.t(context, i)));
        this.g = i;
    }

    public boolean a(Object obj) {
        Object[] objArr = (Object[]) this.y;
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                l0.z("Already in the pool!");
                return false;
            }
        }
        int i3 = this.g;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.g = i3 + 1;
        return true;
    }

    public void c() {
        v().show();
    }

    public Object g() {
        Object[] objArr = (Object[]) this.y;
        int i = this.g;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.g--;
        return obj;
    }

    public void j(int i, wr wrVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            wr wrVar2 = ((wr[]) this.y)[i2];
            wrVar2.getClass();
            if (yf2.k(0L, wrVar.l - wrVar2.l) <= 0) {
                break;
            }
            wrVar2.x = i;
            ((wr[]) this.y)[i] = wrVar2;
            i = i2;
        }
        ((wr[]) this.y)[i] = wrVar;
        wrVar.x = i;
    }

    public int l() {
        return this.g;
    }

    public void m(long j) {
        int i = this.g;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.y)[i2]) {
                int i3 = this.g - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.y;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.g--;
                return;
            }
            i2++;
        }
    }

    public boolean n(long j) {
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.y)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void q(wr wrVar) {
        wr wrVar2;
        int i = wrVar.x;
        if (i == -1) {
            l0.u("Failed requirement.");
            return;
        }
        int i2 = this.g;
        wr wrVar3 = ((wr[]) this.y)[i2];
        wrVar3.getClass();
        wrVar.x = -1;
        ((wr[]) this.y)[i2] = null;
        this.g = i2 - 1;
        if (wrVar == wrVar3) {
            return;
        }
        int iK = yf2.k(0L, wrVar3.l - wrVar.l);
        if (iK == 0) {
            ((wr[]) this.y)[i] = wrVar3;
            wrVar3.x = i;
            return;
        }
        if (iK >= 0) {
            j(i, wrVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.g;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                wrVar2 = ((wr[]) this.y)[i3];
                wrVar2.getClass();
            } else {
                wrVar2 = ((wr[]) this.y)[i3];
                wrVar2.getClass();
                wr wrVar4 = ((wr[]) this.y)[i4];
                wrVar4.getClass();
                if (yf2.k(0L, wrVar4.l - wrVar2.l) >= 0) {
                    wrVar2 = wrVar4;
                }
            }
            if (yf2.k(0L, wrVar2.l - wrVar3.l) <= 0) {
                break;
            }
            int i6 = wrVar2.x;
            wrVar2.x = i;
            ((wr[]) this.y)[i] = wrVar2;
            i = i6;
        }
        ((wr[]) this.y)[i] = wrVar3;
        wrVar3.x = i;
    }

    public void r() {
        this.g = 0;
    }

    public boolean t() {
        return this.g == 0;
    }

    public d6 v() {
        y5 y5Var = (y5) this.y;
        d6 d6Var = new d6(y5Var.g, this.g);
        View view = y5Var.v;
        b6 b6Var = d6Var.c;
        if (view != null) {
            b6Var.s = view;
        } else {
            CharSequence charSequence = y5Var.n;
            if (charSequence != null) {
                b6Var.n = charSequence;
                TextView textView = b6Var.i;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                b6Var.r.setTitle(charSequence);
            }
            Drawable drawable = y5Var.r;
            if (drawable != null) {
                b6Var.w = drawable;
                ImageView imageView = b6Var.c;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    b6Var.c.setImageDrawable(drawable);
                }
            }
        }
        String str = y5Var.x;
        if (str != null) {
            b6Var.v = str;
            TextView textView2 = b6Var.b;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = y5Var.l;
        if (charSequence2 != null) {
            g91 g91Var = y5Var.j;
            Message messageObtainMessage = g91Var != null ? b6Var.d.obtainMessage(-1, g91Var) : null;
            b6Var.j = charSequence2;
            b6Var.t = messageObtainMessage;
        }
        if (y5Var.m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) y5Var.y.inflate(b6Var.h, (ViewGroup) null);
            int i = y5Var.w ? b6Var.o : b6Var.f;
            ListAdapter a6Var = y5Var.m;
            if (a6Var == null) {
                a6Var = new a6(y5Var.g, i, R.id.text1, null);
            }
            b6Var.p = a6Var;
            b6Var.u = y5Var.c;
            if (y5Var.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new x5(y5Var, b6Var));
            }
            if (y5Var.w) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            b6Var.x = alertController$RecycleListView;
        }
        d6Var.setCancelable(y5Var.t);
        if (y5Var.t) {
            d6Var.setCanceledOnTouchOutside(true);
        }
        d6Var.setOnCancelListener(null);
        d6Var.setOnDismissListener(null);
        k43 k43Var = y5Var.a;
        if (k43Var != null) {
            d6Var.setOnKeyListener(k43Var);
        }
        return d6Var;
    }

    public void w(int i) {
        int i2 = this.g;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = (long[]) this.y;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.g--;
        }
    }

    public long x(int i) {
        return ((long[]) this.y)[i];
    }

    public void y(long j) {
        if (n(j)) {
            return;
        }
        int i = this.g;
        long[] jArrCopyOf = (long[]) this.y;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.y = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.g) {
            this.g = i + 1;
        }
    }

    public c6() {
        this.y = new long[2];
    }

    public c6(int i) {
        if (i > 0) {
            this.y = new Object[i];
        } else {
            l0.u("The max pool size must be > 0");
            throw null;
        }
    }

    public c6(Context context) {
        this(context, d6.t(context, 0));
    }

    public c6(kq0 kq0Var, int i) {
        jr2.m(kq0Var);
        this.y = kq0Var;
        this.g = i;
    }
}
