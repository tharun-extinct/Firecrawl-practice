package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class dz4 extends MenuInflater {
    public static final Class[] v;
    public static final Class[] x;
    public final Object[] g;
    public Object n;
    public final Context r;
    public final Object[] y;

    static {
        Class[] clsArr = {Context.class};
        v = clsArr;
        x = clsArr;
    }

    public dz4(Context context) {
        super(context);
        this.r = context;
        Object[] objArr = {context};
        this.g = objArr;
        this.y = objArr;
    }

    public static Object g(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? g(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i43)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.r.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof i43) {
                    i43 i43Var = (i43) menu;
                    if (!i43Var.b) {
                        i43Var.e();
                        z = true;
                    }
                }
                y(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((i43) menu).d();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((i43) menu).d();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public final void y(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        cz4 cz4Var = new cz4(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    t94.v("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                t94.v("Unexpected end of document");
                return;
            }
            Menu menu2 = cz4Var.g;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.r;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r24.b);
                        cz4Var.y = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        cz4Var.r = typedArrayObtainStyledAttributes.getInt(3, 0);
                        cz4Var.n = typedArrayObtainStyledAttributes.getInt(4, 0);
                        cz4Var.v = typedArrayObtainStyledAttributes.getInt(5, 0);
                        cz4Var.x = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        cz4Var.l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r24.s);
                        cz4Var.t = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        cz4Var.a = (typedArrayObtainStyledAttributes2.getInt(5, cz4Var.r) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cz4Var.n) & 65535);
                        cz4Var.m = typedArrayObtainStyledAttributes2.getText(7);
                        cz4Var.q = typedArrayObtainStyledAttributes2.getText(8);
                        cz4Var.w = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        cz4Var.c = string == null ? (char) 0 : string.charAt(0);
                        cz4Var.i = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        cz4Var.b = string2 == null ? (char) 0 : string2.charAt(0);
                        cz4Var.s = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            cz4Var.p = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            cz4Var.p = cz4Var.v;
                        }
                        cz4Var.u = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        cz4Var.z = typedArrayObtainStyledAttributes2.getBoolean(4, cz4Var.x);
                        cz4Var.h = typedArrayObtainStyledAttributes2.getBoolean(1, cz4Var.l);
                        cz4Var.o = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        cz4Var.d = typedArrayObtainStyledAttributes2.getString(12);
                        cz4Var.f = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        cz4Var.k = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && cz4Var.f == 0 && cz4Var.k == null) {
                            cz4Var.e = (o43) cz4Var.g(string3, x, this.y);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cz4Var.e = null;
                        }
                        cz4Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        cz4Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            cz4Var.D = fe1.y(typedArrayObtainStyledAttributes2.getInt(19, -1), cz4Var.D);
                        } else {
                            cz4Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ue5.R(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            cz4Var.C = colorStateList;
                        } else {
                            cz4Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        cz4Var.j = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        cz4Var.j = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(cz4Var.y, cz4Var.t, cz4Var.a, cz4Var.m);
                        cz4Var.y(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        y(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        cz4Var.y = 0;
                        cz4Var.r = 0;
                        cz4Var.n = 0;
                        cz4Var.v = 0;
                        cz4Var.x = true;
                        cz4Var.l = true;
                    } else if (name3.equals("item")) {
                        if (!cz4Var.j) {
                            o43 o43Var = cz4Var.e;
                            if (o43Var == null || !o43Var.y.hasSubMenu()) {
                                cz4Var.j = true;
                                cz4Var.y(menu2.add(cz4Var.y, cz4Var.t, cz4Var.a, cz4Var.m));
                            } else {
                                cz4Var.j = true;
                                cz4Var.y(menu2.addSubMenu(cz4Var.y, cz4Var.t, cz4Var.a, cz4Var.m).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
