package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class le6 {
    public static volatile ArrayList g;
    public static ha2 r;
    public static final Object y = new Object();

    public static w51 g(n51 n51Var) {
        return new w51(0L, n51Var.d(y94.N(0L)));
    }

    public static yn4 n(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        String strY = y(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (name.equals("data")) {
                        y(xmlResourceParser, "scheme");
                        y(xmlResourceParser, "host");
                        y(xmlResourceParser, "port");
                        y(xmlResourceParser, "path");
                        y(xmlResourceParser, "pathPattern");
                        y(xmlResourceParser, "pathPrefix");
                        arrayList.add(new xn4(y(xmlResourceParser, "mimeType")));
                    } else if (name.equals("category")) {
                        arrayList2.add(y(xmlResourceParser, "name"));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || strY == null || arrayList2.isEmpty()) {
            return null;
        }
        return new yn4((xn4[]) arrayList.toArray(new xn4[arrayList.size()]), strY, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static final ha2 r() {
        ha2 ha2Var = r;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.RateReview", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(20.0f, 2.0f);
        kq3Var.x(4.0f, 2.0f);
        kq3Var.r(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        kq3Var.x(2.0f, 22.0f);
        kq3Var.l(4.0f, -4.0f);
        kq3Var.v(14.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.x(22.0f, 4.0f);
        kq3Var.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kq3Var.g();
        kq3Var.j(20.0f, 16.0f);
        kq3Var.x(5.17f, 16.0f);
        kq3Var.l(-0.59f, 0.59f);
        kq3Var.l(-0.58f, 0.58f);
        kq3Var.x(4.0f, 4.0f);
        kq3Var.v(16.0f);
        kq3Var.w(12.0f);
        kq3Var.g();
        kq3Var.j(10.5f, 14.0f);
        kq3Var.x(18.0f, 14.0f);
        kq3Var.w(-2.0f);
        kq3Var.v(-5.5f);
        kq3Var.g();
        kq3Var.j(14.36f, 8.13f);
        kq3Var.r(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        kq3Var.l(-1.77f, -1.77f);
        kq3Var.r(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        kq3Var.x(6.0f, 11.53f);
        kq3Var.x(6.0f, 14.0f);
        kq3Var.v(2.47f);
        kq3Var.l(5.89f, -5.87f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        r = ha2VarY;
        return ha2VarY;
    }

    public static ArrayList v(Context context) {
        yn4 yn4VarN;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (xmlResourceParserLoadXmlMetaData == null) {
                        t94.j(activityInfo.name, "Failed to open android.app.shortcuts meta-data resource of ");
                        return null;
                    }
                    while (true) {
                        try {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && xmlResourceParserLoadXmlMetaData.getName().equals("share-target") && (yn4VarN = n(xmlResourceParserLoadXmlMetaData)) != null) {
                                arrayList2.add(yn4VarN);
                            }
                        } catch (Exception e) {
                            Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                        }
                    }
                    xmlResourceParserLoadXmlMetaData.close();
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static String y(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }
}
