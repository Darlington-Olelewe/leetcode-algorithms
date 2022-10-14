package recursion;

class ReverseCharArray {
    public static void main(String[] args) {
        char[] s = new char[]{'H','a','n','n','a','h'};
        char[] a = new char[]{'A','B','C','N','X','Y','Z'};
        reverseString(a);
        System.out.println(a);
    }


    static void reverseString(char[] s) {
        int last = s.length / 2;
        recurseReverse(s,last,0,s.length - 1);

    }

     static void recurseReverse(char[]s, int last, int begin,int end){
        if(begin == last) return;
        char temp = s[begin];
        s[begin] = s[end];
        s[end] = temp;
        recurseReverse(s,last,++begin,--end);
    }
}
