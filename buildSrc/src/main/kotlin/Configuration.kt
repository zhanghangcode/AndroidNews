@file:Suppress("unused")

/**
 * 項目プロパティー
 */
object Configuration {

    /**
     * 签名配置
     */
    object SigningConfigs {

        /** 署名 */
        const val key_alias = "test"

        /** キー */
        const val key_password = "123123"

        /** 署名所 */
        const val store_file = "android_test.jks"

        /** パスワード */
        const val store_password = "123123"
    }

    /**
     * アプリケーション　プロパティー
     */
    object AppConfigs {

        /** アプリケーション id */
        const val application_id = "com.wj.sampleproject"

        /** コンパイル SDK バージョン */
        const val compile_sdk_version = 31

        /** コンパイル　ツール　バージョン */
        const val build_tools_version = "29.0.3"

        /** 最小バージョン　*/
        const val min_sdk_version = 21

        /** タッゲト　バージョン */
        const val target_sdk_version = 31

        /** アプリ　バージョン番号 */
        const val version_code = 1

        /** アプリ　バージョン */
        const val version_name = "1.0.0"
    }

    /**
     * バージョン番号
     */
    object Versions {

        /** テスト mokito バージョン */
        const val test_mokito_version = "3.3.3"

        /** Kotlin バージョン */
        const val kotlin_version = "1.4.21"

        /** core バージョン */
        const val core_version = "1.3.0"

        /** room バージョン */
        const val room_version = "2.2.5"

        /** paging バージョン */
        const val paging_version = "3.0.0-alpha09"

        /** navigation バージョン */
        const val navigation_version = "2.3.1"

        /** lifecycle バージョン */
        const val lifecycle_version = "2.2.0"

        /** activity バージョン */
        const val activity_version = "1.1.0"

        /** fragment バージョン */
        const val fragment_version = "1.2.5"

        /** koin バージョン */
        const val koin_version = "2.2.1"

        /** glide バージョン */
        const val glide_version = "4.11.0"

        /** okhttp バージョン */
        const val okhttp_version = "4.9.0"

        /** retrofit バージョン */
        const val retrofit_version = "2.9.0"

        /** smart refresh バージョン */
        const val smart_refresh_version = "2.0.1"

        /** immersion bar バージョン */
        const val immersion_bar_version = "3.0.0"

        /** doraemon kit バージョン */
        const val doraemon_kit_version = "3.1.8"

        /** coil バージョン */
        const val coil_version = "1.1.0"

        /** skin切り替えバージョン */
        const val skin_support_version = "4.0.5"

        /** moshi バージョン */
        const val moshi_version = "1.11.0"

        /** ARouter バージョン */
        const val arouter_version = "1.5.1"
    }

    /**
     * ライブラリー
     */
    object Dependencies {

        /** テスト */
        const val test_junit = "junit:junit:4.13"
        const val test_mokito_inline = "org.mockito:mockito-inline:${Versions.test_mokito_version}"
        const val test_mokito_android = "org.mockito:mockito-android:${Versions.test_mokito_version}"
        const val test_uiautomator_v18 = "com.android.support.test.uiautomator:uiautomator-v18:2.1.3"
        const val androidx_test_ext_junit = "androidx.test.ext:junit:1.1.1"
        const val androidx_test_rules = "androidx.test:rules:1.2.0"
        const val androidx_test_runner = "androidx.test:runner:1.2.0"
        const val androidx_test_espresso_core = "androidx.test.espresso:espresso-core:3.2.0"

        /** Kotlin */
        const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
        const val kotlin_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
        const val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin_version}"
        const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin_version}"

        /** Findbugs Jsr */
        const val findbugs_jsr = "com.google.code.findbugs:jsr305:3.0.2"

        /** androidx - legacy */
        const val androidx_legacy = "androidx.legacy:legacy-support-v4:1.0.0"

        /** androidx - appcompat */
        const val androidx_appcompat = "androidx.appcompat:appcompat:1.4.0"

        /** androidx material */
        const val androidx_material = "com.google.android.material:material:1.2.1"

        /** androidx recyclerview */
        const val androidx_recyclerview = "androidx.recyclerview:recyclerview:1.1.0"

        /** androidx viewpager2 */
        const val androidx_viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"

        /** androidx constraintlayoutレイアウト */
        const val androidx_constraint = "androidx.constraintlayout:constraintlayout:2.0.4"

        /** androidx multidex */
        const val androidx_multidex = "androidx.multidex:multidex:2.0.1"

        /** androidx core */
        const val androidx_core = "androidx.core:core:${Versions.core_version}"
        const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.core_version}"

        /** androidx activity */
        const val androidx_activity = "androidx.activity:activity:${Versions.activity_version}"
        const val androidx_activity_ktx = "androidx.activity:activity-ktx:${Versions.activity_version}"

        /** androidx fragment */
        const val androidx_fragment = "androidx.fragment:fragment:${Versions.fragment_version}"
        const val androidx_fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"

        /** androidx lifecycle */
        const val androidx_lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_version}"
        const val androidx_lifecycle_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
        const val androidx_lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
        const val androidx_lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"

        /** androidx room */
        const val androidx_room_runtime = "androidx.room:room-runtime:${Versions.room_version}"
        const val androidx_room_compiler = "androidx.room:room-compiler:${Versions.room_version}"
        const val androidx_room_ktx = "androidx.room:room-ktx:${Versions.room_version}"
        const val androidx_room_rxjava2 = "androidx.room:room-rxjava2:${Versions.room_version}"
        const val androidx_room_testing = "androidx.room:room-testing:${Versions.room_version}"

        /** androidx paging */
        const val androidx_paging_runtime = "androidx.paging:paging-runtime:${Versions.paging_version}"
        const val androidx_paging_common = "androidx.paging:paging-common:${Versions.paging_version}"
        const val androidx_paging_rxjava2 = "androidx.paging:paging-rxjava2:${Versions.paging_version}"
        const val androidx_paging_runtime_ktx = "androidx.paging:paging-runtime-ktx:${Versions.paging_version}"
        const val androidx_paging_common_ktx = "androidx.paging:paging-common-ktx:${Versions.paging_version}"
        const val androidx_paging_rxjava2_ktx = "androidx.paging:paging-rxjava2-ktx:${Versions.paging_version}"

        /** androidx navigation */
        const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment:${Versions.navigation_version}"
        const val androidx_navigation_ui = "androidx.navigation:navigation-ui:${Versions.navigation_version}"
        const val androidx_navigation_runtime = "androidx.navigation:navigation-runtime:${Versions.navigation_version}"
        const val androidx_navigation_common = "androidx.navigation:navigation-common:${Versions.navigation_version}"
        const val androidx_navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation_version}"
        const val androidx_navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation_version}"
        const val androidx_navigation_runtime_ktx = "androidx.navigation:navigation-runtime-ktx:${Versions.navigation_version}"
        const val androidx_navigation_common_ktx = "androidx.navigation:navigation-common-ktx:${Versions.navigation_version}"

        /**
         * Logger
         * - Github: [https://github.com/orhanobut/logger]
         */
        const val logger = "com.orhanobut:logger:2.2.0"

        /**
         * kotlin coroutines
         * - ガイド：[https://www.kotlincn.net/docs/reference/coroutines/coroutines-guide.html]
         * - Github：[https://github.com/Kotlin/kotlinx.coroutines]
         */
        const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.0"

        /**
         * kotlin Json
         * - Github: [https://github.com/Kotlin/kotlinx.serialization]
         */
        const val kotlin_serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1"

        /**
         * Gson
         * - Github：[https://github.com/google/gson]
         */
        const val gson = "com.google.code.gson:gson:2.8.6"

        /**
         * Moshi
         * - Github: [https://github.com/square/moshi]
         */
        const val moshi = "com.squareup.moshi:moshi:${Versions.moshi_version}"
        const val moshi_kt = "com.squareup.moshi:moshi-kotlin:${Versions.moshi_version}"

        /**
         * Klaxon
         * - Github: [https://github.com/cbeust/klaxon]
         */
        const val klaxon = "com.beust:klaxon:5.0.1"

        /**
         * Zxing
         * - Github：[https://github.com/zxing/zxing]
         */
        const val zxing = "com.google.zxing:core:3.4.0"

        /**
         * Koin
         * - Github：[https://github.com/InsertKoinIO/koin]
         */
        const val koin_scope = "org.koin:koin-androidx-scope:${Versions.koin_version}"
        const val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin_version}"
        const val koin_fragment = "org.koin:koin-androidx-fragment:${Versions.koin_version}"
        const val koin_workmanager = "org.koin:koin-androidx-workmanager:${Versions.koin_version}"
        const val koin_compose = "org.koin:koin-androidx-compose:${Versions.koin_version}"
        const val koin_ext = "org.koin:koin-androidx-ext:${Versions.koin_version}"

        /**
         * チャネル
         * - Github：[https://github.com/Meituan-Dianping/walle]
         */
        const val walle_channel = "com.meituan.android.walle:library:1.1.7"

        /**
         * Glide
         * - Github：[https://github.com/bumptech/glide]
         */
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide_version}"
        const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide_version}"

        /**
         * okhttp
         * - Github：[https://github.com/square/okhttp]
         */
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp_version}"
        const val okhttp_urlconnection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okhttp_version}"
        const val okhttp_logging = "com.squareup.okhttp:logging-interceptor:${Versions.okhttp_version}"

        /**
         * okio
         * - Github: [https://github.com/square/okio]
         */
        const val okio = "com.squareup.okio:okio:2.9.0"

        /**
         * Retrofit
         * - Github：[https://github.com/square/retrofit]
         */
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
        const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
        const val retrofit_converter_moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit_version}"
        const val retrofit_converter_kt = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"

        /**
         * SmartRefreshLayout
         * - Github：[https://github.com/scwang90/SmartRefreshLayout]
         */
        const val smart_refresh = "com.scwang.smart:refresh-layout-kernel:${Versions.smart_refresh_version}"
        const val smart_refresh_header_classics = "com.scwang.smart:refresh-header-classics:${Versions.smart_refresh_version}"
        const val smart_refresh_footer_classics = "com.scwang.smart:refresh-footer-classics:${Versions.smart_refresh_version}"

        /**
         * LiveEventBus
         * - Github：[https://github.com/JeremyLiao/LiveEventBus]
         */
        const val live_event_bus = "com.jeremyliao:live-event-bus-x:1.7.2"

        /**
         * bar
         * - Github: [https://github.com/gyf-dev/ImmersionBar]
         */
        const val immersion_bar = "com.gyf.immersionbar:immersionbar:${Versions.immersion_bar_version}"
        const val immersion_bar_ktx = "com.gyf.immersionbar:immersionbar-ktx:${Versions.immersion_bar_version}"

        /**
         * MMKV
         * - Github: [https://github.com/tencent/mmkv]
         */
        const val tencent_mmkv = "com.tencent:mmkv:1.2.5"

        /**
         * TabLayout
         * - Github: [https://github.com/H07000223/FlycoTabLayout]
         */
        const val tablayout = "com.flyco.tablayout:FlycoTabLayout_Lib:2.1.2@aar"

        /**
         * Coil 画像読み込む
         * - Github: [https://github.com/coil-kt/coil]
         */
        const val coil = "io.coil-kt:coil:${Versions.coil_version}"
        const val coil_base = "io.coil-kt:coil-base:${Versions.coil_version}"
        const val coil_gif = "io.coil-kt:coil-gif:${Versions.coil_version}"
        const val coil_svg = "io.coil-kt:coil-svg:${Versions.coil_version}"
        const val coil_video = "io.coil-kt:coil-video:${Versions.coil_version}"

        /**
         * skin切り替え
         * - GitHub: [https://github.com/ximsfei/Android-skin-support]
         */
        const val skin_support = "skin.support:skin-support:4.0.5"
        const val skin_support_appcompat = "skin.support:skin-support-appcompat:4.0.5"
        const val skin_support_material = "skin.support:skin-support-design:4.0.5"
        const val skin_support_cardview = "skin.support:skin-support-cardview:4.0.5"
        const val skin_support_constraint = "skin.support:skin-support-constraint-layout:4.0.5"

        /**
         * ARouter ルーター
         * - Github: [https://github.com/alibaba/ARouter]
         */
        const val arouter_api = "com.alibaba:arouter-api:${Versions.arouter_version}"
        const val arouter_compiler = "com.alibaba:arouter-compiler:${Versions.arouter_version}"
    }
}