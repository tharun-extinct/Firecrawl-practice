package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class yc3 {
    public final wp2 a;
    public final String g;
    public final wp2 j;
    public boolean l;
    public final o05 m;
    public final o05 n;
    public final boolean q;
    public final String r;
    public final wp2 t;
    public final o05 v;
    public final wp2 x;
    public final ArrayList y;
    public static final y54 w = new y54("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final y54 c = new y54("\\{(.+?)\\}");
    public static final y54 i = new y54("http[s]?://");
    public static final y54 b = new y54(".*");
    public static final y54 s = new y54("([^/]*?|)");
    public static final y54 p = new y54("^[^?#]+\\?([^#]*).*");

    public yc3(String str) {
        this.g = str;
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        boolean z = false;
        z = false;
        final byte b2 = z ? (byte) 1 : (byte) 0;
        this.n = new o05(new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b3 = b2;
                yc3 yc3Var = this.t;
                switch (b3) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b3 = 1;
        this.v = new o05(new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b4 = b3;
                yc3 yc3Var = this.t;
                switch (b4) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b4 = 2;
        my1 my1Var = new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b5 = b4;
                yc3 yc3Var = this.t;
                switch (b5) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        bt2 bt2Var = bt2.t;
        this.x = v13.u(bt2Var, my1Var);
        final byte b5 = 3;
        this.j = v13.u(bt2Var, new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b6 = b5;
                yc3 yc3Var = this.t;
                switch (b6) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b6 = 4;
        this.t = v13.u(bt2Var, new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b7 = b6;
                yc3 yc3Var = this.t;
                switch (b7) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b7 = 5;
        this.a = v13.u(bt2Var, new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b8 = b7;
                yc3 yc3Var = this.t;
                switch (b8) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b8 = 6;
        this.m = new o05(new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b9 = b8;
                yc3 yc3Var = this.t;
                switch (b9) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final byte b9 = 7;
        new o05(new my1(this) { // from class: wc3
            public final /* synthetic */ yc3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                List list;
                byte b10 = b9;
                yc3 yc3Var = this.t;
                switch (b10) {
                    case 0:
                        String str2 = yc3Var.r;
                        if (str2 != null) {
                            return new y54(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = yc3Var.g;
                        return Boolean.valueOf(str3 != null && yc3.p.n(str3));
                    case 2:
                        String str4 = yc3Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) yc3Var.v.getValue()).booleanValue()) {
                            str4.getClass();
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    l0.t(xi3.a("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str6 = (String) cj0.l0(queryParameters);
                                if (str6 == null) {
                                    yc3Var.l = true;
                                    str6 = str5;
                                }
                                y54 y54Var = yc3.c;
                                y54Var.getClass();
                                str6.getClass();
                                Matcher matcher = y54Var.j.matcher(str6);
                                matcher.getClass();
                                xc3 xc3Var = new xc3();
                                int i2 = 0;
                                for (c23 c23VarN = mq2.n(matcher, 0, str6); c23VarN != null; c23VarN = c23VarN.y()) {
                                    z13 z13VarY = c23VarN.r.y(1);
                                    z13VarY.getClass();
                                    xc3Var.y.add(z13VarY.g);
                                    if (c23VarN.g().j > i2) {
                                        String strQuote = Pattern.quote(str6.substring(i2, c23VarN.g().j));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = c23VarN.g().t + 1;
                                }
                                if (i2 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i2));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                xc3Var.g = yc3.j(sb.toString());
                                linkedHashMap.put(str5, xc3Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = yc3Var.g;
                        if (str7 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        yc3.g(fragment, arrayList2, sb2);
                        return new fp3(arrayList2, sb2.toString());
                    case 4:
                        fp3 fp3Var = (fp3) yc3Var.j.getValue();
                        return (fp3Var == null || (list = (List) fp3Var.j) == null) ? new ArrayList() : list;
                    case 5:
                        fp3 fp3Var2 = (fp3) yc3Var.j.getValue();
                        if (fp3Var2 != null) {
                            return (String) fp3Var2.t;
                        }
                        return null;
                    case 6:
                        String str8 = (String) yc3Var.a.getValue();
                        if (str8 != null) {
                            return new y54(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        y54 y54Var = w;
        y54Var.getClass();
        if (!y54Var.j.matcher(str).find()) {
            String strPattern = i.j.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        c23 c23VarN = mq2.n(matcher, 0, str);
        if (c23VarN != null) {
            g(str.substring(0, c23VarN.g().j), arrayList, sb);
            y54 y54Var2 = b;
            y54Var2.getClass();
            if (!y54Var2.j.matcher(sb).find()) {
                y54 y54Var3 = s;
                y54Var3.getClass();
                if (!y54Var3.j.matcher(sb).find()) {
                    z = true;
                }
            }
            this.q = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.r = j(sb.toString());
    }

    public static void g(String str, ArrayList arrayList, StringBuilder sb) {
        y54 y54Var = c;
        y54Var.getClass();
        Matcher matcher = y54Var.j.matcher(str);
        matcher.getClass();
        int i2 = 0;
        for (c23 c23VarN = mq2.n(matcher, 0, str); c23VarN != null; c23VarN = c23VarN.y()) {
            z13 z13VarY = c23VarN.r.y(1);
            z13VarY.getClass();
            arrayList.add(z13VarY.g);
            if (c23VarN.g().j > i2) {
                String strQuote = Pattern.quote(str.substring(i2, c23VarN.g().j));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = s.j.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i2 = c23VarN.g().t + 1;
        }
        if (i2 < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i2));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static String j(String str) {
        if (tx4.Q(str, "\\Q", false) && tx4.Q(str, "\\E", false)) {
            return ay4.M(str, ".*", "\\E.*\\Q");
        }
        return tx4.Q(str, "\\.\\*", false) ? ay4.M(str, "\\.\\*", ".*") : str;
    }

    public static void l(Bundle bundle, String str, String str2, jc3 jc3Var) {
        if (jc3Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            de3 de3Var = jc3Var.g;
            str.getClass();
            hb6.q(de3Var, bundle, str, str2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof yc3)) {
            return false;
        }
        return yf2.p(this.g, ((yc3) obj).g);
    }

    public final int hashCode() {
        String str = this.g;
        return (str != null ? str.hashCode() : 0) * 961;
    }

    public final Bundle n(Uri uri, LinkedHashMap linkedHashMap) {
        c23 c23VarR;
        c23 c23VarR2;
        String strDecode;
        uri.getClass();
        y54 y54Var = (y54) this.n.getValue();
        if (y54Var != null && (c23VarR = y54Var.r(uri.toString())) != null) {
            int i2 = 0;
            Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
            if (v(c23VarR, bundleN, linkedHashMap) && (!((Boolean) this.v.getValue()).booleanValue() || x(uri, bundleN, linkedHashMap))) {
                String fragment = uri.getFragment();
                y54 y54Var2 = (y54) this.m.getValue();
                if (y54Var2 != null && (c23VarR2 = y54Var2.r(String.valueOf(fragment))) != null) {
                    List list = (List) this.t.getValue();
                    ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
                    for (Object obj : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            pw5.R();
                            throw null;
                        }
                        String str = (String) obj;
                        z13 z13VarY = c23VarR2.r.y(i3);
                        if (z13VarY != null) {
                            strDecode = Uri.decode(z13VarY.g);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            l(bundleN, str, strDecode, (jc3) linkedHashMap.get(str));
                            arrayList.add(og5.g);
                            i2 = i3;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (v13.f(linkedHashMap, new z6(bundleN, (byte) 24)).isEmpty()) {
                    return bundleN;
                }
            }
        }
        return null;
    }

    public final ArrayList r() {
        Collection collectionValues = ((Map) this.x.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            hj0.a0(arrayList, ((xc3) it.next()).y);
        }
        return cj0.w0(cj0.w0(this.y, arrayList), (List) this.t.getValue());
    }

    public final boolean v(c23 c23Var, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i4 = i2 + 1;
            String strDecode = null;
            if (i2 < 0) {
                pw5.R();
                throw null;
            }
            String str = (String) obj;
            z13 z13VarY = c23Var.r.y(i4);
            if (z13VarY != null) {
                strDecode = Uri.decode(z13VarY.g);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                l(bundle, str, strDecode, (jc3) linkedHashMap.get(str));
                arrayList2.add(og5.g);
                i2 = i4;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final boolean x(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        c23 c23Var;
        ?? r14;
        Object objValueOf;
        boolean z;
        Object obj;
        String query;
        yc3 yc3Var = this;
        for (Map.Entry entry : ((Map) yc3Var.x.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            xc3 xc3Var = (xc3) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (yc3Var.l && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = pw5.k(query);
            }
            og5 og5Var = og5.g;
            boolean z2 = false;
            Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
            ArrayList arrayList = xc3Var.y;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                String str2 = (String) obj2;
                jc3 jc3Var = (jc3) linkedHashMap.get(str2);
                de3 de3Var = jc3Var != null ? jc3Var.g : null;
                if ((de3Var instanceof q40) && !jc3Var.r) {
                    q40 q40Var = (q40) de3Var;
                    switch (q40Var.q) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = new float[0];
                            break;
                        case 2:
                            obj = new int[0];
                            break;
                        case 3:
                            obj = new long[0];
                            break;
                        default:
                            obj = new String[0];
                            break;
                    }
                    q40Var.v(bundleN, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = xc3Var.g;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        c23Var = new c23(matcher, str3);
                    } else {
                        c23Var = null;
                    }
                } else {
                    c23Var = null;
                }
                if (c23Var == null) {
                    return z2;
                }
                ArrayList arrayList2 = xc3Var.y;
                ArrayList arrayList3 = new ArrayList(dj0.Y(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z3 = z2;
                int i3 = z3 ? 1 : 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    int i4 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z3;
                        pw5.R();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    z13 z13VarY = c23Var.r.y(i4);
                    String str6 = z13VarY != null ? z13VarY.g : null;
                    if (str6 == null) {
                        r14 = z3;
                        r14 = z3;
                        str6 = "";
                    }
                    r14 = z3;
                    r14 = z3;
                    jc3 jc3Var2 = (jc3) linkedHashMap.get(str5);
                    try {
                        str5.getClass();
                        if (bundleN.containsKey(str5)) {
                            if (bundleN.containsKey(str5)) {
                                if (jc3Var2 != null) {
                                    de3 de3Var2 = jc3Var2.g;
                                    hb6.w(de3Var2, bundleN, str5, str6, de3Var2.g(str5, bundleN));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            l(bundleN, str5, str6, jc3Var2);
                            objValueOf = og5Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    linkedHashMap = linkedHashMap;
                    r14 = i4;
                    z2 = false;
                }
                r14 = z3;
                linkedHashMap = linkedHashMap;
            }
            bundle.putAll(bundleN);
            yc3Var = this;
        }
        return true;
    }

    public final int y(Uri uri) {
        String str;
        if (uri == null || (str = this.g) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        List<String> pathSegments2 = uri2.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }
}
