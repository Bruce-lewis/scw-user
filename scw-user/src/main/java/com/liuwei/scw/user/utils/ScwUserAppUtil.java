package com.liuwei.scw.user.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class ScwUserAppUtil {
	public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false; 
        String s2="^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$";// 验证手机号
        if(StringUtils.isNotBlank(str)){
            p = Pattern.compile(s2); 
            m = p.matcher(str);
            b = m.matches(); 
        }
        return b;
    }
}
