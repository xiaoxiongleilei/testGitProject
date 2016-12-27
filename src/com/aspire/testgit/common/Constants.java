package com.aspire.testgit.common;

import com.tfc.analysis.KWSeeker;

public class Constants {
	public static String MANAGE_USER_SESSION = "MANAGE_USER_SESSION";// 淇濆瓨鍚庡彴鐢ㄦ埛鐧婚檰鐨凷ession
	public static String LOGIN_VERIFY_SESSION = "LOGIN_VERIFY_SESSION";// 鐧婚檰楠岃瘉鐮佺殑Session
	public static String MODULE_FUNCTION_SESSION="MODULE_FUNCTION_SESSION";//鏉冮檺Session
	public static String ENCRYPT_KEY = "bjxxtkey";
	public static String VERIFY_CODE = "VERIFY_CODE"; // 鐭俊楠岃瘉鐮�
	
	// 鐢ㄤ簬璁板綍鐢ㄦ埛鎿嶄綔鏃ュ織鐨勭被鍨�
	public static Integer INSERT_DATA = 1;//"娣诲姞";//璁㈣喘//鍙戦�
	public static Integer DELETE_DATA = 2;//"鍒犻櫎";
	public static Integer UPDATE_DATA = 3;//"鏇存柊";
	public static Integer SELECT_DATA = 4;//"鏌ヨ";
	public static Integer UPLOAD_DATA = 5;//"瀵煎叆";
	public static Integer DOWNLOAD_DATA = 6;//"瀵煎嚭";
	public static Integer LOGIN = 7;//"鐧诲綍";
	public static Integer LOGOUT = 8;//"閫�嚭";
	public static Integer MODIFY_DATA = 9;//"淇敼";
	public static Integer SMS_ZF = 10;//"杞彂";
	
	public static Integer SUCCESS = 0;//鎴愬姛;
	public static Integer FAILURE = 1;//澶辫触;
	
	// 鐢ㄤ簬娣诲姞CoreUser鐢ㄦ埛鏃跺瘑鐮佸姞瀵嗙殑Key
	public static String PWD_KEY = "2}E$K!2F(l&q?U7>n";
	
	/**鏁忔劅璇嶅鐞�鍦ㄧ郴缁熷惎鍔ㄧ殑鏃跺�浼氬姞杞界浉鍏崇殑鏁忔劅璇�/
	public static KWSeeker ILLEGALWORD;
	
	/** 浠ｇ悊鍟�瑙掕壊鐨勫� */
	public static String AGENT_ROLE = "81";
	/*********浜轰汉閫氭搷浣滄棩蹇楄褰曞父閲�****************/
	public static String APP_OPERATE_LOG="APP_OPERATE_LOG";//鏃ヨ嚦鎿嶄綔璁板綍琛�
	public static String APP_ZX="ZX";//璧勮
	public static String APP_HD="HD";//浜掑姩
	public static String APP_HD_TZ="HD_TZ";//浜掑姩->閫氱煡
	public static String APP_HD_ZY="HD_ZY";//浜掑姩->浣滀笟
	public static String APP_HD_PY="HD_PY";//浜掑姩->璇勮
	public static String APP_HD_RECEIVE="HD_RECEIVE";//浜掑姩->鎴戞敹鍒�
	public static String APP_HD_SEND="HD_SEND";//浜掑姩->鎴戝彂閫�
	public static String APP_HD_ZJ="HD_ZJ";//浜掑姩->鏈�繎涓夊ぉ鏀跺埌鐨勬秷鎭�
	public static String APP_ZY="ZY";//璧勬簮
	public static String APP_ZY_YY="ZY_YY";//璧勬簮-銆嬭祫婧愬簲鐢�
	public static String SHOP_CART = "SHOP_CART"; //璐墿妯″潡
	public static String CLASS_REC="BJ_TJ";//鎺ㄨ崘-銆嬬彮绾ф帹鑽�
	//ZY_YY_APPID//璧勬簮-銆嬪涔犲姪鎵�銆嬪簲鐢╥d
	//ZY_YY_APPID_SERVICECODE//璧勬簮-銆嬪涔犲姪鎵�銆嬪簲鐢╥d-銆嬩笟鍔＄紪鍙�
	public static String APP_ZLSZ="ZLSZ";//璧勬枡璁剧疆
	public static String APP_QHJS="QHJS";//鍒囨崲瑙掕壊
	public static String APP_MMXG="MMXG";//瀵嗙爜淇敼
	public static String APP_YJFK="YJFK";//鎰忚鍙嶉
	public static String APP_LOGIN="LOGIN";//鐧诲綍
	public static String APP_LOGOUT="LOGOUT";//閫�嚭
	public static String APP_MEAL="MEAL";//钀ュ吇椁愯璐�
	public static String APP_STORE="STORE";//鍟嗗煄
	
	public  static String WAP = "wap";
	public  static String IOS = "ios";
	public  static String ANDROID = "android";
	public  static String WEIXIN = "weixin";
	
	
	// 鐢ㄤ簬娣诲姞log_mark琛ㄤ腑mark_type绫诲瀷
	public static final int REGIST_APP_TYPE = 8001;//寮��搴旂敤
	public static final int OPEN_APP_TYPE = 8002;//鎵撳紑搴旂敤
	public static final int BIND_WXLOGIN_TYPE = 9001;//缁戝畾寰俊
	//鐢ㄤ簬娣诲姞log_mark琛ㄤ腑mark_resource绫诲瀷绉垎鏉ユ簮
	public static final int MARK_APP_TYPE = 1;//1:APP瀹㈡埛绔� 
	public static final int MARK_WAP_TYPE = 2;//2:WAP闂ㄦ埛
	public static final int MARK_WEB_TYPE = 3;//3:缃戠珯闂ㄦ埛  
	public static final int MARK_WEIXIN_TYPE = 4;//4:寰俊鍏紬鍙�
	public static final int MARK_OTHER_TYPE = 5;//5:鍏朵粬
}
