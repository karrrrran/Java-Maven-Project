package com.company;

public class LastLetterCount {
    public static String getLastLetterCount(String words){

        String ch[] = words.split(" ");
        int counts = 0, county = 0, switchs = 0, switchy = 0, s = -1, y = -1;

        for(int i=0; i<ch.length; i++){
            if(ch[i].charAt(ch[i].length()-1) == 's'){
                counts++;
                if(switchs == 0) {
                    switchs = 1;
                    s = i;
                }
            }
            else if(ch[i].charAt(ch[i].length()-1) == 'y'){
                county++;
                if(switchy == 0) {
                    switchy = 1;
                    y = i;
                }
            }
        }

//        System.out.println("Words ending in s : " + counts);
//        System.out.println("Words ending in y : " + county);

        if(s != -1 && y != -1){
            String temp = ch[s];
            ch[s] = ch[y];
            ch[y] = temp;
        }

        System.out.print("New Sentence : ");
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i] + " ");
        }

        return "Words ending in s: " + counts + " & Words ending in y: " + county;
    }
}
