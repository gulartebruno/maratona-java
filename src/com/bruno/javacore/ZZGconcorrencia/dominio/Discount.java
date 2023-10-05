package com.bruno.javacore.ZZGconcorrencia.dominio;

//storeName:price:discountCode
public class Discount {
    public enum Code {
        NONE(0), SUPER_SAAYAJIN(5), SUPER_SAAYAJIN2(10), SUPER_SAAYAJIN3(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
