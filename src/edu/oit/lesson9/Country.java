package edu.oit.lesson9;

public enum Country {
    US, UK, DE, FR, ES, IT, CA, JP, MX, IN;
    
    public static void main(String[] args) {
        System.out.println(Country.getUrl(Country.UK));
    }
    
    public static String getUrl(Country country) {
        String url = "https://www.amazon.";

        switch (country) {
        case US:
            url += "com";
            break;
        case UK:
            url += "co.uk";
            break;
        case DE:
            url += "de";
            break;
        case FR:
            url += "fr";
            break;
        case ES:
            url += "es";
            break;
        case IT:
            url += "it";
            break;
        case CA:
            url += "ca";
            break;
        case JP:
            url += "co.jp";
            break;
        case MX:
            url += "com.mx";
            break;
        case IN:
            url += "in";
            break;
        }

        return url;
    }

}
