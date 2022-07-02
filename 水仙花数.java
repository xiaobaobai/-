//水仙花数
        for(int i=100;i<=999;i++){
            int item1=i/100;
            int item2=(i%100)/10;
            int item3=i%10;
            if((item1*item1*item1)+(item2*item2*item2)+(item3*item3*item3)==i){
                System.out.println("水仙花数 =" + i+" ");
            }
