package org.example;

public class CommonlibFactory {

    public static CommonlibApi getInstanse() {
        return new CommonlibApiImpl();
    }

}
