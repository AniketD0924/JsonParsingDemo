package com.indianic.jsonparsingdemo.webservice;

import android.content.Context;

/**
 * Created by indianic on 18/10/16.
 */

public class WSGetDetails {
    private Context context;
    private String message;
    private boolean success;
    private int code;

    public WSGetDetails(final Context context) {
        this.context = context;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public void executeService() {
//        final String url = "http://dev.tuisy.com/api/v1/account/counters";
//        final String response = new WSUtils().getData(url, context);
        final String response = "{\"error\":false,\"data\":[{\"post\":{\"who_posts\":{\"_id\":\"57fcecf3e6603fe821093683\",\"banner_image\":{\"name\":\"9135090041a54c45bd1ad501d6833198.jpg\",\"path\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/f3e660\\/3fe821\\/093683\\/57fcecf3e6603fe8210936839135090041a54c45bd1ad501d6833198.jpg\",\"iphone\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/f3e660\\/3fe821\\/093683\\/57fcecf3e6603fe8210936839135090041a54c45bd1ad501d6833198_iphone.jpg\"},\"categories\":[\"5339503bfd05e4d52336e687\"],\"counters\":{\"members\":{\"pending\":3,\"confirmed\":1,\"banned\":0,\"rejected\":1},\"groups\":0,\"pictures\":0,\"followings\":0},\"coupon\":\"55ffce9de6603ff24b3c1b97\",\"created_at\":\"2016-10-11 01:45 PM\",\"description\":\"Vuelos ida y vuelta desde G ...\",\"is_active\":1,\"owner\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"privacy\":\"friends_of_members\",\"profile_image\":{\"path\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\"},\"updated_at\":\"2016-10-12 12:00 AM\",\"what\":\"11\",\"when\":{\"type\":\"one-time\",\"policy\":\"fixed-date\",\"organizer_dates\":[{\"from\":\"2016-10-11 07:15 PM\",\"to\":\"2016-11-11 07:15 PM\",\"user\":\"57d92812e6603fd84273452c\"}]},\"Where\":{\"lat\":\"43.4676324\",\"long\":\"11.0434909\",\"address\":\"53037 San Gimignano, Province of Siena, Italia\",\"city\":\"Provincia di Siena\",\"state\":\"Toscana\",\"country\":\"Italy\",\"place\":\"\"},\"who\":{\"members\":[{\"who\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"confirmed\",\"banned\":false,\"is_friend\":0},{\"who\":{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"5624ddeee6603fee6e338bac\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/eee660\\/3fee6e\\/338bac\\/5624ddeee6603fee6e338bacaeeab05a16c635d0218fbaf8a5244bfd_big.jpg\",\"fullname\":\"Rushabh Android\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 01:45 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":0}],\"groups\":[]}},\"entity\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"content_type\":\"user_created_plan\",\"post_id\":\"57fcecf4e6603fe821093685\",\"content\":\"11 has been created by mihir_en\",\"mutual_friends\":[{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false}],\"created_at\":\"2016-10-11 01:45 PM\",\"updated_at\":\"2016-10-11 01:45 PM\",\"total_comment\":0,\"comments\":[]},\"wall_id\":\"57fced00e6603fe821093697\"},{\"post\":{\"who_posts\":{\"_id\":\"57fcd789e6603fb72009357c\",\"banner_image\":{\"name\":\"e6a07d676053acbd1d33c3e68114aa30.jpg\",\"path\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/89e660\\/3fb720\\/09357c\\/57fcd789e6603fb72009357ce6a07d676053acbd1d33c3e68114aa30.jpg\",\"iphone\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/plan\\/89e660\\/3fb720\\/09357c\\/57fcd789e6603fb72009357ce6a07d676053acbd1d33c3e68114aa30_iphone.jpg\"},\"categories\":[\"5339503bfd05e4d52336e687\"],\"counters\":{\"members\":{\"pending\":3,\"confirmed\":1,\"banned\":0,\"rejected\":1},\"groups\":0,\"pictures\":0,\"followings\":0},\"coupon\":\"55ffce99e6603ff24b3c1b90\",\"created_at\":\"2016-10-11 12:14 PM\",\"description\":\"7 noches en un estudio d?pl ...\",\"is_active\":1,\"owner\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"privacy\":\"friends_of_members\",\"profile_image\":{\"path\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\"},\"updated_at\":\"2016-10-12 12:00 AM\",\"what\":\"2\",\"when\":{\"type\":\"one-time\",\"policy\":\"fixed-date\",\"organizer_dates\":[{\"from\":\"2016-10-11 05:43 PM\",\"to\":\"2016-11-11 05:43 PM\",\"user\":\"57d92812e6603fd84273452c\"}]},\"Where\":{\"lat\":\"35.5273477\",\"long\":\"23.8202913\",\"address\":\"Tavronitis, Grecia\",\"city\":\"\",\"state\":\"\",\"country\":\"Greece\",\"place\":\"\"},\"who\":{\"members\":[{\"who\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"confirmed\",\"banned\":false,\"is_friend\":0},{\"who\":{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":1},{\"who\":{\"_id\":\"5624ddeee6603fee6e338bac\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/eee660\\/3fee6e\\/338bac\\/5624ddeee6603fee6e338bacaeeab05a16c635d0218fbaf8a5244bfd_big.jpg\",\"fullname\":\"Rushabh Android\",\"gender\":\"Female\",\"superfriend\":false},\"when\":\"2016-10-11 12:14 PM\",\"status\":\"pending\",\"banned\":false,\"is_friend\":0}],\"groups\":[]}},\"entity\":{\"_id\":\"57d92812e6603fd84273452c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_en\",\"gender\":\"Female\",\"superfriend\":false},\"content_type\":\"user_created_plan\",\"post_id\":\"57fcd78ae6603fb72009357e\",\"content\":\"2 has been created by mihir_en\",\"mutual_friends\":[{\"_id\":\"57d929fae6603f4a4473444a\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/assets\\/images\\/profile-default-male.png\",\"fullname\":\"mihir_spanish\",\"gender\":\"Mujer\",\"superfriend\":false},{\"_id\":\"579885afe6603f826274792c\",\"profile_image\":\"http:\\/\\/dev.tuisy.com\\/userfiles\\/user\\/afe660\\/3f8262\\/74792c\\/579885afe6603f826274792c273e7286ce64af588bdc32e526965e85_big.jpg\",\"fullname\":\"Bhoomika\",\"gender\":\"Female\",\"superfriend\":false}],\"created_at\":\"2016-10-11 12:14 PM\",\"updated_at\":\"2016-10-11 12:14 PM\",\"total_comment\":0,\"comments\":[]},\"wall_id\":\"57fcd796e6603fb720093590\"}]}";
        parseResponse(response);
    }

    private void parseResponse(String response) {
        if (response != null && response.trim().length() > 0) {

        }
    }

}
