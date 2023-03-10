class wordVowels{
    static int[] countVowels(String word){
        int[] arr = new int[5];
        word = word.toLowerCase();
        for(int i =0;i<word.length();i++){
            switch(word.charAt(i)){
                case 'a':
                    arr[0]+=1;
                    break;
                case 'e':
                    arr[1]+=1;
                    break;
                case 'i':
                    arr[2]+=1;
                    break;
                case 'o':
                    arr[3]+=1;
                    break;
                case 'u':
                    arr[4]+=1;
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String word = "AeiOuaeioUaei";
        int[] arr = countVowels(word);
        System.out.println("String : "+word);
        System.out.println("No. of 'a' : "+arr[0]);
        System.out.println("No. of 'e' : "+arr[1]);
        System.out.println("No. of 'i' : "+arr[2]);
        System.out.println("No. of 'o' : "+arr[3]);
        System.out.println("No. of 'u' : "+arr[4]);
    }
}