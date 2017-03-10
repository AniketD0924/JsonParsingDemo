package com.indianic.jsonparsingdemo.webservice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;

import com.indianic.jsonparsingdemo.R;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerPNames;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static java.net.Proxy.Type.HTTP;

/**
 * Created by indianic on 18/10/16.
 */
public class WSUtils {
    public static String responseInPut = "";
    static InputStream is = null;
    // Delete Data
    static JSONObject jObj = null;
//    private static boolean isUserInactivateDisplay = false;

    // Delete Json Data

    // Get Data

    public static String DeleteData(String URL, Context context) {

        final DefaultHttpClient httpClient = createHttpClient();
        final HttpDelete httpdelete = new HttpDelete(URL);

        HttpResponse response = null;

        try {

            Log.i("Util", "posted Url:" + URL);
            // httpdelete.setHeader("json", "application/json");
//            httpdelete.setHeader(HTTP.CONTENT_TYPE, "application/json");
            httpdelete.setHeader("token", "5805bf95e6603fbc541e5b34");

            response = httpClient.execute(httpdelete);

            String res = EntityUtils.toString(response.getEntity(), "UTF-8");
            Log.e("Response = ", res);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    // Method is used for posting data.

    public String getData(String url, final Context context) {
        final DefaultHttpClient httpClient = createHttpClient();
        try {
            // final String url = java.net.URLEncoder.encode(URL, "utf-8");
            final String urlNew = url.replaceAll(" ", "%20");

            Log.e("Util", "Get Url:" + urlNew);
            final HttpGet httpget = new HttpGet(urlNew);

            HttpResponse response = null;
            httpget.setHeader("json", "application/json");
            httpget.setHeader("Content-Type", "application/json");
            Log.e("WebServiceUtil", "token : " + "5805cc38e6603fba541e5b30");

            httpget.setHeader("token", "5805cc38e6603fba541e5b30");
            response = httpClient.execute(httpget);

            String res = EntityUtils.toString(response.getEntity(), "UTF-8");
            Log.e("Response = ", res);

            if (res.contains("\"code\":4008")) {
//                if (!isUserInactivateDisplay) {
//                    isUserInactivateDisplay = true;
                ((Activity) context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
//                        displayDialogForInactiveUser(context.getString(R.string.app_name), "adsfasdf", context);
                    }
                });
//                }
            }

            return res;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("error", e.toString());
            return "";
        }
    }

    public static void displayDialogForInactiveUser(String title, String msg, final Context context) {

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle(title);
        alertDialog.setCancelable(false);
        alertDialog.setMessage(msg);

        alertDialog.setNeutralButton(context.getString(R.string.ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        final AlertDialog dialog = alertDialog.create();
        if (!((Activity) context).isFinishing()) {
            if (!dialog.isShowing()) {
                alertDialog.show();
            }
        }
    }


    /**
     * Method used for Create HttpClient object after set different parameters
     *
     * @return
     */
    private static DefaultHttpClient createHttpClient() {
        final SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));

        final HttpParams params = new BasicHttpParams();
        params.setParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, 30);
        params.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE, new ConnPerRouteBean(30));
        params.setParameter(HttpProtocolParams.USE_EXPECT_CONTINUE, false);
        HttpConnectionParams.setConnectionTimeout(params, 30000);
        HttpConnectionParams.setSoTimeout(params, 30000);
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);

        final ClientConnectionManager cm = new ThreadSafeClientConnManager(params, schemeRegistry);
        final DefaultHttpClient client = new DefaultHttpClient(cm, params);
        client.addRequestInterceptor(new HttpRequestInterceptor() {
            public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
                request.addHeader("User-Agent", "Mozilla/5.0");
            }
        });
        return client;
    }

}
