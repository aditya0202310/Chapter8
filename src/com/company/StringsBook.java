package com.company;

public class StringsBook {
    public StringsBook() {
    }

    public static String scroll(String x) {
        String str1;
        String str2;
        String str3;
        str3 = x.substring(1);
        str2 = x.substring(0, 1);
        str1 = str3.concat(str2);
        return str1;
    }

    public static String convertName(String a) {
        String firstName = "";
        String lastName;
        String str3;
        firstName = (a.substring(8));
        firstName = firstName.trim();
        lastName = a.substring(0, 6);
        str3 = firstName.concat(" " + lastName);

        return str3;
    }

    public static String negative(String b) {
        String str1;
        str1 = b.replaceAll("0", "2");
        str1 = str1.replaceAll("1", "0");
        str1 = str1.replaceAll("2", "1");
        return str1;
    }

    public static String convertDate(String dateString) {
        String month;
        String day;
        String year;
        String str4 = "";
        month = dateString.substring(0, 2);
        day = dateString.substring(3, 5);
        year = dateString.substring(6);
        str4 = day + "-" + month + "-" + year;
        return str4;
    }

    public static String convertDate2(String dateStr) {
        String day = "";
        String month = "";
        String year = "";
        int dash = dateStr.indexOf("/");
        month = dateStr.substring(0, dash);
        int dash2 = dateStr.indexOf("/", dash + 1);
        day = dateStr.substring(dash + 1, dash2);
        year = dateStr.substring(dash2 + 1, dateStr.length());
        if (month.length() == 1) {
            month = "0" + month;
        }
        if (day.length() == 1) {
            day = "0" + day;
        }
        String dateFormat = day + "-" + month + "-" + year;
        return dateFormat;
    }


    public static boolean startsWith(String s, String prefix) {
        String res = "";
        int searchPrefix = s.lastIndexOf(prefix);
        if(searchPrefix == -1){
            return false;
        }
        else if(searchPrefix == 0){
            return true;
        }
          else
              return false;
    }

    public static boolean endsWith(String s, String suffix) {
        String a = "";
          int searchSuffix = s.indexOf(suffix);
          if(searchSuffix == -1){
              return false;
          }
          else if(searchSuffix == -1){
              return false;
          }
          else
              a = s.substring(searchSuffix);
              return a.equals(suffix);
    }

    public static String removeTag(String s, String tag) {
        String a = "";
        int searchTag = s.indexOf(tag);
        int searchTag2 = s.indexOf("/" + tag, searchTag);
        if(searchTag2 == -1 || searchTag == -1){
           return s;
        } else
            a = s.substring(searchTag +2, searchTag2 -1);
           return a;
    }


    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(convertName("Mathur,  Aditya"));
        System.out.println(negative("0010111001"));
        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture","rch"));
        System.out.println(startsWith("architecture","architecture"));
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</b>Hello World<b>", "b"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World </b> Happy Birthday", "b"));
        System.out.println(removeTag("Happy <b>Hello World</b> birthday", "b"));
    }
}

