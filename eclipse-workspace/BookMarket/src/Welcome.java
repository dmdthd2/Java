import java.util.Scanner;

public class Welcome {
   static final int Num_Book =6;
   static final int Num_Item =7;
   
   public static void main(String[] args) {
      String[][]mBook = new String[Num_Book][Num_Item];
      
         String greeting = "Welcome to Shooping Mall";
         String tagline = "Welcome to Book Market!";

         Scanner sc = new Scanner(System.in);

         System.out.print("당신의 이름을 입력하세오 :");
         String name = sc.nextLine();

         System.out.print("연락처를 입력하세요 :");
         int mobile = sc.nextInt();

         boolean quit = false;

         while (!quit) {
            System.out.println("***********************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
            
//            System.out.println("***********************************");
//            System.out.println("1. 고객 정보 확인하기 \t 4. 바구니에 항목추가하기");
//            System.out.println("2. 장바구니 상품 목록보기 \t 5. 장바구니의 항목 수량 줄이기");
//            System.out.println("3. 장바구니 비우기 \t\t 6. 장바구니의 항목 삭제하기");
//            System.out.println("7. 영수증 표시하기 \t\t 8. 종료");
//            System.out.println("***********************************");
            
            menuIntroduction();
            
            System.out.println("메뉴 번호를 선택해주세요");
            int menu = sc.nextInt();
            System.out.println(menu + "번을 선택했습니다");

            if (menu < 1 || menu > 8) {
               System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
               switch (menu) {
               case 1:
//                  System.out.print("현재 고객 정보 : ");
//                  System.out.printf("이름: %s 연락처: %d\n", name, mobile);
                  menuGuestInfo(name, mobile);
                  break;
               case 2:
//                  System.out.println("장바구니 상품 목록보기 : ");
                  menuCartItemList();
                  break;
               case 3:
//                  System.out.println("장바구니 비우기 :");
                  menuCartClear();
                  break;
               case 4:
//                  System.out.println("바구니에 항목추가하기:");
                  menuCartAddItem(mBook);
                  break;
               case 5:
//                  System.out.println("5. 장바구니의 항목 수량 줄이기");
                  menuCartRemoveItemCount();
                  break;
               case 6:
//                  System.out.println("6. 장바구니의 항목 삭제하기");
                  menuCartRemoveItem();
                  break;
               case 7:
//                  System.out.println("7. 영수증 표시하기");
                  menuCartBill();
                  break;
               case 8:
//                  System.out.println("8. 종료");
                  menuExit();
                  quit = true;
                  break;
               }
              
            }
         }
      }
      public static void menuIntroduction() {
         System.out.println("***********************************");
         System.out.println("1. 고객 정보 확인하기 \t\t 2. 장바구니 상품 목록보기");
         System.out.println("3. 장바구니 비우기    \t\t 4.바구니에 항목추가하기 ");
         System.out.println("5. 장바구니의 항목 수량 줄이기 \t 6. 장바구니의 항목 삭제하기");
         System.out.println("7. 영수증 표시하기  \t\t 8. 종료");
         System.out.println("***********************************");
         
      }
      
      public static void menuGuestInfo(String name, int mobile) {
         System.out.print("현재 고객 정보 : ");
         System.out.printf("이름: %s 연락처: %d\n", name, mobile);
      }
      public static void menuCartItemList() {
         System.out.println("2. 장바구니 상품 목록 보기");
      }
      public static void menuCartClear() {
         System.out.println("3. 장바구니 비우기");
      }
      public static void menuCartAddItem(String[][]book) {
//         System.out.println("4. 장바구니에 항목 추가하기");
         BookList(book);
          for(int i =0; i<Num_Book; i++) {
             for (int j= 0; j<Num_Item; j++)
                System.out.println(book[i][j]);
             System.out.println();
          }
         boolean quit = false;
         while(!quit) {
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            
            boolean flag = false;
            int numId=-1;
            
            for(int i=0; i<Num_Book; i++) {
            if(str.equals(book[i][0])) {
               numId=i;
               flag = true;
               break;
            }
         }
            if(flag) {
               System.out.println("장바구니에 추가하시겠습니까? Y | N");
               str =input.nextLine();
               
               if(str.toUpperCase().equals("Y")) {
                  System.out.println(book[numId][0]+"도서가 장바구니에 추가되었습니다.");
               }
               quit=true;
            }else
               System.out.println("다시 입력해주세요");
            }
         
      }
      public static void menuCartRemoveItemCount() {
         System.out.println("5. 장바구니의 항목 수량 줄이기");
      }
      public static void menuCartRemoveItem() {
         System.out.println("6. 장바구니의 항목 삭제하기");
      }
      public static void menuCartBill() {
         System.out.println("7. 영수증 표시하기");
      }
      public static void menuExit() {
         System.out.println("8. 종료");
      }
      public static void BookList(String [][]book) {
      book[0][0]="ISBN1234";
      book[0][1]="쉽게 배우는 JSP 웹 프로그래밍";
      book[0][2]="27000";
      book[0][3]="송미영";
      book[0][4]="단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
      book[0][5]="IT전문서";
      book[0][6]="2018/10/08";
      book[1][0]="ISBN1235";
      book[1][1]="안드로이드 프로그래밍";
      book[1][2]="33000";
      book[1][3]="우재남";
      book[1][4]="실습단계별 명쾌한 멘토링!";
      book[1][5]="IT전문서";
      book[1][6]="2022/01/22";
      book[2][0]="ISBN1236";
      book[2][1]="스크레치";
      book[2][2]="22000";
      book[2][3]="고광일";
      book[2][4]="컴퓨터 사고력을 키우는 블록 코딩";
      book[2][5]="컴퓨터 입문";
      book[2][6]="2019/06/10";
      book[3][0]="ISBN1237";
      book[3][1]="김은송의 자서전";
      book[3][2]="50000";
      book[3][3]="김은송";
      book[3][4]="김은송의 인생이 담긴 눈물 없이 볼 수 없는 이야기";
      book[3][5]="자서전";
      book[3][6]="2025/04/09";
      book[4][0]="ISBN1238";
      book[4][1]="김은송의 연애교실 (고병준 필독)";
      book[4][2]="80000";
      book[4][3]="김은송2";
      book[4][4]="여자에게 말도 못걸어본 자들을 위한 S급 비법서";
      book[4][5]="기타도서";
      book[4][6]="2025/04/28 발매예정";
      book[5][0]="ISBN1239";
      book[5][1]="홍영준을 긁는 100가지 방법";
      book[5][2]="1";
      book[5][3]="김은송3";
      book[5][4]="홍영진을 긁을 수 있는 비법";
      book[5][5]="기타도서";
      book[5][6]="2025/04/? 조만간 발매예정";
      
      
      
      
   }
   }