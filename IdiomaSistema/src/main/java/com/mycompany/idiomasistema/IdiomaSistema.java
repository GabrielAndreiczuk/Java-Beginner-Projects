package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getLanguage());
    }
}
