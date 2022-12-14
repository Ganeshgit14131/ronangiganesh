class Anagram 
{

   public static boolean checkAnagram(String a, String b) 
    {
        if (a.length() != b.length())
            return false;
        int index;
        for (int i = 0; i < a.length(); i++) 
        {
            if ((index = b.indexOf(a.charAt(i))) != -1) 
            {
              b = b.substring(0, index) + b.substring(index + 1, b.length());
            } else {
                return false;
            }
        }
        if (b.length() == 0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) 
    {
        if (checkAnagram("stop", "pots"))
            System.out.println("GIVEN STRINGS STOP AND POTS ARE ANAGRAM");
        else
            System.out.println("Not an Anagram");

        if(checkAnagram("army", "mary"))
            System.out.println("GIVEN STRINGS ARMY AND MARY ARE ANAGRAM");
          else
            System.out.println("Not an Anagram");    

    }
}