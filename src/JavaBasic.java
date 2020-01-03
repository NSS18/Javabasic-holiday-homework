public class JavaBasic{

    //1) To remove char 's' from the given string
    public static void remove_char_s(String str)
    {
        String s = str.replace("s","");

        System.out.println("1) After removing character 's' from string ("+str+"),new string will be:  "+s);

    }



    //2)To find length of string
    public static void length_of_string(String str)
    {
        int length=str.length();
        System.out.println("2) Length of string ("+str+") is : "+length);
    }



    //3)To remove space from string
    public static void remove_space(String str)
    {

        String s1 = str.replaceAll("\\s+","");  //use of regex
        System.out.println("3) After removing space from String ("+str+"),new string will be: "+s1);
    }



    //4)To extract special char from string
    public static void extract_special_char(String str1)
    {

        String s2 = str1.replaceAll("[^a-zA-Z0-9]", " "); //use of regex
        System.out.println("4) After extracting special char from string ("+str1+"),new string will be: "+s2);
    }



    //5)To extract number from given string
    public static void extract_number(String str2)
    {
        String s3 = str2.replaceAll("\\d+"," "); //use of regex
        System.out.println("5) After extracting digits from string ("+str2+"), new string will be: "+s3);

    }



    //6)To convert int into double
    public static void int_into_double(int no)
    {
        double d = no;
        System.out.println("6) Double of int "+no+" is: "+d);

    }



    //7)To convert string into integer
    public static void str_into_int(String str)
    {
        int i = Integer.parseInt(str);
        System.out.println("7) String '"+str+"' into integer ïs : "+i);

    }



    //8)To convert double number int0 String
    public static void double_into_str(double d)
    {
        String sr = Double.toString(d);
        System.out.println("8) String of double number "+d+" is : '"+sr+"'");
    }



    //9)To convert string into double
    public static void str_into_double(String sr)
    {
        double d = Double.parseDouble(sr);
        System.out.println("9) String '"+sr+"' into double is : "+d);

    }



    //10)To find out answer of 1/3 into decimal
    public static void fraction_into_decimal(double numerator,double denominator)
    {
        double decimal= numerator/denominator;
        System.out.println("10) Decimal of fraction "+numerator+"/"+denominator+" is : "+decimal);

    }



    //11)To replace currency symbol from $ to £
    public static void replace_currency_symbol(String str)
    {
        String s1 = str.replace("$","£");
        System.out.println("11) After replacing $ with £ --> "+str+" will become "+s1);
    }



//12)TO convert string into number

    public static void String_into_number(String price1, String price2)
    {
        int total;
        total = Integer.parseInt(price1) + Integer.parseInt(price2);
        System.out.println("12) String into Number: Total of " + price1 + " and " + price2 + " is " + total);
    }



    //13)To find middle character of the odd string
    public static void middle_char_of_oddstr(String str)
    {
        int position;
        int length = str.length();
        position = length / 2;
        length = 1;
        String odd = str.substring(position,position+length);
        System.out.println("13) Middle char (odd number of characters) of  string '"+str+"'is : "+odd);
    }


//14)To find middle character of even string

    public static void middle_char_of_evenstr(String str)
    {
        int position;
        int length = str.length();
        position = length / 2 - 1;
        length = 2;
        String even = str.substring(position,position+length);
        System.out.println("14) Middle char (even number of characters) of string '"+str+"' is : "+even);

    }



    //main method starts here
    public static void main(String[] args)  {
        String str = "This is very easy programme";
        String str1 = "This $300 is equivalent of £200 but not for @100";
        String str2 ="The cost of iPhone is £1,250";
        System.out.println("--------COLLECTION OF BASIC JAVA PROGRAMS:------------");
        remove_char_s(str);
        length_of_string(str);
        remove_space(str);
        extract_special_char(str1);
        extract_number(str2);
        int_into_double(450);
        str_into_int("125");
        double_into_str(123.45);
        str_into_double("560.25");
        fraction_into_decimal(1,3);
        replace_currency_symbol("$250.00");
        String_into_number("100", "200");
        middle_char_of_oddstr("England");
        middle_char_of_evenstr("Orange");



    }
}


