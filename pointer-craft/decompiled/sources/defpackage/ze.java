package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ze {
    public final af g;
    public final View n;
    public final we r;
    public final we y;

    public ze(af afVar, we weVar, we weVar2, View view) {
        this.g = afVar;
        this.y = weVar;
        this.r = weVar2;
        this.n = view;
    }

    public final boolean g(Menu menu) {
        int i;
        int i2;
        v35 v35Var = (v35) this.y.g();
        final byte b = 0;
        if (yf2.p(v35Var, null)) {
            return false;
        }
        menu.clear();
        List list = v35Var.g;
        int size = list.size();
        final byte b2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            u35 u35Var = (u35) list.get(i3);
            if (u35Var instanceof c45) {
                i = i4 + 1;
                Object obj = u35Var.g;
                if (yf2.p(obj, af6.g)) {
                    i2 = R.id.cut;
                } else if (yf2.p(obj, af6.y)) {
                    i2 = R.id.copy;
                } else if (yf2.p(obj, af6.r)) {
                    i2 = R.id.paste;
                } else if (yf2.p(obj, af6.n)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = yf2.p(obj, af6.v) ? R.id.autofill : i4;
                }
                final c45 c45Var = (c45) u35Var;
                MenuItem menuItemAdd = menu.add(i5, i2, i4, c45Var.y);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ye
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        byte b3 = b;
                        Object obj2 = this;
                        Object obj3 = c45Var;
                        switch (b3) {
                            case 0:
                                ((c45) obj3).n.a(((ze) obj2).g);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                ih6.y(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (u35Var instanceof i45) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i4 + 1;
                        final Context context = this.n.getContext();
                        i45 i45Var = (i45) u35Var;
                        final TextClassification textClassification = i45Var.y;
                        int i6 = i45Var.r;
                        Drawable drawable = i45Var.n;
                        if (i6 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ye
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    byte b3 = b2;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (b3) {
                                        case 0:
                                            ((c45) obj3).n.a(((ze) obj2).g);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            ih6.y(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            byte b3 = i6 == 0 ? (byte) 1 : b;
                            final RemoteAction remoteActionR = o35.r(textClassification.getActions().get(i6));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i4, remoteActionR.getTitle());
                            menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: m85
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    ih6.y(remoteActionR.getActionIntent());
                                    return true;
                                }
                            });
                        }
                    }
                } else if (u35Var instanceof g45) {
                    i5++;
                }
                i3++;
                b = 0;
            }
            i4 = i;
            i3++;
            b = 0;
        }
        return true;
    }
}
