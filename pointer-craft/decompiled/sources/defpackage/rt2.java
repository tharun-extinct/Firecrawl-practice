package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class rt2 {
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public static final g3 y = new g3("LibraryVersion");
    public static final rt2 r = new rt2();

    public final String g(String str) throws Throwable {
        IOException e;
        String str2;
        InputStream resourceAsStream;
        g3 g3Var = y;
        jr2.a(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = rt2.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable(g3Var.g, 2)) {
                            String str3 = g3Var.y;
                            if (str3 != null) {
                                string = str3.concat(string);
                            }
                            Log.v("LibraryVersion", string);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        String string2 = sb2.toString();
                        if (Log.isLoggable(g3Var.g, 5)) {
                            String str4 = g3Var.y;
                            if (str4 != null) {
                                string2 = str4.concat(string2);
                            }
                            Log.w("LibraryVersion", string2);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStream = resourceAsStream;
                    str2 = null;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    String string3 = sb3.toString();
                    if (Log.isLoggable(g3Var.g, 6)) {
                        String str5 = g3Var.y;
                        if (str5 != null) {
                            string3 = str5.concat(string3);
                        }
                        Log.e("LibraryVersion", string3, e);
                    }
                    InputStream inputStream2 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                str2 = null;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            }
            if (property == null) {
                if (Log.isLoggable(g3Var.g, 3)) {
                    String str6 = g3Var.y;
                    Log.d("LibraryVersion", str6 != null ? str6.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                property = "UNKNOWN";
            }
            concurrentHashMap.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
