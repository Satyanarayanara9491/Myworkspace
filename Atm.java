import java.util.*;
interface atm{//interface implements by classes 
    void updateMobile();
    void updatePin();
    void display();
}

public class Atm{
    //program starts from here
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int correct=0;
    int com=0;
    int j=0;
    int co=0;
    int k=0;
  String accnum[]=new String[100];
  String name[]=new String[100];
  String mobile[]=new String[100+1];
  String adharno[]=new String[100];
  int password[]=new int[100+1];
  int appsecure[]=new int[100];
  double balance=16000.21;
  accnum[0]="1234567A";
  name[0]="rajveer";
  mobile[0]="1234567890";
  adharno[0]="123456789012";/*predefined valure
                                                */
  password[0]=7890;
  appsecure[0]=2982;
  accnum[1]="123456B";
  name[1]="prakash";
  mobile[1]="0987654321";
  adharno[1]="098765432109";
  password[1]=2987;
  appsecure[1]=2981;
  
  
  System.out.println("Welcome to AUTOMATED TELLER MACHINE");
  int a;
  do{
  System.out.println("\nChoose one of the following\n1.add account\n2.deposit amount\n3.cardless withdraw\n4.withdraw the amount\n5.to check balance\n6.update mobile number\n7.update pin\n8.to display details\n10.to exit");
   a=sc.nextInt();
  for (int i=0;i<name.length;i++){
      if(password[i]!=0){
          count=count+1;//it will count upto last element present in an array which is not null
      }
  } 


//CREATING ACCOUNT STARTS FROM HERE
  
  if(a==1){
      for(int i=count;i<count+1;i++){
          sc.nextLine();
     System.out.println("enter the account number with size 8 ");
     String hj=sc.nextLine();
     int af=hj.length();
     //account number must be in 8
     while(af!=8){
         System.out.println("enter the valid account number with size 8 ");
         hj=sc.nextLine();
         int u=hj.length();
         if(u==8){
           break;
         }
     }
     
      System.out.println("enter your name  ");
      String b=sc.nextLine();
      
      System.out.println("enter your mobile number ");
      String c=sc.nextLine();
      int y=c.length();
      //mobile number must be 10 digits only
      while(y!=10){
          System.out.println("enter the valid mobile number with 10 digits ");
          c=sc.nextLine();
          int ss=c.length();
          if(ss==10){
            break;
          }
      }
      
    
      System.out.println("enter your aadhar number ");
      String d=sc.nextLine();
      int aad=d.length();
      while(aad!=12){//aadhar number must be equal to 12
          System.out.println("Sorry your aadhar number is not equal to 12 digits please enter the valid aadhar number ");
        d=sc.nextLine();
        int dhar=d.length();
        if(dhar==12){
          break;
        }
      }
     
      System.out.println("enter the 4 digit password for your account ");
      int f=sc.nextInt();
      String pass=Integer.toString(f);
      int passw=pass.length();
      while(passw!=4){
        System.out.println("please enter correct password with 4 digits ");
        f=sc.nextInt();
        String g=Integer.toString(f);
        int yy=g.length();
        if(yy==4){
          break;
        }
      }

          System.out.println("enter the otp that is send to your mobile ");
        System.out.println("enter 7. to open the mobile ");
        int p=sc.nextInt();
         String str="";
          //if enterd number is 7 it will go into if condition
        if(p==7){
            String st=Integer.toString(f);//it will convert integer to String
        char otp[]=st.toCharArray();//it will convert string into char array
    for( i=0;i<4;i++){
                int ot=otp[i]+5;//adding the 5 for ascii value of character
                char ch=(char)ot;//convert ascii into character
                String conv=Character.toString(ch);//convert char to string
                str=str+conv;//adding converted string to str
            }
        }
         System.out.println("otp "+str);
      System.out.println("enter 1 to get back into atm  ");//back to atm
      int back=sc.nextInt();
  if(back==1){
      sc.nextLine();
      System.out.println("enter the otp ");
      String otpm=sc.nextLine();
      if(otpm.equals(str)){//if entered otp equals to generated otp then account created
          System.out.println("your account is successfully created  ");
          name[i]=b;
          mobile[i]=c;
           adharno[i]=d;//then it will store into array
      password[i]=f;
      accnum[i]=hj;
      }
      else{
          System.out.println("sorry entered otp is incorrect please try again  ");
                 }
               }
             }
            }
//adding account competed here!
//-------------------------------------------------------

    //deposit amount
      if(a==2){
  //To deposit money
  sc.nextLine();
  System.out.println("enter the account number. ");
    String acc=sc.nextLine();
    System.out.println("enter the atm pin ");
    int in=sc.nextInt();
    for(int i=0;i<accnum.length;i++){
      if(acc.equals(accnum[i])){
        com=com+1;
        j=j+i;
      }
    }
            
          if(password [j]==in){//if credentials is matches then
        double amount;

                        System.out.print("enter the Amount to deposit: ");

                        amount =sc.nextInt();

                        if (amount <= 0)

                             System.out.println("Can't deposit negative amount.");

                        else {

                             balance += amount;

                             System.out.println(amount + " has been deposited."+"Now your total balane is "+balance);

                      }    
                      
                      }     
                      j=0; 
                      }
//depositing is ended here
//-------------------------------------------------------



          //cardless withdraw  starts from here-----------------
          //it will have two one is mobile application and another one is atm 
          //------------------------------------------------------------------------------
          
          
        if(a==3){    
       String str="";
    int demo=0;
    int check=0;
    System.out.println("enter 8 to open cardless withdraw application in your mobile  ");
    int mob=sc.nextInt();
    if(mob==8){
        System.out.println("enter 9 to login into carless withdraw application\nenter 10 if you was already logged in ");
        int app=sc.nextInt();
        if(app==9){
            sc.nextLine();
          System.out.println("please enter account number ");
          String appnum=sc.nextLine();
          for(int i=0;i<accnum.length;i++){
              if(appnum.equals(accnum[i])){
                  demo=demo+i;
                  check=check+1;
              }
          }
          if(check==1){//nested if condition 
              System.out.println("enter your name ");
            String check1=sc.nextLine();
            if(name[demo].equals(check1)){
                System.out.println("enter mobile number ");
                String check2=sc.nextLine();
                
                if(mobile[demo].equals(check2)){
                    System.out.println("enter aadhar number");
                    String check3=sc.nextLine();
                    if(adharno[demo].equals(check3)){
                        System.out.println("enter password  ");
                      int pas=sc.nextInt();
                      if(password[demo]==pas){
                          System.out.println("Now set the security pin the security pin for your application and it is must be equal to 4 digit");
                          appsecure[demo]= sc.nextInt();
                          String ka=Integer.toString(appsecure[demo]);
                          int as=ka.length();
                     
                          if(as==4){
                          System.out.println("LOGIN IS SUCCESSFULLY COMPLETED ");
                          System.out.println("welcome to cardless withdraw application");
                          app=10;//just for reference when we come out of nested if it will get 10 only all crediantials is finished
                          }
                          else{
                              System.out.println("set the correct pin for your application  ");
                          }
                      }
                      else{
                          System.out.println("enterd password is wrong  ");
                      }
                    }
                    else{
                        System.out.println("entered adhar number is invalid ");
                    }
                }
                else{
                    System.out.println("entered mobile number is invalid ");
                }
            }
            else{
                System.out.println("entered name is invalid ");
            }
          }
          else{
              System.out.println("entered account number is invalid ");
          }
        }
  
    //end Login--------------------------------
    //----------------------------------------------------------------------
    
    //after login it will get into application
    //------------------------------------------------------------------------------
    
    if(app==10){
        System.out.println("enter your security pin to open ");
        int passw=sc.nextInt();
        for(int i=0;i<appsecure.length;i++){
            if(appsecure[i]==passw){
                System.out.println("Welcome to cardless withdraw application ");
                System.out.println("enter 1 to start the withdraw process ");
                int forward=sc.nextInt();
                if(forward==1){
                 System.out.println("enter your atm pin ");
                 int pin=sc.nextInt();
                 sc.nextLine();
                 if(pin==password[i]){
                      String st=Integer.toString(pin);
        char otp[]=st.toCharArray();
    for( i=0;i<4;i++){
                int ot=otp[i]+i;
                char ch=(char)ot;
                String conv=Character.toString(ch);
                str=str+conv;
                
            }
                
        }
        else{
                System.out.println("please enter the right pin  ");
            }
         System.out.println("enter this secrete code"+" "+str+" "+"in the atm to withdraw money ");
                    correct=correct+1;
                }
            }
        }
        
    }
    }
    //exited from mobile---------------------------------------
    //------------------------------------------------------------------------------
    
    //now enter into atm---------------------------
    System.out.println("enter 3 to get back into atm  ");
      int back=sc.nextInt();
    
  if(back==3&&correct==1){
      System.out.println("--------WELCOME TO ATM-------");
      System.out.println("enter the pin  ");
      int pi=sc.nextInt();
      for(int i=0;i<password.length;i++){
          if(password[i]==pi){
              System.out.println("enter mobile number ");
              sc.nextLine();
              String sz=sc.nextLine();
              if(mobile[i].equals(sz)){
                  System.out.println("enter secrete code  ");
                  String num=sc.nextLine();
                  if(num.equals(str)){
                      System.out.println("enter the amount to withdraw ");
                      int amt=sc.nextInt();
                      if(amt<balance){
                          if(amt>0){
                          balance=balance-amt;
                          System.out.println("withdraw completed Now your balance is "+balance);
                          }
                          else{
                              System.out.println("enter valid amount  ");
                          }
                      }
                      else{
                          System.out.println("your balance is "+balance+" "+"so entered the valid amount ");
                      }
                  }
                  else{
                      System.out.println("incorrect otp  ");
                  }
              }
              else{
                  System.out.println("incorrect mobile number  ");
              }
          }
         
      }
      
  }
  else{
      System.out.println("sorry your withraw is incomplete  ");
  }
        }
        //cashless withdraw compled here----------------------
        //------------------------------------------------------------------------------
        
        
       
      //cash withdraw started from here----------------------------------------------
        //To withdraw ----------------------------------------------------------------------
    if(a==4){
    System.out.println("enter the account number. ");
    sc.nextLine();
    String ac=sc.nextLine();
    System.out.println("enter the atm pin ");
    int inn=sc.nextInt();
    for(int i=0;i<accnum.length;i++){
      if(ac.equals(accnum[i])){
        co=co+1;
        k=k+i;
      }
    }
            
          if(password [k]==inn){
        double amout;

                        System.out.print("enter the Amount to withdraw : ");

                        amout =sc.nextInt();

                        if (amout <= 0||amout>balance)

                             System.out.println("Can't withdraw  amount once check your balance");

                        else {

                             balance -= amout;

                             System.out.println(amout + " has been withdrawn now your balance is "+balance);

                      }    
                      
                      }   
                      k=0;   
                      }
                      //withdraw completed here----------------------------------------------
                      //----------------------------------------------------------------------
                      
                      
                      
                      //check balance started from here----------------------------------------------
                      //----------------------------------------------------------------------
                      if(a==5){
                           System.out.println("enter the account number. ");
    int comm=0;
    int l=0;
    sc.nextLine();
    String acco=sc.nextLine();
    System.out.println("enter the atm pin ");
    int innn=sc.nextInt();
    for(int i=0;i<accnum.length;i++){
      if(acco.equals(accnum[i])){
        comm=comm+1;
        l=l+i;
      }
    }
    if(password[l]==innn)
    {
                          System.out.println("your account balance is "+balance);
    }
                      }
                       //balance checking is completed here 
                       //----------------------------------------------------------------------
                       
                       
                      
                      if(a==6){
                          Demo.updateMobile( mobile, accnum, password);
                      }
                      if(a==7){
                          Test.updatePin(mobile,accnum,password);
                      }
                      if(a==8){
                        Test.display(password,name,accnum,mobile);
                      }
                      if(a==14){
                          for(int i=0;i<password.length;i++){
                              System.out.println(password[i]);
                          }
                      }
        
        
        
         }while(a!=10);
    }
}



//antother class to implement updatemobilenumber method--------------------
//----------------------------------------------------------------------
 abstract class Demo implements atm{
        
         
 public static void updateMobile(String mobile[],String accnum[],int password [])
{
  Scanner sc=new Scanner(System.in);
  int cou=0;
  int m=0;
  System.out.println("enter the account number. ");
    String acco=sc.nextLine();
    System.out.println("enter the atm pin ");
    int ha=sc.nextInt();
    for(int i=0;i<accnum.length;i++){
      if(acco.equals(accnum[i])){
        cou=cou+1;
        m=m+i;
      }
    }     
      if(password [m]==ha&&cou==1){
        System.out.println("enter your existing mobile number  ");
       sc.nextLine();
        String old=sc.nextLine();
        if(mobile[m].equals(old)){
          for(int i=m;i<mobile.length-1;i++){
            mobile[i]=mobile[i+1];
          }
          System.out.println("enter your new mobile number ");
          String New=sc.nextLine();
          if(New.length()==10){
               System.out.println("reenter your new mobile number ");
         String new1=sc.nextLine();
         if(New.equals(new1)){
           int len=password.length-1;
           for(int i=len-1;i>=m;i--){
             mobile[i+1]=mobile[i];
           }
           mobile[m]=New;
         }
             System.out.print("your mobile number updated from "+old+" to "+New+" successful");   
          }
          else{
              System.out.println("enter the valid mobile number with 10 digits  ");
          }
       
        }        
          m=0;           
       }

}
//mobile number updation completed here

}
//--------------------------------------------------------



//another class to implement updatepin and display all the records 
//update pin starts here----------------------------------------------/////
abstract class Test extends Demo implements atm{
 public static void updatePin(String mobile[],String accnum[],int password [])
{
  Scanner sc=new Scanner(System.in);
  int couc=0;
  int o=0;
  int y=0;
  System.out.println("enter the account number. ");
    String accoc=sc.nextLine();
    System.out.println("enter the atm pin ");
    int hac=sc.nextInt();
    for(int i=0;i<accnum.length;i++){
      if(accoc.equals(accnum[i])){
        couc=couc+1;
        o=o+i;
      }
    } 
    
    
      if(password [o]==hac&&couc==1){
        System.out.println("enter your old pin  ");
        int old=sc.nextInt();
        if(password[o]==old){
          for(int i=o;i<password.length-1;i++){
            password[i]=password[i+1];
          }
          System.out.println("enter your new pin ");
          int New=sc.nextInt();
            String cap=Integer.toString(New);
            int ac=cap.length();
          if(ac==4){
          
               System.out.println("reenter your new pin  ");
         int new1=sc.nextInt();
         if(New==new1){
           int len=password.length-1;
           for(int i=len-1;i>=o;i--){
             password[i+1]=password[i];
           }
           password[o]=New;
           System.out.print("your pin is updated from "+old+" to ** successful");
         }
         else{
             System.out.println("your request is failed! ");
         }
                
          }
          else{
            System.out.println("enter the pin with 4 digits correctly ");
        }
        }
      else{
          System.out.println("your old pin is not this   ");
      }
       }
        else{
            System.out.println("sorry your crediantials are incorrect ");
        }
o=0;
    }

//pin update ended here

//------------------------------------------------------------------------------



//display method started here----------------------------------------------
//------------------------------------------------------------------------------///////////
public static void display(int password [],String name[],String accountno[], String mobile[]){
 Scanner sc=new Scanner(System.in);
 int k=0;
  System.out.println("enter the atm pin ");
  int sep=sc.nextInt();
  for(int i=0;i<password.length;i++){
    if(password [i]==sep){
      System.out.println("name "+name[i]+"\natm pin **"+"\naccount number "+accountno[i]+"\nMobile number "+mobile[i]);
    }
    else{
      k=k+1;
    }
  }
 
  if(k==password.length){ 
    System.out.println("enter the valid pin....... ");
       }
     }
   }
//Program ended here
