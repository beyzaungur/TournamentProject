
        

package com.mycompany.tournament;
import java.util.Scanner;

public class Tournament {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    // her takım için istatistik değişkenleri:
    
    int pA=0, wA=0,dA=0,lA=0,gfA=0,gaA=0,ptsA=0;
    int pB=0, wB=0,dB=0,lB=0,gfB=0,gaB=0,ptsB=0; 
    int pC=0, wC=0,dC=0,lC=0,gfC=0,gaC=0,ptsC=0;
    int pD=0, wD=0,dD=0,lD=0,gfD=0,gaD=0,ptsD=0;
    
    //sabit maç sırasını ekrana yazdırma:
    
    System.out.println("match 1: team A vs team B");
    System.out.println("match 2: team A vs team C");        
    System.out.println("match 3: team A vs team D");        
    System.out.println("match 4: team B vs team C ");        
    System.out.println("match 5: team B vs team D ");
    System.out.println("match 6: team C vs team D ");
    
    //skorları sonradan ekrana yazdırmak için :
    int m1_gA, m1_gB;
    int m2_gA, m2_gC;        
    int m3_gA, m3_gD;
    int m4_gB, m4_gC;
    int m5_gB, m5_gD;
    int m6_gC, m6_gD;
    
    //MATCH1
    System.out.println("match 1: team A vs team B");
    System.out.println("team A goals:");
    m1_gA= scanner.nextInt();
    System.out.println("team B goals:");
    m1_gB= scanner.nextInt();
    
    pA++;pB++;
    gfA+=m1_gA;gaA+=m1_gB;
    gfB+=m1_gB;gaB+=m1_gA;
    
    if (m1_gA>m1_gB){
       wA++; ptsA+=3;
       lB++;
    }else if (m1_gB> m1_gA){
       wB++; ptsB+=3;
       lA++;
    }else{
        dA++; dB++;
        ptsA++; ptsB+=1;
    }System.out.println();
    
    //MATCH2
    System.out.println("match 2: team A vs team C");
    System.out.println("team A goals:");
    m2_gA= scanner.nextInt();
    System.out.println("team C goals:");
    m2_gC= scanner.nextInt();
    
    pA++;pC++;
    gfA+=m2_gA;gaA+=m2_gC;
    gfC+=m2_gC;gaC+=m2_gA;
    
    if (m2_gA>m2_gC){
       wA++; ptsA+=3;
       lC++;
    }else if (m2_gC> m2_gA){
       wC++; ptsC+=3;
       lA++;
    }else{
        dA++; dC++;
        ptsA++; ptsC+=1;
    }System.out.println();
    
    //MATCH3
    System.out.println("match 3: team A vs team D");
    System.out.println("team A goals:");
    m3_gA= scanner.nextInt();
    System.out.println("team D goals:");
    m3_gD= scanner.nextInt();
    
    pA++;pD++;
    gfA+=m3_gA;gaA+=m3_gD;
    gfD+=m3_gD;gaD+=m3_gA;
    
    if (m3_gA>m3_gD){
       wA++; ptsA+=3;
       lD++;
    }else if (m3_gD> m3_gA){
       wD++; ptsD+=3;
       lA++;
    }else{
        dA++; dD++;
        ptsA++; ptsD+=1;
    }System.out.println();
    
    //MATCH4
    System.out.println("match 4: team B vs team C");
    System.out.println("team B goals:");
    m4_gB= scanner.nextInt();
    System.out.println("team C goals:");
    m4_gC= scanner.nextInt();
    
    pB++;pC++;
    gfB+=m4_gB;gaB+=m4_gC;
    gfC+=m4_gC;gaC+=m4_gB;
    
    if (m4_gB>m4_gC){
       wB++; ptsB+=3;
       lC++;
    }else if (m4_gC> m4_gB){
       wC++; ptsC+=3;
       lB++;
    }else{
        dB++; dC++;
        ptsB++; ptsC+=1;
    }System.out.println();
    //MATH5
    System.out.println("match 5: team B vs team D");
    System.out.println("team B goals:");
    m5_gB= scanner.nextInt();
    System.out.println("team D goals:");
    m5_gD= scanner.nextInt();
    
    pB++;pD++;
    gfB+=m5_gB;gaB+=m5_gD;
    gfD+=m5_gD;gaD+=m5_gB;
    
    if (m5_gB>m5_gD){
       wB++; ptsB+=3;
       lD++;
    }else if (m5_gD> m5_gB){
       wD++; ptsD+=3;
       lB++;
    }else{
        dB++; dD++;
        ptsB++; ptsD+=1;
    }System.out.println();
    
    //MATCH6
    System.out.println("match 6: team C vs team D");
    System.out.println("team C goals:");
    m6_gC= scanner.nextInt();
    System.out.println("team D goals:");
    m6_gD= scanner.nextInt();
    
    pC++;pD++;
    gfC+=m6_gC;gaC+=m6_gD;
    gfD+=m6_gD;gaD+=m6_gC;
    
    if (m6_gC>m6_gD){
       wC++; ptsC+=3;
       lD++;
    }else if (m6_gD> m6_gC){
       wD++; ptsD+=3;
       lC++;
    }else{
        dC++; dD++;
        ptsC++; ptsD+=1;
    }System.out.println();
    
    //print all entered math scores
    System.out.println("match1: teamA " + m1_gA + "-" +  m1_gB  +" teamB:");
    System.out.println("match2: teamA " + m2_gA  + "-" +  m2_gC  +" teamC:");
    System.out.println("match3: teamA " + m3_gA  + "-" +  m3_gD  +" teamD:");
    System.out.println("match4: teamB " + m4_gB  + "-" +  m4_gC  +" teamC:");
    System.out.println("match5: teamB " + m5_gB  + "-" +  m5_gD  +" teamD:");
    System.out.println("match6: teamC " + m6_gC  + "-" +  m6_gD  +" teamD:");
    System.out.println();
    
    // goal difference
    int gdA = gfA- gaA;
    int gdB = gfB- gaB;
    int gdC = gfC- gaC;
    int gdD = gfD- gaD;
    
    // STANDİNGS TABLE
    System.out.println("Takım  P W D L  GF GA GD  Puan");
    System.out.println("---------------------------");
    System.out.println("team A:"+ pA + " " + wA +" "+ dA+" "+ lA+ " "+gfA+" "+gaA+" "+gdA+" "+ptsA);
    System.out.println("team B:"+ pB + " " + wB +" "+ dB+" "+ lB+ " "+gfB+" "+gaB+" "+gdB+" "+ptsB);          
    System.out.println("team C:"+ pC + " " + wC +" "+ dC+" "+ lC+ " "+gfC+" "+gaC+" "+gdC+" "+ptsC); 
    System.out.println("team D:"+ pD + " " + wD +" "+ dD+" "+ lD+ " "+gfD+" "+gaD+" "+gdD+" "+ptsD);  
    
    // şampiyon belirleme
    String champion =" team A ";
    int maxPoints= ptsA;
    int maxGD =gdA;
    
    if (ptsB > maxPoints || (ptsB ==maxPoints && gdB> maxGD)){
        champion = "team B";
        maxPoints= ptsB;
        maxGD=gdB;
    }
      if (ptsC> maxPoints || (ptsC==maxPoints && gdC> maxGD)){
        champion = "team C";
        maxPoints= ptsC;
        maxGD=gdC;
    }
     if (ptsD > maxPoints || (ptsD == maxPoints && gdD > maxGD)) {
            champion = "team D";
        }
      System.out.println("Champion:"+champion);

    }
  
}
