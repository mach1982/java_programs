public class VowelCount {

int count_a=0;
int count_e=0;
int count_i=0;
int count_o=0;
int count_u=0;
int num_vowel;


public void VowelCount(String message){

        int a_ascii=97;
        int e_ascii=101;
        int i_ascii=105;
        int o_ascii=111;
        int u_ascii=117;
        int A_ascii=65;
        int E_ascii=69;
        int I_ascii=73;
        int O_ascii=79;
        int U_ascii=85;

        for (int i=0; i<=message.length()-1; i++) {

                if(message.charAt(i)== a_ascii || message.charAt(i)==A_ascii) {

                        count_a++;
                        num_vowel+=1;

                }
                else if(message.charAt(i)== e_ascii || message.charAt(i)==E_ascii) {

                        count_e++;
                        num_vowel+=1;

                }

                else if(message.charAt(i)== i_ascii || message.charAt(i)==I_ascii ) {

                        count_i++;
                        num_vowel+=1;

                }

                else if(message.charAt(i)== o_ascii || message.charAt(i)==O_ascii) {

                        count_o++;
                        num_vowel+=1;

                }


                else if(message.charAt(i)== u_ascii || message.charAt(i)==U_ascii) {

                        count_u++;
                        num_vowel+=1;

                }

        }

        System.out.println("No of Vowles:"+num_vowel);

        System.out.println("a count:"+count_a);
        System.out.println("e count:"+count_e);
        System.out.println("i count:"+count_i);
        System.out.println("o count:"+count_o);
        System.out.println("u count:"+count_u);


}


}
