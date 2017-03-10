package com.indianic.jsonparsingdemo.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.indianic.jsonparsingdemo.R;
import com.indianic.jsonparsingdemo.model.BannerImage;
import com.indianic.jsonparsingdemo.model.Cateogories;
import com.indianic.jsonparsingdemo.model.Counter;
import com.indianic.jsonparsingdemo.model.Members;
import com.indianic.jsonparsingdemo.model.MutualFriends;
import com.indianic.jsonparsingdemo.model.OrganizerDates;
import com.indianic.jsonparsingdemo.model.Owner;
import com.indianic.jsonparsingdemo.model.PostModel;
import com.indianic.jsonparsingdemo.model.When;
import com.indianic.jsonparsingdemo.model.Where;
import com.indianic.jsonparsingdemo.model.Who;
import com.indianic.jsonparsingdemo.model.WhoPostModel;
import com.indianic.jsonparsingdemo.webservice.WSGetDetails;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String response = "{\"error\":false,\"data\":[{\"post\":{\"who_posts\":{\"_id\":\"57fcecf3e6603fe821093683\",\"banner_image\":{\"name\":\"9135090041a54c45bd1ad501d6833198.jpg\",\"path\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/f3e660\\/3fe821\\/093683\\/57fcecf3e6603fe8210936839135090041a54c45bd1ad501d6833198.jpg\",\"iphone\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/f3e660\\/3fe821\\/093683\\/57fcecf3e6603fe8210936839135090041a54c45bd1ad501d6833198_iphone.jpg\"},\"categories\":[\"5339503bfd05e4d52336e687\"],\"counters\":{\"members\":{\"pending\":3,\"confirmed\":1,\"banned\":0,\"rejected\":1},\"groups\":0,\"pictures\":0,\"followings\":0},\"coupon\":\"55ffce9de6603ff24b3c1b97\",\"created_at\":\"2016-10-11 01:45 PM\",\"description\":\"Vuelos ida y vuelta desde G ...\",\"is_active\":1,\"owner\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"privacy\":\"friends_of_members\",\"profile_image\":{\"path\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\"},\"updated_at\":\"2016-10-12 12:00 AM\",\"what\":\"11\",\"when\":{\"type\":\"one-time\",\"policy\":\"fixed-date\",\"organizer_dates\":[{\"from\":\"2016-10-11 07:15 PM\",\"to\":\"2016-11-11 07:15 PM\",\"user\":\"57d92812e6603fd84273452c\"}]},\"Where\":{\"lat\":\"43.4676324\",\"long\":\"11.0434909\",\"address\":\"53037 San Gimignano, Province of Siena, Italia\",\"city\":\"Provincia di Siena\",\"state\":\"Toscana\",\"country\":\"Italy\",\"place\":\"\"},\"who\":{\"members\":[{\"who\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"confirmed\",\"banned\":false,\"is_friend\":0},{\"who\":{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"5624ddeee6603fee6e338bac\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/eee660\\/3fee6e\\/338bac\\/5624ddeee6603fee6e338bacaeeab05a16c635d0218fbaf8a5244bfd_big.jpg\",\"fullname\":\"Rushabh Android\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":0}],\"groups\":[]}},\"entity\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"content_type\":\"user_created_plan\",\"post_id\":\"57fcecf4e6603fe821093685\",\"content\":\"11 has been created by mihir_en\",\"mutual_friends\":[{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false}],\"created_at\":\"2016-10-11 01:45 PM\",\"updated_at\":\"2016-10-11 01:45 PM\",\"total_comment\":0,\"comments\":[]},\"wall_id\":\"57fced00e6603fe821093697\"},{\"post\":{\"who_posts\":{\"_id\":\"57fcd789e6603fb72009357c\",\"banner_image\":{\"name\":\"e6a07d676053acbd1d33c3e68114aa30.jpg\",\"path\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/89e660\\/3fb720\\/09357c\\/57fcd789e6603fb72009357ce6a07d676053acbd1d33c3e68114aa30.jpg\",\"iphone\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/89e660\\/3fb720\\/09357c\\/57fcd789e6603fb72009357ce6a07d676053acbd1d33c3e68114aa30_iphone.jpg\"},\"categories\":[\"5339503bfd05e4d52336e687\"],\"counters\":{\"members\":{\"pending\":3,\"confirmed\":1,\"banned\":0,\"rejected\":1},\"groups\":0,\"pictures\":0,\"followings\":0},\"coupon\":\"55ffce99e6603ff24b3c1b90\",\"created_at\":\"2016-10-11 12:14 PM\",\"description\":\"7 noches en un estudio d?pl ...\",\"is_active\":1,\"owner\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"privacy\":\"friends_of_members\",\"profile_image\":{\"path\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\"},\"updated_at\":\"2016-10-12 12:00 AM\",\"what\":\"2\",\"when\":{\"type\":\"one-time\",\"policy\":\"fixed-date\",\"organizer_dates\":[{\"from\":\"2016-10-11 05:43 PM\",\"to\":\"2016-11-11 05:43 PM\",\"user\":\"57d92812e6603fd84273452c\"}]},\"Where\":{\"lat\":\"35.5273477\",\"long\":\"23.8202913\",\"address\":\"Tavronitis, Grecia\",\"city\":\"\",\"state\":\"\",\"country\":\"Greece\",\"place\":\"\"},\"who\":{\"members\":[{\"who\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"confirmed\",\"banned\":false,\"is_friend\":0},{\"who\":{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"5624ddeee6603fee6e338bac\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/eee660\\/3fee6e\\/338bac\\/5624ddeee6603fee6e338bacaeeab05a16c635d0218fbaf8a5244bfd_big.jpg\",\"fullname\":\"Rushabh Android\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":0}],\"groups\":[]}},\"entity\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"content_type\":\"user_created_plan\",\"post_id\":\"57fcd78ae6603fb72009357e\",\"content\":\"2 has been created by mihir_en\",\"mutual_friends\":[{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false}],\"created_at\":\"2016-10-11 12:14 PM\",\"updated_at\":\"2016-10-11 12:14 PM\",\"total_comment\":0,\"comments\":[]},\"wall_id\":\"57fcd796e6603fb720093590\"}]}";
        parseResponse(response);
    }

    private void parseResponse(String response) {
        if (response != null && response.trim().length() > 0) {
            try {
                final JSONObject jsonMain = new JSONObject(response);
                final String error = jsonMain.optString("error");
                if (error.equalsIgnoreCase("false")) {
                    final String jsonRejected = jsonMain.optJSONArray("data").optJSONObject(1).optJSONObject("post").optJSONObject("who_posts").optJSONObject("counters").optJSONObject("members").optString("rejected");
                    Log.e("parseResponse: ", jsonRejected);
                    final JSONArray jsonData = jsonMain.optJSONArray("data");
                    for (int i = 0; i < jsonData.length(); i++) {
                        final ArrayList<PostModel> postModelArrayList = new ArrayList<>();
                        final JSONObject jsonObject = jsonData.optJSONObject(i);
                        final String wallID = jsonObject.optString("wall_id");
                        final JSONObject jsonPost = jsonObject.optJSONObject("post");
                        final PostModel postModel = new PostModel();
                        postModel.setContentType(jsonPost.optString("content_type"));
                        postModel.setPostID(jsonPost.optString("post_id"));
                        postModel.setContent(jsonPost.optString("content"));
                        postModel.setCreatedDate(jsonPost.optString("created_at"));
                        postModel.setUpdatedDate(jsonPost.optString("updated_at"));
                        postModel.setWhoPostModelArrayList(parseWhoPost(jsonPost));
                        postModel.setEntityModelArrayList(parseEntity(jsonPost));
                        postModel.setMutualFriendsArrayList(parseMutualFriends(jsonPost));
                        postModelArrayList.add(postModel);
                        //Parse comments same as mutual friends

                    }
                } else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

    private ArrayList<WhoPostModel> parseWhoPost(final JSONObject jsonPost) {
        final ArrayList<WhoPostModel> whoPostModelArrayList = new ArrayList<>();
        if (jsonPost.has("who_posts")) {
            final JSONObject jsonWhoPost = jsonPost.optJSONObject("who_posts");
            final WhoPostModel whoPostModel = new WhoPostModel();
            whoPostModel.set_id(jsonWhoPost.optString("_id"));
            whoPostModel.setCoupon(jsonWhoPost.optString("coupon"));
            whoPostModel.setCreatedAt(jsonWhoPost.optString("created_at"));
            whoPostModel.setDescription(jsonWhoPost.optString("description"));
            whoPostModel.setIsActive(jsonWhoPost.optString("is_active"));
            whoPostModel.setPrivacy(jsonWhoPost.optString("privacy"));
            whoPostModel.setUpdatedAt(jsonWhoPost.optString("updated_at"));
            whoPostModel.setWhat(jsonWhoPost.optString("what"));
            whoPostModel.setBannerImageArrayList(parseBannerImage(jsonWhoPost));
            whoPostModel.setCateogoriesArrayList(parseCateogry(jsonWhoPost));
            whoPostModel.setCounterArrayList(parseCounters(jsonWhoPost));
            whoPostModel.setOwnerArrayList(parseOwner(jsonWhoPost));
            final JSONObject jsonProfileImage = jsonWhoPost.optJSONObject("profile_image");
            whoPostModel.setProfileImage(jsonProfileImage.optString("path"));
            whoPostModel.setWhenArrayList(parseWhen(jsonWhoPost));
            whoPostModel.setWhereArrayList(parseWhere(jsonWhoPost));
            whoPostModel.setWhoArrayList(parseWho(jsonWhoPost));
            whoPostModelArrayList.add(whoPostModel);
        }
        return whoPostModelArrayList;
    }

    private ArrayList<Cateogories> parseCateogry(final JSONObject jsonWhoPost) {
        final ArrayList<Cateogories> cateogoriesArrayList = new ArrayList<>();
        if (jsonWhoPost.has("categories")) {
            final JSONArray jsonCateogry = jsonWhoPost.optJSONArray("categories");
            Cateogories cateogories;
            for (int i = 0; i < jsonCateogry.length(); i++) {
                cateogories = new Cateogories();
                cateogories.setCateogry(jsonCateogry.optString(i));
                cateogoriesArrayList.add(cateogories);
            }
        }
        return cateogoriesArrayList;
    }

    private ArrayList<BannerImage> parseBannerImage(final JSONObject jsonWhoPost) {
        final ArrayList<BannerImage> bannerImageArrayList = new ArrayList<>();
        if (jsonWhoPost.has("banner_image")) {
            final JSONObject jsonBannerImage = jsonWhoPost.optJSONObject("banner_image");
            final BannerImage bannerImage = new BannerImage();
            bannerImage.setName(jsonBannerImage.optString("name"));
            bannerImage.setPath(jsonBannerImage.optString("path"));
            bannerImageArrayList.add(bannerImage);
        }
        return bannerImageArrayList;

    }

    private ArrayList<Counter> parseCounters(final JSONObject jsonWhoPost) {
        final ArrayList<Counter> counterArrayList = new ArrayList<>();
        if (jsonWhoPost.has("counters")) {
            final JSONObject jsonCouter = jsonWhoPost.optJSONObject("counters");
            final Counter counter = new Counter();
            counter.setGroup(jsonCouter.optString("groups"));
            counter.setPictures(jsonCouter.optString("pictures"));
            counter.setFollowing(jsonCouter.optString("followings"));
            counter.setMembersArrayList(parseMembers(jsonCouter));
            counterArrayList.add(counter);
        }
        return counterArrayList;
    }

    private ArrayList<Members> parseMembers(final JSONObject jsonCouter) {
        final ArrayList<Members> membersArrayList = new ArrayList<>();
        if (jsonCouter.has("members")) {
            final JSONObject jsonMembers = jsonCouter.optJSONObject("members");
            final Members members = new Members();
            members.setPending(jsonMembers.optString("pending"));
            members.setConfirmed(jsonMembers.optString("confirmed"));
            members.setBanned(jsonMembers.optString("banned"));
            members.setRejected(jsonMembers.optString("rejected"));
            membersArrayList.add(members);
        }
        return membersArrayList;
    }

    private ArrayList<Owner> parseOwner(final JSONObject jsonWhoPost) {
        final ArrayList<Owner> ownerArrayList = new ArrayList<>();
        if (jsonWhoPost.has("owner")) {
            final JSONObject jsonOwner = jsonWhoPost.optJSONObject("owner");
            final Owner owner = new Owner();
            owner.setId(jsonOwner.optString("_id"));
            owner.setProfileImage(jsonOwner.optString("profile_image"));
            owner.setFullname(jsonOwner.optString("fullname"));
            owner.setGender(jsonOwner.optString("gender"));
            owner.setSuperfriend(jsonOwner.optString("superfriend"));
            ownerArrayList.add(owner);
        }
        return ownerArrayList;
    }

    private ArrayList<When> parseWhen(JSONObject jsonWhoPost) {
        final ArrayList<When> whenArrayList = new ArrayList<>();
        if (jsonWhoPost.has("owner")) {
            final JSONObject jsonWhen = jsonWhoPost.optJSONObject("when");
            final When when = new When();
            when.setType(jsonWhen.optString("type"));
            when.setPolicy(jsonWhen.optString("policy"));
            when.setOrganizerDatesArrayList(parseOrganizerDate(jsonWhen));
            whenArrayList.add(when);
        }
        return whenArrayList;
    }

    private ArrayList<OrganizerDates> parseOrganizerDate(final JSONObject jsonWhen) {
        final ArrayList<OrganizerDates> organizerDatesArrayList = new ArrayList<>();
        if (jsonWhen.has("organizer_dates")) {
            final JSONArray jsonOrganizerDates = jsonWhen.optJSONArray("organizer_dates");
            for (int i = 0; i < jsonOrganizerDates.length(); i++) {
                final JSONObject jsonObject = jsonOrganizerDates.optJSONObject(i);
                final OrganizerDates organizerDates = new OrganizerDates();
                organizerDates.setFrom(jsonObject.optString("from"));
                organizerDates.setTo(jsonObject.optString("to"));
                organizerDates.setUser(jsonObject.optString("user"));
                organizerDatesArrayList.add(organizerDates);
            }
        }
        return organizerDatesArrayList;
    }

    private ArrayList<Where> parseWhere(JSONObject jsonWhoPost) {
        final ArrayList<Where> whereArrayList = new ArrayList<>();
        if (jsonWhoPost.has("Where")) {
            final JSONObject jsonWhere = jsonWhoPost.optJSONObject("Where");
            final Where where = new Where();
            where.setLat(jsonWhere.optString("lat"));
            where.setLng(jsonWhere.optString("long"));
            where.setAddress(jsonWhere.optString("address"));
            where.setCity(jsonWhere.optString("city"));
            where.setState(jsonWhere.optString("state"));
            where.setCountry(jsonWhere.optString("country"));
            where.setCity(jsonWhere.optString("place"));
            whereArrayList.add(where);
        }
        return whereArrayList;
    }


    private ArrayList<Who> parseWho(JSONObject jsonWhoPost) {
        final ArrayList<Who> whoArrayList = new ArrayList<>();
        if (jsonWhoPost.has("who")) {
            final JSONObject jsonWho = jsonWhoPost.optJSONObject("who");
            if (jsonWho.has("members")) {
                final JSONArray jsonMember = jsonWho.optJSONArray("members");
                final Members members = new Members();
                final Who who = new Who();
                final ArrayList<Members> membersArrayList = new ArrayList<>();
                for (int i = 0; i < jsonMember.length(); i++) {
                    final JSONObject jsonobject = jsonMember.optJSONObject(i);
                    if (jsonobject.has("who")) {
                        final JSONObject jsonwho = jsonobject.optJSONObject("who");
                        members.setOwnerArrayList(parsewho(jsonwho));
                    }
                    members.setWhen(jsonobject.optString("when"));
                    members.setBanned(jsonobject.optString("banned"));
                    members.setIsFriend(jsonobject.optString("is_friend"));
                    members.setStatus(jsonobject.optString("confirmed"));
                    membersArrayList.add(members);
                }
                who.setMembersArrayList(membersArrayList);
                whoArrayList.add(who);
            }
        }
        return whoArrayList;
    }

    private ArrayList<Owner> parsewho(final JSONObject jsonwho) {
        final Owner owner = new Owner();
        final ArrayList<Owner> whoArrayList = new ArrayList<>();
        owner.setId(jsonwho.optString("_id"));
        owner.setProfileImage(jsonwho.optString("profile_image"));
        owner.setFullname(jsonwho.optString("fullname"));
        owner.setGender(jsonwho.optString("gender"));
        owner.setSuperfriend(jsonwho.optString("superfriend"));
        whoArrayList.add(owner);
        return whoArrayList;
    }

    private ArrayList<Owner> parseEntity(JSONObject jsonPost) {
        final ArrayList<Owner> entityArrayList = new ArrayList<>();
        if (jsonPost.has("entity")) {
            final JSONObject jsonEntity = jsonPost.optJSONObject("entity");
            final Owner owner = new Owner();
            owner.setId(jsonEntity.optString("_id"));
            owner.setProfileImage(jsonEntity.optString("profile_image"));
            owner.setFullname(jsonEntity.optString("fullname"));
            owner.setGender(jsonEntity.optString("gender"));
            owner.setSuperfriend(jsonEntity.optString("superfriend"));
            entityArrayList.add(owner);
        }
        return entityArrayList;
    }

    private ArrayList<MutualFriends> parseMutualFriends(JSONObject jsonPost) {
        final ArrayList<MutualFriends> mutualFriendsArrayList = new ArrayList<>();
        if (jsonPost.has("mutual_friends")) {
            final JSONArray jsonMutualFriends = jsonPost.optJSONArray("mutual_friends");
            final MutualFriends mutualFriends = new MutualFriends();
            final ArrayList<Owner> ownerArrayList = new ArrayList<>();
            for (int i = 0; i < jsonMutualFriends.length(); i++) {
                final JSONObject jsonObject = jsonMutualFriends.optJSONObject(i);
                final Owner owner = new Owner();
                owner.setId(jsonObject.optString("_id"));
                owner.setProfileImage("profile_image");
                owner.setFullname("fullname");
                owner.setGender("gender");
                owner.setSuperfriend("superfriend");
                ownerArrayList.add(owner);
            }
            mutualFriends.setMutualFriendsArrayList(ownerArrayList);
            mutualFriendsArrayList.add(mutualFriends);
        }
        return mutualFriendsArrayList;
    }


    /**
     * Check if internet connection is available or not
     *
     * @param context
     * @return true, if internet is available
     */
    private boolean isNetworkAvailable(final Context context) {
        boolean isNetAvailable = false;
        if (context != null) {
            final ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (mConnectivityManager != null) {
                final NetworkInfo activeNetwork = mConnectivityManager.getActiveNetworkInfo();
                if (activeNetwork != null) isNetAvailable = true;
            }
        }
        return isNetAvailable;
    }

    /**
     * AsyncTask for get about us content
     */
    private class AsyncGetDetails extends AsyncTask<Void, Void, Void> {
        private ProgressDialog progressDialog;
        private WSGetDetails wsGetDetails;

        @Override
        protected void onPreExecute() {
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Loading");
            progressDialog.show();
            progressDialog.setCancelable(false);
            wsGetDetails = new WSGetDetails(MainActivity.this);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            wsGetDetails.executeService();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        }
    }
}
