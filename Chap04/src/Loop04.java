import java.util.*;

public class Loop04 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=2; i<=4; i++) {
//			System.out.println("구구단" + i+"단");
//			System.out.println();
//			for(int j=1; j<=10; j++) {
//				System.out.println(i+"X"+j +"="+(i*j));
//			}
//		}
		
		//***********역삼각형****************
//		Scanner sc = new Scanner(System.in);
//		System.out.println("길이를 입력하라.");
//		int len = sc.nextInt();
//		for(int i=0; i< len; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//		for(int j =0; j<(2*len)-1-(i*2); j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		}
		
		//**********정삼각형***************
//		   Scanner sc = new Scanner(System.in);
//	        System.out.println("길이를 입력하라.");
//	        int len = sc.nextInt();
//
//	        for (int i = 0; i < len; i++) {
//	            for (int j = 0; j < len - i - 1; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int j = 0; j < (2*i) + 1; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();  
//	        }
		
		//**********비어있는 삼각형
//	    Scanner sc = new Scanner(System.in);
//        System.out.println("길이를 입력하라.");
//        int len = sc.nextInt();
//
//        for (int i = 0; i < len; i++) {
//            // 공백 찍기
//            for (int j = 0; j < len - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            // 별과 안쪽 공백 찍기
//            for (int j = 0; j < (2 * i + 1); j++) {
//                if (j == 0 || j == (2 * i)) {
//                    // 맨 처음과 맨 끝은 별
//                    System.out.print("*");
//                } else if (i == len - 1) {
//                    // 마지막 줄은 다 별
//                    System.out.print("*");
//                } else {
//                    // 나머지는 공백
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
		
		//*********몇개 몇줄 ************
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("몇개 몇줄을 만들까.");
//		int len = sc.nextInt();
//		
//		for(int i =1; i<=len; i++) {
//			for(int j=0; j<len; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//***********비어있는 사각형**************
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("몇줄로 만들까.");
//		int len = sc.nextInt();
//		
//		for(int i =0; i<len; i++) {
//			if(i==0 || i==len-1) {
//				for(int j=0; j<len; j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for(int k =0; k<len; k++) {
//					if(k==0 || k==len-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		//*********대각선 긋기(왼쪽에서 오른쪽)************
//		Scanner sc = new Scanner(System.in);	
//		System.out.println("몇줄로 만들까.");
//		int len = sc.nextInt();
//		
//		for(int i =0; i<len; i++) {
//			if(i==0 || i==len-1) {
//				for(int j=0; j<len; j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for(int k =0; k<len; k++) {
//					if(k==0 || k==len-1 || k==i) {
//						System.out.print("*");
//                    }else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		//*********대각선 긋기2(오른쪽에서 대각선)
//		Scanner sc = new Scanner(System.in);	
//		System.out.println("몇줄로 만들까.");
//		int len = sc.nextInt();
//		
//		for(int i =0; i<len; i++) {
//			if(i==0 || i==len-1) {
//				for(int j=0; j<len; j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for(int k =0; k<len; k++) {
//					if(k==0 || k==len-1 || k==len-i-1) {
//						System.out.print("*");
//                    }else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	}

}
