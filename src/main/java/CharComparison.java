public class CharComparison 

{
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int a_len = a.length;
    int b_len = b.length;
    
    if (a_len > b_len){
        return 1;}
    if (b_len > a_len){
        return -1;}
        for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]){
            String stra = String.valueOf(a[i]); 
            String strb = String.valueOf(b[i]);
            int c=stra.compareTo(strb);
            if (c> 0){
                return 1;}else{
                    return -1;
                }
        }
       
    }
    return 0;
    }
}

